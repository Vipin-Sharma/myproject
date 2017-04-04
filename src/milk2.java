/*
ID: vipinsh2
LANG: JAVA
TASK: milk2
*/
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by Ekta on 7/26/2015.
 */
public class milk2 {
    BufferedReader br;
    PrintWriter pw;
    StringTokenizer st;
    public static void main(String[] args) throws IOException {
        new milk2().run();
    }

    private void run() throws IOException {
        br = new BufferedReader(new FileReader(this.getClass().getSimpleName() + ".in"));
        pw = new PrintWriter(this.getClass().getSimpleName() + ".out");

        //ArrayList<Integer> array = new ArrayList<Integer>(1000000);
        int[] array1 = new int[1000000];
        int endRecord=0;
        int records = nextInt();
        for (int i = 0; i < records; i++) {
            int start = nextInt();
            int end = nextInt();
            endRecord=end;
            for (int j = start; j <= end; j++) {
                int a = array1[j];
                if (a == 0) {
                    array1[j]=1;
                    //array.add(start, 1);
                } else {
                    //array.add(start, a + 1);
                    array1[j]+=1;
                }
            }
        }
        int noMilkingStart = 0;
        int noMilkingEnd = 0;
        int maxMilkingStart = 0;
        int maxMilkingEnd = 0;
        boolean milkingInProgress = false;


        for (int x = 0; x < endRecord; x++) {
            if (array1[x] > array1[maxMilkingStart]) {
                maxMilkingStart = x;
                if (milkingInProgress == false && noMilkingStart >0) {
                    noMilkingEnd = x - 1;
                }
                milkingInProgress = true;
            } else if (x!=0 && array1[x] < array1[x-1] && array1[x-1]==array1[maxMilkingStart]) {
                maxMilkingEnd = x - 1;
            }
            if (array1[x] == 0) {
                if(milkingInProgress){
                    noMilkingStart = x;
                }
                milkingInProgress = false;
            }
        }
        /*pw.print(noMilkingStart-2-noMilkingEnd);
        pw.print(" ");
        pw.println(maxMilkingEnd-maxMilkingStart);*/
        pw.print(noMilkingEnd-noMilkingStart);
        pw.print(" ");
        pw.println(maxMilkingStart-maxMilkingEnd);
        pw.close();
    }

    private int nextInt() throws IOException {
        if (st==null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }
}
