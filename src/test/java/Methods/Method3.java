package Methods;



import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import Locators.Method3Elements;

public class Method3 extends Method3Elements{

    @Step("Hovering into dekstops")
    public Method3 moveToDestop(){
        moveToDesktops.hover();
        return this;
    }

    @Step("Moving into desktops")
    public Method3 clickOnDestop(){
        clickOnDesktops.click();
        return this;
    }

    @Step("Moving into MP3 players")
    public Method3 clickOnMp3Player(){
        mp3player.click();
        return this;
    }

    @Step("Hovering ipod shuffle and checking if text is visible on mouse hover")
    public Method3 hoverIpodShuffle(){
        ipodShuffle.scrollTo();
        ipodShuffle.hover();
        String titleValue=ipodShuffle.getAttribute("title");
        Assert.assertEquals(titleValue,"iPod Touch");
        return this;
    }

    @Step("clicking on ipod touch")
    public Method3 clickIpodShuffle(){
        ipodShuffle.click();
        return this;
    }

    @Step("adding into cart")
    public Method3 clickAddToCart(){
        cartBtn.click();
        return this;
    }

    @Step("checking that price is correct in cart")
    public Method3 checkItemsPriceAndCount(){
        $("#cart-total").shouldHave(exactText("1 item(s) - $122.00"));
        Assert.assertEquals($(By.id("cart-total")).getText(),"1 item(s) - $122.00");
        return this;
    }
}
