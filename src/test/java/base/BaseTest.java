package base;

import org.testng.annotations.*;

import com.microsoft.playwright.*;

public class BaseTest {

	protected Playwright playwright;
	protected Browser browser;
	protected Page page;

	@BeforeMethod
	public void setup() {

		playwright = Playwright.create();

		browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		page = browser.newPage();
	}

	@AfterMethod
	public void tearDown() {

		browser.close();
		playwright.close();
	}
}