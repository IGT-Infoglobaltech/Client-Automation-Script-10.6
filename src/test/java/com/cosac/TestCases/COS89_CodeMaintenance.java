package com.cosac.TestCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;

public class COS89_CodeMaintenance extends LoginPage{
	
	
	public String CodeText = System.getProperty("user.dir") + "\\target\\COS28_COS89_COS111\\CodeText.PNG";
	public String AddProductIcon = System.getProperty("user.dir") + "\\target\\COS28_COS89_COS111\\AddProductIcon.png";
	public String SaveIcon = System.getProperty("user.dir") + "\\target\\COS28_COS89_COS111\\SaveIcon.png";
	public String CloseTab = System.getProperty("user.dir") + "\\target\\COS28_COS89_COS111\\CloseTab.png";
	public String SystemConfiguration=".\\target\\COS67_CountryMaintenance\\SystemConfig.PNG";
	String code="T";
	String TwoWay="TwoWay";
	String Sortorder="0";
	
	String CountryCode="F";
	String Country="African";
	Robot robo;
	LoginPage login= new LoginPage();
	
	Screen s;
	@Test(priority=1)
	public void customizeFields() throws Throwable {
		login.LoginCosacClient();
		Thread.sleep(15000);
		robo= new Robot();
		s=new Screen();
		 s.find(SystemConfiguration);
		 s.mouseMove();
		 Thread.sleep(1000);
		 s.click();
		/*
		 * robo.keyPress(KeyEvent.VK_ALT); robo.keyPress(KeyEvent.VK_Y);
		 * robo.keyRelease(KeyEvent.VK_Y); robo.keyRelease(KeyEvent.VK_ALT);
		 */
		//Thread.sleep(1000);
		//log.info("User Clicked on SystemConfiguration successfully");
		
		//robo.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(100);
		//robo.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(100);
		 Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(100);
		 Thread.sleep(200);
		robo.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_ENTER);
		//log.info("User is in Code Maintenance");
		Thread.sleep(10000);
		robo.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(50);
		
		robo.keyPress(KeyEvent.VK_M);
		Thread.sleep(3000);
		robo.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robo.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robo.keyPress(KeyEvent.VK_DOWN);
		//log.info("User selected marital status dropdown value successfully");
		 //s=new Screen();
		Thread.sleep(2000);
		 s.find(CodeText);
		 s.mouseMove();
		 Thread.sleep(1000);
		 s.click();
		 Thread.sleep(2000);
		Library.Interaction.writeKeyboard(robo, code); 
		//log.info("User enetered the code successfully");
		Thread.sleep(300);
		 robo.keyPress(KeyEvent.VK_TAB);
		Library.Interaction.writeKeyboard(robo, TwoWay); 
		//log.info("User enetered the Status successfully");
		Thread.sleep(300);
		 robo.keyPress(KeyEvent.VK_TAB);
		Library.Interaction.writeKeyboard(robo, Sortorder);
		//log.info("User enetered the Sort order successfully");
		Thread.sleep(300);
		 robo.keyPress(KeyEvent.VK_TAB);
		Library.Interaction.writeKeyboard(robo, Sortorder);
		Thread.sleep(1500);
		 s.find( AddProductIcon);
		 s.mouseMove();
		 Thread.sleep(1000);
		 s.click();
		 //log.info("User added the new status to marital successfully");
		 Thread.sleep(5000);
		 s.find( SaveIcon);
		 s.mouseMove();
		 Thread.sleep(1000);
		 s.click();
		 //log.info("User clicked on save btn successfully");
		 Thread.sleep(5000);
		 s.find(CloseTab);
		 s.mouseMove();
		 Thread.sleep(1000);
		 s.click();
		 //log.info("User clicked on Close btn successfully");
		 Thread.sleep(5000);
			robo.keyPress(KeyEvent.VK_ALT);
			robo.keyPress(KeyEvent.VK_Y);
			robo.keyRelease(KeyEvent.VK_Y);
			robo.keyRelease(KeyEvent.VK_ALT);
			Thread.sleep(1000);
			//log.info("User Clicked on SystemConfiguration successfully");
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_ENTER);
			//log.info("User is in Code Maintenance");
			Thread.sleep(35000);
			robo.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(50);
			robo.keyPress(KeyEvent.VK_N);
			Thread.sleep(5000);
			
			s.find(CodeText);
			s.mouseMove();
			 Thread.sleep(2000);
			 s.click();
			Library.Interaction.writeKeyboard(robo, CountryCode); 
			//log.info("User enetered the Country code successfully");
			Thread.sleep(500);
			 robo.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.writeKeyboard(robo, Country); 
			//log.info("User enetered the Country Status successfully");
			Thread.sleep(500);
			 robo.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.writeKeyboard(robo, Sortorder);
			//log.info("User enetered the Sort order successfully");
			Thread.sleep(500);
			 robo.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.writeKeyboard(robo, Sortorder);
			Thread.sleep(500);
			 s.find( AddProductIcon);
			 Thread.sleep(1000);
			 s.click();
			 //log.info("User added the new status to marital successfully");
			 Thread.sleep(5000);
			 s.find( SaveIcon);
			 s.mouseMove();
			 Thread.sleep(1000);
			 s.click();
			 //log.info("User clicked on save btn successfully");
			 Thread.sleep(5000);
	}
	
	@Test(priority=2)
	public void validateCodeMaintnce() throws Exception {
		robo= new Robot();
		robo.keyPress(KeyEvent.VK_ALT);
		robo.keyPress(KeyEvent.VK_C);
		robo.keyRelease(KeyEvent.VK_C);
		robo.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(1000);
		//log.info("User clicked on Customermenu successfully");
		//robo.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robo.keyPress(KeyEvent.VK_ENTER);
		//log.info("User Selected Search Customer");
		Thread.sleep(10000);
		
		
		
	}
}