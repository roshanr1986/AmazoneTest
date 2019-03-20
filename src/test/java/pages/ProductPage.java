package pages;

import cucumber.api.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.PageObject;
import util.DriverFactory;

public class ProductPage extends PageObject{

	public WebDriver driver;
	public Scenario _scenario;
	private AddToCartPage addToCartPage;

	@FindBy(how=How.ID, using="add-to-cart-button")
	private WebElement addToCart_button;
	
	@FindBy(how=How.ID, using="priceblock_ourprice")
	private WebElement productPrice;
	
	@FindBy(how=How.ID, using="productTitle")
	private WebElement productTitle;
	
	@FindBy(how=How.ID, using="quantity")
	private WebElement productQuantity;
	
	@FindBy(how=How.ID, using="huc-v2-order-row-confirm-text")
	private WebElement addToCartMessage;

	//Constructor class
	public ProductPage(WebDriver driver, Scenario _scenario) {
		this.driver=driver;
		this._scenario=_scenario;
		PageFactory.initElements(driver, this);
	}


	public boolean checkProductPageLoaded(){
		return isPageLoaded(addToCart_button);
	}
	
	public String getProductPrice() {
		return productPrice.getText();
	}
	
	public String getProductName() {
		return productTitle.getText();
	}
	
	public void addItemToTheCart(String productCount) {
		Select prodcutSelectCnt = new Select(productQuantity);
		prodcutSelectCnt.selectByVisibleText(productCount);
		clickElement(addToCart_button);	
		//addToCartPage = PageFactory.initElements(DriverFactory.getInstance().getDriver(), AddToCartPage.class);
		//return addToCartPage;
	}
	
	public String readAddToCartMessage() throws Exception {
		waitForElement(addToCartMessage);
		return addToCartMessage.getText();
	}
	
	
	
}
