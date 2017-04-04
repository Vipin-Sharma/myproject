package com.vipin.codechecf;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by Ekta on 7/26/2015.
 */
public class MainNUMGAME {
    BufferedReader br;
    PrintWriter pw;
    StringTokenizer st;

    public static void main(String[] args) throws IOException {
        new MainNUMGAME().run();
    }

    public void run() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int numOfTests = nextInt();
        for (int i = 0; i < numOfTests; i++) {
            int num = nextInt();
            if (num%2==0) {
                System.out.println("ALICE");
            }else
                System.out.println("BOB");
        }
    }

    public int nextInt() throws IOException {
        if (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }

    private String next() throws IOException {
        if (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
}
