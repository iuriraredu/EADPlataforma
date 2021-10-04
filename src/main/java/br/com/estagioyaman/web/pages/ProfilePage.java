package br.com.estagioyaman.web.pages;

import br.com.estagioyaman.settings.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    public ProfilePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//div[@id='content']/div[4]/header/div[2]/div/div[2]/div[1]/div[1]/div/div/h1/a")
    private WebElement nomeUsuario;

    public WebElement getNomeUsuario() {
        return nomeUsuario;
    }
}
