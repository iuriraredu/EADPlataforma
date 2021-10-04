package br.com.estagioyaman.web.actions;

import br.com.estagioyaman.settings.BaseTest;
import br.com.estagioyaman.web.pages.ProfilePage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProfileActions extends BaseTest {
    private ProfilePage profilePage;

    public ProfileActions() {
        this.profilePage = new ProfilePage(webDriver);
    }

    public String nomeUsuarioProfile(){
        wait.until(ExpectedConditions.elementToBeClickable(this.profilePage.getNomeUsuario()));
        return this.profilePage.getNomeUsuario().getText();
    }

}
