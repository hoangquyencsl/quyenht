package KiChinh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import TestLogin.TestDriver;

public class ChonKiNganhHoc extends TestDriver {
	EdgeDriver driver= getDriver();
	
	@Test
	//Chọn kì 1-9 tương tự nhau, coppy paste là xong nên chỉ làm 1 ví dụ.
	// Ví dụ: Kì 1, Ngành CNTT
	public void ChonKyChinh () {
		driver.get("http://localhost:8080/SQA2021/student/chonkinganhhoc");
		Select drop = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div/div[2]/div/select")));
		drop.selectByVisibleText("1");
		Select drop2 = new Select(driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div/div[4]/div/select")));
		drop2.selectByVisibleText("CNTT"); 
		WebElement btnNext = driver.findElementByXPath("/html/body/div/div/div/div[2]/form/button");
		btnNext.submit();
		String title = driver.getTitle();
		String expectedtitle ="Danh sách Môn Học";
		
		assertEquals(expectedtitle, title);
		//driver.close();

	}
	
	@Test
	//Kì hè nganh CNTT
	public void ChonKyHe () {
		driver.get("http://localhost:8080/SQA2021/student/chonkinganhhoc");
		Select drop = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div/div[2]/div/select")));
		drop.selectByVisibleText("hè");
		Select drop2 = new Select(driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/div/div[4]/div/select")));
		drop2.selectByVisibleText("CNTT"); 
		WebElement btnNext = driver.findElementByXPath("/html/body/div/div/div/div[2]/form/button");
		btnNext.submit();
		String title = driver.getTitle();
		String expectedtitle ="Tìm môn học";
		
		assertEquals(expectedtitle, title);
		//driver.close();

	}
}
