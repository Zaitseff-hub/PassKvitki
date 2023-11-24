package by.itacademy.zaitsev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KvitkiPage {
    private WebDriver driver;
    public KvitkiPage(WebDriver driver) {this.driver = driver;};

    public static String buttonCookies = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]";
    /*public static String buttonClose = "/html/body/div[6]/div";*/
    public static String buttonUser = "/html/body/div[2]/div[2]/div/app-user-account-link/app-profile-link";
    public static String buttonCloseBunner = "/html/body/div[5]/div[2]";
    public static String textAuthorization = "//*[@id=\"mat-tab-label-0-0\"]/span[2]/span[1]";
    public static String fieldEmail = "//*[@id=\"mat-tab-content-1-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/div";
    public static String textEmail = "//*[@id=\"mat-tab-content-0-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/app-field-error/app-collapsible";
    public void clickButtonCookies() {driver.findElement(By.xpath(buttonCookies)).click();};
    /*public void clickButtonClose() {driver.findElement(By.xpath(buttonClose)).click();}*/
    public void clickButtonUser() {driver.findElement(By.xpath(buttonUser)).click();};
    public void clickButtonCloseBunner() {driver.findElement(By.xpath(buttonCloseBunner)).click();}
    public String getTextAuthorization() {return driver.findElement(By.xpath(textAuthorization)).getText();};
    public void clickFieldEmail() {driver.findElement(By.xpath(fieldEmail)).click();}
    public String getTextEmail() {return driver.findElement(By.xpath(textEmail)).getText();};

};

