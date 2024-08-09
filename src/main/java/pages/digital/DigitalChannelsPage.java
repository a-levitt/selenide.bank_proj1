package pages.digital;

import com.codeborne.selenide.Condition;
import pages.base.BasePage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;


public class DigitalChannelsPage extends BasePage {

    private final SelenideElement getCarInsurance = $x("//a[normalize-space()='Get your car insurance']");
    private final SelenideElement getQuoteButton = $x("//a[@class='bp-image-banner-btn animated']");

    public DigitalChannelsPage getCarInsuranceBanner() {
        getCarInsurance.shouldBe(Condition.visible).click();
        return this;
    }

    public DigitalChannelsPage getAQuote() {
        getQuoteButton.shouldBe(Condition.visible).click();
        return this;
    }


}
