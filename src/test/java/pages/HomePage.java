package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	public static final String URL = "http://thedemosite.co.uk/";

	@FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]")
	private WebElement addUserLink;

	@FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
	private WebElement loginLink;

	public void navUserPage() {
		addUserLink.click();
	}

	public void navloginPage() {
		loginLink.click();
	}

}