package core.HW44;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.safari.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class my {
	static WebDriver driver ;
	public static void chrome (String url) {
		Logger logger = Logger.getLogger("");
		logger.setLevel(Level.OFF);
		String driverPath="";

	     if (System.getProperty("os.name").toUpperCase().contains("MAC"))      driverPath = "./resources/webdrivers/mac/chromedriver";
	else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS"))  driverPath = "./resources/webdrivers/pc/chromedriver.exe";
	else throw new IllegalArgumentException("Unknown OS");
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		System.setProperty("webdriver.chrome.silentOutput", "true");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-infobars"); 
		option.addArguments("--disable-notifications");
		if (System.getProperty("os.name").toUpperCase().contains("MAC"))
			option.addArguments("-start-fullscreen");
		else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS"))
			option.addArguments("--start-maximized");
		else throw new IllegalArgumentException("Unknown OS");
		driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get(url);
	}
	
	
	
	
	
	
	
 public static void firefox (String url) {
	 Logger.getLogger("").setLevel(Level.OFF);
		
     String driverPath=""; 
      if (System.getProperty("os.name").toUpperCase().contains("MAC"))   driverPath="./resources/webdrivers/mac/geckodriver.sh";
      else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS")) driverPath = "";
	System.setProperty("webdriver.gecko.driver", driverPath);
	
	
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	WebDriverWait wait = new WebDriverWait(driver,15);
	driver.get(url);
 }
 
 
 
	public static void safari (String url) {
		Logger logger = Logger.getLogger("");
		logger.setLevel(Level.OFF);
		
		if (!System.getProperty("os.name").contains("Mac")) {throw new IllegalArgumentException("Safari is available only on Mac");}
		
		driver = new SafariDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,15);
		driver.get(url);
	}
	public static void HMLUnit (String url) {
		Logger.getLogger("").setLevel(Level.OFF);
		
	     
	       WebDriver driver =new HtmlUnitDriver();
		
		
		((HtmlUnitDriver) driver).setJavascriptEnabled(true);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,15);
		driver.get(url);
	}
	/*public static void Elements1() {
		String [] element = {"id_quotes","id_current_location","id_weather_icon","id_temperature","id_f_title","id_f_label_fn"};
		ArrayList<String> list = new ArrayList<String>();
		for (String x : element)
			list.add(x);
	}
	public static String Elements2() {
		String [] element = {"id_f_label_fn","id_fname","id_f_label_ln","id_lname","id_f_label_ea"};
		for (String x : element)
		return x; */
		
		
		
	
}
