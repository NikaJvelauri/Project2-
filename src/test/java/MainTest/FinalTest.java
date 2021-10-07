package MainTest;
import Navigation.Navigation;
import ScreenshotFailAndRetry.RetryTests;
import ScreenshotFailAndRetry.ScreenshotOnFail;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;

import DataBaseActions.DB;
import Methods.Method1;
import Methods.Method2;
import Methods.Method3;
import Methods.Method4;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Epic("Project 2")
@Feature("All Methods")
@Listeners(ScreenshotOnFail.class)
public class FinalTest extends DataBaseActions.DB {

    @BeforeClass(groups = {"Resgression1"})
    public void setup() {
        Navigation navigation = new Navigation();
        navigation.navigation();
        DB database = new DB();
        database.getConnection()
        .insertData()
        .getData();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }




    @Story("Click For Method 1 result")
    @Description("This Method is for Registration!")
    @Test(priority = 1, groups = {"Resgression1"})
    public void Method1test(){
        Method1 registration = new Method1();
        registration.ClickOnMyAccount()
                    .ClickOnRegistration()
                    .fillfirstname(name)
                    .filllasttname(LastName)
                    .fillemail(Email)
                    .fillphone(Phone)
                    .agree()
                    .fillpassword(Password)
                    .confirmpassword(Password)
                    .register();
    }

    @Story("Click For Method 2 result")
    @Description("This Method is for sorting by price (HIGH>LOW)")
    @Test(priority = 2, groups = {"Resgression1"})
    public void Method2test(){
        Method2 method2 = new Method2();
        method2.moveto()
                .moveto2()
                .sortclick()
                .beforeSort()
                .sort()
                .afterSort();

    }

    @Story("Click For Method 3 result")
    @Description("With this method we choose ipod touch and add to cart")
    @Test(priority = 3,dependsOnMethods = { "Method1test" }, groups = {"Resgression2"})
    public void Method3test(){
        Method3 method3 = new Method3();
        method3.moveToDestop()
                .clickOnDestop()
                .clickOnMp3Player()
                .hoverIpodShuffle()
                .clickIpodShuffle()
                .clickAddToCart()
                .checkItemsPriceAndCount();


    }

    @Story("Click For Method 4 result")
    @Description("With this method we are ordering this Ipod touch")
    @Test(priority = 4, retryAnalyzer = RetryTests.class, dependsOnMethods = {"Method3test"}, groups = {"Resgression2"})
    public void Method4Test(){
        Method4 method4 = new Method4();
        method4.clickOnPic2()
                .clickOnCheckout()
                .fillChOutFirstName(name)
                .fillChOutLastName(LastName)
                .fillChOutAddress(Address)
                .fillChOutCity(city)
                .fillChOutPostCode(shortZip)
                .pickChOutCountry()
                .clickOnChOutCountry()
                .pickOnChOutRegion()
                .clickOnChOutRegion()
                .continueMth()
                .continueMth2()
                .continueMth3()
                .checkboxMth()
                .continueMth4()
                .checkSubTotal()
                .checkShippingPrice()
                .checkTotal();  //Faildeba inaxavs screens da retrys meshveobit meordeba samjer

    }
}

