package TestChonMonHoc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import TestLogin.TestDriver;

public class ChonMonHoc extends TestDriver {
	EdgeDriver driver= getDriver();
	
	@Test
	
	public void ChonMonHoc () {
		driver.get("http://localhost:8080/SQA2021/student/chonkinganhhoc");
		Select drop = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div/div[2]/div/select")));
		drop.selectByVisibleText("1");
		Select drop2 = new Select(driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div/div[4]/div/select")));
		drop2.selectByVisibleText("CNTT"); 
		WebElement btnNext = driver.findElementByXPath("/html/body/div/div/div/div[2]/form/button");
		btnNext.submit();
		WebElement dangki = driver.findElementByXPath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/table/tbody[1]/tr/td[3]/a");	
		dangki.click();
		String title2 = driver.getTitle();
		String expectedtitle2 ="Danh sách lhp";
		assertEquals(expectedtitle2, title2);
		}
		

		@Test
		
	
		public void ChonLopHocPhan () {
		//Chọn lớp học phần của môn học:
			driver.get("http://localhost:8080/SQA2021/student/chonkinganhhoc");
			Select drop = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div/div[2]/div/select")));
			drop.selectByVisibleText("1");
			Select drop2 = new Select(driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div/div[4]/div/select")));
			drop2.selectByVisibleText("CNTT"); 
			WebElement btnNext = driver.findElementByXPath("/html/body/div/div/div/div[2]/form/button");
			btnNext.submit();
			driver.get("http://localhost:8080/SQA2021/student/danhsachmonhoc");
			WebElement dangki = driver.findElementByXPath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/table/tbody[1]/tr/td[3]/a");	
			dangki.click();
			driver.get("http://localhost:8080/SQA2021/student/chonlophocphankichinh?idMonHoc=INT123");
			WebElement dangki2 = driver.findElementByXPath("/html/body/div/div/div/div[2]/div/div[2]/div/table/tbody[1]/tr/td[12]/a");
			dangki2.click();
			String title3 = driver.getTitle();
			String expectedtitle3 ="Lưu đăng kí";
			assertEquals(expectedtitle3, title3);
		
		//driver.close();
		}
		
		
		@Test
		//chon Đại Số 1
		//id lớp =6.
		public void LuuDangKy () {
			
			driver.get("http://localhost:8080/SQA2021/student/chonlophocphankichinh?idMonHoc=INT123");
			WebElement dangki = driver.findElementByXPath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/table/tbody[1]/tr/td[12]/a");
			dangki.click();
			driver.get("http://localhost:8080/SQA2021/student/luudangkikichinh?idLopHocPhan=6");
			WebElement dangki2 = driver.findElementByXPath("/html/body/div[1]/div/div/div[2]/div/div/div/a");
			dangki2.click();
			String title = driver.getTitle();
			String expectedtitle ="Dashboard";
			assertEquals(expectedtitle, title);
		}
		
		
}