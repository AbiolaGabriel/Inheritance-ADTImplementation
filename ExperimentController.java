import java.util.*;
/**
 * Write a description of class ExperimentController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExperimentController{
    private int numofItems;
    private int seed;
    public ExperimentController(int numofItems, int seed){
        this.numofItems = numofItems;
        this.seed = seed;
    }

    public static void main(String [] args) throws Exception{
        int numTrials = 0;
        int num = 5;
        int seed = 23;
        ExperimentController one = new ExperimentController(num, seed);
        // while(numTrials < 10){
            // one.timeToAppend(num,seed);
            // num += 100;
            // numTrials++;
        // }
        while(numTrials < 10){
            one.timeToString(num,seed);
            num += 100;
            numTrials++;
        }
        
    }

    public long timeToAppend(int numofItems, int seed){
        IntegerList a = new IntegerList();
        Random r = new Random(seed);
        int i = 0;
        while(i<numofItems){
            a.append(r.nextInt(201));
            i++;
        }
        long startTime = System.currentTimeMillis();
        a.toString();
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
        return (totalTime);
    }

    public long timeToString(int numofItems, int seed){
        IntegerList a = new IntegerList();
        Random r = new Random(seed);
        int i = 0;
        long startTime = System.currentTimeMillis();
        while(i<numofItems){
            a.append(r.nextInt(201));
            i++;
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
        return (totalTime);
    }

}
