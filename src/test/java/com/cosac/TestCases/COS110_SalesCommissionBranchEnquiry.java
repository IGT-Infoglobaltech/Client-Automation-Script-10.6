package com.cosac.TestCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;

public class COS110_SalesCommissionBranchEnquiry extends LoginPage {
	public String Reports = ".\\target\\COS30_CreditSaction\\Reports.png";
	public String Search = ".\\target\\COS30_CreditSaction\\Search.png";
	public String Excel = ".\\target\\COS30_CreditSaction\\Excel.png";
	public String arrow = ".\\target\\COS30_CreditSaction\\arrow.png";
	public static String dayFrom="10";
	public static String dayTo="10";
	public static String monthFrom="10";
	public static String monthTo="10";
	public static String yearFrom="2005";
	public static String yearTo="2020";
	public static String  excelFileName = "Testing123";
	public static String FileName = ".\\target\\COS30_CreditSaction\\Filename.png";

	LoginPage login = new LoginPage();
	Robot robo;
	// Verifying Reports--> Sales Commission Branch Enquiry.
	@Test
	public void Client_COS110() throws Throwable {
		try {
			login.LoginCosacClient();
			Thread.sleep(15000);
			Screen s = new Screen();
			s.find(Reports);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			log.info("User clicked on Reports menu");
			Thread.sleep(1000);
			robo=new Robot();
			robo.keyPress(KeyEvent.VK_UP);
			robo.keyPress(KeyEvent.VK_ENTER);
			log.info("User clicked on Sales Commission Branch Enquiry");
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			//Enter FROM date
			log.info("Enter FROM date");
			Library.Interaction.writeKeyboard(robo, dayFrom);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_RIGHT);
			Library.Interaction.writeKeyboard(robo, monthFrom);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_RIGHT);
			Library.Interaction.writeKeyboard(robo, yearFrom);
			log.info("User entered TO date");
			System.out.println("Enter TO date");
			robo.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.writeKeyboard(robo, dayTo);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_RIGHT);
			Library.Interaction.writeKeyboard(robo, monthTo);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_RIGHT);
			Library.Interaction.writeKeyboard(robo, yearTo);
			log.info("User clicked on Search button");
 			s.find(Search);
 			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(5000);
			s.find(arrow);
 			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			String str=Library.Interaction.copyText(robo);
			log.info("User Is able to get report with reference'Commission variable data': "+str);
			Thread.sleep(3000);
			log.info("User clicked on export excel button");
			s.find(Excel);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(7000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1500);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1500);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			log.info("User is export excel file");
			Library.Interaction.closeCosacClient(robo);
			log.info("User is able to close cosac window");
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
			Assert.assertFalse(false);
			Library.Interaction.closeCosacClient(robo);
		}

	}

}
