package by.itacademy.zaitsev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PassPage {
    private WebDriver driver;
    public static String buttonAuthorization = "//span[text()='Личный кабинет']";
    public static String textAuthorization = "//*[contains(text(),'Авторизация')]";
    public static String loginFormMail = "//*[@id=\"form-auth\"]/fieldset/div[1]/label/div[2]/input";
    public static String loginFormPassword = "//*[@id=\"form-auth\"]/fieldset/div[2]/div[1]/div/label/div[2]/input";
    public static String enterButtonLoginForm = "//*[@id=\"form-auth\"]/fieldset/div[3]/input";
    public static String userIsNotFound = "//*[@id=\"auth-popup\"]/div/div/div[2]/div[2]/div";
    public PassPage(WebDriver driver) {this.driver = driver;}
    public void clickButtonAuthorization() {
        driver.findElement(By.xpath(buttonAuthorization)).click();
    }
    public String textAuthorization() {
        return driver.findElement(By.xpath(textAuthorization)).getText();
    }
    public void sendKeysLoginFormMail(String newEmail) {
        driver.findElement(By.xpath(loginFormMail)).sendKeys("az.pomocnik@gmail.com");}
    public void sendKeysLoginFormPassword(String newPassword) {
        driver.findElement(By.xpath(loginFormPassword)).sendKeys("ArtemZaitsev");}
    public void clickEnterButton() { driver.findElement(By.xpath(enterButtonLoginForm)).click();}
    public String userIsNotFound() {
        return driver.findElement(By.xpath(userIsNotFound)).getText();}

};
