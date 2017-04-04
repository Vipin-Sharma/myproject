package com.vipin.codechecf;

import java.util.*;
import java.util.Scanner;

public class Main {

    /*String v = "";*/

    public String[][] initilizeArray(int n) {
        String[][] arr = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.toString(i) + Integer.toString(j);
            }
        }
        return arr;
    }

    public ArrayList<ArrayList<String>> nqueen(int n) {
        ArrayList<ArrayList<String>> result;
        String[][] arr = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.toString(i) + Integer.toString(j);
            }
        }
        ArrayList<ArrayList<String>> prevRes = new ArrayList<>();
        result = solveNqueen(n, n, arr, prevRes);
        result.remove(result.size() - 1);
        return result;
    }

    private ArrayList<ArrayList<String>> solveNqueen(int n, int norig, String[][] arr, ArrayList<ArrayList<String>> resultPassed) {
        for (String[] strings : arr) {
            ArrayList<String> result;
            int row1 = 0;
            int col1 = 0;
            if (resultPassed.size() > 0) {
                result = resultPassed.get(resultPassed.size() - 1);
                if (result.size() == norig) {
                    result = new ArrayList<>();
                    resultPassed.add(result);
                } else {
                    row1 = result.size() == 0 ? 0 : result.get(result.size() - 1).charAt(0) - 48;
                    col1 = result.size() == 0 ? 0 : result.get(result.size() - 1).charAt(1) - 48;
                }
            } else {
                result = new ArrayList<>();
                resultPassed.add(result);
            }
            ArrayList<String> rows = new ArrayList<>();
            ArrayList<String> cols = new ArrayList<>();
            for (String s : result) {
                rows.add(Character.toString(s.charAt(0)));
                cols.add(Character.toString(s.charAt(1)));
            }
            for (String string : strings) {
                /*if(string.equals("14")  || string.equals("15") || string.equals("27") || string.equals("32") ||
                        string.equals("46") || string.equals("53") || string.equals("61") || string.equals("74")){
                    System.out.println();
                }
                if(string.equals(v)){
                    System.out.println();
                }*/
                int row = string.charAt(0) - 48;
                int col = string.charAt(1) - 48;
                if ((result.size() == 0 || (Math.abs(row - row1 + Math.abs(col - col1))) > 2)
                        && !rows.contains(Integer.toString(row)) && !cols.contains(Integer.toString(col)) && isSafe(rows, cols, row, col)) {
                    String[][] arrpassed = new String[n - 1][norig - 1];
                    for (int i = 0, i1 = 0; i < norig; i++) {
                        if (i <= row) continue;
                        for (int j = 0, j1 = 0; j < norig; j++) {
                            if (j == col) continue;
                            arrpassed[i1][j1] = Integer.toString(i) + Integer.toString(j);
                            j1++;
                        }
                        i1++;
                    }
                    result.add(string);
                    if (n - 1 > 0) {
                        solveNqueen(n - 1, norig, arrpassed, resultPassed);
                    }
                    if (result.size() == norig) {
                        ArrayList<String> copy = new ArrayList<>();
                        copy.addAll(result);
                        /*resultPassed.remove(resultPassed.size() - 1);
                        resultPassed.add(copy);*/
                        resultPassed.add(resultPassed.size() - 1, copy);
                    }
                    result.remove(string);
                } else {
                    continue;
                }
            }
            break;
        }
        //pass this so at the end we can get required result
        return resultPassed;
    }

    private boolean isSafe(ArrayList<String> rows, ArrayList<String> cols, int row, int col) {
        for (int i = 0; i < rows.size(); i++) {
            if (Math.abs(Integer.parseInt(rows.get(i)) - row) == Math.abs(Integer.parseInt(cols.get(i)) - col)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int n = s.nextInt();
            if (n <= 0) {
                System.out.println("Not Possible");
                continue;
            } else if (n == 1) {
                System.out.println("Q");
                continue;
            }

            ArrayList<ArrayList<String>> str = new Main().nqueen(n);
            if (str.size() == 0) {
                System.out.println("Not Possible");
            } else {
                for (ArrayList<String> strings : str) {

                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (strings.contains(Integer.toString(i) + Integer.toString(j))) {
                                System.out.print("Q" + "\t");
                            } else {
                                System.out.print("-" + "\t");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Integer) {
            return true;
        }
        return false;
    }
}