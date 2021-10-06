package br.com.estagioyaman.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeLogadaPage {

    public HomeLogadaPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//a[text()='Home']")
    private WebElement homeText;

    public WebElement getHomeText() {
        return homeText;
    }
}
