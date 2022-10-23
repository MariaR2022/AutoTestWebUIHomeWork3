import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class MainLiveJournal {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://livejournal.com");

        //WebElement webElement1 = driver.findElement(By.name("q"));
        //WebElement webElement2 = driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
        //WebElement webElement3 = driver.findElement(By.xpath(".//input[@name='q']"));

        WebElement webElement1 = driver.findElement(By.cssSelector(".categories__item--popup-open > .categories__link"));
        WebElement webElement2 = driver.findElement(By.cssSelector(".s-header-item__link--login"));
        WebElement webElement3 = driver.findElement(By.xpath("//input[@id='user']"));
        WebElement webElement4 = driver.findElement(By.id("lj_loginwidget_password"));
        WebElement webElement5 = driver.findElement(By.className("b-loginform-checkbox__input b-ljform-checkbox ng-valid ng-dirty ng-valid-parse ng-touched ng-empty"));
        WebElement webElement6 = driver.findElement(By.cssSelector(".categories__item--popup-open:nth-child(6) > .categories__link"));
        WebElement webElement7 = driver.findElement(By.cssSelector(".cat-widget__card-wrap--horizontal .post-card-- > .post-card__link"));
        WebElement webElement8 = driver.findElement(By.cssSelector(".aentry-post__socials:nth-child(2) .\\_wo path"));
        WebElement webElement9 = driver.findElement(By.xpath("//a[contains(text(),'Пользовательское соглашение')]"));

        webElement1.click();   //кликаем категорию в горизонтальном меню и заходим в категорию "Путешествия". Это тест №2 в дом.работе к уроку 2
        webElement2.click();   //кликаем кнопку "Войти" в верхнем правом углу страницы. Это 1я часть теста № 1 на авторизацию в дом.работе к уроку №2
        webElement3.click();   //кликаем курсором на поле "Имя пользователя" в виджете для логина и пароля. Это 2я часть теста № 1 на авторизацию в дом.работе к уроку №2
        webElement3.sendKeys("MariyaMarusya");   //вводим логин в поле "Имя пользователя" в виджете для логина и пароля. Это 3я часть теста № 1 на авторизацию в дом.работе к уроку №2
        webElement4.click();   //кликаем курсором на поле "Пароль" в виджете для логина и пароля. Это 4я часть теста № 1 на авторизацию в дом.работе к уроку №2
        webElement4.sendKeys("567Rjvgjn");   //вводим в поле "Пароль" в виджете для логина и пароля. Это 5я часть теста № 1 на авторизацию в дом.работе к уроку №2
        webElement5.click(); //кликаем на чек-бокс, чтобы отключить режим "Запомнить меня". Это завершающая 6я часть теста №1 на авторизацию в дом.работе к уроку №2
        webElement6.click();   //кликаем категорию в горизонтальном меню и заходим в категорию "Работа". Это 1я часть теста №3 в дом.работе к уроку 2
        webElement7.click();   //кликаем на виджет понравившейся статьи, находящейся в категории "Работа". Это 2я часть теста №3 в дом.работе к уроку 2
        webElement8.click();   //кликаем на сердечко под заголовком понравившейся статьи. Это завершающая 3я часть теста №3 в дом.работе к уроку 2
        webElement9.click();   //кликаем на надпись "Пользовательское соглашение" внизу страницы сайта. Это тест №4 в дом.работе к уроку 2

        //try {
        //    Thread.sleep(10000);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}

        driver.navigate().to("https://livejournal.com");

        try {
            webElement3.sendKeys("MariyaMarusya");
        } catch (StaleElementReferenceException e){
            System.out.println(e.getSupportUrl());
        }

        try {
            webElement4.sendKeys("567Rjvgjn");
        } catch (StaleElementReferenceException e){
            System.out.println(e.getSupportUrl());
        }

        //try {
        //    driver.findElement(By.xpath(".//textarea")).click();
        //} catch (ElementNotInteractableException e){
        //    System.out.println(e.getSupportUrl());
        //}

        //Завершаем работу с ресурсом
        driver.quit();
    }
}
