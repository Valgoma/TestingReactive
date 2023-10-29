package testing;
import com.example.reactiveform.Model;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.management.StringValueExp;
import java.util.Random;

public class NewTest {

        @Test
        public void testModelAdd() {
            Assertions.assertEquals("John*", new Model("John").addStar());
            Assertions.assertEquals("345*", new Model("345").addStar());
            Assertions.assertEquals("cat*", new Model("cat").addStar());
        }
    @Test
    public void testModelDel() {
        Assertions.assertEquals("ohn", new Model("John").delLeft());
        Assertions.assertEquals("45", new Model("345").delLeft());
        Assertions.assertEquals("at", new Model("cat").delLeft());
    }
    @Test
    public void testModelInc() {
            Model m = new Model("");
            for (int i =1; i<10; i++)
            {
                Random random=new Random();
               int a = random.nextInt(-1000, 1000);
              int b = a+1;
                   m.setValue(a);
                 Assertions.assertEquals(b, Model.increment());}
    }
    @Test
    public void testModelDec() {
        Model m = new Model("");
        for (int i =1; i<10; i++)
        {
            Random random=new Random();
            int a = random.nextInt(-1000, 1000);
            int b = a-1;
            m.setValue(a);
            Assertions.assertEquals(b, Model.decrement());}
    }
    }



