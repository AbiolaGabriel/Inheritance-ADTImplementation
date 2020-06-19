import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * The test class CellTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CellTest{
    @Test
    public void testAppend(){
        Cell a = new Cell();
        assert a.getNext() == null;
        assert a.getVal() == null;
        Integer x = new Integer(5);
        a.append(x);
        Cell b = a.getNext();
        assert a.getVal() == 5;
        assert b.getNext() == null;
        x = new Integer(10);
        assert b.getVal() == null;
        b.append(x);
        Cell c = b.getNext();
        assert b.getVal() == 10;
        assert c.getNext() == null;
        assert c.getVal() == null;
        
        Cell test = new Cell();
        Cell d = new Cell(x, test);
        assert d.getVal() == 10;
        assert d.getNext() == test;
        x = new Integer(15);
        d.append(x);
        Cell e = test.getNext();
        assert test.getVal() == 15;
        assert d.getNext().getNext() == e;
        assert e.getVal() == null;
    }
    
    @Test
    public void testToString(){
        Cell a = new Cell();
        Integer x = new Integer(5);
        String z = a.toString();
        assert z.equals("");
        a.append(x);
        Cell b = a.getNext();
        x = new Integer(10);
        b.append(x);
        Cell c = b.getNext();
        z = a.toString();
        //System.out.println(z);
        assert z.equals("510");
        a.append(x);
        z = a.toString();
        //System.out.println(z);
        assert z.equals("51010");
        
        Cell test = new Cell();
        Cell d = new Cell(x, test);
        x = new Integer(15);
        d.append(x);
        Cell e = test.getNext();
        z = d.toString();
        //System.out.println(z);
        assert z.equals("1015");
        
        Cell f = new Cell();
        z = f.toString();
        assert z.equals("");
        
        Cell g = new Cell();
        Integer y = new Integer(5);
        g.append(y);
        //Cell h = g.getNext();
        y = new Integer(10);
        g.append(y);
        //Cell i = h.getNext();
        y = new Integer(15);
        g.append(y);
        z = g.toString();
        assert z.equals("51015");
    }
}
