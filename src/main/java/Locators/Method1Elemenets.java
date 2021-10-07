package Locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Method1Elemenets {
    public SelenideElement myAccount = $(By.className("caret"));
    public SelenideElement registrationBtn = $(By.linkText("Register"));
    public SelenideElement userfirstname =  $(By.id("input-firstname"));
    public SelenideElement userlasttname =  $(By.id("input-lastname"));
    public SelenideElement useremail =  $(By.id("input-email"));
    public SelenideElement userphone=  $(By.id("input-telephone"));
    public SelenideElement userpassword=  $(By.id("input-password"));
    public SelenideElement userpasswordconfirm=  $(By.id("input-confirm"));
    public SelenideElement agree =  $(By.name("agree"));
    public SelenideElement registerbtn = $(By.className("btn-primary"));
}
