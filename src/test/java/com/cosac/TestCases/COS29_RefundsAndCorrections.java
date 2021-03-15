package com.cosac.TestCases;
import java.awt.Robot;
import java.awt.event.KeyEvent;
//Here we are Creating and Verifying New Store Location in Country
import java.io.IOException;
import java.net.URL;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.WiniumDriver;

import org.openqa.selenium.winium.WiniumOptions;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Id;
import com.cosac.Locators.Name;
import com.cosac.Locators.Xpath;

import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;
import com.cosac.Utilities.JsonParser;

public class COS29_RefundsAndCorrections extends LoginPage {
	
	private static final WiniumOptions String = null;

	
	LoginPage login = new LoginPage();
   
	@Test
	public void Client() throws Throwable
	
	{
		try {
			login.LoginCosacClient();
			Thread.sleep(25000);
			Screen S = new Screen();
			
			
			//Clicking on Transactions
			Robot robo= new Robot();
			robo.keyPress(KeyEvent.VK_ALT);
			Thread.sleep(300);
			robo.keyPress(KeyEvent.VK_T);
			Thread.sleep(300);
			robo.keyRelease(KeyEvent.VK_T);
			Thread.sleep(300);
			robo.keyRelease(KeyEvent.VK_ALT);
			
			//Clicking on Payments Tab
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			Thread.sleep(7000);
			Library.Interaction.print("User Clicked on Payments Tab");
			Thread.sleep(3000);
			
			//Entering Account Number under Payments
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			//Library.Interaction.writeKeyboard(robo, PaymentAccNum);
			Library.Interaction.writeKeyboard(robo, JsonParser.CommonData("RefundAndCorrection.RefundCurrection.PaymentAccNum"));
			Thread.sleep(2000);
			Library.Interaction.print("User Entered Account Number");
			
			//Entering Amount in the field
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(10000);
			//Library.Interaction.writeKeyboard(robo, Amount);
			Library.Interaction.writeKeyboard(robo, JsonParser.CommonData("RefundAndCorrection.RefundCurrection.Amount"));
			Thread.sleep(1000);
			Library.Interaction.print("User Entered Amount");
			
			Thread.sleep(1000);
			
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			//Library.Interaction.writeKeyboard(robo, TenderAmount);
			Library.Interaction.writeKeyboard(robo, JsonParser.CommonData("RefundAndCorrection.RefundCurrection.TenderAmount"));
			Thread.sleep(1000);
			Library.Interaction.print("User Entered Tendered Amount");
			Thread.sleep(1000);
			//Clicking on Pay Button
			//S.find(receiptNo);
			S.find(JsonParser.getSikuliScreePath("R&C.RefundAndCorrection.receiptNo"));
			S.mouseMove();
			Thread.sleep(1000);
			S.click();
			Thread.sleep(5000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(12000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_ENTER);
			//Thread.sleep(2000);
			Thread.sleep(6000);
			
			//S.find(main);
			S.find(JsonParser.getSikuliScreePath("R&C.RefundAndCorrection.main"));
			S.mouseMove();
			Thread.sleep(1000);
			S.click();
			Thread.sleep(3000);
			
			//Clicking on Transaction Tab
			robo.keyPress(KeyEvent.VK_ALT);
			robo.keyPress(KeyEvent.VK_T);
			Thread.sleep(2000);
			robo.keyRelease(KeyEvent.VK_T);
			robo.keyRelease(KeyEvent.VK_ALT);
			
			//Clicking on Refunds and Corrections Sub menu
			robo.keyPress(KeyEvent.VK_UP);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_UP);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_UP);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_UP);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_UP);
			Thread.sleep(500);
            robo.keyPress(KeyEvent.VK_UP);
			Thread.sleep(500);

			//click on enter
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			Thread.sleep(5000);
			
			//Enter the value on the account number text box
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);

			Library.Interaction.writeKeyboard(robo, JsonParser.CommonData("RefundAndCorrection.RefundCurrection.AccountNum"));
			Library.Interaction.print("User Entered Account Number");
			//Thread.sleep(200);
			
			//To click on the Search button
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			//robo.keyRelease(KeyEvent.VK_TAB);
			
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			//robo.keyRelease(KeyEvent.VK_ENTER);
			Library.Interaction.print("User Clicked on Search Button");
			Thread.sleep(3000);
			

			//Clicking on the Added Data
			//S.find(Data);
			S.find(JsonParser.getSikuliScreePath("R&C.RefundAndCorrection.Data"));
			S.mouseMove();
			Thread.sleep(500);
			S.click();
			Thread.sleep(3000);
			//Clicking on the arrow
			//S.find(arrow);
			S.find(JsonParser.getSikuliScreePath("R&C.RefundAndCorrection.arrow"));
			S.mouseMove();
			Thread.sleep(500);
			S.click();
			Thread.sleep(2000);
			
			//Clicking on the Enter Button
			//S.find(EnterBtn);
			S.find(JsonParser.getSikuliScreePath("R&C.RefundAndCorrection.EnterBtn"));
			S.mouseMove();
			Thread.sleep(500);
			S.click();
			Thread.sleep(3000);
			
			//Entering the credentials for authorisation
			Library.Interaction.writeKeyboard(robo, JsonParser.CommonData("RefundAndCorrection.RefundCurrection.AuthoriseUser"));
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			robo.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(700);
			Library.Interaction.writeKeyboardString(robo, JsonParser.CommonData("RefundAndCorrection.RefundCurrection.Password"));
			Thread.sleep(2500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(9000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(4000);
			Library.Interaction.closeCosacClient(robo);
			Thread.sleep(2000);
			
			
		} catch (Exception e) {
			driver.close();
		}
		
		
	}
	
     
 }

