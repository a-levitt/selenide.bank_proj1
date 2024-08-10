package tests.gateway.positive;

import common.Listener;
import constants.Constant;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import pages.gateway.IbuGatewayFormPage;
import constants.Secure;
import tests.base.BaseTest;

@Feature("Tests to check ibu gateway form fields")
@Story("A positive scenario")
@ExtendWith(Listener.class)
@Execution(ExecutionMode.CONCURRENT)
public class IbuGatewayFormTest extends BaseTest {
    @Test
    public void fillFormTest() {
        basePage.goToUrl(Constant.Urls.IBU_GATEWAY_URL);

        IbuGatewayFormPage page = new IbuGatewayFormPage()
                                            .enterName(Secure.formFillVariables.USERNAME)
                                            .enterPassword(Secure.formFillVariables.USER_PASSWORD)
                                            .clickForgotPassword();

        basePage.isRestorePasswordPopupVisible("One Time Password (OTP) Generator");
    }

}
