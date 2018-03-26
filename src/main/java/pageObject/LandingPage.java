package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPage {
	
	public WebDriver driver;
	
	@FindBy(how=How.LINK_TEXT, using="Cart Contents")
	public static WebElement cart_contents;
	
	@FindBy(how=How.LINK_TEXT, using="CheckOut")
	public static WebElement checkout;
	
	@FindBy(how=How.LINK_TEXT, using="My Account")
	public static WebElement my_Account;
	

	@FindBy(how=How.NAME, using="keywords ")
	public static WebElement quickSearch ;
	
	@FindBy(how=How.XPATH, using="//*[@id='columnLeft']/div[3]/div[2]/form/input[3] ")
	public static WebElement SearchIcon ;
	
	public void click_Cart_Contents(){
		cart_contents.click();
	}
		
		public void click_check_out(){
			checkout.click();
		}
			public void My_Account(){
				my_Account.click();
			}
			
			public void type_into_quickSearch(String product){
				quickSearch.sendKeys(product);
			}
			public void click_SearchIcon(){
				SearchIcon.click();
			}
			
			
				
				
				
			
		}
		
			
			
		}
		
	
	
		
		
	}

	private void click_checkout() {
		// TODO Auto-generated method stub
		
	}
	

}
