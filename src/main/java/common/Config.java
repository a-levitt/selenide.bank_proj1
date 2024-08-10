package common;

import com.codeborne.selenide.Configuration;

public class Config {

    /**
     * Specify the browser for tests:
     * */
    public static final String BROWSER = "chrome"; // firefox, opera, ie, edge

    /**
     *  Clear browser cookies and local storage (after each test)
     * */
    public static final Boolean CLEAR_COOKIES = true;

    /**
     * Keep browser open after all tests/scenario
     * */
    public static final Boolean HOLD_BROWSER_OPEN = true;

    /**
     * Clear old screenshots before starting the build
     * */
    public static final Boolean CLEAR_REPORTS = true;

    static {
        Configuration.holdBrowserOpen = HOLD_BROWSER_OPEN;
        Configuration.reportsFolder = "build/reports/tests";
        Configuration.browser = BROWSER;
    }
}
