package Locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Method2Elements {
    public SelenideElement movetodesktops = $(By.linkText("Laptops & Notebooks"));
    public SelenideElement movetoelement = $(By.linkText("Show All Laptops & Notebooks"));
    public SelenideElement sort = $(By.id("input-sort"));
    public SelenideElement sort2 = $(By.xpath("//*[@id='input-sort']/option[5]"));
    public SelenideElement firstItemPrice = $("#content > div:nth-child(7) > div:nth-child(1) > div > div:nth-child(2) > div.caption > p.price");
    public SelenideElement lastItemPrice = $("#content > div:nth-child(7) > div:nth-child(5) > div > div:nth-child(2) > div.caption > p.price");
}
