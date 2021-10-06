package br.com.estagioyaman.web.actions;

import br.com.estagioyaman.settings.BaseTest;
import br.com.estagioyaman.web.pages.HomePage;

public class HomeActions extends BaseTest {

    private final HomePage homePage;

    public HomeActions() {
        this.homePage = new HomePage(webDriver);
    }

    public void clicarNoBotaoLogin (){
        this.homePage.getBotaoLogin().click();
    }

}
