package tests.gateway.negative;


import common.Listener;
import constants.Constant;
import constants.Secure;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import pages.base.BasePage;
import pages.gateway.IbuGatewayFormPage;
import tests.base.BaseTest;

@Feature("Tests to check ibu gateway form fields")
@Story("A negative scenario")
@ExtendWith(Listener.class)
@Execution(ExecutionMode.CONCURRENT)
public class IbuGatewayFormNegativeTest extends BaseTest {

    @Test
    public void checkRequiredFields() {
        basePage.goToUrl(Constant.Urls.IBU_GATEWAY_URL);

        IbuGatewayFormPage page = new IbuGatewayFormPage()
                .focusName()
                .focusPassword()
                .focusName()
                .checkFillAlerts(BasePage.nameFieldRequiredAlert.getText(), BasePage.passwordFieldRequiredAlert.getText());
    }
}
