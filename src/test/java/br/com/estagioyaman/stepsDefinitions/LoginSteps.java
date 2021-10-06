package br.com.estagioyaman.stepsDefinitions;

import br.com.estagioyaman.settings.PropertiesManager;
import br.com.estagioyaman.web.actions.LoginActions;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;

public class LoginSteps {

    private LoginActions loginActions;

    public LoginSteps() {
        this.loginActions = new LoginActions();
    }

    @E("preencho os campos de login com dados válidos para acesso")
    public void preenchoOsCamposDeLoginComDadosValidosParaAcesso (){
        this.loginActions.preencheCampoEmail(PropertiesManager.getPropertiesValue("user","credencials"));
        this.loginActions.preencheCampoSenha(PropertiesManager.getPropertiesValue("password","credencials"));
    }

    @Quando("clico no botão {string}")
    public void clicoNoBotão(String arg0) {
        this.loginActions.clicarNoBotaoEntra();
    }
}


