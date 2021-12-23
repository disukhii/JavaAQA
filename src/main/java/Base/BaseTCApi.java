package Base;

import org.testng.annotations.DataProvider;

public class BaseTCApi{
    @DataProvider()
    public static Object[][] opencartStatusPath(){
        return new Object[][]{{"/",200},{"/jsagfhkal",404}};
    }

    @DataProvider()
    public static Object[][] amazonCemStatusPath(){
        return new Object[][]{{"/cem",200},{"/CEMM",404}};
    }

    @DataProvider()
    public static Object[][] amazonSuggestionsStatusPath(){
        return new Object[][]{{"/api/2017/suggestions",204},{"/api/2017/suggestionsss",404}};
    }


}