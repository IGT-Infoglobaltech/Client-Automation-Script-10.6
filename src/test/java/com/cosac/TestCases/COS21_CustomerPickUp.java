package com.cosac.TestCases;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.KeyEvent;
//Here we are Creating and Verifying New Store Location in Country
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.ToolTipUI;

import org.apache.log4j.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.WiniumDriver;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Id;
import com.cosac.Locators.Name;
import com.cosac.Locators.Xpath;

import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;
import com.cosac.Utilities.JsonParser;
import com.google.j2objc.annotations.Property;

public class COS21_CustomerPickUp extends LoginPage {
	
	
	LoginPage login=new LoginPage();
	Screen s;
	Robot robo1;
	String accountNO;
	String productPopUp="C:\\Automation Script\\COSACS_CLIENT_AUTOMATIONSCRIPT\\target\\CustPickup\\productPopup.png";
	String error="C:\\Automation Script\\COSACS_CLIENT_AUTOMATIONSCRIPT\\target\\CustPickup\\error.png";
	
    //Verifying Create--> Location.
	@Test(priority=0)
	public void Client() throws Throwable
	{
		String Phone=JsonParser.CommonData("COS-21.CustomerPickUp.Phone");
		int coubt=Phone.length();
	    String PhoneAreaCode = Phone.substring(0, 3);
	    String PhoneNumber = Phone.substring(3, coubt);
		try {
			
		login.LoginCosacClient();

            Thread.sleep(15000);
            s = new Screen();
			robo1 = new Robot();
			
			
			s.find(JsonParser.getSikuliScreePath("CashAndGoScreensPath.NewCustCASHAccount.Customer"));
			s.mouseMove();
			Thread.sleep(1000);
			s.click();

			Thread.sleep(2000);
			// log.info("User is able to click to Customer");
			s.find(JsonParser.getSikuliScreePath("CashAndGoScreensPath.NewCustCASHAccount.CustomerSearch"));
			s.mouseMove();
			Thread.sleep(1000);
            robo1 = new Robot();
		    robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_DOWN);
			robo1.keyPress(KeyEvent.VK_ENTER);
			// log.info("User is able to click to New Customer");
			Thread.sleep(10000);

			s.find(JsonParser.getSikuliScreePath("CashAndGoScreensPath.NewCustCASHAccount.CustomerID"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(700);
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("COS-21.CustomerPickUp.PersonalID"));
			Thread.sleep(2000);
			s.find(JsonParser.getSikuliScreePath("CashAndGoScreensPath.NewCustCASHAccount.LinkingAccount"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(300);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("COS-21.CustomerPickUp.DOB"));
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("COS-21.CustomerPickUp.FirstName"));
			Thread.sleep(1000);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("COS-21.CustomerPickUp.LastName"));
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_DOWN);
			
			Thread.sleep(3000);
			s.find(JsonParser.getSikuliScreePath("CashAndGoScreensPath.NewCustCASHAccount.AddressAdd"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(4000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("COS-21.CustomerPickUp.Address1"));
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("COS-21.CustomerPickUp.Address2"));
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("COS-21.CustomerPickUp.Address3"));
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("COS-21.CustomerPickUp.PostalCode"));
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboard(robo1, PhoneAreaCode);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboard(robo1, PhoneNumber);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
            Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("COS-21.CustomerPickUp.Email"));
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(4000);
			s.find(JsonParser.getSikuliScreePath("CashAndGoScreensPath.NewCustCASHAccount.CreateCASHAccount"));
			s.mouseMove();
			Thread.sleep(300);
			s.click();
			Thread.sleep(16000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(700);
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("COS-21.CustomerPickUp.productCode"));
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.writeKeyboard(robo1, "9");
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(700);
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("COS-21.CustomerPickUp.productQuantity"));
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(700);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_TAB);
			
			Thread.sleep(1000);
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("COS-21.CustomerPickUp.DeliveryDay"));
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			s.find(JsonParser.getSikuliScreePath("CashAndGoScreensPath.NewCustCASHAccount.DeliveryInst"));
			s.mouseMove();
			Thread.sleep(700);
			s.click();
			//Thread.sleep(3000);
			Thread.sleep(3000);
			s.find(JsonParser.getSikuliScreePath("CashAndGoScreensPath.NewCustCASHAccount.AddProductIcon"));
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(1500);
			try 
            {
            	 if(s.exists(JsonParser.getSikuliScreePath("CashAndGoScreensPath.NewCustCASHAccount.OutOfStock"))!= null)
     		    { 
            		 robo1.keyPress(KeyEvent.VK_ENTER);
     		    }
     		else {
     				System.out.println("Product Out of stock popup not coming");
     			} 
				
			} 
            catch (Exception e) {
            	System.out.println("Product in stock");
			}
			
			Thread.sleep(4000);
			
            try 
            {
            	 if(s.exists(JsonParser.getSikuliScreePath("CashAndGoScreensPath.NewCustCASHAccount.warrantyScreen"))!= null)
     		    { 
     		    s.find(JsonParser.getSikuliScreePath("CashAndGoScreensPath.NewCustCASHAccount.add"));
     		    s.mouseMove();
     			Thread.sleep(500);
     		    s.click();
     		    Thread.sleep(6000);
     		    s.find(JsonParser.getSikuliScreePath("CashAndGoScreensPath.NewCustCASHAccount.buy"));
     		    s.mouseMove();
     			Thread.sleep(500);
     		    s.click();
     		    Thread.sleep(10000);
     		    }
     		else {
     				System.out.println("Warranty not Added to Product");
     			} 
				
			} 
            catch (Exception e) {
            	System.out.println("Product is not warrantable");
			}

			
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2500);
			s.find(JsonParser.getSikuliScreePath("CashAndGoScreensPath.NewCustCASHAccount.SaveIcon"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(3000);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(4000);
			s.find(JsonParser.getSikuliScreePath("CashAndGoScreensPath.NewCustCASHAccount.CloseTab"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(4000);
			s.find(JsonParser.getSikuliScreePath("CashAndGoScreensPath.NewCustCASHAccount.AccountNoBar"));
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(1500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_C);
			Thread.sleep(200);
			robo1.keyRelease(KeyEvent.VK_C);
			Thread.sleep(200);
			robo1.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(200);
			accountNO = Library.Interaction.copyText(robo1).replace("-", "");
		    Thread.sleep(3000);
			s.find(JsonParser.getSikuliScreePath("CashAndGoScreensPath.NewCustCASHAccount.CloseTab"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(3000);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			s.find(JsonParser.getSikuliScreePath("CashAndGoScreensPath.NewCustCASHAccount.Transaction"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(200);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(4000);
			Thread.sleep(1500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_V);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_V);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(3000);
			s.find(JsonParser.getSikuliScreePath("CashAndGoScreensPath.NewCustCASHAccount.PaymentCustID"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(4000);
			s.find(JsonParser.getSikuliScreePath("CashAndGoScreensPath.NewCustCASHAccount.PaymentAmmount"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(1500);
			robo1.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(20);
			robo1.keyPress(KeyEvent.VK_C);
			Thread.sleep(100);
			robo1.keyRelease(KeyEvent.VK_C);
			Thread.sleep(100);
			robo1.keyRelease(KeyEvent.VK_CONTROL);

			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(15000);

			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(7000);
			Library.Interaction.closeCosacClient(robo1);
			Thread.sleep(1000);
			
		}
		catch (Exception e) 
		{
			Assert.fail( e.getMessage());
			e.printStackTrace();
			e.getMessage();
			Library.Interaction.closeCosacClient(robo1);
			driver.close();
		}}
	private Object exists(String error2) {
		// TODO Auto-generated method stub
		return null;
	}
	@Test(dependsOnMethods = "Client")
			public void custPickup() throws Throwable
			{
				try {
				 login.LoginCosacWeb();
				 Library.Interaction.userWait();
				 Library.Interaction.print("User Launched web application");
				 Library.Interaction.clickByXpath(Xpath.CustPickup.Logistic);
				 Library.Interaction.userWait();
				 Library.Interaction.clickByXpath(Xpath.CustPickup.searchShipment);
				 String str2="171400649590";
				 Library.Interaction.setTextBoxByXpath(Xpath.CustPickup.search, accountNO);
				 String status=driver.findElement(By.xpath(Xpath.CustPickup.status)).getText();
				 Library.Interaction.print(status);
				try {
					if (status != null) {
						Library.Interaction.print(status);
						Library.Interaction.print("status found with: "+status);
					} else {
						Library.Interaction.print("status not found");
					}
				} catch (Exception e) {
					Library.Interaction.print("status not found");
				}
				 Library.Interaction.print(status);
				 Thread.sleep(4000);
				 driver.quit();
			

		}
			

		catch (Exception e) 
		{
			Assert.fail( e.getMessage());
			e.printStackTrace();
			e.getMessage();
			Library.Interaction.closeCosacClient(robo1);
			driver.quit();
		}
		
		
}

	
     
 }

