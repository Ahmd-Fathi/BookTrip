import org.testng.annotations.Test;

public class secondtest extends TestBase {

    HomePage HomeObject;

    @Test
    public  void TC_BookTrip() throws InterruptedException {

        HomeObject=new HomePage(driver);
        HomeObject.SetFirstAndSecondCountry("del","phuket");

        Thread.sleep(50000);






    }









}
