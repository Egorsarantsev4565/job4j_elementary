import org.junit.Assert;
import  org.junit.Test;
import ru.job4j.calculator.Fit;

public class FitTest {

    @Test
    public void manWeight() {
        double in = 185;
        double expected = 97.75;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01); }

        @Test
    public void womanWeight() {
        double in = 185;
        double expected = 86.25;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01); }
}



