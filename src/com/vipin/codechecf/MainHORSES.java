package com.vipin.codechecf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by Ekta on 7/28/2015.
 */
public class MainHORSES {
    BufferedReader br;
    PrintWriter pw;
    StringTokenizer st;

    public static void main(String[] args) throws IOException{
        new MainHORSES().run();
    }

    private void run() throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));

        int numOfTests=nextInt();

        for (int j = 0; j < numOfTests; j++) {
            int numOfElements=nextInt();
            BigInteger[] initArray = new BigInteger[numOfElements];
            for (int i = 0; i < numOfElements; i++) {
                initArray[i]= BigInteger.valueOf(nextInt());
            }
            Arrays.sort(initArray);

            BigInteger min = initArray[1].subtract(initArray[0]);
            for (int i = 1; i < numOfElements-1; i++) {
                if ((initArray[i+1].subtract(initArray[i])).compareTo(min)==-1){
                    min = initArray[i+1].subtract(initArray[i]);
                }
            }
            System.out.println(min);
        }
    }
    public int nextInt() throws IOException {
        if (st==null || !(st.hasMoreTokens())){
            st=new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }
}
