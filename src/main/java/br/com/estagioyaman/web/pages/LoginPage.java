package br.com.estagioyaman.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@id='email' and preceding-sibling:: label[text()='E-mail ']]")
    private WebElement campoEmail;

    @FindBy(xpath = "//input[@id='senha' and preceding-sibling:: label[text()='Senha ']]")
    private WebElement campoSenha;

    @FindBy(xpath = "//button[@id='btn_login']")
    private WebElement botaoEntrar;

    public WebElement getCampoEmail() {
        return campoEmail;
    }

    public WebElement getCampoSenha() {
        return campoSenha;
    }

    public WebElement getBotaoEntrar() {
        return botaoEntrar;
    }
}
