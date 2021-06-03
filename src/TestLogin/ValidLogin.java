package TestLogin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class ValidLogin extends TestDriver {
	 EdgeDriver driver = getDriver();
     @Test
      public void ValidLogin(){
      driver.get("http://localhost:8080/SQA2021/login");
      WebElement user= driver.findElement(By.id("exampleInputEmail"));
      WebElement password=driver.findElement(By.id("exampleInputPassword"));
      user.sendKeys("B17DCCN522");
      password.sendKeys("123456");
      WebElement btnLogin=driver.findElement(By.id("btnlogin"));
      btnLogin.click();
      String title=driver.getTitle();
      String expectedTitle="Trang chủ";
      //driver.close();
      assertEquals(expectedTitle, title);
  }
}
