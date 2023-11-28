import by.itacademy.zaitsev.PassPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPass {
    WebDriver driver;
    @BeforeEach
    public void start() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
    }
    @AfterEach
    public void finish() {
        driver.quit();
    }
    @Test
    public void testWithAuthorization() throws InterruptedException {

        PassPage pass = new PassPage(driver);
        pass.clickButtonAuthorization();
        Assertions.assertEquals("Авторизация", pass.textAuthorization());
        Thread.sleep(3000);

    }
    @Test
    public void testWithData () throws InterruptedException {

        PassPage pass = new PassPage(driver);
        Thread.sleep(3000);
        pass.clickButtonAuthorization();

        Assertions.assertEquals("Авторизация", pass.textAuthorization());

        pass.sendKeysLoginFormMail("az.pomocnik@gmail.com");
        pass.sendKeysLoginFormPassword("ArtemZaitsev");
        pass.clickEnterButton();
        Assertions.assertEquals("Пользователь не найден", pass.userIsNotFound());
        Thread.sleep(3000);
    }
}
