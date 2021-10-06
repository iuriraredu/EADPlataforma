package br.com.estagioyaman.stepsDefinitions;

import br.com.estagioyaman.web.actions.HomeLogadaActions;
import io.cucumber.java.pt.Então;

import static org.junit.Assert.*;

public class HomeLogadaSteps {
    private HomeLogadaActions homeLogadaActions;

    public HomeLogadaSteps() {
        this.homeLogadaActions = new HomeLogadaActions();
    }

    @Então("^sou redirecionado para a tela \"([^\"]*)\"$")
    public void souRedirecionadoParaATela(String paginaOndeEsta){
        assertEquals(paginaOndeEsta, this.homeLogadaActions.mensagemTelaHome());
    }
}


