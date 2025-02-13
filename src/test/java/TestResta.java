import org.example.Resta;
import org.example.Suma;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestResta {
    @Test
    public void resta(){
        Resta resta = new Resta();
        System.out.println("Resta OK");
        Assertions.assertEquals(10, resta.resta(20,10));
    }

    @Test
    public void restaFalse(){
        Resta resta = new Resta();
        System.out.println("Resta false");
        Assertions.assertFalse(20 == resta.resta(20,20));
    }
}
