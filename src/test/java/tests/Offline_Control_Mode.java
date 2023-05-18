



package tests;



import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import config.BaseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import pages.AjoutEquipementPage;
import pages.AuthentificationPage;
import pages.ControlAccPage;
import pages.CreationScAutoPage;
import pages.CréationEspacePage;
import pages.CréationSitePage;
import pages.EditDevicePage;
import io.appium.java_client.touch.WaitOptions;
import pages.CréationSitePage;


public class Offline_Control_Mode extends BaseClass{

	public CréationSitePage créationsitepage;
	public CréationEspacePage créationespacepage;
	public AjoutEquipementPage ajoutequipementpage;
	public EditDevicePage editdevicepage;
	public ControlAccPage controlaccpage;
    public CreationScAutoPage creationscautopage;  
    
        
   
@Test
public void CreationSite() {
     //driver.startRecordingScreen(new AndroidStartScreenRecordingOptions()
     //        .withVideoSize("1280x720")
     //        .withTimeLimit(Duration.ofSeconds(100)));
    
    
	  créationsitepage = new CréationSitePage();
	  
	   PageFactory.initElements(driver, créationsitepage);
		// Start screen recording
	   
		//driver.startRecordingScreen(new AndroidStartScreenRecordingOptions().withVideoSize("1280x720").withTimeLimit(Duration.ofSeconds(100)));	
		
		créationsitepage.buttonnouveausite.click();
		créationsitepage.editnomsite.sendKeys("SofiaTech");
		créationsitepage.editadress.sendKeys("El ghazela");
		créationsitepage.buttonsuivant.click();
		créationsitepage.wifi.sendKeys("TOPNET_B1D0");
		créationsitepage.pwd.sendKeys("ylqcnui8qp");
		créationsitepage.buttonsave.click();
  
    
   
     }
     @Test
    public void Creation_Area() throws InterruptedException {
    	 
    	 créationespacepage = new CréationEspacePage();
   	  
  	   PageFactory.initElements(driver, créationespacepage); 
    	 
    	 créationespacepage.entrésite.click();   	 
    	 Thread.sleep(2000);
    	 créationespacepage.plus.click();   
    	 créationespacepage.newarea.click(); 
    	 créationespacepage.editnomarea.sendKeys("Salle de reunion"); 
    	 créationespacepage.photoespace.click();
     	 créationespacepage.galerie.click();
     	 Thread.sleep(2000);
     	créationespacepage.buttonautoriser.click();
     	créationespacepage.buttonautoriser2.click();
        Thread.sleep(2000);
    	créationespacepage.choixphoto.click();
        Thread.sleep(2000);
        créationespacepage.buttonajouter.click();
   
     }
   

	@Test
  
     public void add_Device() throws InterruptedException, IOException {
		
		 ajoutequipementpage = new AjoutEquipementPage();
		  
		   PageFactory.initElements(driver, ajoutequipementpage);
		
		 ajoutequipementpage.espace.click();
		 Thread.sleep(2000);
		 ajoutequipementpage.clickespace.click();
		 ajoutequipementpage.ajoutdevice.click();
		 ajoutequipementpage.croixacc.click();
		 ajoutequipementpage.activerblue.click();
		  Thread.sleep(2000);
		  ajoutequipementpage.autoriser.click();
		  Thread.sleep(4000);
		  ajoutequipementpage.suivant.click();
		   Thread.sleep(3000);
		   ajoutequipementpage.autoriserr.click();
		   Thread.sleep(23000);
		   ajoutequipementpage.choosedevice.click();
		   Thread.sleep(10000);
		   ajoutequipementpage.crayondev.click();
		   ajoutequipementpage.editnomlampe.clear();
		   ajoutequipementpage.editnomlampe.sendKeys("Lampe1");
		   ajoutequipementpage.lampe1.click();
		   ajoutequipementpage.enregistrer.click();
		   ajoutequipementpage.crayon.click();
		   ajoutequipementpage.editmap.clear();
		   ajoutequipementpage.editmap.sendKeys("map1");
		   ajoutequipementpage.save.click();
		   ajoutequipementpage.crayondevice.click();
		   ajoutequipementpage.editlampe2.clear();
		   ajoutequipementpage.editlampe2.sendKeys("Lampe2");
		   ajoutequipementpage.lampe2.click();
		   ajoutequipementpage.enregis.click();
		   ajoutequipementpage.cray.click();
		   ajoutequipementpage.editnomstore.clear();
		   ajoutequipementpage.editnomstore.sendKeys("store1");
		   ajoutequipementpage.store1.click();
		   Thread.sleep(2000);
		   ajoutequipementpage.okstore.click();
		   ajoutequipementpage.savee.click();
		   Thread.sleep(1000);
		   ajoutequipementpage.cr.click();
		   ajoutequipementpage.editnommap.clear();
		   ajoutequipementpage.editnommap.sendKeys("map2");
		   ajoutequipementpage.enregistr.click();
		   Thread.sleep(2000);
		   driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+".textMatches(\""+"Ajouter"+"\").instance(0))"));    
		    Thread.sleep(3000);
		    ajoutequipementpage.choixroom.click();
		    Thread.sleep(2000);
		    ajoutequipementpage.sallereunion.click();

	        Thread.sleep(1000);
	        ajoutequipementpage.ajoutbutton.click();
	        Thread.sleep(2000);
	        ajoutequipementpage.sortie.click();
        
	        Thread.sleep(4000);
       
        
	}

	   
		     
        
	@Test 
	  
    public void control_Acc() throws InterruptedException, IOException {
    
		
		controlaccpage = new ControlAccPage();
		  
		PageFactory.initElements(driver, controlaccpage);
		
		controlaccpage.sallereunion.click();
		Thread.sleep(25000);
		
		 
		 
    
	 WebElement l10= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup"));
	
    System.out.println(l10.getClass().getName());
   
    LongPressOptions longPressOptions = new LongPressOptions();
    longPressOptions.withDuration(Duration.ofSeconds(2)); // Set the duration of the long press
    longPressOptions.withElement(ElementOption.element(l10)); // Set the element to long press on
    try {
        new TouchAction((PerformsTouchActions) driver).longPress(longPressOptions).perform();
    } catch (Exception e) {
        e.printStackTrace();
    }
    
	controlaccpage.Ajoutfav.click();  
     Thread.sleep(1000);
	    //click on the lampe1 
     controlaccpage.allumerlampe.click();
	    Thread.sleep(2000);
	    controlaccpage.allumerlampe2.click(); 
	    controlaccpage.back.click();
	    Thread.sleep(2000);
	    controlaccpage.acc.click(); 
	    Thread.sleep(4000);
	    controlaccpage.Lampes.click();
	    Thread.sleep(3000);
	    controlaccpage.stores.click();
	    Thread.sleep(3000);
	    controlaccpage.tous.click();
	    Thread.sleep(3000);
	    controlaccpage.espaces.click();
	    Thread.sleep(2000);
	    controlaccpage.sallereunion.click();
	    Thread.sleep(2000); 
	    controlaccpage.flecheback.click();
	    Thread.sleep(2000);
	    controlaccpage.acceuil.click();
	    Thread.sleep(2000);
	    
   driver.findElement(new AppiumBy.ByAndroidUIAutomator(
    	    "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
    	    + ".scrollToEnd(10)"
    	    + ".scrollIntoView(new UiSelector().resourceId(\"com.sofia.commendo:id/favorite_accessories_grid_view\").instance(0))"
    	));
    Thread.sleep(2000);
     
	}
	
    
       
	  
    @Test
    public void creationScAuto() throws InterruptedException, IOException{
        
	        	  creationscautopage = new CreationScAutoPage();
	        	  
	       	   PageFactory.initElements(driver, creationscautopage);
       
       
       
     
        //SC auto for once  
	       	creationscautopage.intelligent.click();
	       	creationscautopage.automatisation.click();
	       	Thread.sleep(1000);
	    	creationscautopage.nouvelleauto.click();
	    	creationscautopage.editnomsc.sendKeys("Sc Auto For Once" );
	    	creationscautopage.reglertemps.click();
	    	creationscautopage.tempstext.clear();
	    	creationscautopage.tempstext.sendKeys("59");
	    	driver.hideKeyboard();
	    	creationscautopage.terminé.click();
	    	Thread.sleep(4000);
	    	creationscautopage.ajoutacc.click();
	    	Thread.sleep(2000);
	    	creationscautopage.cochlampe1.click();
	    	creationscautopage.cochlampe2.click();
	       	creationscautopage.buttonterminé.click();
	       	Thread.sleep(4000);
	        
	          driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector()"+".textMatches(\""+"Terminé"+"\").instance(0))"));

	          Thread.sleep(2000);
	        	creationscautopage.clicklampe1.click();
	        	creationscautopage.clicklampe2.click();
	        	   Thread.sleep(5000);
        
	        	   creationscautopage.terminébutton.click(); 
   
	        	   Thread.sleep(6000);
          //scene auto for repeat
	        	   creationscautopage.addelements.click();
	        	   creationscautopage.nouvelleautomation.click();
          
	        	   creationscautopage.editnomsc.sendKeys("Sc Auto For Repeat");
	        	   creationscautopage.reglertemps.click();
	        	   creationscautopage.repeat.click();

                    Thread.sleep(2000);
             	   creationscautopage.lundi.click();
             	  creationscautopage.mardi.click();

                   Thread.sleep(2000);

int height = driver.manage().window().getSize().getHeight();
int width = driver.manage().window().getSize().getWidth();

// Calculate the start and end points for the swipe gesture
int startX = width / 2;
int startY = (int) (height * 0.8);
int endY = (int) (height * 0.2);

// Create a new TouchAction instance and perform the swipe gesture
TouchAction action = new TouchAction(driver);
action.press(PointOption.point(startX, startY))
      .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))) // <-- use WaitOptions.waitOptions
      .moveTo(PointOption.point(startX, endY))
      .release()
      .perform();
creationscautopage.okdays.click();


Thread.sleep(2000);
creationscautopage.terminer.click();
Thread.sleep(2000);
creationscautopage.ajoutacc.click();

Thread.sleep(1000);
creationscautopage.cochlampe1.click();
creationscautopage.cochlampe2.click();
creationscautopage.buttonterminé.click(); 
 
Thread.sleep(2000);
driver.findElement(new AppiumBy.ByAndroidUIAutomator(
	    "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	    + ".scrollToEnd(10)"
	    + ".scrollIntoView(new UiSelector().resourceId(\"com.sofia.commendo:id/btn_save\").instance(0))"
	));
Thread.sleep(2000);
creationscautopage.clicklampe1.click();
creationscautopage.clicklampe2.click();
Thread.sleep(2000);
creationscautopage.terminébutton.click();
//Terminé
Thread.sleep(2000);
       


	}

    
    
    @Test
	   
	   public void edit_Device() throws InterruptedException, IOException {
     
		editdevicepage = new EditDevicePage();
		  
		   PageFactory.initElements(driver, editdevicepage);
		   
		   editdevicepage.espacee.click();
		   editdevicepage.viewespace.click();
		   Thread.sleep(10000);
    
		     
		   
		   
	   	 WebElement l12= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup"));
	  	
		    System.out.println(l12.getClass().getName());
		   
		    LongPressOptions longPressOptions1 = new LongPressOptions();
		    longPressOptions1.withDuration(Duration.ofSeconds(2)); // Set the duration of the long press
		    longPressOptions1.withElement(ElementOption.element(l12)); // Set the element to long press on
		    try {
		        new TouchAction((PerformsTouchActions) driver).longPress(longPressOptions1).perform();
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    
	    	Thread.sleep(2000);
	    	editdevicepage.edit.click();
		    
	   	    Thread.sleep(2000);
	   	 editdevicepage.crayon.click();
	   	    
	 	 editdevicepage.editnomstore.clear(); 
	 	 editdevicepage.editnomstore.sendKeys("lampe3");
	 	editdevicepage.lampe.click();
	 	editdevicepage.save.click();
	 	Thread.sleep(1000);
	    driver.findElement(new AppiumBy.ByAndroidUIAutomator(
	    	    "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	    	    + ".scrollToEnd(10)"
	    	    + ".scrollIntoView(new UiSelector().resourceId(\"com.sofia.commendo:id/btn_save\").instance(0))"
	    	));   
		 
	    //Config la deux lampe 
	    editdevicepage.crayedit.click();
	    editdevicepage.editlampe4.clear();
	    editdevicepage.editlampe4.sendKeys("lampe4");
	    editdevicepage.clicklampe.click();
	    editdevicepage.enregistrerrr.click();
	    driver.findElement(new AppiumBy.ByAndroidUIAutomator(
	    	    "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	    	    + ".scrollToEnd(10)"
	    	    + ".scrollIntoView(new UiSelector().resourceId(\"com.sofia.commendo:id/btn_save\").instance(0))"
	    	)); 
	    editdevicepage.ajout.click();
	    editdevicepage.reunion.click();
	    
	    //w ntala3 lbug (tfasakh nom du device w taaml ajouter tetaada )
	    WebElement l33= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup"));
	  	
	    System.out.println(l33.getClass().getName());
	   
	    LongPressOptions longPressOptions3 = new LongPressOptions();
	    longPressOptions3.withDuration(Duration.ofSeconds(2)); // Set the duration of the long press
	    longPressOptions3.withElement(ElementOption.element(l33)); // Set the element to long press on
	    try {
	        new TouchAction((PerformsTouchActions) driver).longPress(longPressOptions3).perform();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	 	Thread.sleep(2000);
 	editdevicepage.edit.click();
 	Thread.sleep(3000);
 	editdevicepage.editdevicename.click();
 	editdevicepage.editdevicename.clear();
 	 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		 String filePath = "C:\\Users\\trifi\\eclipse-workspace\\CommendoTest\\test-output\\screenshots\\device_name_empty.png";


		  FileUtils.copyFile(screenshot, new File(filePath));
		  
		driver.hideKeyboard();

		  driver.findElement(new AppiumBy.ByAndroidUIAutomator(
		    	    "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
		    	    + ".scrollToEnd(10)"
		    	    + ".scrollIntoView(new UiSelector().resourceId(\"com.sofia.commendo:id/btn_save\").instance(0))"
		    	)); 
		  File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			 String filePath1 = "C:\\Users\\trifi\\eclipse-workspace\\CommendoTest\\test-output\\screenshots\\ajouter_button_highlighted.png";


			  FileUtils.copyFile(screenshot1, new File(filePath1));

			   editdevicepage.ajout.click();
		    
		    
		
		
		  
		    Thread.sleep(2000);}
	 		  
	 	        
	 	          
        
        
        
                
        
        
        
        
        
    
       
     
     
     
    
     }






