package TestChonKyDangky;



import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import TestLogin.TestDriver;

public class ChonKyDangKy extends TestDriver {
	EdgeDriver driver = getDriver();

	
	//chọn kì chính
	@Test
	public void Valid() {
	
		driver.get("http://localhost:8080/SQA2021/student/index");
		WebElement dangki = driver.findElementByXPath("/html/body/div[1]/div/div/div[1]/div/ul/li[2]/div[1]");
		Actions action = new Actions(driver);
		action.moveToElement(dangki).click().perform();
	    WebElement kichinh= driver.findElementByXPath("/html/body/div[1]/div/div/div[1]/div/ul/li[2]/div[2]/a[1]");
	    action.moveToElement(kichinh).click();
	    String title = driver.getTitle();
	    String expectedTitle = "Chọn kì + ngành học";
	    driver.close();
	    assertEquals(expectedTitle, title);
	    driver.close();
	}
	@Test
	public void Valid2() {
	
		driver.get("http://localhost:8080/SQA2021/student/index");
		WebElement dangki = driver.findElementByXPath("/html/body/div[1]/div/div/div[1]/div/ul/li[2]/div[1]");
		Actions action = new Actions(driver);
		action.moveToElement(dangki).click().perform();
	    WebElement kiphu= driver.findElementByXPath("/html/body/div[1]/div/div/div[1]/div/ul/li[2]/div[2]/a[2]");
	    action.moveToElement(kiphu).click();
	    String title = driver.getTitle();
	    String expectedTitle = "Tìm môn học";
	    driver.close();
	    assertEquals(expectedTitle, title);
	    driver.close();
	}
	
}
	
	
	
	
	
	

