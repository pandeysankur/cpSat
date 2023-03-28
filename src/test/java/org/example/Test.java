package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        invokeBrowser();
        tittleAndTopStories();
        asserts();
        newWindowa();
        quit();
    }

    public static void invokeBrowser() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.ndtv.com/business");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public static void tittleAndTopStories() {
        System.out.println("Get Title : " + driver.getTitle());
        System.out.println("Get Current URL : " + driver.getCurrentUrl());
        driver.findElement(By.className("allow")).click();
        List<WebElement> allLinks = driver.findElements(By.xpath("/html/body/div[5]/div[1]/div/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/h1/a"));
        System.out.println("Size of href::" + allLinks.size());
        for (WebElement link : allLinks) {
            System.out.println(link.getText() + "[Top Stroies href]- " + link.getAttribute("href"));
        }
    }

    public static void asserts() {
        WebElement menuItem = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div[1]/ul/li[3]/a"));
        String actualName = menuItem.getAttribute("title");
        Assert.assertEquals(actualName, "Latest");
        System.out.println(actualName);
    }

    public static void newWindowa() {
        // Find The "LATEST" elements and right Clicking it.
        WebElement latestElement = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div[1]/ul/li[3]/a"));
        Actions action = new Actions(driver);
        action.contextClick(latestElement).build().perform();

        // opening the link in a new window.
        action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();

        // switching to new window
        String mainWindow = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        // print the title of the latest page
        String title = driver.getTitle();
        System.out.println("New-window and print title of LATEST::" + title);
    }

    public static void topStories() {
        List<WebElement> allLinks = driver.findElements(By.xpath("/html/body/div[2]/div/div/section"));
        for (WebElement link : allLinks) {
            System.out.println(link.getText() + "[Top Stroies href]- " + link.getAttribute("href"));
        }
    }

    public static void screenShot(){
        //Take the screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        //Copy the file to a location and use try catch block to handle exception
        try {
            FileUtils.copyFile(screenshot, new File("/home/Cucumber/homePageScreenshot.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void quit() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }


}
//