package class27;

import Utils.Constants;
import class22.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E2ConfigReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream(Constants.CONFIG_READER_PATH);
        Properties properties= new Properties();
        properties.load(fis);


        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22)");
                driver.manage().window().maximize();

        WebElement username = driver.findElement(By.cssSelector("#txtUsername"));
        String userName=properties.getProperty("userName");
        username.sendKeys("userName");
        String passwordField= properties.getProperty("password");
        WebElement password = driver.findElement(By.cssSelector("#txtPassword"));
        password.sendKeys("password");
        WebElement login = driver.findElement(By.cssSelector(".button"));
        login.click();



    }
}
