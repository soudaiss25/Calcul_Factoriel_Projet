import com.groupeisi.CalculFactoriel;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculFactorielTest {
    CalculFactoriel calcul = new CalculFactoriel();
    @Test
    public void testFactorielDeZero() {
        // given
        int nombre = 0;

        // when
        int result = calcul.CalculFactorielMethod(nombre);

        // then
        assertEquals(1, result, "Le factoriel de 0 doit être 1");
    }
    @Test
    public void testFactoriel() {
        // given
        int nombre = 5;

        // when
        int result = calcul.CalculFactorielMethod(nombre);

        // then
        assertEquals(120, result, "Le factoriel de 5 doit être 120");
    }




}
