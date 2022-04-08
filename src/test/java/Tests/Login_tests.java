package Tests;

import InstaBug.Base.Base;
import InstaBug.pages.loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_tests extends Base {

    loginpage lgnpage ;

    @Given("user opens the login screen")
    public void user_opens_the_login_screen() {
        launch_browser();
    }

    @When("user enter email as {string} and password as {string}")
    public void user_enter_valid_email_and_password(String username, String pass) {
            lgnpage = new loginpage();
            lgnpage.filling_username_password(username, pass);
    }
    @When("click login")
    public void click_login() {

            lgnpage = new loginpage();
            lgnpage.clicklogin();
    }
    @Then("app navigate the user to next screen")
    public void app_navigate_the_user_to_next_screen() {
        var URL = driver.getCurrentUrl();
        Assert.assertTrue(URL.contains("checkpoint"));
        System.out.println(URL);
    }

    @Then("app keep user in the same page")
    public void appKeepUserInTheSamePage() {
        var URL = driver.getCurrentUrl();
        Assert.assertTrue(URL.contains("login"));
        System.out.println(URL);
    }
}
