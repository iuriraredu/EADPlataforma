package br.com.estagioyaman.stepsDefinitions;

import br.com.estagioyaman.web.actions.LoginActions;
import io.cucumber.java.pt.Dado;

public class LoginSteps {
    private final LoginActions loginActions;

    public LoginSteps() {
        this.loginActions = new LoginActions();
    }

    @Dado("que relizou login com credenciais válidas")
    public void queRelizouLoginComCredenciaisValidas() {
        this.loginActions.preencherUsuarioESenha();
        this.loginActions.clicaBotaoEntrar();
    }
}
