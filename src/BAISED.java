import java.math.BigInteger;
import java.util.*;

/**
 * Created by Ekta on 11/23/2015.
 */
public class BAISED {
    public static Scanner scan;
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        int t=0;
        if(scan.hasNext()){
            t=scan.nextInt();
        }
        for (int i = 0; i < t; i++) {
            findBadness(scan.nextInt());
        }
    }

    private static void findBadness(int i) {
        HashMap<String,BigInteger> input = new HashMap<>(i);
        for (int j = 0; j < i; j++) {
            input.put(scan.next(),scan.nextBigInteger());
        }

        Map<String,BigInteger> input1 = sortByValue(input);

        BigInteger count =new BigInteger("1");
        BigInteger badness = new BigInteger("0");

        //sort input.values() before processing in loop down

        for (String s : input1.keySet()) {
            BigInteger temp = input1.get(s).subtract(count);
            if(temp.compareTo(new BigInteger("0"))== -1){
                badness = badness.add(temp.negate());
            }else {
                badness = badness.add(temp);
            }
            count = count.add( new BigInteger("1"));
        }
        if(badness.compareTo(new BigInteger("0"))== -1){
            System.out.println(badness.negate());
        }else {
            System.out.println(badness);
        }
    }

    public static Map<String,BigInteger> sortByValue(Map<String,BigInteger> unsortMap) {
        List list = new LinkedList(unsortMap.entrySet());

        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        Map<String,BigInteger> sortedMap = new LinkedHashMap<String,BigInteger>();
        for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry<String,BigInteger> entry = (Map.Entry) it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}