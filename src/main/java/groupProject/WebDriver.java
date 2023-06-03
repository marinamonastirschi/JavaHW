package groupProject;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends WebDriver{
    void navigate();
}
class FirefoxDriver implements RemoteWebDriver{

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {

    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {

    }
}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {

    }
}
interface TakesScreenshot extends RemoteWebDriver{
    void getScreenshot();
}
class DriverTester{
    public static void main(String[] args) {
       RemoteWebDriver[] webDriver= {new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};
       for(RemoteWebDriver driver: webDriver){
           driver.close();
           driver.open();
           driver.getTitle();
           driver.navigate();
       }
    }
}
