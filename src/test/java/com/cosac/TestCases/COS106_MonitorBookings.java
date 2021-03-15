package com.cosac.TestCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.cosac.Locators.Id;
import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;
import com.cosac.Utilities.JsonParser;

public class COS106_MonitorBookings extends LoginPage {


	public String Reports=".\\target\\COS42_68_69_70_106_107\\Reports.PNG";
	public String Search2=".\\target\\COS42_68_69_70_106_107\\Search2.PNG";
	public String ExporttoExcel=".\\target\\COS42_68_69_70_106_107\\ExporttoExcel.PNG";

    LoginPage login=new LoginPage();
    Robot robo1;
	@Test
	public void MonitorBookings() throws Throwable
	{


		try
		{
			login.LoginCosacClient();
			Thread.sleep(15000);
			Screen s = new Screen();
			s.find(Reports);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			log.info("User clicked on Reports");
			Thread.sleep(2000);
			robo1=new Robot();
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			log.info("User clicked on Monitor Bookings");
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(3000);
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("Monitor.MonitorBooking.day"));
            Library.Interaction.print("User Entered Day");
            log.info("User Entered Day");
			Library.Interaction.userWait();
            robo1.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(1000);
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("Monitor.MonitorBooking.Month"));
			log.info("User Entered Month");
			Library.Interaction.userWait();
			s.find(Search2);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			log.info("User clicked on Search button");
			Thread.sleep(18000);
			s.find(ExporttoExcel);
			s.mouseMove();
			Thread.sleep(800);
			s.click();
			log.info("User clicked on Export to Excel button");
			Thread.sleep(5000);
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("Monitor.MonitorBooking.data"));
			Thread.sleep(3000);
			robo1.keyPress(KeyEvent.VK_CONTROL); 
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_A); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_A); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_CONTROL);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_CONTROL); 
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_C); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_C); 
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_CONTROL);
			log.info("User Copy the Account Number");
			Library.Interaction.userWait();
			String FileName=Library.Interaction.captureText();
			Library.Interaction.print("File Name is:"+FileName);
	        Library.Interaction.userWait();
			log.info("User Entered file name");
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			log.info("User Clicked on save button");
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			Library.Interaction.closeCosacClient(robo1);
			log.info("User clicked on Close Window");

		}catch(Exception e)
		{
			e.printStackTrace();
			e.getMessage();
			driver.close();
			Library.Interaction.closeCosacClient(robo1);
		}

	}

}