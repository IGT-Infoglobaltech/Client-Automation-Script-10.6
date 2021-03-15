package com.cosac.TestCases;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.Match;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cosac.PageObject.Library;
import com.cosac.PageObject.LoginPage;

public class COS67_SystemConfiguration_CountryMaintenance extends LoginPage{
	
	public String SystemConfiguration=".\\target\\COS67_CountryMaintenance\\SystemConfig.PNG";
	public String ScrollDown="./target/COS67_CountryMaintenance/scrolldown.png";
	public String TAX="./target/COS67_CountryMaintenance/TAX.png";
	public String TaxRate="./target/COS67_CountryMaintenance/TaxRate.png";
	public String TaxDown="./target/COS67_CountryMaintenance/TaxDown.png";
	public String Save="./target/COS67_CountryMaintenance/TaxRateSave.png";
	public String Exit="./target/COS67_CountryMaintenance/CntryMntExit.png";
	public String Delivery="./target/COS67_CountryMaintenance/Delivery.png";
	public String ExpDelivery="./target/COS67_CountryMaintenance/ExpDelivery.png";
	public String CloseApp="./target/COS67_CountryMaintenance/CloseApp.png";
	public String CustomerTab="./target/COS67_CountryMaintenance/customertab.png";
	public String Search="./target/COS67_CountryMaintenance/CustSeach.PNG";
	public String CustArrow="./target/COS67_CountryMaintenance/CustomerSelectArrow.png";
	public String ExpDelIcon="./target/COS67_CountryMaintenance/ExpDelIcon.png";
	public String LineItems="./target/COS67_CountryMaintenance/LineItems.png";
	public String downarrowCM="./target/COS67_CountryMaintenance/downarrowCM.png";
	public static Screen s;
	public static Robot r;
	String custID="0VAL120743";
	LoginPage login = new LoginPage();
	Robot rb;
    
	@Test(priority=1)
	public void Client() throws Throwable
	{
		try
		{
			login.LoginCosacClient();
			Thread.sleep(15000);
			//Library.Interaction.userWait();
			//Library.Interaction.ClientClick(SystemConfiguration);
			
			//log.info("User Clicked on System Configuration");
			Robot r = new Robot();
			Screen s=new Screen();
			//Library.Interaction.ClientClick(SystemConfiguration);
			/*s.find(SystemConfiguration);
			s.mouseMove();
			Thread.sleep(800);
			s.click();
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_ENTER);
			//log.info("User Clicked On Country Maintainence");
			Thread.sleep(2000);
			s.find(downarrowCM);
			s.mouseMove();
			Thread.sleep(1000);
			s.click();  s.click(); s.click(); s.click(); s.click(); s.click(); s.click(); s.click();s.click();s.click();
			Thread.sleep(2000);
			s.find(TAX);
			s.mouseMove();
			Thread.sleep(800);
			s.click();
			Thread.sleep(1500);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			//Library.Interaction.ClientClick(TaxRate);
			//log.info("User clicked on Tax/Service Charges/Fees");
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			//Library.Interaction.ClientClick(TaxDown);
			//log.info("Tax Rate Changed Successfully");
			Thread.sleep(2000);
			s.find(Save);
			s.mouseMove();
			Thread.sleep(800);
			s.click();
			Thread.sleep(1500);
			//Library.Interaction.ClientClick(Save);
			//log.info("New Tax Rate is Saved Successfully");
			//log.info("After EOD JOB New Tax Rate will Update!!!");
			Thread.sleep(3000);
			s.find(Exit);
			s.mouseMove();
			Thread.sleep(800);
			s.click();
			Thread.sleep(2500);*/
			//Thread.sleep(5000);
			//Library.Interaction.ClientClick(Exit);
			//log.info("Exit Successfully");

		}
		catch (Exception e) {
			e.printStackTrace();
			windriver.close();
		}
	}
	@Test(dependsOnMethods = "Client")
	public void LineItems()throws Throwable
	{
		try
		{
			//Library.Interaction.userWait();
			Screen s=new Screen();
			Thread.sleep(2000);
			s.find(SystemConfiguration);
			s.mouseMove();
			Thread.sleep(800);
			s.click();
			Thread.sleep(2500);
			//Library.Interaction.ClientClick(SystemConfiguration);
			//log.info("User Clicked on System Configuration");
			Robot r = new Robot();
			//Screen s=new Screen();
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_ENTER);
			//log.info("User Clicked On Country Maintainence");
			Thread.sleep(8000);
			s.find(downarrowCM);
			s.mouseMove();
			Thread.sleep(800);
			s.click();s.click();
			Thread.sleep(2000);
			s.find(LineItems);
			s.mouseMove();
			Thread.sleep(800);
			s.click();
			Thread.sleep(1500);
			//log.info("User Clicked On Line Items");
			Thread.sleep(2000);
			s.find(Delivery);
			s.mouseMove();
			Thread.sleep(800);
			s.click();
			Thread.sleep(2500);
			//Library.Interaction.ClientClick(Delivery);
			System.out.println("Clicked on delivery");
			//log.info("User Clicked on Display Express Delivery");
			Thread.sleep(500);
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			Thread.sleep(2000);
			s.find(ExpDelivery);
			s.mouseMove();
			Thread.sleep(800);
			s.click();
			Thread.sleep(2500);
			//Library.Interaction.ClientClick(ExpDelivery);
			//log.info("User Changed the Value");
			Thread.sleep(500);
			//Thread.sleep(2000);
			s.find(Save);
			s.mouseMove();
			Thread.sleep(800);
			s.click();
			Thread.sleep(2500);
			//Library.Interaction.ClientClick(Save);
			//log.info("Saved Successfully");	
			//Thread.sleep(5000);
			//Thread.sleep(2000);
			s.find(Exit);
			s.mouseMove();
			Thread.sleep(800);
			s.click();
			Thread.sleep(2500);
			//Library.Interaction.ClientClick(Exit);
			//log.info("Exit Successfully");
			

			
			
		}
		catch (Exception e) {
			e.printStackTrace();
			Library.Interaction.closeCosacClient(r);
		}
	}
	@Test(dependsOnMethods = "LineItems")
	public void ExpDelivery() throws Throwable
	{
		try
		{
			Screen sc=new Screen();
			sc.find(CustomerTab);
			sc.mouseMove();
			Thread.sleep(800);
			sc.click();
			//log.info("User Clicked on Customer");
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			rb.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_ENTER);
			//rb.keyRelease(KeyEvent.VK_ENTER);
			//log.info("User Clicked on Customer Search");
			Thread.sleep(2000);
			//log.info("User is in Customer Search Screen");
			rb.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(500);
			rb.keyRelease(KeyEvent.VK_TAB);
			//log.info("User Clicked on CustomerID");
			Library.Interaction.writeKeyboard(rb, custID);
			//log.info("User entered CustomerID");
			Thread.sleep(3000);
			sc.find(Search);
			sc.mouseMove();
			Thread.sleep(800);
			sc.click();
			//log.info("User Clicked on Search Icon");
			Thread.sleep(5000);
			//log.info("Customer Details Displayed Successfully");
			sc.find(CustArrow);
			sc.mouseMove();
			Thread.sleep(1000);
			sc.rightClick();
			rb.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			rb.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(300);
			rb.keyPress(KeyEvent.VK_ENTER);
			//rb.keyRelease(KeyEvent.VK_ENTER);
			//log.info("User Selected Customer Details Option");
			Thread.sleep(25000);
			//log.info("User succesfully logged in to Customer Record Screen");
			//Thread.sleep(2000);
			sc.find(CustArrow);
			sc.mouseMove();
			Thread.sleep(1000);
			sc.rightClick();
			Thread.sleep(3000);
			rb.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);  
			//rb.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			rb.keyPress(KeyEvent.VK_ENTER);
			//rb.keyRelease(KeyEvent.VK_ENTER);
			//log.info("User selected Enter Line Items option");
			Thread.sleep(15000);
			//log.info("User succesfully logged in to Input/Revise Sales Order screen");
			//Thread.sleep(5000);
			try {
			if(sc.exists(ExpDelIcon) != null)
			{
				System.out.println("Express Delivery Enabled");
				Library.Interaction.closeCosacClient(rb);
				//log.info("Express Delivery");
			}
			else
			{
				System.out.println("Express Delivery Option is Disabled");
				Library.Interaction.closeCosacClient(rb);
				//log.info("Express Delivery Option is Disabled");
			}}
			catch (Exception e) {
				System.out.println("Express Delivery Option is Disabled");
				Library.Interaction.closeCosacClient(rb);
				// TODO: handle exception
			}
			Thread.sleep(5000);
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
			Library.Interaction.closeCosacClient(rb);
			windriver.close();
		}
	}
}