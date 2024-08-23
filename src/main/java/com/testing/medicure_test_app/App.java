package com.testing.medicure_test_app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Selenium test for medicure app!!!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Welcome to Medicure Application!!!" );
        //initialize the chrome driver
        WebDriver driver = new ChromeDriver();

        //open the medicure web application
        driver.get("http://18.221.166.176:8082/contact.html");
        Thread.sleep(3000);
        
        // locate the yourname textbox and enter value
        WebElement yourName = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[1]/div/input"));
        yourName.sendKeys("Suren");
        System.out.println(yourName);

        // locate the phoneNumber textbox and enter value
        WebElement phoneNumber = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[2]/div/input"));
        phoneNumber.sendKeys("1234567890");
        System.out.println(phoneNumber);
        
        // locate the email textbox and enter value
        WebElement email = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[2]/input"));
        email.sendKeys("testing@abc.com");
        System.out.println(email);
        
        // locate the message textbox and enter value
        WebElement message = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[3]/input"));
        message.sendKeys("Testing");
        System.out.println(message);
        
        // locate the send button and click
        WebElement sendButton = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[4]/button"));
        sendButton.click();
        Thread.sleep(5000);
        
        // locate the response
        WebElement response = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[4]/p"));
        response.getText();
        System.out.println(response.getText());
       
        Thread.sleep(3000);
       
        driver.quit();        
        
    }
}
