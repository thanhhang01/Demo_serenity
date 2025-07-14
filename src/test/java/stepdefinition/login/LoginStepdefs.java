package stepdefinition.login;
import Pages.LoginPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.asserts.Assertion;

import java.time.Duration;

import static org.testng.AssertJUnit.assertTrue;

public class LoginStepdefs {
    WebDriver driver;
    LoginPages loginPage;
//    @Given("I opened chrome browser")
//    public void iOpenedChromeBrowser() {
//        driver = new ChromeDriver();
//    }
//
//    @When("I go to opencart login page")
//    public void iGoToOpencartLoginPage() {
//        // đến trang mà mình cần test
//        driver.get("http://14.241.72.46/Login.aspx");
//    }
//
//    @Then("I see login page")
//    public void iSeeLoginPage() {
//        // cái trang đã được loading login
//        WebElement btnLogin = driver.findElement(By.xpath("//input[@id='btnDangNhap']"));
//        Assert.assertTrue(btnLogin.isDisplayed());
//
//    }


    //Test
    @Given("Người dùng ở trang đăng nhập")
    public void openLoginPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://14.241.72.46/Login.aspx");
        loginPage = new LoginPages(driver);
    }

    @When("Người dùng nhập username là {string} và password là {string}")
    public void enterUsernamePassword(String username, String password) {
        driver.findElement(By.id("txtusername")).sendKeys(username);
        driver.findElement(By.id("txtpassword")).sendKeys(password);
    }

    @And("Người dùng nhấn nút {string}")
    public void clickLogin(String buttonText) {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Then("Hệ thống chuyển đến trang chủ")
    public void verifyHomePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("SinhVien.aspx"));

        String expectedUrl = "http://14.241.72.46/SinhVien.aspx?Chuyen_nganh=1";
        String actualUrl = driver.getCurrentUrl();

        if (!actualUrl.equals(expectedUrl)) {
            throw new AssertionError("Không chuyển đến trang chủ. URL hiện tại: " + actualUrl);
        }

//        driver.quit();
    }


    //Để trống không nhập  username và password
    @When("Người dùng không nhập username và không nhập password")
    public void nguoiDungKhongNhapUsernamePassword() {
        driver.findElement(By.id("txtusername")).clear();
        driver.findElement(By.id("txtpassword")).clear();
    }

    @Then("Hệ thống hiển thị thông báo lỗi {string}")
    public void hienThiThongBaoLoi(String message) {
        String actualMessage = driver.findElement(By.id("lblThong_bao")).getText();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        AssertJUnit.assertEquals(message, actualMessage);
    }

    @Then("Hệ thống hiển thị nút đăng xuất")
    public void hienthinutDangXuat() {
        // Mở dropdown nếu cần
        driver.findElement(By.className("btn-dropdown")).click();

// Đợi dropdown hiển thị
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logoutLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Đăng xuất']")));

// Click đăng xuất
//        logoutLink.click();
//        WebElement logoutBtn = driver.findElement(By.xpath("//a[@href='/logout.aspx']"));
//        assertTrue(logoutBtn.isDisplayed());
    }

    @When("Người dùng nhấn nút đăng xuất")
    public void clickDangxuat() {
        driver.findElement(By.xpath("//a[@href='/logout.aspx']")).click();
    }
}
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//wait.until(ExpectedConditions.alertIsPresent());
//
//Alert alert = driver.switchTo().alert();
//alert.accept();