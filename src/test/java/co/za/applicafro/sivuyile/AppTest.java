package co.za.applicafro.sivuyile;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    App app = new App();

    @Test
    public void testFail(){

        try {
            int n = app.getNum("3");
            Assert.fail();
        }catch (NumberFormatException ne){
            System.out.print(ne.getMessage());
        }
    }
}
