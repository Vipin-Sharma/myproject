package train.usaco;/*
 ID: vipinsh2
 LANG: JAVA
 PROG: beads
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

/*public class beads {

    public static void main(String[] args) throws Exception {
        beads main = new beads();
        main.solve();
    }

    public void solve() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("beads.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
                "beads.out")));
        int N = Integer.parseInt(br.readLine());
        String strLine = br.readLine();
        strLine += strLine;
        int max = 0;
        for (int i = 0; i < 2 * N; i++) {
            int m1 = 0;
            char a = 'w';
            boolean first = true;
            for (int k = i; k < 2 * N; k++) {
                if (a == strLine.charAt(k) || strLine.charAt(k) == 'w') {
                    m1++;
                    if (strLine.charAt(k) != 'w') {
                        first = false;
                        a = strLine.charAt(k);
                    }
                }
                else if (strLine.charAt(k) != 'w') {
                    if (first) {
                        first = false;
                        m1++;
                        a = strLine.charAt(k);
                    }
                    else
                        break;
                }
            }
            a = 'w';
            first = true;
            int m2 = 0;
            for (int k = i - 1; k >= 0; k--) {
                if (a == strLine.charAt(k) || strLine.charAt(k) == 'w') {
                    m2++;
                    if (strLine.charAt(k) != 'w') {
                        first = false;
                        a = strLine.charAt(k);
                    }
                }
                else if (strLine.charAt(k) != 'w') {
                    if (first) {
                        first = false;
                        m2++;
                        a = strLine.charAt(k);
                    }
                    else
                        break;
                }
            }
            if (m1 + m2 > max) {
                max = m1 + m2;
            }
            if (m1 + m2 >= N) {
                max = N;
                break;
            }
        }
        out.write("" + max + "\n");
        out.close();
    }*/
public class BuyingCheap{
    public static void main(String[] args){
        /*int[] input = new int[args.length];
        int i =0;
        for(String a:args){
            input[i] = Integer.parseInt(a);
            i++;
        }*/
        int[] input = {10, 40, 50, 20, 70,80, 30, 90, 60};
        /*new BuyingCheap().thirdBestPrice(input);*/
        System.out.println(new BuyingCheap().thirdBestPrice(input));
    }
    public int thirdBestPrice(int[] prices){
        //CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<Integer>();
        //LinkedHashSet<Integer> lset = new LinkedHashSet<Integer>();
        TreeSet<Integer> tset = new TreeSet<Integer>();
        for(int i:prices){
            tset.add(i);
        }
        int count=1;
        int _3rdSmall=0;
        for (int j:tset){
            if (count==3){
                _3rdSmall= j;
                break;
            }
            count+=1;
        }
        if (_3rdSmall==0){
            return -1;
        }
        return _3rdSmall;
    }
}