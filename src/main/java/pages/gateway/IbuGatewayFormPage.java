package pages.gateway;

import pages.base.BasePage;

import org.junit.jupiter.api.Assertions;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;


public class IbuGatewayFormPage extends BasePage {

    private final SelenideElement EnterUsernameField = $x("//input[@id='username']");
    private final SelenideElement EnterPasswordField = $x("//input[@id='password']");
    private final SelenideElement forgotPasswordButton = $x("//button[@class='mat-button ng-star-inserted']");
    private final SelenideElement nameFieldRequiredAlert = $x("//mat-error[@id='mat-error-0']");
    private final SelenideElement passwordFieldRequiredAlert = $x("//mat-error[@id='mat-error-1']");

    public IbuGatewayFormPage enterName(String name) {
        EnterUsernameField.shouldBe(Condition.visible).sendKeys(name);
        return this;
    }

    public IbuGatewayFormPage enterPassword(String password) {
       EnterPasswordField.shouldBe(Condition.visible).sendKeys(password);
        return this;
    }

    public IbuGatewayFormPage focusName() {
        EnterUsernameField.shouldBe(Condition.visible).click();
        return this;
    }

    public IbuGatewayFormPage focusPassword() {
       EnterPasswordField.shouldBe(Condition.visible).click();
        return this;
    }

    public IbuGatewayFormPage clickForgotPassword() {
        forgotPasswordButton.shouldBe(Condition.visible).click();
        return this;
    }

    public IbuGatewayFormPage checkFillAlerts() {
        SelenideElement nameAlert = nameFieldRequiredAlert;
        SelenideElement passwordAlert = passwordFieldRequiredAlert;

        nameAlert.shouldBe(Condition.visible);
        passwordAlert.shouldBe(Condition.visible);
        String nameAlertText = nameAlert.getText();
        String passwordAlertText = passwordAlert.getText();

        Assertions.assertEquals("User name is required", nameAlertText);
        Assertions.assertEquals("Password is required", passwordAlertText);

        return this;
    }

}
