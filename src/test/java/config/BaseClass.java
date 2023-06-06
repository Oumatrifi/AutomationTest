package config;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pageObjects.AuthentificationPage;

public class BaseClass {
	

	 public static AndroidDriver driver;
	    @BeforeSuite
	    public AndroidDriver setup(){

	        DesiredCapabilities caps = new DesiredCapabilities();
	        //caps.setCapability("platformName", "ANDROID");
	        caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
	        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
	        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A03");
	        caps.setCapability(MobileCapabilityType.UDID, "R9YT80FLLAT");
	        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
	        caps.setCapability(MobileCapabilityType.APP, "E:\\Commendo\\Commendo.apk");
	       
	       
	        //caps.setCapability(MobileCapabilityType.BROWSER_NAME, "CHROME");
	        try {
	            driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), caps);
	        } catch (MalformedURLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         
	        }
	        
            return driver;   
	    }
	   
}
