package com.pj;


import com.pj.service.BrowserUtil;
import com.pj.service.OperatingSystemUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class BrowserNameDetectionTest {
    @Test
    void testInternetExplorerDetection() {
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; rv:11.0) like Gecko";
        System.out.println(BrowserUtil.getBrowserName(userAgent));
        System.out.println(BrowserUtil.getBrowserVersion(userAgent));
        System.out.println(OperatingSystemUtil.getOperatingSystemName(userAgent));
        System.out.println(OperatingSystemUtil.getOperatingSystemVersion(userAgent));
        Assertions.assertNotNull(BrowserUtil.getBrowserName(userAgent));
    }

    @Test
    void testEdgeChromiumBrowserDetection() {
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.140 Safari/537.36 Edge/18.17763";
        System.out.println(BrowserUtil.getBrowserName(userAgent));
        System.out.println(BrowserUtil.getBrowserVersion(userAgent));
        System.out.println(OperatingSystemUtil.getOperatingSystemName(userAgent));
        System.out.println(OperatingSystemUtil.getOperatingSystemVersion(userAgent));
        Assertions.assertNotNull(BrowserUtil.getBrowserName(userAgent));
    }

    @Test
    void testEdgeLegacyBrowserDetection() {
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.140 Safari/537.36 Edg/18.17763";
        System.out.println(BrowserUtil.getBrowserName(userAgent));
        System.out.println(BrowserUtil.getBrowserVersion(userAgent));
        System.out.println(OperatingSystemUtil.getOperatingSystemName(userAgent));
        System.out.println(OperatingSystemUtil.getOperatingSystemVersion(userAgent));
        Assertions.assertNotNull(BrowserUtil.getBrowserName(userAgent));
    }

    @Test
    void testChromeBrowserDetection() {
        String userAgent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.82 Safari/537.36";
        System.out.println(BrowserUtil.getBrowserName(userAgent));
        System.out.println(BrowserUtil.getBrowserVersion(userAgent));
        System.out.println(OperatingSystemUtil.getOperatingSystemName(userAgent));
        System.out.println(OperatingSystemUtil.getOperatingSystemVersion(userAgent));
        Assertions.assertNotNull(BrowserUtil.getBrowserName(userAgent));
    }

    @Test
    void testOtherChromiumBrowserDetection() {
        String userAgent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.152 Safari/537.36";
        System.out.println(BrowserUtil.getBrowserName(userAgent));
        System.out.println(BrowserUtil.getBrowserVersion(userAgent));
        System.out.println(OperatingSystemUtil.getOperatingSystemName(userAgent));
        System.out.println(OperatingSystemUtil.getOperatingSystemVersion(userAgent));
        Assertions.assertNotNull(BrowserUtil.getBrowserName(userAgent));
    }

    @Test
    void testFirefoxBrowserDetection() {
        String userAgent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:86.0) Gecko/20100101 Firefox/86.0";
        System.out.println(BrowserUtil.getBrowserName(userAgent));
        System.out.println(BrowserUtil.getBrowserVersion(userAgent));
        System.out.println(OperatingSystemUtil.getOperatingSystemName(userAgent));
        System.out.println(OperatingSystemUtil.getOperatingSystemVersion(userAgent));
        Assertions.assertNotNull(BrowserUtil.getBrowserName(userAgent));
    }

    @Test
    void testSafariBrowserDetection() {
        String userAgent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.0.3 Safari/605.1.15";
        System.out.println(BrowserUtil.getBrowserName(userAgent));
        System.out.println(BrowserUtil.getBrowserVersion(userAgent));
        System.out.println(OperatingSystemUtil.getOperatingSystemName(userAgent));
        System.out.println(OperatingSystemUtil.getOperatingSystemVersion(userAgent));
        Assertions.assertNotNull(BrowserUtil.getBrowserName(userAgent));
    }

    @Test
    void testOperaBrowserDetection() {
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36 OPR/56.0.3051.52";
        System.out.println(BrowserUtil.getBrowserName(userAgent));
        System.out.println(BrowserUtil.getBrowserVersion(userAgent));
        System.out.println(OperatingSystemUtil.getOperatingSystemName(userAgent));
        System.out.println(OperatingSystemUtil.getOperatingSystemVersion(userAgent));
        Assertions.assertNotNull(BrowserUtil.getBrowserName(userAgent));
    }
}
