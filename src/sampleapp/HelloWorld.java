package sampleapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld
{
    public static void main(String[] args)
    {
//      System.out.println("Hello world");

        //website get
        System.setProperty("webdriver.chrome.driver","E:\\Hamza\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://flashdashdeals.com/");
        driver.quit();
    }
}
