package src.Test.org.example.exercice3;

import org.example.exercice3.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution=new Solution();

    @Test
    public void testIncTab() {
        int[] tableau={1,2,3};
        solution.incTab(tableau);
        assertArrayEquals(new int[]{2,3,4},tableau);
    }

    @Test
    public void testInceTabWithEmptyArray(){
        int[] tableau={};
        solution.incTab(tableau);
        assertArrayEquals(new int[]{},tableau);
    }


    @Test
    void testIncNewTab() {
        int[] tableau={1,2,3};
        int[] result=solution.incNewTab(tableau);
        assertArrayEquals(new int[]{2,3,4},result);
    }

    @Test
    void testIncNewTabOut() {
        int[] tableau1={1,2,3};
        int[] tableau2=new int[3];
        solution.incNewTabOut(tableau1,tableau2);
        assertArrayEquals(new int[]{2,3,4},tableau2);
    }
}