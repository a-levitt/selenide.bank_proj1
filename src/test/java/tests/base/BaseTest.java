package tests.base;

import com.codeborne.selenide.SelenideElement;
import common.Listener;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.base.BasePage;
import pages.digital.DigitalChannelsPage;
import pages.gateway.IbuGatewayFormPage;
import pages.insurance.InsurancePlansPage;

import java.io.File;
import java.time.LocalTime;
import java.util.Objects;

import static com.codeborne.selenide.Selenide.$x;
import static common.Config.*;

@ExtendWith(Listener.class)
@Execution(ExecutionMode.CONCURRENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    protected BasePage basePage = new BasePage();
    protected InsurancePlansPage insurancePage = new InsurancePlansPage();
    protected DigitalChannelsPage digitalPage = new DigitalChannelsPage();
    protected IbuGatewayFormPage ibuGatewayPage = new IbuGatewayFormPage();
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);

    static {
        LOGGER.info("START TIME: " + LocalTime.now());
        LOGGER.info("Clear reports directory build/reports/ ...");
        File allureResults = new File("allure-results");
        if (allureResults.isDirectory()) {
            for (File item : Objects.requireNonNull(allureResults.listFiles())) {
                item.delete();
            }
        }
        if (CLEAR_REPORTS) {
            File reports = new File("build/reports/tests");
            if (allureResults.isDirectory()) {
                for (File item : Objects.requireNonNull(allureResults.listFiles())) {
                    item.delete();
                }
            }
            File downloads = new File("build/downloads");
            if (downloads.isDirectory()) {
                for (File screenshot : Objects.requireNonNull(reports.listFiles())) {
                    screenshot.delete();
                }
            }


            LOGGER.info("Old screenshots and reports deleted");
        }
    }
}
