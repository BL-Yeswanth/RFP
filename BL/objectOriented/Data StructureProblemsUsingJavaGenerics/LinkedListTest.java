import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void given3Numbers_WhenSearched30_ShouldReturnTrue() {

        LinkedList<Integer> list = new LinkedList<>();

        list.append(56);
        list.append(30);
        list.append(70);

        boolean result = list.search(30);

        Assert.assertTrue(result);
    }
}