package br.com.estagioyaman.settings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public abstract class BaseTest {

    protected static WebDriver webDriver;
    protected static WebDriverWait wait;

    protected static void browserSetUp(){
        String browser = PropertiesManager.getPropertiesValue("browser", "application");

        if (browser.contains("Chrome")){
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();
        }

        if(browser.contains("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            webDriver = new FirefoxDriver();
        }

        if(browser.contains("Edge")){
            WebDriverManager.edgedriver().setup();
            webDriver = new EdgeDriver();
        }

        if(browser.contains("Opera")){
            WebDriverManager.operadriver().setup();
            webDriver = new OperaDriver();
        }

        webDriver.manage().window().maximize();
        webDriver.get(PropertiesManager.getPropertiesValue("URLQA", "application"));
        wait = new WebDriverWait(webDriver,15);
    }

    protected static void browserTearDown(){
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    protected static void browserScreenShot(String nomeCenario){
        String dataEHora = new SimpleDateFormat("yyyy-MM-dd/hh.mm.ss_").format(new Timestamp(System.currentTimeMillis()));
        String nomeDoArquivo = dataEHora + nomeCenario;
        try {
            File screenshot = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("test-output/Screenshot/" + nomeDoArquivo + ".png"));
        } catch (Exception e){
            System.out.println("Houveram problemas ao copiar o arquivo para pasta!\n" + e.getMessage());
        }
    }
}
