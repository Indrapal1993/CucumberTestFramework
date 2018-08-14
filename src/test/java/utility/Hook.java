package utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook {

	private static WebDriver driver;
	private static String appPackage = "com.frmedia.sbfguide.qat";
	private static String appActivity = "com.frmedia.sbfguide.activities.MainContainerActivity";

	@Before("@web")
	public void setup(){
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	@Before("@appium")
	public void setUpAppium() throws MalformedURLException
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", "Android Emulator");

		capabilities.setCapability("appium-version", "1.4.16");

		capabilities.setCapability("platformVersion", "6.0");

		capabilities.setCapability("platformName", "Android");

		capabilities.setCapability("unicodeKeyboard", true);

		capabilities.setCapability("resetKeyboard", true);

		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 3000);

		capabilities.setCapability(MobileCapabilityType.TAKES_SCREENSHOT, "true");

		capabilities.setCapability("appPackage", appPackage);

		capabilities.setCapability("appActivity", appActivity);

		//capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

	}
	
	public void crash(){
		driver.close();
	}
}
