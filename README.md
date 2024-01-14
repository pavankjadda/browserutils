# Browser Utils
Library that contains Utility classes to get Browser, Operating System information of the requester from `HttpServletRequest`
1. BrowserUtils
2. OperatingSystemUtil

These utility methods are static and can be used directly without creating an instance of the class.

## BrowserUtils
This class has 2 methods:
1. `getBrowserName(String userAgent)`
2. `getBrowserVersion(String userAgent)`

### getBrowserName(String userAgent)
This method takes `userAgent` as input and returns the browser name as `String`. If the browser name is not found, it returns `Unknown Browser`. 
And if the `userAgent` is `null` or empty, it returns `null`.
### getBrowserVersion(String userAgent)
This method takes `userAgent` as input and returns the browser version as `String`. If the `userAgent` is `null` or empty, it returns `null` and if the browser version is not found, it returns `Unknown`

## OperatingSystemUtil
This class has 2 methods:
1. `getOperatingSystemName(String userAgent)`
2. `getOperatingSystemVersion(String userAgent)`

### getOperatingSystemName(String userAgent)
This method takes `userAgent` as input and returns the operating system name as `String`. If the operating system name is not found, it returns `Unknown`.
And if the `userAgent` is `null` or empty, it returns `null`.
### getOperatingSystemVersion(String userAgent)
This method takes `userAgent` as input and returns the operating system version as `String`. If the `userAgent` is `null` or empty, it returns `null` and if the operating system version is not found, it returns `Unknown`
