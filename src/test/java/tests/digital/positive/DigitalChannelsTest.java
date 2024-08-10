package tests.digital.positive;

import common.Listener;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import pages.digital.DigitalChannelsPage;
import tests.base.BaseTest;

import static constants.Constant.Urls.*;

@Feature("Tests to check digital channels page")
@Story("A positive scenario")
@ExtendWith(Listener.class)
@Execution(ExecutionMode.CONCURRENT)
public class DigitalChannelsTest extends BaseTest {
    @Test
    void isRedirectToApp() {
        basePage.goToUrl(DIGITAL_CHANNELS_URL);

        DigitalChannelsPage page = new DigitalChannelsPage()
                .getCarInsuranceBanner()
                .getAQuote();
        basePage.isQRCodeDisplayed();
    }
}
