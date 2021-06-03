package TestTimMonHoc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import TestLogin.TestDriver;

public class InvalidTimMH extends TestDriver {
EdgeDriver driver= getDriver();
	
	@Test
	// Valid
	// id môn học không có trong kì hè
	public void TimMonHoc () {
		driver.get("http://localhost:8080/SQA2021/student/timmonhoc");
		WebElement enterid = driver.findElementByXPath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div/input");
		enterid.sendKeys("INT1");
		WebElement search = driver.findElementByXPath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/button");
		search.click();
		driver.get("http://localhost:8080/SQA2021/student/timmonhoc?error");
		WebElement err = driver.findElementByXPath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div[1]");
		String messErr = err.getText();
		String title = driver.getTitle();
		String expectedMess = "môn học bạn tìm không tồn tại - mời bạn nhập lại môn học";
		String expectedtitle ="Tìm môn học";
		
		assertEquals(expectedtitle, title);
		assertEquals(expectedMess, messErr);
		//driver.close();

	}
}
