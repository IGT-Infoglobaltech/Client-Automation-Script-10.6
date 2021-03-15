package com.cosac.TestCases;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.KeyEvent;
//Here we are Creating and Verifying New Store Location in Country
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.WiniumDriver;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cosac.Locators.Id;
import com.cosac.Locators.Name;
import com.cosac.Locators.Xpath;

import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;
import com.cosac.Utilities.Constants;
import com.cosac.Utilities.JsonParser;
import com.cosac.Utilities.JsonReader;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import net.minidev.json.parser.ParseException;

public class COS24_NewCustomerCASH extends LoginPage {

	LoginPage login = new LoginPage();
	Screen s;
	Robot robo1;
	

	// Verifying Create--> Location.
	@Test()

	public void Client() throws Throwable
			{
		String Phone=JsonParser.CommonData("CashAndGo.NewCustomerCASHAccount.Phone");
		int coubt=Phone.length();
	    String PhoneAreaCode = Phone.substring(0, 3);
	    String PhoneNumber = Phone.substring(3, coubt);
		try {
			login.LoginCosacClient();
			Thread.sleep(15000);
			s = new Screen();
			s.find(JsonParser.getSikuliScreePath("CashAndGoScreensPath.NewCustCASHAccount.Customer"));
			s.mouseMove();
			Thread.sleep(1000);
			s.click();

			Thread.sleep(2000);
			 log.info("User is able to click to Customer");
			s.find(JsonParser.getSikuliScreePath("CashAndGoScreensPath.NewCustCASHAccount.CustomerSearch"));
			s.mouseMove();
			Thread.sleep(1000);
            robo1 = new Robot();
		    robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_DOWN);
			robo1.keyPress(KeyEvent.VK_ENTER);
			 log.info("User is able to click to New Customer");
			Thread.sleep(10000);

			s.find(JsonParser.getSikuliScreePath("CashAndGoScreensPath.NewCustCASHAccount.CustomerID"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(700);
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("CashAndGo.NewCustomerCASHAccount.PersonalID"));
			 log.info("User Entered CustomerID");
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
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("CashAndGo.NewCustomerCASHAccount.DOB"));
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("CashAndGo.NewCustomerCASHAccount.FirstName"));
			Thread.sleep(1000);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("CashAndGo.NewCustomerCASHAccount.LastName"));
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
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CashAndGo.NewCustomerCASHAccount.Address1"));
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CashAndGo.NewCustomerCASHAccount.Address2"));
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CashAndGo.NewCustomerCASHAccount.Address3"));
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("CashAndGo.NewCustomerCASHAccount.PostalCode"));
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
            Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CashAndGo.NewCustomerCASHAccount.Email"));
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
			log.info("User User Clickes to Create CASH Customer");
			Thread.sleep(20000);
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
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("CashAndGo.NewCustomerCASHAccount.productCode"));
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.writeKeyboard(robo1, "9");
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(700);
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("CashAndGo.NewCustomerCASHAccount.productQuantity"));
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
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("CashAndGo.NewCustomerCASHAccount.DeliveryDay"));
			Thread.sleep(1000);
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
			log.info("User Clicked to Save Product");
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
			log.info("User Clicked to Transaction");
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
			log.info("User Completed Transaction Successfully");
			Thread.sleep(7000);
			Library.Interaction.closeCosacClient(robo1);
			Thread.sleep(1000);

		} catch (Exception e) {
			e.getMessage();
			Assert.fail( e.getMessage());
		    Library.Interaction.closeCosacClient(robo1);

		}

	}

}
