package com.cosac.TestCases;

import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.cosac.Locators.Xpath;
import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;
import com.cosac.Utilities.JsonParser;

import junit.framework.Assert;

public class COS34_GoodsReturn extends LoginPage {
	
	  public static String Customer =".\\target\\COS30_CreditSaction\\Customer.png"; 
	  public static String Collection = ".\\target\\COS30_CreditSaction\\DropDown.png"; 
	  public static String Reason = ".\\target\\COS30_CreditSaction\\Reason.png"; 
	  public static String SelectRow = ".\\target\\COS30_CreditSaction\\arrow.png"; 
	  public static String save = ".\\target\\COS30_CreditSaction\\save.png";
	  
	  public static String Notes = ".\\target\\COS30_CreditSaction\\Notes.png";
	  public static String PlusBTN = ".\\target\\COS30_CreditSaction\\PlusBTN.png";
	  public static String itemNum = ".\\target\\COS30_CreditSaction\\itemNum.png";
	  public static String accNo = "910444178600"; 
	  public static String branchCode= "910"; 
	  public static String branchName = "910 COURTS CROSS ROADS"; 
	  public static String CollectionValue = "i"; 
	  public static String ReasonValue ="exchange";
	 
	LoginPage login = new LoginPage();

	// Verifying Customer--> Goods Return
	@Test
	public void COS34() throws Throwable {

		try {
			
			login.LoginCosacClient();
			Thread.sleep(15000);
			//log.info("Client Application Steps");
			Screen s = new Screen();
			//s.find(Customer);
			s.find(JsonParser.getSikuliScreePath("goods.GoodsReturn.Customer"));
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			//log.info("user clicked on Customer");
			Robot robo = new Robot();
			robo.keyPress(KeyEvent.VK_SHIFT);
			robo.keyPress(KeyEvent.VK_G);
			robo.keyRelease(KeyEvent.VK_G);
			robo.keyRelease(KeyEvent.VK_SHIFT);
			//log.info("user clicked on Goods Return");
			Thread.sleep(5000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			// please remove hypens and enter account number
			//Library.Interaction.writeKeyboard(robo, accNo);
			Library.Interaction.writeKeyboard(robo, JsonParser.CommonData("Goods.GoodsReturn.accNo"));
			//log.info("User entered account number");
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_ENTER);
			//Thread.sleep(1000);
			//log.info("user clicked on search");
			Thread.sleep(7000);
			//s.find(Collection);
			s.find(JsonParser.getSikuliScreePath("goods.GoodsReturn.Collection"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(2000);
			//log.info("user clicked on Collection");
			//Library.Interaction.writeKeyboard(robo, CollectionValue);
			Library.Interaction.writeKeyboard(robo, JsonParser.CommonData("Goods.GoodsReturn.CollectionValue"));
			//log.info("user selected exchange");
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			//s.find(Reason);
			s.find(JsonParser.getSikuliScreePath("goods.GoodsReturn.Reason"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(1000);
			//log.info("user clicked on Reason");
			//Library.Interaction.writeKeyboard(robo, ReasonValue);
			Library.Interaction.writeKeyboard(robo, JsonParser.CommonData("Goods.GoodsReturn.ReasonValue"));
			robo.keyPress(KeyEvent.VK_ENTER);
			//Thread.sleep(500);
			//log.info("user selected damaged goods");
			Thread.sleep(5000);
			//s.find(itemNum);
			s.find(JsonParser.getSikuliScreePath("goods.GoodsReturn.itemNum"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			
			//log.info("User Selected Row");
			Thread.sleep(3000);
			//s.find(Notes);
			s.find(JsonParser.getSikuliScreePath("goods.GoodsReturn.Notes"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			//Library.Interaction.writeKeyboard(robo, "Faultygoods");
			Library.Interaction.writeKeyboard(robo, JsonParser.CommonData("Goods.GoodsReturn.comment"));
			//log.info("User entered notes");
			Thread.sleep(3000);
			//s.find(PlusBTN);
			s.find(JsonParser.getSikuliScreePath("goods.GoodsReturn.PlusBTN"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			Thread.sleep(6000);
			//log.info("User clicked on plus icon");
			//s.find(save);
			s.find(JsonParser.getSikuliScreePath("goods.GoodsReturn.save"));
			s.mouseMove();
			Thread.sleep(500);
			s.click();
			//log.info("User clicked on save");
			Thread.sleep(15000);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			Library.Interaction.closeCosacClient(robo);

		// Web application starts
			
			Thread.sleep(5000);
			login.LoginCosacWeb();
			Thread.sleep(5000);
			//Library.Interaction.userWait();
			Library.Interaction.click(Xpath.CustomerPickUp.logistics);
			Thread.sleep(2000);
			//log.info("Web Application Steps");
			//log.info("user clicked on logistics");
			Library.Interaction.click(Xpath.CustomerPickUp.customerPickup);
			Thread.sleep(3000);
			//log.info("user clicked on customerPickup");
			Library.Interaction.selectEle(Xpath.CustomerPickUp.ArrowdeliveryBranch,
			Xpath.CustomerPickUp.SearchdeliveryBranch, Xpath.CustomerPickUp.SelectdeliveryBranch, JsonParser.CommonData("Goods.GoodsReturn.branchCode"),JsonParser.CommonData("Goods.GoodsReturn.branchName"));
			Thread.sleep(4000);
			//log.info("user selected branch code and name");
			Thread.sleep(4000);
			Library.Interaction.click(Xpath.CustomerPickUp.printReturn);
			Thread.sleep(4000);
			//log.info("user clicked on printReturn");
			Library.Interaction.click(Xpath.CustomerPickUp.newPickUpLink);
			Thread.sleep(4000);
			//log.info("user clicked on newPickUpLink link");
			Thread.sleep(4000);
			Library.Interaction.switchToNewWindow();
			//log.info("user swiched to new window");
			WebElement text = driver.findElement(By.xpath(Xpath.CustomerPickUp.ReturnNote));
			Thread.sleep(2000);
			String Printnote = text.getText();
			System.out.println(text);
			String Id = Printnote.substring(13, 20);
			System.out.println(Id);
			//log.info("user captured the id and saved in id variable");
			Thread.sleep(2000);
			driver.close();
			//log.info(" window is closed after collecting ID");
			Library.Interaction.switchToParentWindow();
			Thread.sleep(3000);
			//log.info("Switched to Parent window");
			Library.Interaction.click(Xpath.CustomerPickUp.okBTN);
			Thread.sleep(3000);
			//log.info("user clicked on OK button");
			Library.Interaction.click(Xpath.CustomerPickUp.confirmpickUpNote);
			Thread.sleep(5000);
			//log.info("user clicked on confirmpickUpNote");
			Library.Interaction.click(Xpath.CustomerPickUp.logistics);
			Thread.sleep(2000);
			//log.info("user clicked on logistics");
			Library.Interaction.click(Xpath.CustomerPickUp.searchShipment);
			Thread.sleep(2000);
			//log.info("clicked on searchShipment");
			Library.Interaction.setTextBoxByXpath(Xpath.CustomerPickUp.search, Id);
			Thread.sleep(2000);
			//log.info("Searched id");
			WebElement status = driver.findElement(By.xpath(Xpath.CustomerPickUp.status));
			Thread.sleep(1000);
			//log.info("user checked the status");
			String Expected = "Collected";
			String Actual = status.getText();
			System.out.println(Actual);
			//log.info("User captued the status");
			Assert.assertEquals(Expected, Actual);
			Thread.sleep(2000);
			driver.quit();

		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertFalse(false);
			driver.quit();
		}

	}
}
