import Math.Atan;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AtanTest {
    @Test
    void doAtanTest() {
        Atan m=new Atan();

        double val=-1;
        double eps=0.01;
            Assertions.assertEquals(Math.atan(val),m.doAtan(val,eps),eps);

        }

    }
