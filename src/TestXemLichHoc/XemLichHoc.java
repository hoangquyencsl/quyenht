package TestXemLichHoc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import TestLogin.TestDriver;

public class XemLichHoc extends TestDriver {
	EdgeDriver driver = getDriver();
	
	@Test
	public void Valid() {
		
		driver.get("http://localhost:8080/SQA2021/login");
	    WebElement user= driver.findElement(By.id("exampleInputEmail"));
	    WebElement password=driver.findElement(By.id("exampleInputPassword"));
	    user.sendKeys("B17DCCN522");
	    password.sendKeys("123456");
	    WebElement btnLogin=driver.findElement(By.id("btnlogin"));
	    btnLogin.click();
		driver.get("http://localhost:8080/SQA2021/student/index");
		WebElement lichhoc = driver.findElement(By.id("lichhoc"));
		lichhoc.click();
	    String title = driver.getTitle();
	    String expectedTitle = "Lịch Học";
	    //driver.close();
	    assertEquals(expectedTitle, title);
	  
	}
	
}
