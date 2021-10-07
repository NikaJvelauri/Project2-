package Navigation;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public class Navigation {

   // Change default timeout with Selenide Configuration
   //Open the chrome browser
   //Navigate to the http://tutorialsninja.com/demo/

    String url = "http://tutorialsninja.com/demo/";


    public void navigation(){
        Configuration.timeout=8000;
        Configuration.startMaximized = true;
        open(url);
    }
}
