package com.cosac.TestCases;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;

import com.cosac.Utilities.JsonReader;
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

import net.minidev.json.parser.ParseException;


public class COS30_CreditSanctioning extends LoginPage {
	/*
	 * public static String PersonalID = "3399889"; public static String DOB =
	 * "1989"; public static String FirstName = "Vivek"; public static String
	 * LastName = "Bharti"; public static String Address1 = "street1"; public static
	 * String Address2 = "street2"; public static String Address3 = "JM"; public
	 * static String PostalCode = "12345"; public static String Phone = "123456789";
	 * public static String Email = "ma@gmail.com"; public static String productCode
	 * = "ORWE58"; public static String productQuantity = "1"; public static String
	 * DeliveryDay = "08"; public static String PhoneAreaCode = "2300"; public
	 * static String PhoneNumber = "2300"; public static String TenderedAmount =
	 * "2300";
	 */

	/*
	 * public static String CustomerID =
	 * ".\\target\\COS30_CreditSaction\\CustomerID.png"; public static String
	 * LinkingAccount = ".\\target\\COS30_CreditSaction\\LinkingAccount.png"; public
	 * static String CreateReadyFinance =
	 * ".\\target\\COS30_CreditSaction\\ReadyFinance.png"; public static String
	 * AddressAdd = ".\\target\\COS30_CreditSaction\\AddressAdd.png"; public static
	 * String MatchingRecord = ".\\target\\COS30_CreditSaction\\MatchingRecord.png";
	 * public static String ResidentialButton =
	 * ".\\target\\COS30_CreditSaction\\ResidencialButton.png"; public static String
	 * EmployeeStatus = ".\\target\\COS30_CreditSaction\\EmployeeStatus.png"; public
	 * static String Employment = ".\\target\\COS30_CreditSaction\\Employment.png";
	 * public static String Category =
	 * ".\\target\\COS30_CreditSaction\\Category.png"; public static String
	 * PayButton = ".\\target\\COS30_CreditSaction\\PayButton.png"; public static
	 * String CloseTab = ".\\target\\COS30_CreditSaction\\CloseTab.png"; public
	 * static String Approve = ".\\target\\COS30_CreditSaction\\Approve.png"; public
	 * static String UW = ".\\target\\COS30_CreditSaction\\UW.png"; public static
	 * String GreenButton = ".\\target\\COS30_CreditSaction\\GreenButton.png";
	 * public static String Comments =
	 * ".\\target\\COS30_CreditSaction\\Comments.png"; public static String
	 * Reference2 = ".\\target\\COS30_CreditSaction\\Reference2.png"; public static
	 * String References = ".\\target\\COS30_CreditSaction\\References.png"; public
	 * static String EmployerDetals =
	 * ".\\target\\COS30_CreditSaction\\EmployerDetails.png"; public static String
	 * S2 = ".\\target\\COS30_CreditSaction\\S2.png"; public static String
	 * CurrResidentialSt = ".\\target\\COS30_CreditSaction\\CurrResidentialSt.png";
	 * public static String DD = ".\\target\\COS30_CreditSaction\\DD.png"; public
	 * static String AddProductIcon =
	 * ".\\target\\COS30_CreditSaction\\AddProductIcon.png"; public static String
	 * SaveIcon = ".\\target\\COS30_CreditSaction\\SaveIcon.png"; public static
	 * String AccountNoBar = ".\\target\\COS30_CreditSaction\\AccountNoBar.png";
	 * public static String Transaction =
	 * ".\\target\\COS30_CreditSaction\\Transaction.png"; public static String
	 * PaymentCustID = ".\\target\\COS30_CreditSaction\\PaymentCustID.png"; public
	 * static String PaymentAmmount =
	 * ".\\target\\COS30_CreditSaction\\PaymentAmmount.png"; public static String
	 * ProductCategory = ".\\target\\COS30_CreditSaction\\ProductCategory.png";
	 * public static String ProductCategory1 =
	 * ".\\target\\COS30_CreditSaction\\ProductCategory1.png"; public static String
	 * Finnancial = ".\\target\\COS30_CreditSaction\\Finnancial.png"; public static
	 * String Search = ".\\target\\COS30_CreditSaction\\Search2.PNG"; public static
	 * String Main = ".\\target\\COS30_CreditSaction\\Main.png"; public static
	 * String CheckBox = ".\\target\\COS30_CreditSaction\\CheckBox.png";
	 */

	LoginPage login = new LoginPage();
	Robot robo1;
	Screen s;

	// Verifying Credit--> Incomplete Credit Applications
	@Test
	public void COS30() throws Throwable {
		
		String Phone=JsonParser.CommonData("ReadyFinnanceFData.RFData.Phone");
		int coubt=Phone.length();
	    String PhoneAreaCode = Phone.substring(0, 3);
	    String PhoneNumber = Phone.substring(3, coubt);

		try {
			login.LoginCosacClient();
			Thread.sleep(15000);
			s = new Screen();
            robo1 = new Robot();
			
			
			robo1.keyPress(KeyEvent.VK_ALT);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_C);
			Thread.sleep(1000);
			robo1.keyRelease(KeyEvent.VK_C);
			Thread.sleep(500);
			robo1.keyRelease(KeyEvent.VK_ALT);
			
			
			Thread.sleep(1500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_ENTER);
			log.info("User is able to click to New Customer");
			Thread.sleep(5000);

			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.CustomerID"));
			s.mouseMove();
			Thread.sleep(800);
			s.click();
			Thread.sleep(700);
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.PersonalID"));
			Thread.sleep(2000);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.LinkingAccount"));
			s.mouseMove();
			Thread.sleep(800);
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
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.DOB"));
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.FirstName"));
			Thread.sleep(1000);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.LastName"));
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
			Thread.sleep(300);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.AddressAdd"));
			s.mouseMove();
			Thread.sleep(800);
			//Library.Interaction.userWait();
			s.click();
			Thread.sleep(4000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.Address1"));
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.Address2"));
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.Address3"));
			Thread.sleep(500);
			Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Library.Interaction.userWait();
			Library.Interaction.writeKeyboard(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.PostalCode"));
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
			// Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			// Library.Interaction.userWait();
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);

			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.Email"));
			Thread.sleep(300);
			// Library.Interaction.userWait();
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
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.CreateReadyFinance"));
			s.mouseMove();
			Thread.sleep(800);
			s.click();
			Thread.sleep(500);
			log.info("User created RF Account");
			Thread.sleep(9000);

			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.MatchingRecord"));
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			log.info("User clicked matchingrecord");
			Thread.sleep(1000);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			String accountNO = Library.Interaction.copyText(robo1).replace("-", "");
			robo1.mousePress(InputEvent.BUTTON3_DOWN_MASK);
			robo1.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(7000);
			//Personal
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			//Residential
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.ResidentialButton"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo1.keyPress(KeyEvent.VK_DELETE);
			Thread.sleep(500);
			Library.Interaction.writeKeyboardString(robo1, "5");
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(4000);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.CurrentResidentialStatus"));
			s.mouseMove();
			Thread.sleep(800);
			s.click();
			Thread.sleep(700);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(4000);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.Employment"));
			s.mouseMove();
			Thread.sleep(300);
			s.click();
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DELETE);
			Thread.sleep(500);
			Library.Interaction.writeKeyboardString(robo1, "5");
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(4000);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.EmployeeStatus"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(700);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			//Pay Frequency
			Thread.sleep(2000);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.Finnancial"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(700);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.NetIncome"));
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
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.MiscExpense"));
			Thread.sleep(2000);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.Category"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(2000);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.ProductCategory"));
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(1500);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2500);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.GreenButton"));
			s.mouseMove();
			Thread.sleep(800);
			s.click();
			Thread.sleep(1500);
			robo1.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1500);
			robo1.keyPress(KeyEvent.VK_ENTER);
			log.info("User Completed Sanction Stage 1");
			Thread.sleep(3000);
			
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.S2"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(5000);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.EmployerDetals"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(700);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.EmployerName"));
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.EmployerAdd1"));
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.EmployerAdd2"));
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.EmployerPostal"));
			Thread.sleep(3000);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.References"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(700);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.Ref1FirstName"));
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.Ref1SecName"));
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.Ref1Add1"));
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.Ref1Add2"));
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.Ref1Postal"));
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
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.Reference2"));
			s.mouseMove();
			Thread.sleep(800);
			s.click();
			Thread.sleep(700);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			//Library.Interaction.writeKeyboardString(robo1, "JackSecond");
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.Ref2FirstName"));
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			//Library.Interaction.writeKeyboardString(robo1, "Luis");
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.Ref2SecName"));
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			//Library.Interaction.writeKeyboardString(robo1, "HomeAdress3");
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.Ref2Add1"));
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			//Library.Interaction.writeKeyboardString(robo1, "HomeAdress4");
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.Ref2Add2"));
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			//Library.Interaction.writeKeyboardString(robo1, "8976558");
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.Ref2Postal"));
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
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.Comments"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(2000);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.GreenButton"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			log.info("User Completed Sanction Stage 2");
			Thread.sleep(3000);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.DD"));
			s.mouseMove();
			Thread.sleep(800);
			s.click();
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(700);
			//Proof Of ID
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
		    Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.PId"));
			Thread.sleep(300);
			//Proof of Income
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.PIncome"));
			//Proof Of Address
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.PAddress"));
			Thread.sleep(2000);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.GreenButton"));
			s.mouseMove();
			Thread.sleep(800);
			s.click();
			log.info("User Completed DD");
			Thread.sleep(5000);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.Main"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(500);
			// for credit option
			Thread.sleep(4000);
			robo1.keyPress(KeyEvent.VK_ALT);
			robo1.keyPress(KeyEvent.VK_R);
			robo1.keyRelease(KeyEvent.VK_R);
			robo1.keyRelease(KeyEvent.VK_ALT);
			log.info("user clicked on credit");
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_SHIFT);
			robo1.keyPress(KeyEvent.VK_I);
			robo1.keyRelease(KeyEvent.VK_I);
			robo1.keyRelease(KeyEvent.VK_SHIFT);
			log.info("user clicked on incomplete credit applications");
			Thread.sleep(3000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			
			//Library.Interaction.writeKeyboardString(robo1, "910");
			Library.Interaction.writeKeyboardString(robo1, JsonParser.CommonData("CreditSanc.CreditSanctioning.BranchCode"));
			Thread.sleep(2500);
			//s.find(Search);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.Search"));
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(3000);
			//log.info("serach");
			//s.mouseMove();
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			//s.find(CheckBox);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.CheckBox"));
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(2000);
			log.info("user unchecked 1st checkbox");		
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			//s.find(CheckBox);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.CheckBox"));
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(2000);
			log.info("user unchecked 2nd checkbox");	
			//s.find(Search);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.Search"));
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(2000);	
			//log.info("serach");
			//s.find(MatchingRecord);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.MatchingRecord"));
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(2000);
			robo1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			String str = accountNO;
			String previous_str = "";
			Boolean flag_one = true;
			while (flag_one) {
				String result1 = Library.Interaction.copyText(robo1);
				System.out.println(result1);

				if (previous_str.equals(result1)) {
					flag_one = false;
				}
				if (flag_one) {
					if (str.equals(result1)) {
						System.out.println("Entered the result=" + result1);
						robo1.keyPress(KeyEvent.VK_ENTER);

						robo1.mousePress(InputEvent.BUTTON2_DOWN_MASK);
						robo1.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
						Thread.sleep(100);
						break;
					} else {
						robo1.keyPress(KeyEvent.VK_DOWN);
						previous_str = result1;
					}
				} else {
					break;
				}
			}
			log.info("User is able to match record");
			//UW 
			Thread.sleep(3000);
			//s.find(UW);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.UW"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			log.info("User clicked UW");
			Thread.sleep(3000);
			//s.find(Approve);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.Approve"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			log.info("User clicked Approve");
			Thread.sleep(2500);
			//s.find(GreenButton);
			s.find(JsonParser.getSikuliScreePath("CS.CreditSaction.GreenButton"));
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			log.info("User completed UW");
			log.info("User completed Credit Sactioning");
			Thread.sleep(4000);
			Library.Interaction.closeCosacClient(robo1);
			Thread.sleep(2000);
		} catch (Exception e) {
			driver.close();
			e.printStackTrace();
			Assert.assertFalse(false);
		}
	}
	}
			
			
			
			
			