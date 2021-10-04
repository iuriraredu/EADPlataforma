package br.com.estagioyaman.stepsDefinitions;

import br.com.estagioyaman.web.actions.HomeActions;
import io.cucumber.java.pt.Quando;

public class HomeSteps {

    private final HomeActions homeActions;

    public HomeSteps() {
        this.homeActions = new HomeActions();
    }

    @Quando("clico na imagem do usuário no canto superior direito")
    public void clicoNaImagemDoUsuarioNoCantoSuperiorDireito() {
        this.homeActions.clicaNaImagemDoUsuario();
    }
}
