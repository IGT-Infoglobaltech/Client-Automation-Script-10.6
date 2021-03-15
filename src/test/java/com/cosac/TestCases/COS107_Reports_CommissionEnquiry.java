package com.cosac.TestCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;

public class COS107_Reports_CommissionEnquiry extends LoginPage {

	
	public String Reports=".\\target\\COS42_68_69_70_106_107\\Reports.PNG";
	public String Load=".\\target\\COS42_68_69_70_106_107\\Load.PNG";
	public String Blank=".\\target\\COS42_68_69_70_106_107\\Blank.png";
	public String BlueArrow=".\\target\\COS42_68_69_70_106_107\\BlueArrow.PNG";
	public String ExporttoExcel=".\\target\\COS42_68_69_70_106_107\\ExporttoExcel.PNG";

    LoginPage login=new LoginPage();
    Robot robo1;
	@Test
	public void CommissionEnquiry() throws Throwable
	{

		try
		{
            login.LoginCosacClient();
            Thread.sleep(15000);
            Screen s = new Screen();
            
			s.find(Reports);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(3000);
			log.info("User clicked on Reports");
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
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			log.info("User clicked on Sales Commission Enquiry");
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(3000);
			Library.Interaction.writeKeyboard(robo1, "1");
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_RIGHT);
			robo1.setAutoDelay(50);
			Thread.sleep(2000);
			Library.Interaction.writeKeyboard(robo1, "1");
			Thread.sleep(2000);
			log.info("User Selected Month");
			robo1.keyPress(KeyEvent.VK_RIGHT);
			robo1.setAutoDelay(50);
			Thread.sleep(2000);
			Library.Interaction.writeKeyboard(robo1, "2017");
			Thread.sleep(2000);
			log.info("User Selected Year");
			s.find(Load);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(20000);
			log.info("User Clicked on Load Button");
			s.find(Blank);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(5000);
			log.info("User Clicked on Blank Button");
		    s.find(BlueArrow);
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(5000);
			log.info("User able to get Commission Enquiery report");
			Library.Interaction.closeCosacClient(robo1);
			log.info("User clicked on Close Window");
			

		
		}catch(Exception e)
		{
			e.printStackTrace();
			e.getMessage();
			Library.Interaction.closeCosacClient(robo1);
		}

	}

}
