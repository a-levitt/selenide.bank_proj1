//package tests;
//
//import com.codeborne.selenide.Condition;
//import common.Listener;
//import io.qameta.allure.Feature;
//import io.qameta.allure.Story;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.jupiter.api.parallel.Execution;
//import org.junit.jupiter.api.parallel.ExecutionMode;
//
//import static com.codeborne.selenide.Selenide.*;
//
//@Feature("Tests to check digital channels page")
//@Story("A positive scenario")
//@ExtendWith(Listener.class)
//@Execution(ExecutionMode.CONCURRENT)
//public class SelenideBaseTest {
//
//    @Test
//    public void test() throws InterruptedException {
//        open("https://www.bankofcyprus.com/en-gb");
//        $x("//button[@id='ccc-recommended-settings']").click();
//        $x("//button[@class='trigger-search trigger-search-desktop']").click();
//        $x("//input[@id='searchQueryDesktop']").setValue("Loans").pressEnter();
//        $x("//div[@class='wrapper intro']/p").shouldBe(Condition.visible);
//
//        //Thread.sleep(10000);
//    }
//}