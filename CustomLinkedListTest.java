import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomLinkedListTest {

    @Test
    public void testAdd() {
        CustomLinkedList list = new CustomLinkedList();
        list.Add(1);
        list.Add(2);
        list.Add(3);
        assertEquals(2, list.Count());
    }

    @Test
    public void testCountEmptyList() {
        CustomLinkedList list = new CustomLinkedList();
        assertEquals(0, list.Count());
    }

    @Test
    public void testCountListWithOneElement() {
        CustomLinkedList list = new CustomLinkedList();
        list.Add(1);
        assertEquals(0, list.Count());
    }

    @Test
    public void testCountListWithMultipleElements() {
        CustomLinkedList list = new CustomLinkedList();
        list.Add(1);
        list.Add(2);
        list.Add(3);
        list.Add(3);
        list.Add(3);
        assertEquals(5, list.Count());
    }
    
    @Test
    public void gettest()
    {
    	CustomLinkedList list = new CustomLinkedList();	
    	list.Add(1);
    	list.Add(5);
    	list.Add(8);
    	list.Add(69);
    	assertEquals(69, list.Get(3));
    }
    
}