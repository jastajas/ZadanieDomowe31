import java.util.Iterator;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {

        TreeSet<Integer> randomNo = SetManagement.createSet();

        System.out.println("Minimum Value: " + SetManagement.minValue(randomNo));
        System.out.println("Maximum Value: " + SetManagement.maxValue(randomNo));

        double avgVal = SetManagement.averageVal(randomNo);

        System.out.println("Average Value: " + avgVal);

        TreeSet<Integer> overAvg = SetManagement.overAverage(randomNo,avgVal);
        Iterator<Integer> itr = overAvg.iterator();
        System.out.print("Values over average: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
    }
}
