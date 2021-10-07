package Methods;




import io.qameta.allure.Step;

import org.testng.Assert;
import Locators.Method2Elements;



public class Method2 extends Method2Elements {

    @Step("Move to Laptops & Notebooks")
    public Method2 moveto(){
        movetodesktops.hover();
        return this;
    }

    // Move to Laptops & Notebooks
    @Step("Move to Show All Laptops & Notebooks")
    public Method2 moveto2(){
        movetoelement.click();
        return this;
    }

    //Click on 'Show all Laptops & Notebooks' button
    @Step("Click on sorting arrow")
    public Method2 sortclick(){
        sort.click();
        return this;
    }

    //Sort by Price (High > Low)
    @Step("Sorting: (High>Low)")
    public Method2 sort(){
        sort2.click();
        return this;
    }


    @Step("Checking if sorts works well")
    public Method2 beforeSort(){
        Assert.assertNotEquals(firstItemPrice.getText(), "$2,000.00\n" +
                        "Ex Tax: $2,000.00");

        Assert.assertNotEquals(lastItemPrice.getText(), "$122.00\n" +
                "Ex Tax: $100.00");
        return this;
    }
    @Step("Checking if sorts works well")
    public Method2 afterSort(){
        Assert.assertEquals(firstItemPrice.getText(), "$2,000.00\n" +
                "Ex Tax: $2,000.00" );

        Assert.assertEquals(lastItemPrice.getText(), "$122.00\n" +
                "Ex Tax: $100.00");
        return this;
    }






}
