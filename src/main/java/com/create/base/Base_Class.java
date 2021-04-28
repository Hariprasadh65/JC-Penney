package com.create.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static WebDriver driver;

//***** BROWSER LAUNCH
	public static WebDriver getbrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//Driver//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Driver//geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (type.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//Driver//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

//****CLICK
	public static void click(WebElement element) {
		element.click();
	}

//*****SENDKEYS
	public static void enterdata(WebElement element, String value) {
		element.sendKeys(value);
	}

//******GET
	public static void getpage(String url) {
		driver.get(url);
	}

//******NAVIGATIONS
	public static void navigation(String type, String site) {
		if (type.equalsIgnoreCase("goto")) {
			driver.navigate().to(site);
		} else if (type.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		} else if (type.equalsIgnoreCase("back")) {
			driver.navigate().back();
		} else if (type.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}
	}

//***IMPLICIT WAIT
	public static void imwait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
//****SCROLL
	
		public static void scroll(WebElement element) {
			
			try {
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView();", element);
			} catch (Exception e) {

				e.printStackTrace();
			}
			
			
		}
	

//****EXPLICIT WAIT
	public static void exwait(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

//****IS ENABLED
	public static void isenable(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);

	}

//***** IS DISABLE
	public static void isdisable(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}

//******ISSELECTED
	public static void isselected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);

	}

//****CLOSE
	public static void close() {
		driver.close();
	}

//*****QUIT
	public static void quit() {
		driver.quit();
	}

//*****GET TITLE
	public static void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}

//****GETCURRENTURL
	public static void currenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

//****FRAMES
	public static void frame(String type) {
		if (type.equalsIgnoreCase("framein")) {
			driver.switchTo().frame(0);
		} else if (type.equalsIgnoreCase("frameout")) {
			driver.switchTo().defaultContent();
		}
	}

//**** MOUSE HOVER ACTIONS	
	public static void mousehover(WebElement element, String type) {
		Actions ac = new Actions(driver);
		if (type.equalsIgnoreCase("moveto")) {
			ac.moveToElement(element).build().perform();
		} else if (type.equalsIgnoreCase("contextclick")) {
			ac.contextClick().build().perform();
		}
	}

//***** KEYBOARD ACTION = ROBOT	
	public static void keyboard(WebElement element, String type) throws AWTException {
		Robot r = new Robot();
		if (type.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		} else if (type.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		} else if (type.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
	}

//***** SCREENSHOT		
	public static void screenshot(String path) throws IOException {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File(path);
			FileUtils.copyFile(source, destination);
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//****** SINGLEDROPDOWN	
	public static void singledropdown(WebElement element, String type, String value) {

		try {
			Select s = new Select(element);
			if (type.equalsIgnoreCase("byvalue")) {
				s.selectByValue(value);
			} else if (type.equalsIgnoreCase("byIndex")) {
				int parseInt = Integer.parseInt(value);
				s.selectByIndex(parseInt);
			} else if (type.equalsIgnoreCase("byvisibletext")) {
				s.selectByVisibleText(value);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

///****ALERT
	public static void alert(WebElement element, String type, String value) {

		Alert alert = driver.switchTo().alert();

		if (type.equalsIgnoreCase("accept")) {
			alert.accept();
		}

		else if (type.equalsIgnoreCase("confirm")) {
			alert.accept();
		} else if (type.equalsIgnoreCase("dismiss")) {
			alert.dismiss();
		} else if (type.equalsIgnoreCase("prompt")) {
			alert.sendKeys(value);
			String text = alert.getText();
			System.out.println(text);
		}
	}

//*****MULTIPLE DROPDOWN	
	public static void multidropdown(WebElement element, String type) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("ismultiple")) {
			boolean multiple = s.isMultiple();
			System.out.println(multiple);
		} else if (type.equalsIgnoreCase("getoptions")) {
			List<WebElement> options = s.getOptions();
			for (WebElement alloptions : options) {
				System.out.println(alloptions.getText());

				int size = options.size();
				System.out.println(size);
				for (int i = 0; i <= size; i++) {
					if (i == 3 || i == 5 || i == 1) {
						s.selectByIndex(i);
					}
					System.out.println(i);
				}
			}
		} else if (type.equalsIgnoreCase("getallselected")) {
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement fulloptions : allSelectedOptions) {
				System.out.println(fulloptions.getText());
			}
		} else if (type.equalsIgnoreCase("firstselected")) {
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText());
		}
	}

}
