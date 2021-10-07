package Methods;

import Locators.Method1Elemenets;

import io.qameta.allure.Step;


public class Method1 extends Method1Elemenets {


        @Step("Clicking on my account")
        public Method1 ClickOnMyAccount(){
            myAccount.click();
            return this;
        }

        @Step("Clicking on register button")
        public Method1 ClickOnRegistration(){
            registrationBtn.click();
            return this;
        }

        @Step("filling first name")
        public Method1 fillfirstname(String firstname1){
            userfirstname.sendKeys(firstname1);
            return this;
        }

        @Step("filling last name")
        public Method1 filllasttname(String LastName1){
            userlasttname.sendKeys(LastName1);
            return this;
        }

        @Step("filling email")
        public Method1 fillemail(String Email1){
            useremail.sendKeys(Email1);
            return this;
        }

         @Step("filling phone number")
        public Method1 fillphone(String Phone1){
            userphone.sendKeys(Phone1);
            return this;
        }

        @Step("filling password")
        public Method1 fillpassword(String Password1){
            userpassword.sendKeys(Password1);
            return this;
        }

        @Step("confirming password")
        public Method1 confirmpassword(String ConfirmPassword1){
            userpasswordconfirm.sendKeys(ConfirmPassword1);
            return this;
        }

        @Step("agree checkbox")
        public Method1 agree(){
            agree.click();
            return this;
        }

        @Step("clicking on register button")
        public Method1 register(){
            registerbtn.click();
            return this;
     }


}
