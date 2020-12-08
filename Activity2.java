package AppiumTest.MobileAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity2 {
    WebDriverWait wait;
    AppiumDriver<MobileElement> driver = null;

    @BeforeTest
    public void setup() throws MalformedURLException {

        // Set the Desired Capabilities
    	DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceId", "XT1068");
        caps.setCapability("deviceName", "XT1068");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
	
    public void add() {
	
        driver.findElementById("digit_5").click();
	
        driver.findElementById("op_add").click();
	
        driver.findElementById("digit_9").click();
	
        // Perform Calculation
	
        driver.findElementById("eq").click();
	
 
	
        // Display Result
	
        String result = driver.findElementById("result").getText();
	
        System.out.println(result);
	
        Assert.assertEquals(result, "14");
	
    }
	
    
	
    @Test
	
    public void subtract() {
	
        driver.findElementById("digit_1").click();
	
        driver.findElementById("digit_0").click();
	
        driver.findElementById("op_sub").click();
	
        driver.findElementById("digit_5").click();
	
        // Perform Calculation
	
        driver.findElementById("eq").click();
	
 
	
        // Display Result
	
        String result = driver.findElementById("result").getText();
	
        System.out.println(result);
	
        Assert.assertEquals(result, "5");
	
    }
	
 
	
    @Test
	
    public void multiply() {
	
        driver.findElementById("digit_5").click();
	
        driver.findElementById("op_mul").click();
	
        driver.findElementById("digit_1").click();
	
        driver.findElementById("digit_0").click();
	
        driver.findElementById("digit_0").click();
	
        // Perform Calculation
	
        driver.findElementById("eq").click();
	
 
	
        // Display Result
	
        String result = driver.findElementById("result").getText();
	
        System.out.println(result);
	
        Assert.assertEquals(result, "500");
	
    }
	
 
	
    @Test
	
    public void divide() {
	
        driver.findElementById("digit_5").click();
	
        driver.findElementById("digit_0").click();
	
        driver.findElementById("op_div").click();
	
        driver.findElementById("digit_2").click();
	
        // Perform Calculation
	
        driver.findElementById("eq").click();
	
 
	
        // Display Result
	
        String result = driver.findElementById("result").getText();
	
        System.out.println(result);
	
        Assert.assertEquals(result, "25");
	
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}