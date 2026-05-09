import org.junit.Assert;
import org.junit.Test;

public class SortedLinkedListTest {

    @Test
    public void givenNumbers_WhenAdded_ShouldSortAscending() {

        SortedLinkedList<Integer> list =
                new SortedLinkedList<>();

        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);

        // Check head value
        Assert.assertEquals(
                Integer.valueOf(30),
                list.head.data
        );
    }
}