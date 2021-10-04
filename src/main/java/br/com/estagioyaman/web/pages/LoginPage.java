package br.com.estagioyaman.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage (WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
    }

    @FindBy(xpath = "//input[@id='id_username_or_email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@id='id_password']")
    private WebElement inputSenha;


    @FindBy(xpath = "//div[@class='form-submit']/button")
    private WebElement botaoEntrar;


    public WebElement getInputEmail() {
        return inputEmail;
    }

    public WebElement getInputSenha() {
        return inputSenha;
    }

    public WebElement getBotaoEntrar() {
        return botaoEntrar;
    }
}
