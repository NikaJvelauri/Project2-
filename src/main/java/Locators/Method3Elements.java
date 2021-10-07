package Locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Method3Elements {
    public SelenideElement moveToDesktops = $(By.linkText("Desktops"));
    public SelenideElement clickOnDesktops = $(By.linkText("Show All Desktops"));
    public SelenideElement mp3player = $(By.xpath("//*[@id='column-left']/div[1]/a[10]"));
    public SelenideElement ipodShuffle = $(By.xpath("//*[@alt = 'iPod Touch' and @title = 'iPod Touch']"));
    public SelenideElement cartBtn = $(By.id("button-cart"));
}
