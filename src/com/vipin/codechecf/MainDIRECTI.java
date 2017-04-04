package com.vipin.codechecf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Created by Ekta on 8/1/2015.
 */
public class MainDIRECTI {
    BufferedReader br;
    PrintWriter pw;
    StringTokenizer st;
    public static void main(String[] args) throws IOException {
        new MainDIRECTI().run();
    }

    private void run() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int numOfTestCases = nextInt();

        for (int i = 0; i < numOfTestCases; i++) {
            int numOfRoutes=nextInt();
            String[] direction = new String[numOfRoutes];
            String[] road = new String[numOfRoutes];
            for (int j = 0; j < numOfRoutes; j++) {
                String route = next();
                String[] strArray = route.split(" on ");
                direction[j]=strArray[0];
                road[j]=strArray[1];
            }
            // Now calculate reverse route
            String previousDirection = null;

            String[] newDirection = new String[numOfRoutes];
            String[] newRoad = new String[numOfRoutes];
            for (int k = numOfRoutes-1,l=0; k >= 0 && l<numOfRoutes; k--,l++) {
                if(previousDirection==null){
                    newDirection[l]="Begin";
                }else{
                    if(previousDirection.contains("Right")){
                        newDirection[l]="Left";
                    }else {
                        newDirection[l]="Right";
                    }
                }
                newRoad[l]=road[k];
                previousDirection=direction[k];
            }
            for (int a = 0; a < numOfRoutes; a++) {
                System.out.println(newDirection[a]+" on "+newRoad[a]);
            }
            System.out.println("");
        }
    }
    public String next() throws IOException {
        return br.readLine();
    }
    public int nextInt() throws IOException {
        if (st==null || !st.hasMoreTokens()){
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }
}
