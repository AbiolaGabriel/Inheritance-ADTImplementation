
/**
 * Write a description of class IntegerList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IntegerList extends IntegerListADT{
    private Cell root;
    
    public IntegerList(){
        this.root = null;
    }
    
    public IntegerList(Integer x, Cell y){
        this.root = new Cell(x,y);
    }

    /**
     * The method creates a root for the Cell list to begin and then adds a value to the root
     * if the root does not exist; otherwise it uses the same append method as the Cell class
     *
     * @param x - An integer object will be added as the value of the Cell object
     */
    public void append(Integer x){
        if(root == null){
            root = new Cell();
        }
        root.append(x);
    }

    /**
     * The method checks if a root exist and if it does not it returns an empty string;
     * otherwise it uses the same toString method as the Cell class
     *
     * @return - returns a String with all the values of Cell objects
     */
    public String toString(){
        if(root == null) {
            return "";
        }
        return root.toString();
    }

    /**
     * The method checks to see if the integerlist is empty or not
     *
     * @return - A boolean depending on whether the list is empty or not which is based on whether there's a root or not
     */
    public boolean isEmpty(){
        if(root == null){
            return true;
        }
        return false;
    }
    
    public Cell getRoot(){
        return this.root;
    }
}
