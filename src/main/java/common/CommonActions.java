package common;

import com.codeborne.selenide.Selenide;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static common.Config.CLEAR_COOKIES;

public class CommonActions {
    private static final Logger LOGGER = LoggerFactory.getLogger(CommonActions.class);

    public static void clearCookiesAndStorage() {
        if(CLEAR_COOKIES) {
            try {
                Selenide.clearBrowserCookies();
                Selenide.clearBrowserLocalStorage();
                Selenide.executeJavaScript("window.SessionStorage.clear()");
            } catch (Exception e) {
                LOGGER.error("Fail to clearCookiesAndStorage()", e.getMessage());
            }

        }
    }
}
