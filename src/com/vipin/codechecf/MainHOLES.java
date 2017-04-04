package com.vipin.codechecf;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by Ekta on 7/26/2015.
 */
public class MainHOLES {
    BufferedReader br;
    PrintWriter pw;
    StringTokenizer st;
    public static void main(String[] args) throws IOException {
        new MainHOLES().run();
    }

    public void run() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int numOfTests =nextInt();
        for (int i = 0; i <numOfTests; i++) {
            int numOfHoles=0;
            String input= next();
            char[] inchar = input.toCharArray();
            for (char c : inchar) {
                if (c=='A' ||c=='D' ||c=='O'||c=='P'||c=='Q'||c=='R'){
                    numOfHoles++;
                }
                if (c=='B'){
                    numOfHoles++;
                    numOfHoles++;
                }
            }
            System.out.println(numOfHoles);
        }
    }

    public int nextInt() throws IOException {
        if(st==null || !st.hasMoreTokens()){
            st= new StringTokenizer(br.readLine());
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
