package Base;

import org.testng.annotations.DataProvider;

public class BaseTCApi{
    @DataProvider()
    public static Object[][] opencartStatusPath(){
        return new Object[][]{{"/",200},{"/jsagfhkal",404}};
    }

}