package Methods;

import Locators.Method4Elements;
import io.qameta.allure.Step;
import org.testng.Assert;


public class Method4 extends Method4Elements {



    @Step("Click on cart")
    public Method4 clickOnPic2(){
        checkout.click();
        return this;
    }

    @Step("Go to checkout")
    public Method4 clickOnCheckout(){
        clickOnCheckout.click();
        return this;
    }

    @Step("Fill firstname")
    public Method4 fillChOutFirstName(String firstName){
        chOutFirstName.sendKeys(firstName);
        return this;
    }

    @Step("Fill lastname")
    public Method4 fillChOutLastName(String LastName){
        chOutLastName.sendKeys(LastName);
        return this;
    }

    @Step("Fill city")
    public Method4 fillChOutCity(String city){
        chOutCity.sendKeys(city);
        return this;
    }

    @Step("Fill Zip code")
    public Method4 fillChOutPostCode(String postcode){
        chOutPostCode.sendKeys(postcode);
        return this;
    }

    @Step("Fill address")
    public Method4 fillChOutAddress(String address){
        chOutAddress.sendKeys(address);
        return this;
    }

    @Step("Click on country selector arrow")
    public Method4 pickChOutCountry(){
        chOutCountrySelector.click();
        return this;
    }

    @Step("Select country")
    public Method4 clickOnChOutCountry(){
        chOutPickCountry.click();
        return this;
    }

    @Step("Click on region selector arrow ")
    public Method4 pickOnChOutRegion(){
        chOutRegionSelector.click();
        return this;
    }

    @Step("Select region")
    public Method4 clickOnChOutRegion(){
        chOutPickSelector.click();
        return this;
    }

    @Step("Click on continue button")
    public Method4 continueMth(){
        continueBtn.click();
        return this;
    }

    @Step("Skip next method and clicking on continue method")
    public Method4 continueMth2(){
        continueBtn2.click();
        return this;
    }

    @Step("Skip next method and clicking on continue method")
    public Method4 continueMth3(){
        continueBtn3.click();
        return this;
    }

    @Step("Accept the terms")
    public Method4 checkboxMth(){
        checkbox.click();
        return this;
    }

    @Step("Click on continue method")
    public Method4 continueMth4(){
        continueBtn4.click();
        return this;
    }

    @Step("Check that Unit price and Sub total price is correct")
    public Method4 checkSubTotal(){
        Assert.assertEquals(subTotal.getText(), unitPrice.getText());
        return this;
    }

    @Step("Check that shipping price is correct")
    public Method4 checkShippingPrice(){
        Assert.assertEquals(shippingPrice.getText(), "$5.00");
        return this;
    }

    @Step("Check that total price and price in cart is correct")
    public Method4 checkTotal(){
        Assert.assertEquals("$122.00", totalPrice.getText());  //FOR FAIL
//        Assert.assertNotEquals("$122.00", totalPrice.getText());  //FOR PASS
        return this;
    }




}
