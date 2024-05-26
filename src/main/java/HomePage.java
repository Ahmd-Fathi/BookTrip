import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public  HomePage(WebDriver driver){

        this.driver=driver;
    }
private By FirstDate=By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[6]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]");
    private  By SecondDate=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[6]/div[1]/div[3]/div[2]/div[6]/div[1]/div[1]");
private  By secondcountry=By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[3]/div[1]/div[2]/input[1]");
private By firstcountry=By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]");

private  By NextMonthBtn=By.cssSelector("g[fill=\"none\"][transform=\"translate(1 1)\"] circle");
private  By TextBoxForSecondCountry=By.xpath("//div[text()='Return Date']/following-sibling::div");



    public void SetFirstAndSecondCountry(String firstCountryName1,String SecondCountry2) throws InterruptedException {

        driver.findElement(firstcountry).sendKeys(firstCountryName1);
        driver.findElement(secondcountry).sendKeys(SecondCountry2);
        Thread.sleep(2000);
        driver.findElement(NextMonthBtn).click();
        driver.findElement(NextMonthBtn).click();
        driver.findElement(FirstDate).click();
        driver.findElement(TextBoxForSecondCountry).click();
        Thread.sleep(4000);
        driver.findElement(SecondDate).click();

        //



    }

















}
