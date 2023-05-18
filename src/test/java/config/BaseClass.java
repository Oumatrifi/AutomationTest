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
import pages.AuthentificationPage;

public class BaseClass {
	public AuthentificationPage authentificationpage;
	 public static AndroidDriver driver;
	    @BeforeSuite
	    public AndroidDriver setup(){

	        DesiredCapabilities caps = new DesiredCapabilities();
	        //caps.setCapability("platformName", "ANDROID");
	        caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
	        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
	        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "HUAWEI Y7 Prime 2019");
	        caps.setCapability(MobileCapabilityType.UDID, "BVK6R20519013034");
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
	    @Test
	    
	    public  void Authentification() throws IOException, InterruptedException{
	    		
	    		Thread.sleep(2000);
	    	   authentificationpage = new AuthentificationPage();
	    	   PageFactory.initElements(driver, authentificationpage);
	    		// Start screen recording
	    	   
	    		//driver.startRecordingScreen(new AndroidStartScreenRecordingOptions().withVideoSize("1280x720").withTimeLimit(Duration.ofSeconds(100)));	
	    		
	    		authentificationpage.zero.click();
	    		authentificationpage.un.click();
	    		authentificationpage.deux.click();
	    		authentificationpage.trois.click();
	    		authentificationpage.quatre.click();
	    		authentificationpage.croix.click();
	    		authentificationpage.editcodepin.sendKeys("11111");
	            authentificationpage.eye.click();
	            authentificationpage.editcodepin2.sendKeys("11111");
	            authentificationpage.eye2.click();
	            driver.hideKeyboard();
	            authentificationpage.buttonEnregistrer.click();
	    //String video =driver.stopRecordingScreen();
	    //byte[] decode = Base64.getDecoder().decode(video);
	    //FileUtils.writeByteArrayToFile(new File("video/androidclip.mp4"), decode);

	        authentificationpage.un.click();
	        authentificationpage.un.click();
	        authentificationpage.un.click();
	        authentificationpage.un.click();
	        authentificationpage.un.click();

	        }
}
