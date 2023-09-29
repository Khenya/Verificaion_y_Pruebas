package qa;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;

// class AppTest {
//     @Test void appHasAGreeting() {
//         App classUnderTest = new App();
//         assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
//     }
// }

public class AppTest {
    
    @BeforeEach
    public void before(){
        System.out.println("before");
        // requirement -> setup / initialize
    }
    
    @Test
    public void verifySomeThing(){
        System.out.println("test1");
        // step
        // step
        // verification
    }
    @Test
    public void verifySomeThing2(){
        System.out.println("test2");
        // step
        // step
        // verification
    }
    
    @AfterEach
    public void after(){
        System.out.println("after");
        // cleanup / teardown 
    }
    


}