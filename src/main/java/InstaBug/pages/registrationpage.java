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

    WebElement Signupbtn = driver.findElement(By.xpath("//*[@class = '_42ft _4jy0 _16jx _4jy6 _4jy2 selected _51sy']"));
    WebElement FirstName = driver.findElement(By.xpath("//*[@name='firstname']"));
    WebElement SurName = driver.findElement(By.xpath("//*[@name='lastname']"));
    WebElement UserName = driver.findElement(By.xpath("//*[@name='reg_email__']"));
    WebElement Password = driver.findElement(By.id("password_step_input"));
    WebElement BirthDay = driver.findElement(By.id("day"));
    WebElement BirthMonth = driver.findElement(By.id("month"));
    WebElement BirthYear = driver.findElement(By.id("year"));
    WebElement CheckFemale = driver.findElement(By.id("u_0_6_0e"));
    WebElement CheckMale = driver.findElement(By.id("u_0_7_ZJ"));
    WebElement CheckCustom = driver.findElement(By.id("u_0_8_83"));
    WebElement Pronoun = driver.findElement(By.id("js_1if"));
    WebElement CustomGender = driver.findElement(By.xpath("//input[@name= 'custom_gender']"));
    WebElement Submitbtn = driver.findElement(By.id("u_0_10_Jm"));


    // Initializing the page functions for tests handling

    public void GoTOSignupPage(){
        Signupbtn.click();
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
    public void CheckingCustomGender (String customgender , String pronoun){
        Select selectpronoun = new Select(Pronoun);
        selectpronoun.selectByValue(pronoun);
        CheckCustom.click();
        CustomGender.sendKeys(customgender);

    }
    public void ClickSignUp(){
        //Submitbtn.submit();

    }

}
