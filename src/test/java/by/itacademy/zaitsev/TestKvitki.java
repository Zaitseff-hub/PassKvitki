package by.itacademy.zaitsev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestKvitki {
    @Test
    public void testWithAuthorization() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kvitki.by");
        KvitkiPage kvitki = new KvitkiPage(driver);
        kvitki.clickButtonCookies();
        Thread.sleep(3000);
        /*kvitki.clickButtonClose();
        Thread.sleep(3000);*/
        kvitki.clickButtonUser();
        Thread.sleep(3000);
        kvitki.clickButtonCloseBunner();
        Assertions.assertEquals("Вход", kvitki.getTextAuthorization());
        Thread.sleep(3000);
        kvitki.clickFieldEmail();
        Assertions.assertEquals("Пожалуйста, заполните поле (Эл. почта)", kvitki.getTextEmail());
        Thread.sleep(3000);
        driver.quit();
    }
}
