import org.example.Suma;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSuma {
    @Test
    public void suma(){
        Suma suma = new Suma();
        Assertions.assertEquals(30, suma.suma(10,20));
    }
}
