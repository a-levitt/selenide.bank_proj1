package pages.insurance;

import pages.base.BasePage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;


public class InsurancePlansPage extends BasePage {

    // https://www.bankofcyprus.com/en-gb/Personal/Digital_Channels/hidden/gic_homeinsurance_awareness/
    // ?nextScreen=home_insurance&utm_source=website&utm_medium=website&utm_campaign=Home

    //https://www.bankofcyprus.com/en-gb/Personal/Digital_Channels/hidden/qr-code-home-insurance/
    // ?nextScreen=home_insurance&utm_source=SM&utm_medium=SM&utm_campaign=Home

    private final SelenideElement getProposalButton = $x("(//a[@class='current-accounts-overlay-link'])[2]");
    private final SelenideElement mobileAppRedirectButton = $x("//a[@class='bp-image-banner-btn animated']");

    public InsurancePlansPage getHomeInsurance() {
        getProposalButton.shouldBe(Condition.visible).click();
        return this;
    }

    public InsurancePlansPage getAQuickQuote() {
        mobileAppRedirectButton.shouldBe(Condition.visible).click();
        return this;
    }
}
