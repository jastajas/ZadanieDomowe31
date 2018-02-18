import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class SetManagement {

    public static TreeSet<Integer> createSet(){

        Random rnd = new Random();
        TreeSet<Integer> numSet = new TreeSet<>();

        do{
            numSet.add(rnd.nextInt(1000));
        } while (numSet.size() < 50);

        return numSet;
    }

    public static int minValue(TreeSet<Integer> tempSet){
        return tempSet.first();
    }

    public static int maxValue(TreeSet<Integer> tempSet){
        return tempSet.last();
    }

    public static double averageVal(TreeSet<Integer> tempSet){
        int avg = 0;
        Iterator<Integer> itr = tempSet.iterator();

        while (itr.hasNext()){
            avg += itr.next();
        }
        return (avg / tempSet.size());
    }

  public static TreeSet<Integer> overAverage(TreeSet<Integer> tempSet, double avg){

        TreeSet<Integer> overAvg = new TreeSet<>();
        Iterator<Integer> itr = tempSet.iterator();
        while (itr.hasNext()) {
            int tempNo = itr.next();
            if (tempNo > avg)
                overAvg.add(tempNo);
        }
        return overAvg;
  }

}
