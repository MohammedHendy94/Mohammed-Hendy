package Tests;

import InstaBug.Base.Base;
import InstaBug.pages.registrationpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Registration_test extends Base {

    registrationpage registpage ;

    @Given("user opening the registration page")
    public void user_opening_the_registration_page() {
        launch_browser();
        registpage.gotosignup();
        registpage = new registrationpage();
    }

    @When("user fill the firstname as {string} and lastname as {string}")
    public void user_fill_the_firstname_and_lastname(String firstname , String lastname) {
        registpage = new registrationpage();
        registpage.FillingName(firstname,lastname);
    }

    @When("fill the username as {string} and password as {string}")
    public void fill_the_username_and_password(String username , String password) {
        registpage = new registrationpage();
        registpage.SettingUsername_Password(username,password);
    }

    @When("select the birth date, Day as {string} and Month as {string} and Year as {string}")
    public void select_the_birth_date(String day ,String month , String year) {
        registpage = new registrationpage();
        registpage.SelectingBirthday(day,month,year);

    }

    @When("select the gender as {string}")
    public void select_the_gender(String gender) {
        registpage = new registrationpage();
        registpage.SelectingGender(gender);
    }

    @When("click register")
    public void click_register() {
        registpage = new registrationpage();
        registpage.ClickSignUp();
    }

    @Then("App Navigate user to the next page")
    public void app_navigate_user_to_the_next_page() {
        var URL = driver.getCurrentUrl();
        Assert.assertTrue(URL.contains("confirmemail"));
        System.out.println(URL);
    }
    @When("select the custom gender and fill the pronoun as {int} and gender as {string}")
    public void select_the_custom_gender_and_fill_the_pronoun_as_she_wish_her_a_happy_birthday_gender(int pronounindex , String gender) {
        registpage = new registrationpage();
        registpage.CheckingCustomGender(gender , pronounindex);

    }


}
