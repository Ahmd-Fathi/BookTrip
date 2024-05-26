import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class flightDetailsPage {
WebDriver driver;

public  flightDetailsPage(WebDriver driver){

    this.driver=driver;

}


private By TextAsseration=By.cssSelector("div.css-76zvg2.r-homxoj.r-1hfyk0a > span:nth-of-type(2)");

public  String TextAsseration()
{

   return driver.findElement(TextAsseration).getText();


}




}
