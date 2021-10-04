package br.com.estagioyaman.web.actions;

import br.com.estagioyaman.settings.BaseTest;
import br.com.estagioyaman.settings.PropertiesManager;
import br.com.estagioyaman.web.pages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginActions extends BaseTest {

    private LoginPage loginPage;

    public LoginActions(){
        this.loginPage = new LoginPage(webDriver);
    }

    public void preencherUsuarioESenha(){
        wait.until(ExpectedConditions.elementToBeClickable(this.loginPage.getInputEmail()));
        this.loginPage.getInputEmail().click();
        this.loginPage.getInputEmail().sendKeys(
                PropertiesManager.getPropertiesValue("user","credencials")
        );
        this.loginPage.getInputSenha().click();
        this.loginPage.getInputSenha().sendKeys(
                PropertiesManager.getPropertiesValue("password","credencials")
        );
    }

    public void clicaBotaoEntrar(){
        this.loginPage.getBotaoEntrar().click();
    }
}
