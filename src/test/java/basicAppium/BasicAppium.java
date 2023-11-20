package basicAppium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BasicAppium {
    AppiumDriver mobile;

    @BeforeEach
    public void openApp() throws MalformedURLException {
        DesiredCapabilities config = new DesiredCapabilities();
        config.setCapability("deviceName","TECNO CAMON 18");
        config.setCapability("platformVersion","12.0");
        config.setCapability("appPackage","com.transsion.calculator");
        config.setCapability("appActivity","com.transsion.calculator.Calculator");
        config.setCapability("platformName","Android");
        config.setCapability("automationName","UiAutomator2");
        mobile = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),config);
        // implicit / explicit / fluent
        mobile.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void verifySomething() throws InterruptedException {
        Thread.sleep(5000);
   }

    @AfterEach
    public void closeApp(){
        mobile.quit();
    }
}