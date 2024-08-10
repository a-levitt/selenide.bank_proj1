package pages.base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$x;

public class BasePage {

    public final SelenideElement MobileAppQR = $x("//div[@class='time-check-wrap animated']");
    public final SelenideElement passwordForm = $x("//mat-dialog-container[@id='mat-dialog-1']");
    public final SelenideElement popUpTitleText = $x("//mat-card-title[@class='mat-card-title']");
    public static final SelenideElement nameFieldRequiredAlert = $x("//mat-error[@id='mat-error-0']");
    public static final SelenideElement passwordFieldRequiredAlert = $x("//mat-error[@id='mat-error-1']");
    public static final SelenideElement acceptButton = $x("//button[@id='ccc-recommended-settings']");
    /**
     * Navigate to specific URL
     * */
    public void goToUrl(String url) {
        open(url);
        acceptButton.shouldBe(Condition.visible).click();
    }


    public void isQRCodeDisplayed() {
        MobileAppQR.shouldBe(Condition.visible);
    }

    public void isRestorePasswordPopupVisible(String generationTitle) {
        passwordForm.shouldBe(Condition.visible);
        String title = popUpTitleText.getText();
        Assertions.assertEquals(generationTitle, title);
    }

    public void checkMessage(String message) {
        $(byText(message)).shouldBe(Condition.visible);
    }
}
