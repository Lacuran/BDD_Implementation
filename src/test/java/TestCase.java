import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

    @Given("The First test case")
    public void theFirstTestCase() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kornel\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://opencart.abstracta.us/");
    }

    @Given("The second test Case")
    public void theSecondTestCase() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kornel\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://opencart.abstracta.us/");

        WebElement samsung = driver.findElement(By.linkText("iPhone"));
        samsung.click();
        WebElement review = driver.findElement(By.linkText("Reviewa (0)"));
        review.click();
        WebElement name = driver.findElement(By.id("input-name"));
        name.sendKeys("Kornel Wrzesien");
        WebElement myReview = driver.findElement(By.id("input-review"));
        myReview.sendKeys("Meh słaby.\n");
        myReview.sendKeys("Nigdy więcej iPhonu. \n");

    }

    @Given("The third test case")
    public void theThirdTestCase() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kornel\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://opencart.abstracta.us/");

        WebElement samsung = driver.findElement(By.linkText("iPhone"));
        samsung.click();
        WebElement review = driver.findElement(By.linkText("Reviews (0)"));
        review.click();
        WebElement name = driver.findElement(By.id("input-name"));
        name.sendKeys("Rafał Pacholczyk");
        WebElement myReview = driver.findElement(By.id("input-review"));
        myReview.sendKeys("I bought this iPhone 5 years ago.\n");
        myReview.sendKeys("It has been working flawlessly so far. \n");
        myReview.sendKeys("What I particularly like is the app store \n");
        myReview.sendKeys("Also the price is quite right.\n");
        myReview.sendKeys("I encourage anyone who likes iPhones to by this phone\n");
        WebElement radio5 = driver.findElement(By.xpath("//input[@value='5']"));
        WebElement radio4 = driver.findElement(By.xpath("//input[@value='4']"));
        radio5.click();
        radio4.click();
        WebElement continues = driver.findElement(By.id("button-review"));
        continues.click();
        WebElement newCathegory = driver.findElement(By.linkText("Laptops & Notebooks"));
        newCathegory.click();
        WebElement otherCathegory = driver.findElement(By.linkText("Components"));
        otherCathegory.click();
    }

    @Given("The fourth test case")
    public void theFourthTestCase() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kornel\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://opencart.abstracta.us/");

        WebElement samsung = driver.findElement(By.linkText("iPhone"));
        samsung.click();
        WebElement review = driver.findElement(By.linkText("Reviews (0)"));
        review.click();
        WebElement name = driver.findElement(By.id("input-name"));
        name.sendKeys("Rafał Pacholczyk");
        WebElement myReview = driver.findElement(By.id("input-review"));
        myReview.sendKeys("I bought this iPhone 5 years ago.\n");
        myReview.sendKeys("It has been working flawlessly so far. \n");
        myReview.sendKeys("What I particularly like is the app store \n");
        myReview.sendKeys("Also the price is quite right.\n");
        myReview.sendKeys("I encourage anyone who likes iPhones to by this phone\n");
        WebElement radio5 = driver.findElement(By.xpath("//input[@value='5']"));
        WebElement radio4 = driver.findElement(By.xpath("//input[@value='4']"));
        radio5.click();
        radio4.click();
        WebElement continues = driver.findElement(By.id("button-review"));
        continues.click();
        WebElement newCathegory = driver.findElement(By.linkText("Laptops & Notebooks"));
        newCathegory.click();
        WebElement otherCathegory = driver.findElement(By.linkText("Components"));
        otherCathegory.click();
        WebElement monitors = driver.findElement(By.linkText("Monitors (2)"));
        monitors.click();
        WebElement appleMonitor = driver.findElement(By.linkText("Apple Cinema 30\""));
        appleMonitor.click();
        WebElement addToCart = driver.findElement(By.id("button-cart"));
        addToCart.click();
    }
}
