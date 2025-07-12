package stepdefinition.login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class LoginStepdefs {
    WebDriver driver;
    @Given("I opened chrome browser")
    public void iOpenedChromeBrowser() {
        driver = new ChromeDriver();
    }

    @When("I go to opencart login page")
    public void iGoToOpencartLoginPage() {
        // đến trang mà mình cần test
        driver.get("http://14.241.72.46/Login.aspx");
    }

    @Then("I see login page")
    public void iSeeLoginPage() {
        // cái trang đã được loading login
        WebElement btnLogin = driver.findElement(By.xpath("//input[@id='btnDangNhap']"));
        Assert.assertTrue(btnLogin.isDisplayed());

    }
}
