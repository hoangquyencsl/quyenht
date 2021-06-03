package TestTimMonHoc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import TestLogin.TestDriver;

public class TimMocHoc extends TestDriver {
	EdgeDriver driver= getDriver();
	
	@Test
	// Valid
	// Tìm id môn học trong kì hè
	public void TimMonHoc () {
		driver.get("http://localhost:8080/SQA2021/student/timmonhoc");
		WebElement enterid = driver.findElementByXPath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div/input");
		enterid.sendKeys("INT991");
		WebElement search = driver.findElementByXPath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/button");
		search.click();
		
		String title = driver.getTitle();
		String expectedtitle ="Danh sách lhp";
		
		assertEquals(expectedtitle, title);
		//driver.close();

	}
	@Test
	// Valid
	// Chọn lớp học phần kì hè
	public void ChonLopHocPhan () {
		driver.get("http://localhost:8080/SQA2021/student/timmonhoc");
		WebElement enterid = driver.findElementByXPath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div/input");
		enterid.sendKeys("INT991");
		WebElement search = driver.findElementByXPath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/button");
		search.click();
		driver.get("http://localhost:8080/SQA2021/student/chonlophocphankihe");
		WebElement dangki = driver.findElementByXPath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/table/tbody[1]/tr/td[12]/a");
		dangki.click();
		String title = driver.getTitle();
		String expectedtitle ="Lưu đăng kí";
		
		assertEquals(expectedtitle, title);
	}
	@Test
	// Valid
	// Đăng kí lớp học phần kì hè
	public void LuuDangKi () {
		driver.get("http://localhost:8080/SQA2021/student/timmonhoc");
		WebElement enterid = driver.findElementByXPath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div/input");
		enterid.sendKeys("INT991");
		WebElement search = driver.findElementByXPath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/button");
		search.click();
		driver.get("http://localhost:8080/SQA2021/student/chonlophocphankihe");
		WebElement dangki = driver.findElementByXPath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/table/tbody[1]/tr/td[12]/a");
		dangki.click();
		driver.get("http://localhost:8080/SQA2021/student/luudangkikihe?idLopHocPhan=15");
		WebElement luudangki = driver.findElementByXPath("/html/body/div[1]/div/div/div[2]/div/div/div/a");
		luudangki.click();
		String title = driver.getTitle();
		String expectedtitle ="Dashboard";
		
		assertEquals(expectedtitle, title);
	}
}
