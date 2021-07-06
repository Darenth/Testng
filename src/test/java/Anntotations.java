import org.testng.annotations.*;

public class Anntotations {

    @BeforeSuite
    public  void BeforeSuite(){
        System.out.println("BeforeSuite Chrome Set up System property");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("BeforeTest Open Chrome");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass Open Test application");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod Sign In");
    }


    @Test
    public void searchCustomer(){
        System.out.println("Test search for customer");
    }

    @Test
    public void searchProduct(){
        System.out.println("Test search for product");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod Sign Out");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass Close Test application");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest Close Chrome");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite Clean Up all Coockies");
    }
}
