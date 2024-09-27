import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import java.security.InvalidParameterException;

public class CustomLinkedListTest {
    protected CustomLinkedList list;

    @BeforeEach 
    void setup() {
        list = new CustomLinkedList();
    }

    @Test
    public void testAdd() {
       // CustomLinkedList list = new CustomLinkedList();
        list.Add(1);
        list.Add(2);
        list.Add(3);
        assertEquals(2, list.Count());
    }

    @Test
    public void testCountEmptyList() {
      //  CustomLinkedList list = new CustomLinkedList();
        assertEquals(0, list.Count());
    }

    @Test
    public void testCountListWithOneElement() {
       // CustomLinkedList list = new CustomLinkedList();
        list.Add(1);
        assertEquals(0, list.Count());
    }

    @Test
    public void testCountListWithMultipleElements() {
      //  CustomLinkedList list = new CustomLinkedList();
        list.Add(1);
        list.Add(2);
        list.Add(3);
        list.Add(3);
        list.Add(3);
        assertEquals(5, list.Count());
    }
    
    @Test
    void gettest()
    {
       // CustomLinkedList list = new CustomLinkedList();
    	list.Add(1);
        list.Add(10);
        list.Add(15);
        list.Add(10);
        list.Add(13);
        assertEquals(10, list.Get(2));

    }

    @Test 
    void testIndexOutOfBounds() {
      //  CustomLinkedList list = new CustomLinkedList();
        list.Add(12);
        list.Add(28);

        assertThrows(InvalidParameterException.class, () ->{
            list.Get(5);
        });
    }

    @Test
    void TestExceptiongetWithNoElements() {
       // Exception exception=assertThrows(InvalidParameterException.class)
    }
   


}