import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void givenLinkedList_WhenInserted40After30_ShouldReturnTrue() {

        LinkedList<Integer> list = new LinkedList<>();

        list.append(56);
        list.append(30);
        list.append(70);

        list.insertAfter(30, 40);

        boolean result = list.search(40) != null;

        Assert.assertTrue(result);
    }
}