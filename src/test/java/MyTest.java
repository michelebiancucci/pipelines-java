import com.microsoft.demo.Demo;
import org.junit.Test;

public class MyTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        d.DoSomething(true);
        for (int i = 0; i < 3; i++) {  
            d.DoSomethingBeautiful();
        }       
    }

    @Test
    public void test_method_2() {        
    }
}
