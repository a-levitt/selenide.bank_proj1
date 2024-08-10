package pages.gateway;

import pages.base.BasePage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;


public class IbuGatewayFormPage extends BasePage {

    private final SelenideElement EnterUsernameField = $x("//input[@id='username']");
    private final SelenideElement EnterPasswordField = $x("//input[@id='password']");
    private final SelenideElement forgotPasswordButton = $x("//button[@class='mat-button ng-star-inserted']");

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

    public IbuGatewayFormPage checkFillAlerts(String nameFillAlert, String passwordFieldAlert) {
       checkMessage(nameFillAlert);
       checkMessage(passwordFieldAlert);

        return this;
    }

}
