package br.com.estagioyaman.web.actions;

import br.com.estagioyaman.settings.BaseTest;
import br.com.estagioyaman.web.pages.HomeLogadaPage;

public class HomeLogadaActions extends BaseTest {
    private HomeLogadaPage homeLogadaPage;

    public HomeLogadaActions() {
        this.homeLogadaPage = new HomeLogadaPage(webDriver);
    }

    public String mensagemTelaHome(){
        return this.homeLogadaPage.getHomeText().getText();
    }
}
