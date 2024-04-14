import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.DFS;



public class DFSTest {
    private LinkedList<LinkedList<Integer>> value;
    private Integer size;
    private DFS main;

    @BeforeEach
    public void startValues(){
        this.value = new LinkedList<>();
        this.size = 8;
        for(int i=0; i < this.size; i++){
            this.value.add(new LinkedList<Integer>());
        }

        value.get(0).add(1);
        value.get(0).add(4);

        value.get(1).add(0);
        value.get(1).add(2);
        value.get(1).add(3);

        value.get(2).add(1);
        value.get(2).add(4);
        value.get(2).add(5);

        value.get(3).add(1);
        value.get(3).add(5);
        value.get(3).add(7);

        value.get(4).add(0);
        value.get(4).add(2);
        value.get(4).add(6);
        value.get(4).add(7);


        value.get(5).add(2);
        value.get(5).add(3);
        value.get(5).add(7);


        value.get(6).add(4);

        value.get(7).add(3);
        value.get(7).add(4);
        value.get(7).add(5);

        this.main = new DFS(this.value);

    }
    @Test
    public void testForFirstNode(){
        Queue<Integer> result = this.main.dfs_start(0);
        Queue<Integer> expected = new LinkedList<Integer>();
        expected.add(6);
        expected.add(5);
        expected.add(3);
        expected.add(7);
        expected.add(4);
        expected.add(2);
        expected.add(1);
        expected.add(0);

        assertEquals(expected, result);
    }
    @Test
    public void testForSecondNode(){
        Queue<Integer> result = this.main.dfs_start(1);
        Queue<Integer> expected = new LinkedList<Integer>();
        expected.add(7);
        expected.add(3);
        expected.add(5);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(0);
        expected.add(1);

        assertEquals(expected, result);
    }
    @Test
    public void testForThirdNode(){
        Queue<Integer> result = this.main.dfs_start(2);
        Queue<Integer> expected = new LinkedList<Integer>();
        expected.add(6);
        expected.add(5);
        expected.add(3);
        expected.add(7);
        expected.add(4);
        expected.add(0);
        expected.add(1);
        expected.add(2);

        assertEquals(expected, result);
    }
    @Test
    public void testForFourthNode(){
        Queue<Integer> result = this.main.dfs_start(3);
        Queue<Integer> expected = new LinkedList<Integer>();
        expected.add(7);
        expected.add(5);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(0);
        expected.add(1);
        expected.add(3);

        assertEquals(expected, result);
    }
    @Test
    public void testForFifthNode(){
        Queue<Integer> result = this.main.dfs_start(4);
        Queue<Integer> expected = new LinkedList<Integer>();
        expected.add(7);
        expected.add(3);
        expected.add(5);
        expected.add(2);
        expected.add(1);
        expected.add(0);
        expected.add(6);
        expected.add(4);

        assertEquals(expected, result);
    }
    @Test
    public void testForSixthNode(){
        Queue<Integer> result = this.main.dfs_start(5);
        Queue<Integer> expected = new LinkedList<Integer>();
        expected.add(6);
        expected.add(3);
        expected.add(7);
        expected.add(4);
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(5);

        assertEquals(expected, result);
    }
    @Test
    public void testForSeventhNode(){
        Queue<Integer> result = this.main.dfs_start(6);
        Queue<Integer> expected = new LinkedList<Integer>();
        expected.add(7);
        expected.add(3);
        expected.add(5);
        expected.add(2);
        expected.add(1);
        expected.add(0);
        expected.add(4);
        expected.add(6);

        assertEquals(expected, result);
    }
    @Test
    public void testForEighthNode(){
        Queue<Integer> result = this.main.dfs_start(7);
        Queue<Integer> expected = new LinkedList<Integer>();
        expected.add(5);
        expected.add(2);
        expected.add(6);
        expected.add(4);
        expected.add(0);
        expected.add(1);
        expected.add(3);
        expected.add(7);

        assertEquals(expected, result);
    }
    @Test
    public void control(){
        Queue<Integer> result = this.main.dfs_start(0);
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
