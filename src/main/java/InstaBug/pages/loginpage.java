package InstaBug.pages;

import InstaBug.Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginpage extends Base {

    // Finding the page elements

    WebElement email = driver.findElement(By.id("email"));
    WebElement password = driver.findElement(By.id("pass"));
    WebElement login_Btn = driver.findElement(By.id("loginbutton"));

    // Initializing the page functions for tests handling

    public void filling_username_password (String username , String Pass ) {
        email.sendKeys(username);
        password.sendKeys(Pass);
    }
    public void clicklogin() {
        login_Btn.click();
    }

}
