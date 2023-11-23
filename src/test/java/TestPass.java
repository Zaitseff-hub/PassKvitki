import by.itacademy.zaitsev.PassPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPass {
    @Test
    public void testWithAuthorization() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        PassPage pass = new PassPage(driver);

        pass.clickButtonAuthorization();

        WebElement textAuthorizationWebElement = driver.findElement(By.xpath(PassPage.textAuthorization));
        String actualTextAuthorizationWebElement = textAuthorizationWebElement.getText();
        Assertions.assertEquals("Авторизация", actualTextAuthorizationWebElement);

        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void testWithData () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pass.rw.by/ru/");
        PassPage pass = new PassPage(driver);

        pass.clickButtonAuthorization();

        WebElement textAuthorizationWebElement = driver.findElement(By.xpath(PassPage.textAuthorization));
        String actualTextAuthorizationWebElement = textAuthorizationWebElement.getText();
        Assertions.assertEquals("Авторизация", actualTextAuthorizationWebElement);

        pass.sendKeysLoginFormMail("az.pomocnik@gmail.com");
    }
}
