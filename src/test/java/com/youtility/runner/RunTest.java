package com.youtility.runner;

import cucumber.api.CucumberOptions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.OnboardingPagesObjects;

    RunWith(Cucumber.class)
    @CucumberOptions(
            plugin={"pretty", "html:target/cucumber-html", "json:target/cucumber-json-report.json"},
            features={"src/test/resources/features/EndtoEnd.feature"},
            monochrome = true,
            tags={"@all", "@Android"},
            glue = {"com.whitbread.steps"}
    )

    public class RunTest {
        public static AppiumDriver<MobileElement> driver;
        public static String device;
        public static String build;
        public static String platform;
        public static WebDriverWait wait;
        public static Common common;
        public OnboardingPagesObjects onboardingPagesObjects;


        @BeforeClass
        public void setUp() throws Exception {
            driver = drivers.getDriver();
            device = drivers.getDevice();
            build = drivers.getBuild();
            platform = drivers.getPlatform();
            wait = new WebDriverWait(driver, 45);

            common = new Common();
            onboardingPagesObjects =  new OnboardingPagesObjects(this.driver);
        }

        @AfterClass
        public static void tearDown() {
            if (device.equals("android_sim") || device.equals("ios_sim")) {
                driver.resetApp();
            } else if (platform.equals("iOS") || platform.equals("android")){
                driver.removeApp("com.whitbread.tda.sw.dev" + build);
            }
            driver.quit();
        }
    }
}
