package stepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.ExcelUtil;

import java.io.IOException;
import java.time.Duration;

public class Login {

    WebDriver driver;

    @Given("user is on the login page")
    public void user_is_on_the_login_page() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().minimize();
        String file = System.getProperty("user.dir") + "src/main/resources/data/data.xlsx";
        int row = ExcelUtil.getRowCount(file, "Sheet1");

        for (int i = 1; i <= row; i++) {
            // read from excel
            String username = ExcelUtil.getCellData(file, "Sheet1", i, 0);
            String password = ExcelUtil.getCellData(file, "Sheet1", i, 1);

            //pass this data to the application
            driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
            driver.findElement(By.xpath("//input[@id='login-button']")).click();// click login

        }

    }
    @When("user enters correct user name and correct password")
    public void user_enters_correct_user_name_and_correct_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("clicks on the login button")
    public void clicks_on_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user should be navigated to the inventory page")
    public void user_should_be_navigated_to_the_inventory_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }}

