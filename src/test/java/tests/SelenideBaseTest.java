//package tests;
//
//import com.codeborne.selenide.Condition;
//import org.junit.jupiter.api.Test;
//
//import static com.codeborne.selenide.Selenide.*;
//
//public class SelenideBaseTest {
//
//    @Test
//    public void test()  throws InterruptedException{
//        open("https://www.bankofcyprus.com/en-gb");
//        $x("//button[@id='ccc-recommended-settings']").click();
//        $x("//button[@class='trigger-search trigger-search-desktop']").click();
//        $x("//input[@id='searchQueryDesktop']").setValue("Loans").pressEnter();
//        $x("//div[@class='wrapper intro']/p").shouldBe(Condition.visible);
//
//        //Thread.sleep(10000);
//    }
//}
