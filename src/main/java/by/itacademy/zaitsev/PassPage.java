package by.itacademy.zaitsev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PassPage {
    static WebDriver driver;
    public static String buttonAuthorization = "//*[@id=\"db\"]/div[1]/div[1]/div/header/div/div[3]/div[3]/ul/li[2]/a";
    public static String textAuthorization = "//*[@id=\"auth-popup\"]/div/div/div[1]/div";
    public static String loginFormMail = "//*[@id=\"form-auth\"]/fieldset/div[1]/label/div[2]/input";
    public PassPage(WebDriver driver) {this.driver = driver;}
    public void clickButtonAuthorization() {
        driver.findElement(By.xpath(buttonAuthorization)).click();
    }
    public String textAuthorization() {
        return driver.findElement(By.xpath(textAuthorization)).getText();
    }
    public void sendKeysLoginFormMail(String newEmail) {
        driver.findElement(By.xpath(loginFormMail)).sendKeys("az.pomocnik@gmail.com");
    }
};
