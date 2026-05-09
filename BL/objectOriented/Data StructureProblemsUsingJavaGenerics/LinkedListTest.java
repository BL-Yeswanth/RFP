import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void givenLinkedList_WhenDeleted40_ShouldReturnSize3() {

        LinkedList<Integer> list = new LinkedList<>();

        list.append(56);
        list.append(30);
        list.append(40);
        list.append(70);

        // Delete node 40
        list.delete(40);

        // Check size
        int size = list.size();

        Assert.assertEquals(3, size);
    }
}