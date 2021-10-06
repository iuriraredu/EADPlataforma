package br.com.estagioyaman.web.actions;

import br.com.estagioyaman.settings.BaseTest;
import br.com.estagioyaman.web.pages.LoginPage;

public class LoginActions extends BaseTest {

    private final LoginPage loginPage;

    public LoginActions(){
        this.loginPage = new LoginPage(webDriver);
    }

    public void preencheCampoEmail(String email){
        this.loginPage.getCampoEmail().sendKeys(email);
    }

    public void preencheCampoSenha(String senha){
        this.loginPage.getCampoSenha().sendKeys(senha);
    }

    public void clicarNoBotaoEntra(){
        this.loginPage.getBotaoEntrar().click();
    }
}
