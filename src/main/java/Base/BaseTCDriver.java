package Base;
import org.testng.annotations.DataProvider;

public class BaseTCDriver {
    @DataProvider()
    public static Object[][] browserDataProvider() {
        return new Object[][]{
                {"chrome"}
                //,{"firefox"}
                //,{"chrome"}
        };
    }


}

