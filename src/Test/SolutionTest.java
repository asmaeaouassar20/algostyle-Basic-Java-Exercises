package src.Test;

import org.example.exercice1.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest1 {

    private final Solution solution=new Solution();
    // Lorsque vou déclarez une variable avec "final"
    // cela signifie que vous ne pouvez pas réassigner
    // une nouvelle valeur à cette variable après
    // sa première initialisation

    @Test
    public void testCompresser(){
        assertEquals("bonjouràtous",solution.compresser("  BoNjoUr à     ToUs  "));
    }

    @Test
    @DisplayName("tester la méthode inversion1()")
    public void testInversion1(){
        assertEquals("CBA",solution.inversion1("ABC"));
    }

    @Test
    public void testInversion2(){
        assertEquals("asmae",solution.inversion2("eamsa"));
    }

}