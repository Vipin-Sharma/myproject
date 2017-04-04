package com.vipin.codechecf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Created by Ekta on 8/1/2015.
 */
public class MainMAXDIFF {
    BufferedReader br;
    PrintWriter pw;
    StringTokenizer st;
    public static void main(String[] args) throws IOException {
        new MainMAXDIFF().run();
    }

    private void run() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int numOfTestCases = nextInt();

        for (int i = 0; i < numOfTestCases; i++) {
            int n = nextInt();
            int k = nextInt();
            int[] weightArray = new int[n];
            int s = 0;
            for (int j = 0; j < n; j++) {
                weightArray[j]=nextInt();
                s=s+weightArray[j];
            }
            Arrays.sort(weightArray);

            int sumOfinitialK =0;
            for (int g = 0; g < k; g++) {
                sumOfinitialK=sumOfinitialK+weightArray[g];
            }
            int sumOfLastK=0;
            for (int h = 0; h < k; h++) {
                sumOfLastK=sumOfLastK+weightArray[weightArray.length-h-1];
            }

            /*int maxK = Math.max(sumOfinitialK,sumOfLastK);*/
            int maxDiff = Math.max(Math.abs(sumOfinitialK - (s - sumOfinitialK)), Math.abs(sumOfLastK - (s - sumOfLastK)));
            System.out.println(maxDiff);
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
