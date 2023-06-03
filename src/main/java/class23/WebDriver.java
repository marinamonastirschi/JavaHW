package class23;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Chrome Browser open");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Chrome Browser close");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Window maximizes");
    }

    @Override
    public void findElement() {
        System.out.println("Finding the element");
    }
}
class FireFox implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Firefox browser open");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Firefox browser close");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizes the windows");
    }

    @Override
    public void findElement() {
        System.out.println("Finds the element");
    }
}
class WebDriverTester{
    public static void main(String[] args) {
        WebDriver[] webDriver= {new ChromeDriver(), new FireFox()};
        for (WebDriver w:webDriver){
            w.closeBrowser();
            w.findElement();
            w.maximizeWindow();
            w.openBrowser();
        }
    }
}
