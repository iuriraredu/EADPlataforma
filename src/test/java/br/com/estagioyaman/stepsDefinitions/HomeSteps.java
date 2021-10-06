package br.com.estagioyaman.stepsDefinitions;

import br.com.estagioyaman.web.actions.HomeActions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;

public class HomeSteps {

    private HomeActions homeActions;
    public HomeSteps() {
        this.homeActions = new HomeActions();
    }

    @Dado("^que estou na página home do site$")
    public void queEstouNaPaginaHomeDoSite(){
    }

    @E("clico Login")
    public void clicoLogin() {
        this.homeActions.clicarNoBotaoLogin();
    }
}


