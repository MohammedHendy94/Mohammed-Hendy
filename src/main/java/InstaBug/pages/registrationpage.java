package InstaBug.pages;

import InstaBug.Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class registrationpage extends Base {


    // Finding page elements

    //WebElement Signupbtn = driver.findElement(By.xpath("//a[@class = '_42ft _4jy0 _16jx _4jy6 _4jy2 selected _51sy']"));
    WebElement FirstName = driver.findElement(By.xpath("//*[@name='firstname']"));
    WebElement SurName = driver.findElement(By.xpath("//*[@name='lastname']"));
    WebElement UserName = driver.findElement(By.xpath("//*[@name='reg_email__']"));
    WebElement Password = driver.findElement(By.id("password_step_input"));
    WebElement BirthDay = driver.findElement(By.id("day"));
    WebElement BirthMonth = driver.findElement(By.id("month"));
    WebElement BirthYear = driver.findElement(By.id("year"));
    WebElement CheckFemale = driver.findElement(By.xpath("//*[contains(@name, 'sex')]"));
    WebElement CheckMale = driver.findElement(By.xpath("//*[contains(@name, 'sex')]"));
    WebElement CheckCustom = driver.findElement(By.xpath("//*[contains(@name, 'sex')]"));
    WebElement Pronoun = driver.findElement(By.xpath("//*[contains(@name, 'preferred_pronoun')]"));
    WebElement CustomGender = driver.findElement(By.xpath("//input[@name= 'custom_gender']"));
    WebElement Submitbtn = driver.findElement(By.xpath("//*[contains(@name, 'websubmit')]"));


    // Initializing the page functions for tests handling

    public static void gotosignup()
    {
        WebElement Signupbtn = driver.findElement(By.xpath("//a[@class = '_42ft _4jy0 _16jx _4jy6 _4jy2 selected _51sy']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Signupbtn.click();

    }

    public void GoTOSignupPage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       //Signupbtn.click();
        //driver.get("https://www.facebook.com/r.php?next=https%3A%2F%2Fdevelopers.facebook.com%2Fdocs%2Fdevelopment%2Fbuild-and-test%2Ftest-users&locale=en_GB&display=page");
    }
    public void FillingName(String firstname , String lastname){
        FirstName.sendKeys(firstname);
        SurName.sendKeys(lastname);
    }
    public void SettingUsername_Password (String username , String password){
        UserName.sendKeys(username);
        Password.sendKeys(password);
    }
    public void SelectingBirthday(String day , String month , String year){
        Select selectDay = new Select(BirthDay);
        selectDay.selectByValue(day);
        Select selectMonth = new Select(BirthMonth);
        selectMonth.selectByValue(month);
        Select selectYear = new Select(BirthYear);
        selectYear.selectByValue(year);

    }
    public void SelectingGender (String gender ) {
        switch (gender) {
            case "male":
                CheckMale.click();
                break;
            case "female":
                CheckFemale.click();
                break;
        }
    }
    public void CheckingCustomGender (String customgender , int pronounindex){
        Select selectpronoun = new Select(Pronoun);
        selectpronoun.selectByIndex(pronounindex);
        CheckCustom.click();
        CustomGender.sendKeys(customgender);

    }
    public void ClickSignUp(){
        //Submitbtn.submit();

    }

}
