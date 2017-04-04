package train.usaco;
/*
ID: vipinsh2
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class ride {
    public static void main (String [] args) throws IOException {
        // Use BufferedReader rather than RandomAccessFile; it's much faster
        BufferedReader f = new BufferedReader(new FileReader("ride.in"));
        // input file name goes above
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
        // Use StringTokenizer vs. readLine/split -- lots faster
        StringTokenizer st = new StringTokenizer(f.readLine());
        // Get line, break into tokens
        String comet = st.nextToken();

        BigInteger cometInt = new BigInteger("1",10);
        BigInteger groupInt = new BigInteger("1",10);
        for (int i = 0; i < comet.length(); i++) {
            cometInt = cometInt.multiply(BigInteger.valueOf(comet.charAt(i)-64));
        }
        StringTokenizer st2 = new StringTokenizer(f.readLine());

        BigInteger cometRem = cometInt.remainder(BigInteger.valueOf(47));

        String group = st2.nextToken();
        for (int i = 0; i < group.length(); i++) {
            groupInt = groupInt.multiply(BigInteger.valueOf(group.charAt(i)-64));
        }
        BigInteger groupRem = groupInt.remainder(BigInteger.valueOf(47));

        if (cometRem.equals(groupRem)){
            out.println("GO");
        }else{
            out.println("STAY");
        }

        out.close();
        System.exit(0);
    }
}