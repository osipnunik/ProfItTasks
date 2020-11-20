import org.junit.Assert;
import org.junit.Test;
import task1.UtilitarniyClass;


public class ProfItTasks {

    @Test
    public void testForTask1() {
        int startDate = 17;
        for (int i = 0; i < 7; i++) {
            String current = UtilitarniyClass.getNextMonday((startDate+i) + ".11.2020");
            Assert.assertEquals(current, "23.11.2020");
        }
    }

}
