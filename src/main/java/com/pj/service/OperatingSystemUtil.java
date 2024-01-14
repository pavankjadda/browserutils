package com.pj.service;

import com.pj.constants.Labels;
import jakarta.servlet.http.HttpServletRequest;

/**
 * Gets Requester Operating System(OS) and OS Version based on userAgent
 *
 * @author Pavan Kumar Jadda
 * @since 1.0.0
 */
public class OperatingSystemUtil {
    private OperatingSystemUtil() {
        // Hides public constructor
    }

    /**
     * Gets browser Operating System name from the {@link HttpServletRequest}
     *
     * @author Pavan Kumar Jadda
     * @since 1.0.0
     */
    public static String getOperatingSystemName(String userAgent) {
        String osType = Labels.UNKNOWN;
        if (userAgent.contains(Labels.WINDOWS_NT)) {
            osType = Labels.WINDOWS;
        } else if (userAgent.contains(Labels.MAC_OS)) {
            osType = Labels.MAC_OS;
            if (userAgent.contains(Labels.IPHONE) || userAgent.contains(Labels.IPAD)) {
                osType = Labels.IOS;
            }
        } else if (userAgent.contains(Labels.LINUX)) {
            osType = Labels.LINUX;
        } else if (userAgent.contains("X11")) {
            osType = Labels.UNIX;
        } else if (userAgent.contains("android")) {
            osType = Labels.ANDROID;
        }
        return osType;
    }

    /**
     * Gets browser Operating System name from the {@link HttpServletRequest}
     *
     * @author Pavan Kumar Jadda
     * @since 1.0.0
     */
    public static String getOperatingSystemVersion(String userAgent) {
        String osVersion = Labels.UNKNOWN;
        if (userAgent.contains(Labels.WINDOWS_NT)) {
            osVersion = userAgent.substring(userAgent.indexOf(Labels.WINDOWS_NT + " ") + 11, userAgent.indexOf(";"));
        } else if (userAgent.contains(Labels.MAC_OS)) {
            osVersion = userAgent.substring(userAgent.indexOf(Labels.MAC_OS + " ") + 7, userAgent.indexOf(")"));
        } else if (userAgent.contains("X11")) {
            osVersion = "Unknown";
        } else if (userAgent.contains("android")) {
            osVersion = Labels.UNKNOWN;
        }
        return osVersion;
    }
}
