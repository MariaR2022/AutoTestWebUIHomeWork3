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
        WebElement webElement9 = driver.findElement(By.xpath("//a[contains(text(),'???????????????????????????????? ????????????????????')]"));

        webElement1.click();   //?????????????? ?????????????????? ?? ???????????????????????????? ???????? ?? ?????????????? ?? ?????????????????? "??????????????????????". ?????? ???????? ???2 ?? ??????.???????????? ?? ?????????? 2
        webElement2.click();   //?????????????? ???????????? "??????????" ?? ?????????????? ???????????? ???????? ????????????????. ?????? 1?? ?????????? ?????????? ??? 1 ???? ?????????????????????? ?? ??????.???????????? ?? ?????????? ???2
        webElement3.click();   //?????????????? ???????????????? ???? ???????? "?????? ????????????????????????" ?? ?????????????? ?????? ???????????? ?? ????????????. ?????? 2?? ?????????? ?????????? ??? 1 ???? ?????????????????????? ?? ??????.???????????? ?? ?????????? ???2
        webElement3.sendKeys("MariyaMarusya");   //???????????? ?????????? ?? ???????? "?????? ????????????????????????" ?? ?????????????? ?????? ???????????? ?? ????????????. ?????? 3?? ?????????? ?????????? ??? 1 ???? ?????????????????????? ?? ??????.???????????? ?? ?????????? ???2
        webElement4.click();   //?????????????? ???????????????? ???? ???????? "????????????" ?? ?????????????? ?????? ???????????? ?? ????????????. ?????? 4?? ?????????? ?????????? ??? 1 ???? ?????????????????????? ?? ??????.???????????? ?? ?????????? ???2
        webElement4.sendKeys("567Rjvgjn");   //???????????? ?? ???????? "????????????" ?? ?????????????? ?????? ???????????? ?? ????????????. ?????? 5?? ?????????? ?????????? ??? 1 ???? ?????????????????????? ?? ??????.???????????? ?? ?????????? ???2
        webElement5.click(); //?????????????? ???? ??????-????????, ?????????? ?????????????????? ?????????? "?????????????????? ????????". ?????? ?????????????????????? 6?? ?????????? ?????????? ???1 ???? ?????????????????????? ?? ??????.???????????? ?? ?????????? ???2
        webElement6.click();   //?????????????? ?????????????????? ?? ???????????????????????????? ???????? ?? ?????????????? ?? ?????????????????? "????????????". ?????? 1?? ?????????? ?????????? ???3 ?? ??????.???????????? ?? ?????????? 2
        webElement7.click();   //?????????????? ???? ???????????? ?????????????????????????? ????????????, ?????????????????????? ?? ?????????????????? "????????????". ?????? 2?? ?????????? ?????????? ???3 ?? ??????.???????????? ?? ?????????? 2
        webElement8.click();   //?????????????? ???? ???????????????? ?????? ???????????????????? ?????????????????????????? ????????????. ?????? ?????????????????????? 3?? ?????????? ?????????? ???3 ?? ??????.???????????? ?? ?????????? 2
        webElement9.click();   //?????????????? ???? ?????????????? "???????????????????????????????? ????????????????????" ?????????? ???????????????? ??????????. ?????? ???????? ???4 ?? ??????.???????????? ?? ?????????? 2

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

        //?????????????????? ???????????? ?? ????????????????
        driver.quit();
    }
}
