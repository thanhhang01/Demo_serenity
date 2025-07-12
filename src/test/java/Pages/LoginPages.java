package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {

    WebDriver driver;

    public LoginPages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "txtusername")
    WebElement txtUsername;

    @FindBy(id = "txtpassword")
    WebElement txtPassword;

    @FindBy(id = "btnDangNhap")
    WebElement btnLogin;

    public void enterUsername(String username) {
        txtUsername.clear();
        txtUsername.sendKeys(username);
    }

    public void enterPassword(String password) {
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }

    public void clickLogin() {
        btnLogin.click();
    }
}
