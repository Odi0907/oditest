package drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class Drivers {

    private static DesiredCapabilities caps = new DesiredCapabilities();
    private static AppiumDriver<MobileElement> driver;
    public static Properties prop = new Properties();
    static InputStream input = null;
    public static String device = null;
    public static String build = null;
    public static String platform = null;
    public static String buildPath = null;

    // Get the device from the command line
    public static String getDevice() {
        device = System.getProperty("device");
        return device;
    }

    // Get the environment from the command line (dev, qa, uat, prod)
    public static String getBuild() {
        build = System.getProperty("env");
        return build;
    }

    // Get the platform from the command line (iOS or Android)
    public static String getPlatform() {
        platform = System.getProperty("platform");
        return platform;
    }

    // Get the build path + filename without the extension (appended depending of the platform)
    public static String getBuildPath() {
        buildPath = prop.getProperty("buildPath") + "/" + System.getProperty("env") + "/" + prop.getProperty("filename");
        return buildPath;
    }

    public static AppiumDriver<MobileElement> getDriver() throws IOException {
//		load properties file
        input = new FileInputStream("properties/driver.properties");
        prop.load(input);

        getDevice();
        getBuild();
        getPlatform();
        getBuildPath();

//		device is set at command line
        switch(device) {

            // iOS devices
            case "iosSim":
                iosSimSetup();
                break;

            case "iphone6Plus":
                iPhone6PlusSetup();
                break;

            case "iphone6SPlus":
                iPhone6SPlusSetup();
                break;

            case "iphone5c":
                iPhone5cSetup();
                break;

            // Android devices
            case "androidSim":
                androidSimSetup();
                break;

            case "samsung":
                samsungSetup();
                break;

            case "htcOneM9":
                htcOneM9Setup();
                break;

            case "htcOne":
                htcOneSetup();
                break;

            case "motorolaMotoG":
                motorolaMotoGSetup();
                break;

            case "samsungS4Mini":
                samsungS4MiniSetup();
                break;

            case "googleNexus4":
                googleNexus4Setup();
                break;

            // Android emulators
            case "genymotionNexus5":
                genymotionNexus5Setup();
                break;

            case "genymotionNexus5X":
                genymotionNexus5XSetup();
                break;

            case "genymotionNexus5X7":
                genymotionNexus5X7Setup();
                break;

            default:
                iosSimSetup();
                break;
        }

        // Setup common properties
        if(platform.equals("android")) {
            androidSetup();
        } else {
            iosSetup();
        }

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

    // Common platform configuration
    public static void iosSetup() throws MalformedURLException {
        caps.setCapability("platformName", prop.getProperty("ios_platform_name"));
        caps.setCapability("app", System.getProperty("user.dir") + buildPath + ".ipa");
        driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

    public static void androidSetup() throws MalformedURLException {
        caps.setCapability("platformName", prop.getProperty("android_platform_name"));
        caps.setCapability("app", System.getProperty("user.dir") + buildPath + ".apk");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

    // Custom configuration of the devices
    public static void androidSimSetup() throws MalformedURLException {
        caps.setCapability("platformVersion", System.getProperty("version"));
        caps.setCapability("deviceName", System.getProperty("name"));
    }

    public static void iosSimSetup() throws MalformedURLException {
        caps.setCapability("platformVersion", System.getProperty("version"));
        caps.setCapability("deviceName", System.getProperty("name"));
    }

    public static void iPhone6PlusSetup() throws MalformedURLException {
        caps.setCapability("deviceName", prop.getProperty("iphone6plus_device_name"));
        caps.setCapability("udid", prop.getProperty("iphone6plus_udid"));
        caps.setCapability("autoAcceptAlerts",true);
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("bootstrapPath", "/usr/local/lib/node_modules/appium/node_modules/appium-xcuitest-driver/WebDriverAgent");
        caps.setCapability("agentPath", "/usr/local/lib/node_modules/appium/node_modules/appium-xcuitest-driver/WebDriverAgent/WebDriverAgent.xcodeproj");

    }

    public static void iPhone6SPlusSetup() throws MalformedURLException {
        caps.setCapability("deviceName", prop.getProperty("iphone6SPlus_device_name"));
        caps.setCapability("udid", prop.getProperty("iphone6SPlus_udid"));
        caps.setCapability("autoAcceptAlerts", true);
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("bootstrapPath", "/usr/local/lib/node_modules/appium/node_modules/appium-xcuitest-driver/WebDriverAgent");
        caps.setCapability("agentPath", "/usr/local/lib/node_modules/appium/node_modules/appium-xcuitest-driver/WebDriverAgent/WebDriverAgent.xcodeproj");

    }

    public static void iPhone5cSetup() throws MalformedURLException {
        caps.setCapability("deviceName", prop.getProperty("iphone5C_device_name_2"));
        caps.setCapability("udid", prop.getProperty("iphone5C_udid"));
        caps.setCapability("autoAcceptAlerts",true);

    }

    public static void samsungSetup() throws MalformedURLException {
        caps.setCapability("deviceName", prop.getProperty("samsung_device_name"));
        caps.setCapability("app", System.getProperty("user.dir") + buildPath + ".apk");
    }

    // Android devices
    public static void htcOneM9Setup() throws MalformedURLException {
        caps.setCapability("deviceName", prop.getProperty("htcOneM9_device_name"));
        caps.setCapability("app", System.getProperty("user.dir") + buildPath + ".apk");
        caps.setCapability("automationName", "uiautomator2");
        caps.setCapability("appActivity", "com.whitbread.tda.components.start.activities.StartActivity");
    }

    public static void htcOneSetup() throws MalformedURLException {
        caps.setCapability("deviceName", prop.getProperty("htcOne_device_name"));
        caps.setCapability("app", System.getProperty("user.dir") + buildPath + ".apk");
        caps.setCapability("automationName", "uiautomator2");
        caps.setCapability("appActivity", "com.whitbread.tda.components.start.activities.StartActivity");
    }

    public static void motorolaMotoGSetup() throws MalformedURLException {
        caps.setCapability("deviceName", prop.getProperty("motorolaMotoG_device_name"));
        caps.setCapability("app", System.getProperty("user.dir") + buildPath + ".apk");
        caps.setCapability("automationName", "uiautomator2");
        caps.setCapability("appActivity", "com.whitbread.tda.components.start.activities.StartActivity");
    }

    public static void samsungS4MiniSetup() throws MalformedURLException {
        caps.setCapability("deviceName", prop.getProperty("samsungS4Mini_device_name"));
        caps.setCapability("app", System.getProperty("user.dir") + buildPath + ".apk");
        caps.setCapability("appActivity", "com.whitbread.tda.components.start.activities.StartActivity");
    }

    public static void googleNexus4Setup() throws MalformedURLException {
        caps.setCapability("deviceName", prop.getProperty("googleNexus4_device_name"));
        caps.setCapability("app", System.getProperty("user.dir") + buildPath + ".apk");
        caps.setCapability("automationName", "uiautomator2");
        caps.setCapability("appActivity", "com.whitbread.tda.components.start.activities.StartActivity");
    }

    // Android emulators
    public static void genymotionNexus5Setup() throws MalformedURLException {
        caps.setCapability("deviceName", prop.getProperty("genymotionNexus5_device_name"));
        caps.setCapability("app", System.getProperty("user.dir") + buildPath + ".apk");
    }

    public static void genymotionNexus5XSetup() throws MalformedURLException {
        caps.setCapability("deviceName", prop.getProperty("genymotionNexus5X_device_name"));
        caps.setCapability("app", System.getProperty("user.dir") + buildPath + ".apk");
    }

    public static void genymotionNexus5X7Setup() throws MalformedURLException {
        caps.setCapability("deviceName", prop.getProperty("genymotionNexus5X7_device_name"));
        caps.setCapability("app", System.getProperty("user.dir") + buildPath + ".apk");
    }
}
