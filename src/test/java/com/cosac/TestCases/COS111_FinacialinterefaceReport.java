package com.cosac.TestCases;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;

public class COS111_FinacialinterefaceReport extends LoginPage {
	
	public String Reports = System.getProperty("user.dir") + "\\target\\COS28_COS89_COS111\\Reports.PNG";
	public String Interface = System.getProperty("user.dir") + "\\target\\COS28_COS89_COS111\\interface.PNG";
	public String value = System.getProperty("user.dir") + "\\target\\COS28_COS89_COS111\\value.PNG";
	
	LoginPage login = new LoginPage();
	Robot robo;
	@Test
	public void Client() throws Throwable {
		try {
			
			login.LoginCosacClient();
			Thread.sleep(15000);
			Screen s = new Screen();
			robo = new Robot();
			
			s.find(Reports);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			log.info("User clicked on Reports successfully");
			robo.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_ENTER);
			log.info("User clicked on finacial interface reports ");
			Thread.sleep(7000);
			s.find(Interface);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			log.info("User clicked on interface reports ");
			log.info("User is able get Summary update interface reports");
			Thread.sleep(5000);
			s.find(value);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			log.info("User right clicked on  Summary update Deatails");
			Thread.sleep(7000);
			robo.mousePress(InputEvent.BUTTON3_MASK);
		    robo.mouseRelease(InputEvent.BUTTON3_MASK);
		    robo.delay(200);
	        Thread.sleep(3000);
			robo.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_ENTER);
			log.info("User is able to move to summary breakdown page");
			Thread.sleep(4000);
			Library.Interaction.closeCosacClient(robo);
	        log.info("User able to close cosac");
				
				
		}catch(Exception e){
			e.getMessage();
			e.getStackTrace();
			Assert.assertFalse(false);
			Library.Interaction.closeCosacClient(robo);
		}
	}
}
