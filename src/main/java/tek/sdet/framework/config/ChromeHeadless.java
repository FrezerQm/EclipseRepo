package tek.sdet.framework.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadless implements Browser{

	@Override
	public WebDriver OpenBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		//in order to use headless execution we can use ChromeOptions class
		//same steps apply to Firefox, Edge browser
        ChromeOptions options = new ChromeOptions();
        //use ChromeOptions to execute in different mode (Example: headless)
        //options.addArguments("--incognito"); -- execute in private mode
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get(url);
		return driver;
	}
 
}
