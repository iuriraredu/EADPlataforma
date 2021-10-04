package br.com.estagioyaman.web.actions;

import br.com.estagioyaman.settings.BaseTest;
import br.com.estagioyaman.web.pages.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeActions extends BaseTest {

    public static Object clicaNaImagemDoUsuario;
    private HomePage homePage;

    public HomeActions(){
        this.homePage = new HomePage(webDriver);
    }

    public void clicaNaImagemDoUsuario(){
        wait.until(ExpectedConditions.elementToBeClickable(this.homePage.getImagemDoUsuario()));
        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        js.executeScript("arguments[0].click();", this.homePage.getImagemDoUsuario());
    }
}
