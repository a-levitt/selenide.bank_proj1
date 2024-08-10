package common;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import org.junit.jupiter.api.extension.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static common.CommonActions.clearCookiesAndStorage;
import static org.junit.jupiter.api.extension.ExtensionContext.Namespace.GLOBAL;

public class Listener implements TestWatcher, AfterEachCallback, BeforeAllCallback {

    private static final Logger LOGGER = LoggerFactory.getLogger(Listener.class);

    @Override
    public void beforeAll(ExtensionContext extensionContext) {
        extensionContext.getRoot().getStore(GLOBAL).put(true, this);
    }

    @Override
    public void afterEach(ExtensionContext extensionContext) {
        clearCookiesAndStorage();
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        LOGGER.info("Test {} - FAILED", context.getTestMethod().get().getName());
        String screenshotName = context.getTestMethod().get().getName() +
                String.valueOf(System.currentTimeMillis()).substring(9,13);
        LOGGER.info("Trying to get screenshot...");
        Selenide.screenshot(screenshotName);
        attachScreenshotToAllure();
    }

    @Attachment
    public byte[] attachScreenshotToAllure() {
        if (WebDriverRunner.hasWebDriverStarted()) {
            return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
        } else return null;
    }
}
