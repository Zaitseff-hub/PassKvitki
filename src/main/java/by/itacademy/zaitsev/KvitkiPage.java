package by.itacademy.zaitsev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KvitkiPage {
    private WebDriver driver;
    public KvitkiPage(WebDriver driver) {this.driver = driver;};

    public static String buttonCookies = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]";
    public static String buttonClose = "/html/body/div[6]/div";
    public static String buttonUser = "/html/body/div[2]/div[2]/div/app-user-account-link/app-profile-link/svg-icon";
    public static String buttonCloseBunner = "/html/body/div[5]/div[2]";
    public static String textAuthorization = "//*[@id=\"mat-tab-label-0-0\"]/span[2]/span[1]";
    public static String loginFormMail = "//input[contains(@type, 'email')]";
    public static String loginFormPassword = "//input[@type='password']";
    public static String enterButtonLoginForm = "//button[@class='ng-tns-c28-4']";
    public static String userIsNotFound = "//*[@class='info-text']";
    public void clickButtonCookies() {driver.findElement(By.xpath(buttonCookies)).click();};
    public void clickButtonClose() {driver.findElement(By.xpath(buttonClose)).click();}
    public void clickButtonUser() {driver.findElement(By.xpath(buttonUser)).click();};
    public void clickButtonCloseBunner() {driver.findElement(By.xpath(buttonCloseBunner)).click();}
    public String getTextAuthorization() {return driver.findElement(By.xpath(textAuthorization)).getText();};
    public void sendKeysLoginFormMail(String newEmail) {
        driver.findElement(By.xpath(loginFormMail)).sendKeys("az.pomocnik@gmail.com");}
    public void sendKeysLoginFormPassword(String newPassword) {
        driver.findElement(By.xpath(loginFormPassword)).sendKeys("ArtemZaitsev");}
    public void clickEnterButtonLoginForm() {
        driver.findElement(By.xpath(enterButtonLoginForm)).click();
    }
    public String userIsNotFound() {return driver.findElement(By.xpath(userIsNotFound)).getText();};
};

