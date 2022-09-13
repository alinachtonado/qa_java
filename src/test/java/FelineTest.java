import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    private Feline feline;

    @Before
    public void setUp(){
        feline = new Feline();
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> food = feline.eatMeat();
        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    public void getFamilyTest() {
        String family = feline.getFamily();
        assertEquals("Кошачьи", family);
    }

    @Test
    public void getKittensTest() {
        int kittens = feline.getKittens();
        assertEquals(1, kittens);
    }

    @Test
    public void getKittens2Test() {
        int kittens = feline.getKittens(11);
        assertEquals(11, kittens);
    }
}
