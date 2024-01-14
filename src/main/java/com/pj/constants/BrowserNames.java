package com.pj.constants;


/**
 * Stores all major browser names in Enum
 *
 * @author Pavan Kumar Jadda
 * @since 2.0.0
 */
public enum BrowserNames {
    GOOGLE_CHROME("Google Chrome"), OTHER_CHROMIUM_BROWSER("Other Chromium Browser"), OPERA("Opera"), MOZILLA_FIREFOX("Mozilla Firefox"), SAFARI("Safari"),
    MICROSOFT_EDGE_CHROMIUM("Microsoft Edge Chromium"), MICROSOFT_EDGE_LEGACY("Microsoft Edge Legacy"), INTERNET_EXPLORER("Internet Explorer");

    private final String name;

    BrowserNames(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
