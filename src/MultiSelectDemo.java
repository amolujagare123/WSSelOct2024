import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/amol.html");

        // 1. find the web element
        WebElement multiSel = driver.findElement(By.id("multiSel"));

        //2. create the object of the select class
        Select selText = new Select(multiSel);

        Thread.sleep(4000);

        // 3. select from drop down
        selText.selectByVisibleText("text 2");
        selText.selectByIndex(3);
        selText.selectByIndex(4);

        Thread.sleep(4000);
      /*  selText.deselectByIndex(3);
        selText.deselectByIndex(4);*/

        selText.deselectAll();


    }
}
