package com.vipin.codechecf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Created by Ekta on 8/1/2015.
 */
public class MainLAPIN {
    BufferedReader br;
    PrintWriter pw;
    StringTokenizer st;
    public static void main(String[] args) throws IOException {
        new MainLAPIN().run();
    }

    private void run() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int numOfTestCases = nextInt();
        for (int i = 0; i < numOfTestCases; i++) {
            String str = next();
            boolean even;
            if(str.length()%2==0){
                even=true;
            }else{
                even=false;
            }
            char[] charArray = str.toCharArray();
            HashMap<Character,Integer> firstMap = new HashMap<>();
            HashMap<Character,Integer> secondMap = new HashMap<>();
            for (int j = 0; j < charArray.length/2; j++) {
                if (firstMap.get(charArray[j])!= null){
                    firstMap.put(charArray[j],firstMap.get(charArray[j])+1);
                }else {
                    firstMap.put(charArray[j],1);
                }
            }
            for (int k = even ? charArray.length/2 : charArray.length/2+1; k < charArray.length; k++) {
                if (secondMap.get(charArray[k])!= null){
                    secondMap.put(charArray[k],secondMap.get(charArray[k])+1);
                }else {
                    secondMap.put(charArray[k],1);
                }
            }
            if (firstMap.equals(secondMap)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
    public String next() throws IOException {
        if (st==null || !st.hasMoreTokens()){
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
    public int nextInt() throws IOException {
        if (st==null || !st.hasMoreTokens()){
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }
}
