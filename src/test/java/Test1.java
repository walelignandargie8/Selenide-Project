import org.checkerframework.checker.fenum.qual.AwtAlphaCompositingRule;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Test1 {
  /*  @Test
    public void testPageUrlandTitle(){
        open("https://practice.automationbro.com/");

        String url = WebDriverRunner.url();
        assertEquals(url,"https://practice.automationbro.com/");

        String title = title();
        //assertEquals(title, "Practice E-Commerce Site � Automation Bro");
    }
   */
    @Test
    public void verifyLogin(){
        open("https://practice.automationbro.com/");
        $(By.xpath("//ul[@id='primary-menu']/li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-619']")).click();
        $(By.xpath("//input[@id='username']")).sendKeys("User123forTest");
        $(By.xpath("//input[@id='password']")).sendKeys("Pa$$w0rd@123");
        $(By.xpath("//button[@name='login']")).click();
        $(By.xpath("//input[@id='rememberme']")).click();
        $(".woocommerce-error > li").shouldHave(text("Error"));
        $(By.xpath("//button[@name='register']")).shouldHave(visible);
        //$(".loading progress").shouldBe(visible);
        //$(".CssSelector").shouldNotBe(selected);
        //$("#gender").shouldBe(selected);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
