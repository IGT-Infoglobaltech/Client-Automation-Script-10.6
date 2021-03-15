package com.cosac.TestCases;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
//Here we are Creating and Verifying New Store Location in Country
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.Locators.Name;
import com.cosac.Locators.Xpath;

import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;
import com.cosac.Utilities.JsonParser;

import bsh.util.AWTConsole;

public class COS_57GiftVouchers extends LoginPage {
	


	//voucher name changes all the time
	//String VoucherName="0125";
	String VoucherValue="24";
	String AccountNum="344400354390";
	//file name changes all the time
	String FileName="122";
	LoginPage login=new LoginPage();
	Robot robot;
    //Verifying Transaction--> GiftVoucher.
	@Test
	public void Client() throws Throwable
	{
		try {
			
			login.LoginCosacClient();
			Thread.sleep(15000);
			Screen s=new Screen();
			robot=new Robot();
			log.info("User able to login Client Application");
			//user click on the gift voucher
			//user enters the name  of the gift voucher
			robot.keyPress(KeyEvent.VK_ALT);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_T);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_T);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_ALT);
	        log.info("User clicked on the GiftVoucher");
	        robot.keyPress(KeyEvent.VK_SHIFT);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_V);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_V);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_SHIFT);
	        Thread.sleep(3000);
	        // user enters the referance name
	        //Library.Interaction.writeKeyboard(robot, VoucherName);
	        Library.Interaction.writeKeyboard(robot, JsonParser.CommonData("GiftVoucher.Gift.VoucherName"));
	        Thread.sleep(1000);
	        log.info("User enters the referance name");
	        //user selects the check box
			robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
			//user click on the check box
	        robot.keyPress(KeyEvent.VK_ENTER);
	        Thread.sleep(4000);
			//user Moves to expiry date 
	        robot.keyPress(KeyEvent.VK_TAB);
	        //user enters the voucher value
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        //user enters the value
	        //Library.Interaction.writeKeyboard(robot, VoucherValue);
	        Library.Interaction.writeKeyboard(robot, JsonParser.CommonData("GiftVoucher.Gift.VoucherValue"));
	        Thread.sleep(1000);
			//user click on the enter
			robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(1000);
	        robot.keyPress(KeyEvent.VK_ENTER);
            //user clicked on the Transactions
	        log.info("User able to Sell Gift Voucher");
	        
	        Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ALT);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_T);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_T);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_ALT);

	        //user enters the payment screen
	        Thread.sleep(1500);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        Thread.sleep(4000);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(1000);
	        //Library.Interaction.writeKeyboard(robot, AccountNum);
	        Library.Interaction.writeKeyboard(robot, JsonParser.CommonData("GiftVoucher.Gift.AccountNum"));
	        Thread.sleep(1000);
	        log.info("User able to Enter Account Number in Payment Page");
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(10000);
	        //user selects the gift voucher from the list
	        robot.keyPress(KeyEvent.VK_SHIFT);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyRelease(KeyEvent.VK_SHIFT);
            //user sell the  voucher
	        //user selects the gift voucher as the payment option
	        Thread.sleep(1000);
	        robot.keyPress(KeyEvent.VK_G);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_G);
			Thread.sleep(500);
			//user enters the gift voucher name
			robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        Thread.sleep(500);
	        //Library.Interaction.writeKeyboard(robot, VoucherName);
	        Library.Interaction.writeKeyboard(robot, JsonParser.CommonData("GiftVoucher.Gift.VoucherName"));
	        Thread.sleep(500);
	        log.info("User able to Enter Voucher name in Payment Page");
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        Thread.sleep(500);
	        Thread.sleep(500);
	        //user click on pay button
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        Thread.sleep(8000);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_TAB);
	        Thread.sleep(1000);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        Thread.sleep(3000);
	        log.info("Gift Voucher Payment Completed");
	        Library.Interaction.closeCosacClient(robot);
	        log.info("User able to close cosac");
	     
	       
		
		} catch (Exception e) {
			e.getMessage();
			e.getStackTrace();
			Assert.assertFalse(false);
			Library.Interaction.closeCosacClient(robot);
		}
		
		
	}
     
 }

