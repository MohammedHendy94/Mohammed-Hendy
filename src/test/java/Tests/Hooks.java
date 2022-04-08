package Tests;
import InstaBug.Base.Base;
import org.junit.After;
import org.junit.Before;

public class Hooks extends Base {
    // To be Executed before each test
    @Before
    public void run_before_tests(){

    }
    // To Be Executed after each test
    @After
    public void run_after_tests(){
        close_browser();

    }
}
