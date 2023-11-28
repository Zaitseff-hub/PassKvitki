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
        kvitki.clickButtonClose();
        Thread.sleep(3000);
        kvitki.clickButtonUser();
        Thread.sleep(3000);
        kvitki.clickButtonCloseBunner();
        Assertions.assertEquals("Вход", kvitki.getTextAuthorization());
        Thread.sleep(3000);
        kvitki.sendKeysLoginFormMail("az.pomocnik@gmail.com");
        kvitki.sendKeysLoginFormPassword("ArtemZaitsev");
        kvitki.clickEnterButtonLoginForm();
        Thread.sleep(2000);
        Assertions.assertEquals("Электронная почта или пароль недействительны. Система была обновлена, и в связи с этим мы перешли на вход по электронной почте.", kvitki.userIsNotFound());
        Thread.sleep(3000);
        driver.quit();
    }
}
