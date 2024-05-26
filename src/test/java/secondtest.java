import org.testng.Assert;
import org.testng.annotations.Test;

public class secondtest extends TestBase {
    flightDetailsPage flightDetailsPageObject;
    HomePage HomeObject;

    @Test
    public  void TC_BookTrip() throws InterruptedException {
        flightDetailsPageObject =new flightDetailsPage(driver);
        HomeObject=new HomePage(driver);
        HomeObject.SetFirstAndSecondCountry("del","phuket");
        HomeObject.ClickOnSearchFlightBtn();
        Assert.assertTrue(flightDetailsPageObject.TextAsseration().contains("Depart Date : Tue, 08 Oct 2024"));







    }









}
