import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class TestBase {


    @BeforeSuite
    public void beforeSuite() {
            //1. Read and load properties
            //2. init logger
    }

    @AfterSuite
    public void afterSuite() {
            //1. generate report
            //2?
    }
}
