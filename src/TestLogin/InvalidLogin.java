package TestLogin;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvalidLogin extends TestDriver {

	EdgeDriver driver=getDriver();
    
	
	 @Test
	 //sai mật khẩu
     public void InvalidLogin(){
     driver.get("http://localhost:8080/SQA2021/login");
     WebElement user= driver.findElement(By.id("exampleInputEmail"));
     WebElement password=driver.findElement(By.id("exampleInputPassword"));
     user.sendKeys("B17DCCN522");
     password.sendKeys("123");
     WebElement btnLogin=driver.findElement(By.id("btnlogin"));
     btnLogin.click();
     driver.get("http://localhost:8080/SQA2021/login?error");
     WebElement error = driver.findElementByXPath("/html/body/div[1]/div/div/div/div/div/div[2]/div/form/div[1]");
     String errormessage = error.getText();
     String title=driver.getTitle();
     String expectedTitle="Đăng nhập";
     String expectedmess = "Thông tin tài khoản mật khẩu sai và không được bỏ trống";
     driver.close();
     assertEquals(expectedTitle, title);
     assertEquals(errormessage, expectedmess);
 }
	 @Test
	 //sai tên đăng nhập
     public void InvalidLogin2(){
     driver.get("http://localhost:8080/SQA2021/login");
     WebElement user= driver.findElement(By.id("exampleInputEmail"));
     WebElement password=driver.findElement(By.id("exampleInputPassword"));
     user.sendKeys("B17CN522");
     password.sendKeys("123");
     WebElement btnLogin=driver.findElement(By.id("btnlogin"));
     btnLogin.click();
     driver.get("http://localhost:8080/SQA2021/login?error");
     WebElement error = driver.findElementByXPath("/html/body/div[1]/div/div/div/div/div/div[2]/div/form/div[1]");
     String errormessage = error.getText();
     String title=driver.getTitle();
     String expectedTitle="Đăng nhập";
     String expectedmess = "Thông tin tài khoản mật khẩu sai và không được bỏ trống";
     driver.close();
     assertEquals(expectedTitle, title);
     assertEquals(errormessage, expectedmess);
 }
	
    
	
	 @Test
	 //bỏ trống
     public void InvalidLogin3(){
     driver.get("http://localhost:8080/SQA2021/login");
     WebElement user= driver.findElement(By.id("exampleInputEmail"));
     WebElement password=driver.findElement(By.id("exampleInputPassword"));
     user.sendKeys("");
     password.sendKeys("");
     WebElement btnLogin=driver.findElement(By.id("btnlogin"));
     btnLogin.click();
     driver.get("http://localhost:8080/SQA2021/login?error");
     WebElement error = driver.findElementByXPath("/html/body/div[1]/div/div/div/div/div/div[2]/div/form/div[1]");
     String errormessage = error.getText();
     String title=driver.getTitle();
     String expectedTitle="Đăng nhập";
     String expectedmess = "Thông tin tài khoản mật khẩu sai và không được bỏ trống";
     driver.close();
     assertEquals(expectedTitle, title);
     assertEquals(errormessage, expectedmess);
 }
}
