package src.Test.org.example.exercice2;

import org.example.exercice2.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution=new Solution();

    @Test
    public void testDatesEstValide(){
        assertTrue(solution.dateEstValide("5/5/5"));
        assertTrue(solution.dateEstValide("5:5:5"));
        assertTrue(solution.dateEstValide("02-7-5"));

        assertFalse(solution.dateEstValide("02-75"));
    }

    @Test
    public void testConvertDateValid(){
        assertEquals("lundi 15 janvier",solution.convertDate("1/15/1"));
        assertEquals("mardi 2 février",solution.convertDate("2/02/2"));
        assertEquals("vendredi 5 mai",solution.convertDate("05/05/05"));
        assertEquals("vendredi 5 mai",solution.convertDate("5:5:5"));
    }

}