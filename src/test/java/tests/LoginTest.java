package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void verifyValidLogin() {

		LoginPage loginPage = new LoginPage(page);

		loginPage.navigate();

		loginPage.login("standard_user", "secret_sauce");

		Assert.assertTrue(page.url().contains("inventory"));
	}
}