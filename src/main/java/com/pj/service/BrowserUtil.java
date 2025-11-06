package com.pj.service;

import com.pj.constants.BrowserNames;
import com.pj.constants.Labels;
import jakarta.servlet.http.HttpServletRequest;

/**
 * Gets Browser name, Browser Version from User Agent
 *
 * @author Pavan Kumar Jadda
 * @since 1.0.0
 */
public class BrowserUtil {
    private BrowserUtil() {
        // Hides public constructor
    }

    /**
     * Gets Browser Name from the {@link HttpServletRequest}
     *
     * @param userAgent User Agent of the request
     *
     * @return Browser Name from the User Agent
     *
     * @author Pavan Kumar Jadda
     * @since 1.0.0
     */
    public static String getBrowserName(String userAgent) {
        if(userAgent == null || userAgent.isBlank()) return null;
        else if (userAgent.contains(Labels.TRIDENT) || userAgent.contains(Labels.MSIE))
            return BrowserNames.INTERNET_EXPLORER.toString();
        else if (userAgent.contains(Labels.EDG) && !userAgent.contains(Labels.EDGE) && userAgent.contains(Labels.CHROME))
            return BrowserNames.MICROSOFT_EDGE_CHROMIUM.toString();
        else if (userAgent.contains(Labels.EDGE) && userAgent.contains(Labels.CHROME))
            return BrowserNames.MICROSOFT_EDGE_LEGACY.toString();
        else if (userAgent.contains(Labels.FIREFOX)) return BrowserNames.MOZILLA_FIREFOX.toString();
        else if (userAgent.contains(Labels.SAFARI) && !userAgent.contains(Labels.CHROME) && !userAgent.contains(Labels.CHROMIUM))
            return BrowserNames.SAFARI.toString();
        else if (userAgent.contains(Labels.OPERA)) return BrowserNames.OPERA.toString();
        else if (userAgent.contains(Labels.CHROME) && !userAgent.contains(Labels.CHROMIUM))
            return BrowserNames.GOOGLE_CHROME.toString();
        else if (userAgent.contains(Labels.CHROME)) return BrowserNames.OTHER_CHROMIUM_BROWSER.toString();
        else return "Unknown Browser";
    }

    /**
     * Gets Browser Version from the {@link HttpServletRequest}
     *
     * @param userAgent User Agent of the request
     *
     * @return Browser version from the User Agent
     *
     * @author Pavan Kumar Jadda
     * @since 1.0.0
     */
    public static String getBrowserVersion(String userAgent) {
        var browserVersion = Labels.UNKNOWN;

        if(userAgent == null || userAgent.isBlank()) return null;
        else if (userAgent.contains(Labels.TRIDENT) || userAgent.contains(Labels.MSIE))
            browserVersion = userAgent.substring(userAgent.indexOf(Labels.TRIDENT)).split("/")[1];

        else if (userAgent.contains(Labels.EDG) && !userAgent.contains(Labels.EDGE) && userAgent.contains(Labels.CHROME))
            browserVersion = userAgent.substring(userAgent.indexOf(Labels.EDG)).split("/")[1];

        else if (userAgent.contains(Labels.EDGE) && userAgent.contains(Labels.CHROME))
            browserVersion = userAgent.substring(userAgent.indexOf(Labels.EDGE)).split("/")[1];

        else if (userAgent.contains(Labels.FIREFOX))
            browserVersion = userAgent.substring(userAgent.indexOf(Labels.FIREFOX)).split("/")[1];

        else if (userAgent.contains(Labels.SAFARI) && !userAgent.contains(Labels.CHROME) && !userAgent.contains(Labels.CHROMIUM))
            browserVersion = userAgent.substring(userAgent.indexOf("Version/") + 8).split(" ")[0];

        else if (userAgent.contains(Labels.OPERA))
            browserVersion = userAgent.substring(userAgent.indexOf("OPR")).split("/")[1];

        else if (userAgent.contains(Labels.CHROME) && !userAgent.contains(Labels.CHROMIUM)) {
            browserVersion = userAgent.substring(userAgent.indexOf("Chrome")).split("/")[1];
            browserVersion = browserVersion.split(" ")[0];
        }

        return browserVersion;
    }
}