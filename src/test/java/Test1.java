import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.testng.Assert.assertEquals;

public class Test1 {
    @Test
    public void testPageUrlandTitle(){
        open("https://practice.automationbro.com/");

        String url = WebDriverRunner.url();
        assertEquals(url,"https://practice.automationbro.com/");

        String title = title();
        //assertEquals(title, "Practice E-Commerce Site � Automation Bro");


    }
}
