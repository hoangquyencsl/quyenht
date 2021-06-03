package TestLogin;

import org.openqa.selenium.edge.EdgeDriver;

public class TestDriver {
	private String Url="C:\\Users\\ASUS\\Desktop\\msedgedriver.exe";
	public TestDriver() {
	}
	public EdgeDriver getDriver() {
		System.setProperty("webdriver.edge.driver", Url);
		return new EdgeDriver() ;
		
	}
}
