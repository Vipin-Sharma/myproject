/*
ID: vipinsh2
LANG: JAVA
TASK: gift1
*/
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class gift1 {
    BufferedReader br;
    PrintWriter pw;
    StringTokenizer st;
    public static void main(String[] args) throws IOException {
        new gift1().run();
    }
    public void run() throws IOException {
        br = new BufferedReader(new FileReader(this.getClass().getSimpleName() + ".in"));
        pw = new PrintWriter(this.getClass().getSimpleName() + ".out");

        List<String> persons = new ArrayList<String>();

        int np = nextInt();
        for (int i = 0; i < np; i++) {
            persons.add(next());
        }
        HashMap<String,Integer> received = new HashMap<String,Integer>();
        HashMap<String,Integer> initial = new HashMap<String,Integer>();
        for (int i = 0; i < np; i++) {
            initial.put(persons.get(i),0);
            received.put(persons.get(i),0);
        }

        for (int i = 0; i < np; i++) {
            String giver = next();
            int amount = nextInt();
            int recipients = nextInt();
            initial.put(giver,amount);
            int remaining=0;
            if(recipients!=0) {
                remaining = amount % recipients;
                received.put(giver,received.get(giver)+remaining);
            }

            for (int j = 0; j < recipients; j++) {
                String receiver = next();
                received.put(receiver,received.get(receiver)+amount/recipients);
            }
        }

        for (String s : persons) {
            pw.println(s + " " + (received.get(s)-initial.get(s)));
        }
        pw.close();
    }

    private int nextInt() throws IOException {
        if (st==null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }
    private String next() throws IOException {
        if (st==null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
}
