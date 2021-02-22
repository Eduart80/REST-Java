package testCase;

import WebDriver.Web;
import org.testng.annotations.Test;

public class getClass {

    String token = "c6aef9e3a879687e044a91f99a7d4719319bc1cc598d93fd54cbd29de766346b";

    @Test
    public void testGet(){
        String b = Web.getDriver().getCurrentUrl();
        System.out.println(b);
    }
}
