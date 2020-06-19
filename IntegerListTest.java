import java.util.*;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class IntegerListTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class IntegerListTest
{
    /**
     * Default constructor for test class IntegerListTest
     */
    public IntegerListTest()
    {
    }
    
    @Test
    public void testAppend(){
        IntegerList a = new IntegerList();
        Integer x = new Integer(5);
        assert a.getRoot() == null;
        a.append(x);
        assert a.getRoot().getVal() == 5;
        assert a.getRoot().getNext() != null;
        x = new Integer(10);
        a.append(x);
        assert a.getRoot().getNext().getVal() == 10;
        
        Cell c = new Cell();
        IntegerList b = new IntegerList(x,c);
        b.append(x);
        assert b.getRoot().getVal() == 10;
        assert b.getRoot().getNext() != null;
        assert b.getRoot().getNext().getVal() == 10;
        assert b.getRoot().getNext().getNext() != null;
        assert b.getRoot().getNext().getNext().getVal() == null;
    }
    
    @Test
    public void testToString(){
        IntegerList a = new IntegerList();
        String z = a.toString();
        assert z.equals("");
        Integer x = new Integer(5);
        a.append(x);
        z = a.toString();
        assert z.equals("5");
        x = new Integer(10);
        a.append(x);
        z = a.toString();
        assert z.equals("510");
        
        Cell c = new Cell();
        IntegerList b = new IntegerList(x,c);
        b.append(x);
        z = b.toString();
        assert z.equals("1010");
    }
    
    @Test
    public void testEmpty(){
        IntegerList a = new IntegerList();
        assert a.isEmpty() == true;
        assertTrue(a.isEmpty());
        Integer x = new Integer(5);
        a.append(x);
        assert a.isEmpty() == false;
        assertFalse(a.isEmpty());
    }
}
