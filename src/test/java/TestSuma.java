import org.example.Suma;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSuma {
    @Test
    public void suma(){
        Suma suma = new Suma();
        System.out.println("Suma OK");
        Assertions.assertEquals(30, suma.suma(10,20));
    }

    @Test
    public void sumaFalse(){
        Suma suma = new Suma();
        System.out.println("Suma false");
        Assertions.assertFalse(20 == suma.suma(10,20));
    }
}
