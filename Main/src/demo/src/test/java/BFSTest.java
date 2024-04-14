import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.BFS;

public class BFSTest {
    private Integer[][]value;
    private BFS main;

    @BeforeEach
    public void startValues(){
        this.value = new Integer[][]{{0,1,0,1,0,0,0},
                                    {1,0,0,1,0,0,1},
                                    {0,0,0,0,1,1,1},
                                    {1,1,0,0,0,1,0},
                                    {0,0,1,0,0,0,1},
                                    {0,0,1,1,0,0,0},
                                    {0,1,1,0,1,0,0}};
        this.main = new BFS (this.value);

    }
    @Test
    public void testFor0(){
        Queue<Integer> result = this.main.solution(0);
        Queue<Integer> expected = new LinkedList<Integer>();
        expected.add(0);
        expected.add(1);
        expected.add(3);
        expected.add(6);
        expected.add(5);
        expected.add(2);
        expected.add(4);

        assertEquals(expected, result);
    }
    @Test
    public void testFor1(){
        Queue<Integer> result = this.main.solution(1);
        Queue<Integer> expected = new LinkedList<Integer>();
        expected.add(1);
        expected.add(0);
        expected.add(3);
        expected.add(6);
        expected.add(5);
        expected.add(2);
        expected.add(4);

        assertEquals(expected, result);
    }
    @Test
    public void testFor2(){
        Queue<Integer> result = this.main.solution(2);
        Queue<Integer> expected = new LinkedList<Integer>();
        expected.add(2);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(3);
        expected.add(1);
        expected.add(0);

        assertEquals(expected, result);
    }
    @Test
    public void testFor3(){
        Queue<Integer> result = this.main.solution(3);
        Queue<Integer> expected = new LinkedList<Integer>();
        expected.add(3);
        expected.add(0);
        expected.add(1);
        expected.add(5);
        expected.add(6);
        expected.add(2);
        expected.add(4);

        assertEquals(expected, result);
    }
    @Test
    public void testFor4(){
        Queue<Integer> result = this.main.solution(4);
        Queue<Integer> expected = new LinkedList<Integer>();
        expected.add(4);
        expected.add(2);
        expected.add(6);
        expected.add(5);
        expected.add(1);
        expected.add(3);
        expected.add(0);

        assertEquals(expected, result);
    }
    @Test
    public void testFor5(){
        Queue<Integer> result = this.main.solution(5);
        Queue<Integer> expected = new LinkedList<Integer>();
        expected.add(5);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(6);
        expected.add(0);
        expected.add(1);

        assertEquals(expected, result);
    }
    @Test
    public void testFor6(){
        Queue<Integer> result = this.main.solution(6);
        Queue<Integer> expected = new LinkedList<Integer>();
        expected.add(6);
        expected.add(1);
        expected.add(2);
        expected.add(4);
        expected.add(0);
        expected.add(3);
        expected.add(5);

        assertEquals(expected, result);
    }

    @Test
    public void control(){
        Queue<Integer> result = this.main.solution(0);
        Queue<Integer> expected = new LinkedList<Integer>();
        expected.add(5);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(0);
        expected.add(1);
        expected.add(3);
        expected.add(7);

        assertNotEquals(expected, result);
    }
}

