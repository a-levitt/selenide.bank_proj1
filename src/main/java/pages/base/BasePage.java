package pages.base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class BasePage {

    public final SelenideElement MobileAppQR = $x("//div[@class='time-check-wrap animated']");
    public final SelenideElement passwordForm = $x("//mat-dialog-container[@id='mat-dialog-1']");
    public final SelenideElement popUpTitleText = $x("//mat-card-title[@class='mat-card-title']");

    /**
     * Navigate to specific URL
     * */
    public void goToUrl(String url) {
        open(url);
    }


    public void isQRCodeDisplayed() {
        MobileAppQR.shouldBe(Condition.visible);
    }

    public void isRestorePasswordPopupVisible(String generationTitle) {
        passwordForm.shouldBe(Condition.visible);
        String title = popUpTitleText.getText();

        checkMessage(generationTitle);
        //Assertions.assertEquals("One Time Password (OTP) Generator", title);
    }

    public void checkMessage(String message) {
        $(byText(message)).shouldBe(Condition.visible);
    }
}
