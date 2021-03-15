package com.cosac.TestCases;

import org.testng.annotations.Test;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.apache.commons.lang3.StringUtils;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.cosac.Locators.Id;
import com.cosac.Locators.Name;
import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;
import com.cosac.Utilities.JsonParser;

public class COS28_CashierTotalingProcess extends LoginPage {

	public String CustomerMenu = System.getProperty("user.dir") + "\\target\\COS28_COS89_COS111\\customer.PNG";
	public String SearchBTN = System.getProperty("user.dir") + "\\target\\SearchBTN.PNG";
	public String AccountNoBar = System.getProperty("user.dir") + "\\target\\AccountNoBar.png";
	public String CloseTab = System.getProperty("user.dir") + "\\target\\CloseTab.png";
	public String Transaction = System.getProperty("user.dir") + "\\target\\Transaction.png";
	public String PaymentCustID = System.getProperty("user.dir") + "\\target\\PaymentCustID.png";
	public String PaymentAmount = System.getProperty("user.dir") + "\\target\\paymentamount.png";
	public String Load = System.getProperty("user.dir") + "\\target\\Load.png";
	public String SaveIcon = System.getProperty("user.dir") + "\\target\\SaveIcon.png";
	public String Name = System.getProperty("user.dir") + "\\target\\COS28_COS89_COS111\\Name.PNG";
	public String TestBoss = System.getProperty("user.dir") + "\\target\\COS28_COS89_COS111\\TestBoss.PNG";
	public String cash = System.getProperty("user.dir") + "\\target\\COS28_COS89_COS111\\cash.PNG";
	public String saveAmount = System.getProperty("user.dir") + "\\target\\COS28_COS89_COS111\\saveAmount.PNG";
	public String copy = System.getProperty("user.dir") + "\\target\\copy.png";
	public String Tendered = System.getProperty("user.dir") + "\\target\\Tendered.png";
	public String main = System.getProperty("user.dir") + "\\target\\COS28_COS89_COS111\\Main.PNG";
	
	
	
	String Amount="10";
	String paidAmount="5";
	String Comment="Done";
	String Reference="hebbalrefnce";
	String AccountNum="910-4439-1679-0";
    LoginPage login=new LoginPage();
	@Test
	public void Client() throws Throwable {
		try {
			login.LoginCosacClient();
			Thread.sleep(25000);
			Screen s = new Screen();
			System.out.println(windowsuserName);
			
			/*s.find(CustomerMenu);
			s.click();*/
		Robot robo = new Robot();
			robo.keyPress(KeyEvent.VK_ALT);
			robo.keyPress(KeyEvent.VK_C);
			robo.keyRelease(KeyEvent.VK_C);
			robo.keyRelease(KeyEvent.VK_ALT);
			Thread.sleep(1000);
			//log.info("User clicked on Customer menu successfully");
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_ENTER);
			//log.info("User Selected Search Customer");
			Thread.sleep(8000);
			s.find(SearchBTN);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			//log.info("User clicked on SearchBTN");
			Thread.sleep(30000);
			s.find(AccountNoBar);
			s.mouseMove();
			Thread.sleep(2000);
			s.click();
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(100);
			robo.keyPress(KeyEvent.VK_C);
			Thread.sleep(100);
			robo.keyRelease(KeyEvent.VK_C);
			Thread.sleep(100);
			robo.keyRelease(KeyEvent.VK_CONTROL);
			//log.info("User Copied the account No successfully");
			Thread.sleep(1000);
			s.find(CloseTab);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();  
			//Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_ALT);
			robo.keyPress(KeyEvent.VK_T);
			robo.keyRelease(KeyEvent.VK_T);
			robo.keyRelease(KeyEvent.VK_ALT);
			
			//log.info("User clicked on Transaction successfully");
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(7000);
			//robo.keyPress(KeyEvent.VK_TAB);
			//Thread.sleep(500);
			//robo.keyPress(KeyEvent.VK_TAB);
			//Thread.sleep(500);
			//robo.keyPress(KeyEvent.VK_ENTER);
			//log.info("User clicked on payment successfully");
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			Library.Interaction.writeKeyboardString(robo, AccountNum);
		
			//robo.keyPress(KeyEvent.VK_CONTROL);
			//Thread.sleep(1000);
			//robo.keyPress(KeyEvent.VK_V);
			//Thread.sleep(1000);
			//robo.keyRelease(KeyEvent.VK_V);
			//Thread.sleep(1000);
			//robo.keyRelease(KeyEvent.VK_CONTROL);
			//Thread.sleep(1000);
			//robo.keyPress(KeyEvent.VK_CONTROL);
			//Thread.sleep(1000);
			//log.info("User pasted the account No successfully");
			//robo.keyPress(KeyEvent.VK_TAB);
			//Thread.sleep(2000);
			//s.find(PaymentCustID);
			//s.mouseMove();
			//Thread.sleep(1000);
			//s.click();
			
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(4000);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(10000);
			Library.Interaction.writeKeyboardString(robo, "2000");
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			Library.Interaction.writeKeyboardString(robo, "2000");
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			//robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
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
			//Thread.sleep(3000);
			//s.find(copy);
			//s.mouseMove();
			//Thread.sleep(1000);
			//s.click();
			Thread.sleep(5000);
			//s.find(Tendered);
			//s.mouseMove();
			//Thread.sleep(1000);
			//s.click();
			//Thread.sleep(3000);
			/*
			 * robo.keyPress(KeyEvent.VK_CONTROL); Thread.sleep(1000);
			 * robo.keyPress(KeyEvent.VK_A); Thread.sleep(1000);
			 * robo.keyRelease(KeyEvent.VK_A); robo.keyRelease(KeyEvent.VK_BACK_SPACE);
			 * Thread.sleep(1000); robo.keyRelease(KeyEvent.VK_CONTROL); Thread.sleep(1000);
			 * Library.Interaction.writeKeyboard(robo, Amount); Thread.sleep(1000);
			 */
			//log.info("User entered the Amount successfully");
			//robo.keyPress(KeyEvent.VK_TAB);
			//Thread.sleep(10000);
			//robo.keyPress(KeyEvent.VK_TAB);
			//Thread.sleep(1000);
			//robo.keyPress(KeyEvent.VK_TAB);
			//Thread.sleep(1000);
			//robo.keyPress(KeyEvent.VK_ENTER);
			//Thread.sleep(1500);
			//robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(7000);
			Thread.sleep(3000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(7000);
			s.find(main);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(5000);
			
			
			
			//log.info("User clicked on CloseBTN successfully");
			Thread.sleep(3000);
			s.find(Transaction);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			//log.info("User clicked on Transaction successfully");
			
			Thread.sleep(2500);
			robo.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(15000);
			s.find(Load);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(10000);
			//log.info("User clicked on LoadBTN");
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(300);
			Library.Interaction.writeKeyboard(robo, paidAmount);
			Thread.sleep(500);
			s.find(SaveIcon);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			//log.info("User clicked on saveBTN successfully");
			Thread.sleep(3000);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			String windowsuserName1 = windowsuserName.substring(0, 1).toUpperCase() + windowsuserName.substring(1);
			System.out.println(windowsuserName1);
			String str=StringUtils.capitalize(windowsuserName);
			System.out.println(str);
			Library.Interaction.writeKeyboardString(robo, windowsuserName);
			//driver.findElementById(Id.LoginPage.userName).sendKeys(windowsuserName);
			Thread.sleep(3000);
			//log.info("User Entered the UserName To Authorize");
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			//String str1=StringUtils.capitalize(WindowspassWord);
			//String WindowspassWord1 = WindowspassWord.substring(0, 1).toUpperCase() + WindowspassWord.substring(1);
			Library.Interaction.writeKeyboardString(robo, WindowspassWord);
//			driver.findElementById(Id.LoginPage.passWord).sendKeys(WindowspassWord);
			//log.info("User Entered the password To Authorize");
			Thread.sleep(3000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_ENTER);
			//log.info("User clicked on AuthorizeBTN successfully");
			Thread.sleep(5000);
			// robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
			Library.Interaction.writeKeyboard(robo, paidAmount);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			Library.Interaction.writeKeyboard(robo, Comment);
			//log.info("User Entered the comment");
			Thread.sleep(1000);
			s.find(SaveIcon);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(5000);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			s.find(".\\target\\COS28_COS89_COS111\\Cancel.PNG");
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			//log.info("User clicked on saveBTN successfully");
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_ESCAPE);
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_ESCAPE);
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_ESCAPE);
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_ESCAPE);
			Thread.sleep(5000);
			robo.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(4000);
			
			robo.keyPress(KeyEvent.VK_UP);
			Thread.sleep(2000);
			s.find(Name);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(5000);
			s.find(Name);
			Thread.sleep(1000);
			s.click();
			Thread.sleep(3000);
			Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2500);
			String str7="RIT Core User";
			String previous_str = "";
			Boolean flag_one = true;
			while (flag_one) {
				String result1=Library.Interaction.copyText(robo);
				System.out.println(result1);
				
				if(previous_str.equals(result1))
				{
					flag_one = false;
				}
				if (flag_one) {
                if (str7.equals(result1)) {
                	System.out.println("Entered the result="+result1);
                	robo.keyPress(KeyEvent.VK_ENTER);
                	
                	robo.mousePress(InputEvent.BUTTON2_DOWN_MASK);
                	robo.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
                	//robo1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                	//robo1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                	Thread.sleep(100);
                	break;
                }
                else {
                	robo.keyPress(KeyEvent.VK_DOWN);
                	previous_str = result1;
				}
				}
				else
				{
					break;
				}
			}
			System.out.println("Execution Ended");
			
			
			//s.find(TestBoss);
			//s.mouseMove();
			//Thread.sleep(1000);
			///s.click();
			Thread.sleep(10000);
			robo.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(2000);	
			robo.keyPress(KeyEvent.VK_CONTROL);
			 Thread.sleep(500);
			robo.keyPress(KeyEvent.VK_C);
			 Thread.sleep(500);
			robo.keyRelease(KeyEvent.VK_C);
			 Thread.sleep(500);
			robo.keyRelease(KeyEvent.VK_CONTROL);	
			Thread.sleep(1000);
			s.find(cash);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(300);
			robo.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(1000);
			  robo.keyPress(KeyEvent.VK_CONTROL);
			  Thread.sleep(1000);
			  robo.keyPress(KeyEvent.VK_V);
			  Thread.sleep(1000);
			  robo.keyRelease(KeyEvent.VK_V);
			  Thread.sleep(1000);
			  robo.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			robo.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(1000);
			robo.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(1000);
			Library.Interaction.writeKeyboard(robo, Reference);
			Thread.sleep(1000);
			s.find(saveAmount);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();
			Thread.sleep(8000);
			Library.Interaction.closeCosacClient(robo);
			Thread.sleep(2000);
			//log.info("cashier paid amount to maincashier successfully");
			//Thread.sleep(5000);
			

		} catch (Exception e) {
			e.printStackTrace();
			driver.close();
		}
	}

}
