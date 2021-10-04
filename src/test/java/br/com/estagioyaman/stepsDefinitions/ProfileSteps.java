package br.com.estagioyaman.stepsDefinitions;

import br.com.estagioyaman.web.actions.ProfileActions;
import io.cucumber.java.pt.Entao;

import static org.junit.Assert.*;

public class ProfileSteps {
    private final ProfileActions profileActions;

    public ProfileSteps() {
         profileActions = new ProfileActions();
    }

    @Entao("sou redirecionado para o perfil {string}")
    public void souRedirecionadoParaOPerfil(String nomeUsuario) {
        assertEquals(nomeUsuario, this.profileActions.nomeUsuarioProfile());
    }
}
