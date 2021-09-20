package Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WaleTest {
    private static Wale s;
    private static Time c;
    private static Idea idea;
    private static String p;


    @BeforeEach
    void beforeEach() {
        s=new Wale("Wale");
        c=new Time(1);

        p="BACK";
        s.setTime(c);
    }

    @Test
   void toBeOrNot(){
        assertEquals(s.toBeOrNot(),s.getName() + " уверен, что он кит");
        c=new Time(0);
        s.setTime(c);
        assertEquals(s.toBeOrNot(),s.getName() +  "не является китом");
    }

    @Test
    void changePosition(){
        assertEquals(s.isNaturePosition(p),true);
    }
}