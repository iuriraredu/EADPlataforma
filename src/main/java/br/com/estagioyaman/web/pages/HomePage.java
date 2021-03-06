package br.com.estagioyaman.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//li[@class='active login_header']")
    private WebElement botaoLogin;

    public WebElement getBotaoLogin() {
        return botaoLogin;
    }
}
