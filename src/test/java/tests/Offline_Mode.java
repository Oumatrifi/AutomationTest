



package tests;



import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import config.BaseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidStartScreenRecordingOptions;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import pageObjects.AjoutEquipementPage;
import pageObjects.AuthentificationPage;
import pageObjects.ControlAccPage;
import pageObjects.CreationScAutoPage;
import pageObjects.CreationSite2Page;
import pageObjects.CréationEspacePage;
import pageObjects.CréationSitePage;
import pageObjects.EditDevicePage;
import io.appium.java_client.touch.WaitOptions;

import org.testng.asserts.SoftAssert;
public class Offline_Mode extends BaseClass{
	  private SoftAssert softAssert;
	  private boolean isTestFailed = false;

		// TODO Auto-generated constructor stub
	public AuthentificationPage authentificationpage;
	public CréationSitePage créationsitepage;
	public CréationEspacePage créationespacepage;
	public AjoutEquipementPage ajoutequipementpage;
	public EditDevicePage editdevicepage;
	public ControlAccPage controlaccpage;
    public CreationScAutoPage creationscautopage;  
    public CreationSite2Page creationsite2page;
    @Test
    
    public  void Authentification() throws IOException, InterruptedException{
    		
    		Thread.sleep(2000);
    	   authentificationpage = new AuthentificationPage();
    	   PageFactory.initElements(driver, authentificationpage);
    		 
    		
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


        authentificationpage.un.click();
        authentificationpage.un.click();
        authentificationpage.un.click();
        authentificationpage.un.click();
        authentificationpage.un.click();

        }
   
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
    	 Thread.sleep(2000);
     	 créationespacepage.galerie.click();
     	 Thread.sleep(2000);
     	créationespacepage.buttonautoriser.click();
     	créationespacepage.buttonautoriser2.click();
        Thread.sleep(3000);
    	créationespacepage.galery.click();
        Thread.sleep(2000);
        créationespacepage.telechargements.click();
        Thread.sleep(2000);
        créationespacepage.image.click();
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
		   Thread.sleep(2000);
		   ajoutequipementpage.choosedevice.click(); 
		   Thread.sleep(6000);
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
    public void control_Acc_Case1() throws InterruptedException, IOException {
    
		
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
		driver.startRecordingScreen(new AndroidStartScreenRecordingOptions().withVideoSize("1280x720").withTimeLimit(Duration.ofSeconds(100)));	

	    controlaccpage.acceuil.click();
	    Thread.sleep(2000);
	    
   driver.findElement(new AppiumBy.ByAndroidUIAutomator(
    	    "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
    	    + ".scrollToEnd(10)"
    	    + ".scrollIntoView(new UiSelector().resourceId(\"com.sofia.commendo:id/favorite_accessories_grid_view\").instance(0))"
    	));
    Thread.sleep(2000);}
     @Test
public void control_acc_case2() throws InterruptedException, IOException {
		   
    	creationsite2page = new CreationSite2Page();
		  
		   PageFactory.initElements(driver, creationsite2page);
    	
		   creationsite2page.arrowdown.click(); 
		   creationsite2page.nouveausite.click();
		   créationsitepage.editnomsite.sendKeys("Enetcom");
			créationsitepage.editadress.sendKeys("sfax");
			créationsitepage.buttonsuivant.click();
			créationsitepage.wifi.sendKeys("TOPNET_B1D0");
			créationsitepage.pwd.sendKeys("ylqcnui8qp");
			créationsitepage.buttonsave.click();
			//Start screen recording
	    	   
			creationsite2page.enetcomsite.click();
			Thread.sleep(3000);
			
    	
			  driver.findElement(new AppiumBy.ByAndroidUIAutomator(
			    	    "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
			    	    + ".scrollToEnd(10)"
			    	    + ".scrollIntoView(new UiSelector().resourceId(\"com.sofia.commendo:id/favorite_accessories_grid_view\").instance(0))"
			    	));
			  
			  boolean isElementDisplayed = creationsite2page.element.isDisplayed();

	  			try {
	  			    assert !isElementDisplayed : "L'accessoire du site1 est affiché dans les accessoires favoris du site 2"; // Note the negation operator (!) in the assertion condition
	  			} catch (AssertionError e) {
	  			    System.out.println(e.getMessage());
	  			  creationsite2page.clicklampesite2.click();  
					
				  
		   			creationsite2page.menusite2.click();
		   			creationsite2page.flechsofia.click();
		   		  driver.findElement(new AppiumBy.ByAndroidUIAutomator(
				    	    "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
				    	    + ".scrollToEnd(10)"
				    	    + ".scrollIntoView(new UiSelector().resourceId(\"com.sofia.commendo:id/favorite_accessories_grid_view\").instance(0))"
				    	));
		   		  Thread.sleep(3000);
		   	
	  			creationsite2page.espace.click();
	  			creationsite2page.view.click();
	  			Thread.sleep(2000);
	  		    String video =driver.stopRecordingScreen();
	  		    byte[] decode = Base64.getDecoder().decode(video);
	  		    FileUtils.writeByteArrayToFile(new File("video/bug control acc case2.mp4"), decode);
	  			creationsite2page.back.click();
	  			
	  			    Thread.sleep(2000);
	  			    throw new RuntimeException("La méthode a échoué en raison de l'affichage et le controle de l'accessoire du site1 dans le site2");
	  			}
    	//controller favorites devices from enetcom site 
			  
		creation_sc_Auto();	 
    }

	 		  
	 	        
	 	           
        
         
       
	  
    @Test
    public void creation_sc_Auto() throws InterruptedException, IOException{
        
	        	  creationscautopage = new CreationScAutoPage();
	        	  
	       	   PageFactory.initElements(driver, creationscautopage);
       
       
       
     
        //SC auto for once  
	       	creationscautopage.intelligent.click();
	       	creationscautopage.automatisation.click();
	       	Thread.sleep(1000);
	    	creationscautopage.nouvelleauto.click(); 
	    	creationscautopage.editnomsc.sendKeys("Sc Auto For Once" );
	    	creationscautopage.reglertemps.click();
	      	
	
	    	creationscautopage.clock.clear();
	    	creationscautopage.clock.sendKeys("11");
	    	creationscautopage.tempstext.clear();
	    	creationscautopage.tempstext.sendKeys("59");
	    	driver.hideKeyboard();
	    	
	    	creationscautopage.terminé.click();
	 
			  
	    	Thread.sleep(4000);
	      	
	   			  
	 
		   

	         
	    	 Thread.sleep(5000); 
	    	creationscautopage.ajoutacc.click();
	    	Thread.sleep(2000);
	    	creationscautopage.cochlampe1.click();
	    	creationscautopage.cochlampe2.click();
	       	creationscautopage.buttonterminé.click();
	       	Thread.sleep(4000);
	        
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
		   Thread.sleep(2000);
		   editdevicepage.viewespace.click();
		   Thread.sleep(5000);
 
		      
		   
		   
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
	    Thread.sleep(2000);
	    editdevicepage.ajout.click();
	    Thread.sleep(2000);
	    editdevicepage.viewespace.click();
	    Thread.sleep(2000);
	    
	    WebElement m= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup"));
	  	
	    System.out.println(l12.getClass().getName());
	   
	    LongPressOptions longPressOptions3 = new LongPressOptions();
	    longPressOptions3.withDuration(Duration.ofSeconds(2)); // Set the duration of the long press
	    longPressOptions3.withElement(ElementOption.element(m)); // Set the element to long press on
	    try {
	        new TouchAction((PerformsTouchActions) driver).longPress(longPressOptions3).perform();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
    	Thread.sleep(2000);
    	editdevicepage.edit.click();
    	Thread.sleep(2000);
    	editdevicepage.editdevicename.clear();
    	driver.hideKeyboard();
  		File screenshot5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			 String filePath5 = "C:\\Users\\trifi\\eclipse-workspace\\CommendoTest\\test-output\\screenshots\\device name empty.png";

			  FileUtils.copyFile(screenshot5, new File(filePath5));
    	  driver.findElement(new AppiumBy.ByAndroidUIAutomator(
  	    	    "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
  	    	    + ".scrollToEnd(10)"
  	    	    + ".scrollIntoView(new UiSelector().resourceId(\"com.sofia.commendo:id/btn_save\").instance(0))"
  	    	));  
		    
    		File screenshot6 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

 			 String filePath6 = "C:\\Users\\trifi\\eclipse-workspace\\CommendoTest\\test-output\\screenshots\\ajoutbutton highlighted.png";

 			  FileUtils.copyFile(screenshot6, new File(filePath6));
 			 boolean isButtonEnabled = editdevicepage.ajout.isEnabled();

  			try {
  			    assert !isButtonEnabled : "Le bouton est activé."; // Note the negation operator (!) in the assertion condition
  			} catch (AssertionError e) {
  			    System.out.println(e.getMessage());

  			    editdevicepage.ajout.click();
  			    Thread.sleep(2000);
  			    throw new RuntimeException("La méthode a échoué en raison de la mise en surbrillance du bouton.");
  			}
 		  
  	  }
    
        
        
        
    
       
     
     
     
    
     }




