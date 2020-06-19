import java.util.*;
/**
 * The Cell class creates new Cell objects to append values to and to 
 * also print the value of each cell object
 *
 * @Abiola Olofin
 * 
 */
public class Cell{
    private Integer val;
    private Cell next;

    public Cell(){
        this.val = null;
        this.next = null;
    }

    public Cell(Integer val, Cell next){
        this.val = val;
        this.next = next;
    }

    /**
     * This method adds an integer value to the Cell object
     * if the current cell does not have a next Cell to point to
     *
     * @param x - An Integer object that will be added as the value of the current Cell object
     */
    public void append(Integer x){
        if(this.next == null){
            Cell newCell = new Cell();
            this.val = x;
            this.next = newCell;
        }
        else{
            this.next.append(x);
        }
    }

    /**
     * This method returns a string that holds all the value of each of the Cell objects
     * and the method is recursive
     *
     * @return - returns a String with all the values of each of the Cell objects
     */
    public String toString(){
        if(this.next != null){
            return this.val.toString() + this.next.toString();
        }
        else if(this.next == null && this.val == null){
            return "";
        }
        else {
            return "";
        }
    }

    public Integer getVal(){
        return this.val;
    }

    public Cell getNext(){
        return this.next;
    }
}
