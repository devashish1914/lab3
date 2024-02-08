import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests {
    @Test
    public void filterTest1(){
        List<String> l1 = Arrays.asList("Bob", "Rob","Rohan","Tapas","Jacob");
        StringChecker sc = new Check();
        //String[] arr1 = (String[])(ListExamples.filter(l1,sc).toArray());
        assertArrayEquals(new String[]{"Bob", "Rob"}, (ListExamples.filter(l1,sc).toArray()));
    }
}
