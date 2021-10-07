package Locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import DataBaseActions.DB;

public class Method4Elements extends DB{
    public SelenideElement checkout = $(By.id("cart-total"));
    public SelenideElement clickOnCheckout = $(By.className("fa-share"));
    public SelenideElement chOutFirstName = $(By.xpath("//*[@id='input-payment-firstname']"));
    public SelenideElement chOutLastName = $(By.xpath("//*[@id='input-payment-lastname']"));
    public SelenideElement chOutAddress = $(By.xpath("//*[@id='input-payment-address-1']"));
    public SelenideElement chOutCity = $(By.xpath("//*[@id='input-payment-city']"));
    public SelenideElement chOutPostCode = $(By.xpath("//*[@id='input-payment-postcode']"));
    public SelenideElement chOutCountrySelector = $(By.xpath("//*[@id='input-payment-country']"));
    public SelenideElement chOutPickCountry = $(By.xpath("//*[@value = '223']"));
    public SelenideElement chOutRegionSelector = $(By.xpath("//*[@id='input-payment-zone']"));
    public SelenideElement chOutPickSelector = $(By.xpath("//*[@value = '3674']"));
    public SelenideElement continueBtn = $(By.xpath("//*[@id='button-payment-address']"));
    public SelenideElement continueBtn2 = $(By.xpath("//*[@id='button-shipping-address']"));
    public SelenideElement continueBtn3 =  $(By.xpath("//*[@id='button-shipping-method']"));
    public SelenideElement checkbox =  $(By.xpath("//*[@type = 'checkbox' and @value = '1']"));
    public SelenideElement continueBtn4 =  $(By.xpath("//*[@id='button-payment-method']"));
    public SelenideElement cartTotal = $(By.xpath("//*[@id='cart-total']"));
    public SelenideElement unitPrice = $(By.xpath("//*[@id='collapse-checkout-confirm']/div/div[1]/table/tbody/tr/td[4]"));
    public SelenideElement subTotal = $(By.xpath("//*[@id='collapse-checkout-confirm']/div/div[1]/table/tfoot/tr[1]/td[2]"));
    public SelenideElement shippingPrice = $(By.xpath("//*[@id='collapse-checkout-confirm']/div/div[1]/table/tfoot/tr[2]/td[2]"));
    public SelenideElement totalPrice = $(By.xpath("//*[@id='collapse-checkout-confirm']/div/div[1]/table/tfoot/tr[3]/td[2]"));


}
