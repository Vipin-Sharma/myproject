package com.vipin.interviewbit;

import java.util.*;

/**
 * Created by Ekta on 3/6/2016.
 */
//Definition for singly-linked list.
class ListNode1 {
    public int val;
    public ListNode1 next;

    ListNode1(int x) {
        val = x;
        next = null;
    }

    public String toString() {
        return String.valueOf(val);
    }
}

public class SolutionLevel5 {
    /*public static void main(String[] args) {
        ListNode1 lt = new ListNode1(1);
        lt.next = new ListNode1(5);
        lt.next.next = new ListNode1(3);
        lt.next.next.next = new ListNode1(6);
        lt.next.next.next.next = new ListNode1(2);
        lt.next.next.next.next.next = new ListNode1(4);
        *//*lt.next.next.next.next.next.next = lt.next.next;*//*


        *//*ListNode1 ans = new SolutionLevel5().reverseList(lt);*//*
        *//*ListNode1 ans = new SolutionLevel5().reverseBetween(lt, 3, 5);

        while (ans!=null){
            System.out.println(ans.toString());
            ans = ans.next;
        }*//*
        *//*List<ListNode1> ans = new SolutionLevel5().listCycles(lt);*//*
        *//*ListNode1 ans = new SolutionLevel5().detectCycle(lt);*//*
        *//*ListNode1 ans = new SolutionLevel5().sortList(lt);
        while (ans!=null){
            System.out.println(ans.toString());
            ans = ans.next;
        }*//*
        *//*System.out.println(new SolutionLevel5().listCycles(lt));*//*
        *//*System.out.println(new SolutionLevel5().reverseString("V"));*//*
        *//*System.out.println(new SolutionLevel5().evalExp("3+5"));*//*
        *//*System.out.println(new SolutionLevel5().evalExp("(-100+((5-2*5))*5) + 5*10*10"));*//*
        ArrayList<String> st = new ArrayList<>();

         *//*1 2 + 4 × + 3 −*//*
        st.add("5");
        st.add("1");
        st.add("2");
        st.add("+");
        st.add("4");
        st.add("*");
        st.add("+");
        st.add("3");
        st.add("-");
        *//*System.out.println(new SolutionLevel5().evalExp("(100+((5-2*5))*5) + 5*(10)*10"));*//*
        *//*System.out.println(new SolutionLevel5().evalRPN(st));*//*
        *//*int[] arr = {2,1,2,3,1};*//*
        *//*int[] arr = {2,1,5,6,2,3};*//*
        ArrayList<Integer> arr = new ArrayList<>();
        *//*2,1,2,3,1*//*
        *//*arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.add(1);
        arr.add(1);*//*
        *//*arr.add(2);
        arr.add(1);
        arr.add(5);
        arr.add(6);
        arr.add(2);
        arr.add(3);*//*
        *//*arr.add(90);
        arr.add(58);
        arr.add(69);
        arr.add(70);
        arr.add(82);
        arr.add(100);
        arr.add(13);
        arr.add(57);
        arr.add(47);
        arr.add(18);*//*
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(5);
        arr.add(1);
        arr.add(6);
        *//*6, 2, 5, 4, 5, 1, 6*//*
        *//*90, 58, 69, 70, 82, 100, 13, 57, 47, 18*//*
        *//*int[] arr1 = {6, 2, 5, 4, 5, 1, 6};*//*
        int[] arr1 = {47, 69, 67, 97, 86, 34, 98, 16, 65, 95, 66, 69, 18, 1, 99, 56, 35, 9, 48, 72, 49, 47, 1, 72, 87, 52, 13, 23, 95, 55, 21, 92, 36, 88, 48, 39, 84, 16, 15, 65, 7, 58, 2, 21, 54, 2, 71, 92, 96, 100, 28, 31, 24, 10, 94, 5, 81, 80, 43, 35, 67, 33, 39, 81, 69, 12, 66, 87, 86, 11, 49, 94, 38, 44, 72, 44, 18, 97, 23, 11, 30, 72, 51, 61, 56, 41, 30, 71, 12, 44, 81, 43, 43, 27};
        *//*System.out.println(new SolutionLevel5().maxArea(arr));*//*
        String a = "(a+b)";
        *//*System.out.println(new SolutionLevel5().braces(a));*//*
        *//*System.out.println(Mod(-1,1,20));*//*
        *//*System.out.println(Mod(0,0,1));*//*
        *//*System.out.println(Mod(71045970,41535484,64735492));*//*
        *//*System.out.println(new SolutionLevel5().letterCombinations("1234567890").toString());*//*
        ArrayList<Integer> abc = new ArrayList<>();
        *//*15, 20, 12, 19, 4*//*
        abc.add(1);
        abc.add(2);
        abc.add(3);
        abc.add(4);
        *//*abc.add(4);*//*
        *//*System.out.println(new SolutionLevel5().subsets(abc).toString());*//*
        *//*System.out.println(new SolutionLevel5().grayCode(4));*//*
        *//*System.out.println(new SolutionLevel5().permutation(abc));*//*
        System.out.println(new SolutionLevel5().solveNQueens(20));
    }

    public ArrayList<String> solveNQueens(int n){
        ArrayList<String> result = new ArrayList<>();
        String[][] arr = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.toString(i) + Integer.toString(j);
            }
        }
        ArrayList<String> prevRes = new ArrayList<>();
        result = solveNqueenRec(n,n,arr,prevRes);

        return result;
    }

    private ArrayList<String> solveNqueenRec(int n,int norig, String[][] arr, ArrayList<String> result) {
        int row1 = result.size()==0 ? 0 : result.get(result.size()-1).charAt(0)-48;
        int col1 = result.size()==0 ? 0 : result.get(result.size()-1).charAt(1)-48;
        ArrayList<String> rows= new ArrayList<>();
        ArrayList<String> cols= new ArrayList<>();
        for (String s : result) {
            rows.add(Character.toString(s.charAt(0)));
            cols.add(Character.toString(s.charAt(1)));
        }
        for (String[] strings : arr) {
            for (String string : strings) {
                int row = string.charAt(0)-48;
                int col = string.charAt(1)-48;
                if((result.size()==0 || (Math.abs(row-row1 + Math.abs(col-col1)))>2)
                        && !rows.contains(Integer.toString(row)) && !cols.contains(Integer.toString(col)) && isSafe(rows,cols,row,col)){
                    String[][] arrpassed = new String[n-1][norig-1];
                    for (int i = 0, i1 =0; i < norig; i++) {
                        if (i<=row) continue;
                        for (int j = 0, j1 =0 ; j < norig; j++) {
                            if (j==col) continue;
                            arrpassed[i1][j1]= Integer.toString(i)+Integer.toString(j);
                            j1++;
                        }
                        i1++;
                    }
                    result.add(string);
                    if(n-1>0){
                        solveNqueenRec(n - 1, norig, arrpassed, result);
                    }
                    if(result.size()==norig){
                        return result;
                    }else {
                        result.remove(string);
                    }
                }else {
                    continue;
                }
            }
            break;
        }
        return null;
    }

    private boolean isSafe(ArrayList<String> rows, ArrayList<String> cols, int row, int col) {
        for (int i = 0; i < rows.size(); i++) {
            if(Math.abs(Integer.parseInt(rows.get(i)) - row) == Math.abs(Integer.parseInt(cols.get(i)) -col)){
                return false;
            }
        }
        return true;
    }
*/
    public static void main(String[] args) {

        int n = 4;
        /*ArrayList<ArrayList<String>> str = new SolutionLevel5().solveNQueens(n);
        for (ArrayList<String> strings : str) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }*/
        RandomListNode e1 = new RandomListNode(1);
        RandomListNode e2 = new RandomListNode(2);
        RandomListNode e3 = new RandomListNode(3);
        RandomListNode e4 = new RandomListNode(2);
        e1.next = e2;
        e2.next = e3;
        e3.next = null;

        e1.random = e3;
        e2.random = e1;
        e3.random = e1;
        /*new SolutionLevel5().copyRandomList(e1);*/
        /*System.out.println(new SolutionLevel5().lengthOfLongestSubstring("abcabcbb"));*/
        /*System.out.println(new SolutionLevel5().lengthOfLongestSubstring("azxywbaxbfghijk"));*/
        /*System.out.println(new SolutionLevel5().lengthOfLongestSubstring("Wnb9z9dMc7E8v1RTUaZPoDNIAXRlzkqLaa97KMWLzbitaCkRpiE4J4hJWhRcGnC8H6mwasgDfZ76VKdXhvEYmYrZY4Cfmf4HoSlchYWFEb1xllGKyEEmZOLPh1V6RuM7Mxd7xK72aNrWS4MEaUmgEn7L4rW3o14Nq9l2EN4HH6uJWljI8a5irvuODHY7A7ku4PJY2anSWnfJJE1w8p12Ks3oZRxAF3atqGBlzVQ0gltOwYmeynttUmQ4QBDLDrS4zn4VRZLosOITo4JlIqPD6t4NjhHThOjJxpMp9fICkrgJeGiDAwsb8a3I7Txz5BBKV9bEfMsKNhCuY3W0ZHqY0MhBfz1CbYCzwZZdM4p65ppP9s5QJcfjadmMMi26JKz0TVVwvNA8LP5Vi1QsxId4SI19jfcUH97wmZu0pbw1zFtyJ8GAp5yjjQTzFIboC1iRzklnOJzJld9TMaxqvBNBJKIyDjWrdfLOY8FGMOcPhfJ97Dph35zfxYyUf4DIqFi94lm9J0skYqGz9JT0kiAABQZDazZcNi80dSSdveSl6h3dJjHmlK8qHIlDsqFd5FMhlEirax8WA0v3NDPT8vPhwKpxcnVeu14Gcxr3h1wAXXV0y7Xy9qqB2NQ5HQLJ7cyXAckEYHsLCPSy28xcdNJatx1KLWohOQado4WywJbGvsFR17rKmvOPABweXnFD3odrbSMD4Na4nuBBswvMmFRTUOcf7jZi4z5JnJqXz6hitaPnaEtjoSEBq82a52nvqYy7hhldBoxen2et2OMadVEHeTYLL7GLsIhTP6UizHIuzcJMljo4lFgW5AyrfUlIBPAlhwaSiJtTvcbVZynDSM6RO1PqFKWKg2MHIgNhjuzENg2oFCfW7z5KJvEL9qWqKzZNc0o3BMRjS04NCHFvhtsteQoQRgz84XZBHBJRdekCdcVVXu9c01gYRAz7oIAxN3zKZb64EFKssfQ4HW971jv3H7x5E9dAszA0HrKTONyZDGYtHWt4QLhNsIs8mo4AIN7ecFKewyvGECAnaJpDn1MTTS4yTgZnm6N6qnmfjVt6ZU51F9BxH0jVG0kovTGSjTUkmb1mRTLQE5mTlVHcEz3yBOh4WiFFJjKJdi1HBIBaDL4r45HzaBvmYJPlWIomkqKEmQ4rLAbYG7C5rFfpMu8rHvjU7hP0JVvteGtaGn7mqeKsn7CgrJX1tb8t0ldaS3iUy8SEKAo5IZHNKOfEaij3nI4oRVzeVOZsH91pMsA4jRYgEohubPW8ciXwVrFi1qEWjvB8gfalyP60n1fHyjsiLW0T5uY1JzQWHKCbLVh7QFoJFAEV0L516XmzIo556yRH1vhPnceOCjebqgsmO78AQ8Ir2d4pHFFHAGB9lESn3OtJye1Lcyq9D6X93UakA3JKVKEt6JZDLVBMp4msOefkPKSw59Uix9d9kOQm8WCepJTangdNSOKaxblZDNJ5eHvEroYacBhd9UdafEitdF3nfStF7AhkSfQVC61YWWkKTNdx96OoJGTnxuqt4oFZNFtO7aMuN3IJAkw3m3kgZFRGyd3D3wweagNL9XlYtvZwejbjpkDOZz33C0jbEWaMEaUPw6BG49XqyQoUwtriguO0yvWyaJqD4ye3o0E46huKYAsdKAq6MLWMxF6tfyPVaoqOGd0eOBHbAF89XXmDd4AIkoFPXkAOW8hln5nXnIWP6RBbfEkPPbxoToMbV"));*/
        /*System.out.println(new SolutionLevel5().fractionToDecimal(-1,-2147483648));*/
        /*System.out.println(new SolutionLevel5().fractionToDecimal(22,7));*/
        /*System.out.println(new SolutionLevel5().fractionToDecimal(33,5));*/
        /*System.out.println(new SolutionLevel5().fractionToDecimal(659,85));*/
        /*System.out.println(new SolutionLevel5().fractionToDecimal(50,22));*/
        List<String> arrayList = new ArrayList<>();
        /*arrayList.add("foo");
        arrayList.add("bar");*/
        /*arrayList.add("the");*/
        /*arrayList.add("cac");
        arrayList.add("aaa");
        arrayList.add("aba");
        arrayList.add("aab");
        arrayList.add("abc");*/
        arrayList.add("aaa");
        arrayList.add("aaa");

        /*System.out.println(new SolutionLevel5().findSubstring("barfoothefoobarman", arrayList));*/
        /*System.out.println(new SolutionLevel5().findSubstring("barfoothefoobartheman", arrayList));*/
        /*System.out.println(new SolutionLevel5().findSubstring("abbaccaaabcabbbccbabbccabbacabcacbbaabbbbbaaabaccaacbccabcbababbbabccabacbbcabbaacaccccbaabcabaabaaaabcaabcacabaa",
                arrayList));*/
        System.out.println(new SolutionLevel5().findSubstring("aaaaaaaaaaaaaaaaaa", arrayList));
    }

    public ArrayList<Integer> findSubstring(String a, final List<String> b) {
        ArrayList<Integer> result = new ArrayList<>();
        int wordLen = 0;
        int numberOfElements = 0;

        if (b.size() > 0) {
            wordLen = b.get(0).length();
            numberOfElements = b.size();
        }

        Map<String, Integer> map = new HashMap<>();
        for (String s : b) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        Map<String, Integer> currentMap = new HashMap<>(map);
        int counter = numberOfElements;
        for (int i = 0; i < a.length(); ) {
            if (i + wordLen <= a.length()) {
                if (map.containsKey(a.substring(i, i + wordLen))) {
                    if (currentMap.containsKey(a.substring(i, i + wordLen)) &&
                            currentMap.get(a.substring(i, i + wordLen)) == 1) {
                        currentMap.remove(a.substring(i, i + wordLen));
                        if (currentMap.size() == 0) {
                            result.add(i - (wordLen * (numberOfElements - 1)));
                            currentMap = new HashMap<>(map);
                            i = i - (wordLen * (numberOfElements - 1)) + 1;
                            counter = numberOfElements;
                        } else {
                            i = i + wordLen;
                            counter--;
                        }
                    } else if (currentMap.containsKey(a.substring(i, i + wordLen)) &&
                            currentMap.get(a.substring(i, i + wordLen)) > 1) {
                        currentMap.put(a.substring(i, i + wordLen), currentMap.get(a.substring(i, i + wordLen)) - 1);
                        i = i + wordLen;
                        counter--;
                    } else {
                        i = i - (wordLen * (numberOfElements - counter)) + 1;
                        currentMap = new HashMap<>(map);
                        counter = numberOfElements;
                    }
                } else {
                    i = i - (wordLen * (numberOfElements - counter)) + 1;
                    currentMap = new HashMap<>(map);
                    counter = numberOfElements;
                }
            } else {
                return result;
            }
        }
        return result;
    }

    public String fractionToDecimal(int numerator, int denominator) {
        long a = numerator, b = denominator;
        if (a % b == 0) return String.valueOf(a / b);
        Map<Long, Integer> map = new HashMap<>();
        StringBuilder res = new StringBuilder();
        if ((a > 0 && b < 0) || (a < 0 && b > 0)) res.append("-");
        a = Math.abs(a);
        b = Math.abs(b);
        res.append(a / b + ".");
        a = (a % b) * 10;
        while (!map.containsKey(a)) {
            map.put(a, res.length());
            res.append(String.valueOf(a / b));
            a = (a % b) * 10;
            if (a == 0) return res.toString();
        }
        return res.insert(map.get(a), "(").append(")").toString();
    }

    /*public String fractionToDecimal(int numerator, int denominator) {
        String result = null;
        int scale = 100;
        BigDecimal num1 = new BigDecimal(numerator);
        BigDecimal num2 = new BigDecimal(denominator);

        result = num1.divide(num2,scale,BigDecimal.ROUND_HALF_UP).toPlainString();
        while (result.charAt(result.length()-1)=='0'){
            result = result.substring(0,result.length()-1);
        }
        String res = new String();
        int rem = numerator%denominator;
        Map<Integer,Integer> mp = new HashMap<>();
        while ( (rem!=0) && !(mp.containsKey(rem)))
        {
            // Store this remainder
            mp.put(rem, res.length());

            // Multiply remainder with 10
            rem = rem*10;

            // Append rem / denr to result
            int res_part = rem / denominator;
            res += String.valueOf(res_part);

            // Update remainder
            rem = rem % denominator;
        }
        if(res.length()!=0){
            result = result.replaceAll(res,"");
            result = result.concat("("+res+")");
        }
        return result;
    }*/
    public int lengthOfLongestSubstring(String a) {
        int longestLength = 0;
        int length = 0;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            length++;
            if (map.containsKey(String.valueOf(a.charAt(i))) && map.get(String.valueOf(a.charAt(i))) > (i + 1 - length)) {
                length = i + 1 - map.get(String.valueOf(a.charAt(i)));
                map.remove(String.valueOf(a.charAt(i)));
                map.put(String.valueOf(a.charAt(i)), i + 1);
            } else {
                map.put(String.valueOf(a.charAt(i)), i + 1);
            }
            if (length > longestLength) {
                longestLength = length;
            }
        }
        return longestLength;
    }


    static class RandomListNode {
        int label;
        RandomListNode next, random;

        RandomListNode(int x) {
            this.label = x;
        }
    }

    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode copy = null;
        /*Map<Integer, RandomListNode> map = new HashMap<>();*/
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        boolean firstTime = true;

        while (head != null) {
            RandomListNode element;
            if (map.containsKey(head)) {
                element = map.get(head);
            } else {
                element = new RandomListNode(head.label);
                map.put(head, element);
            }
            /*RandomListNode element =new RandomListNode(head.label);*/

            if (firstTime) {
                copy = element;
                firstTime = false;
            }
            if (head.next != null) {
                RandomListNode next;
                if (map.containsKey(head.next)) {
                    next = map.get(head.next);
                } else {
                    next = new RandomListNode(head.next.label);
                    map.put(head.next, next);
                }
                element.next = next;
            } else {
                element.next = null;
            }


            if (head.random != null) {
                RandomListNode random;
                if (map.containsKey(head.random)) {
                    random = map.get(head.random);
                } else {
                    random = new RandomListNode(head.random.label);
                    map.put(head.random, random);
                }
                element.random = random;
            } else {
                element.random = null;
            }

            head = head.next;
        }
        return copy;
    }

    public int diffPossible(final List<Integer> a, int b) {
        if (a.size() == 1) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        if (b == 0) {
            for (Integer integer : a) {
                if (map.containsKey(integer)) {
                    return 1;
                } else {
                    map.put(integer, integer);
                }
            }
            return 0;
        }

        for (Integer integer : a) {
            if (map.containsKey(integer)) {
                return 1;
            }
            map.put(integer, integer);
        }
        for (Integer integer : a) {
            if (map.containsKey(integer - b) || map.containsKey(integer + b)) {
                return 1;
            }
        }
        return 0;
    }

    public String[][] initilizeArray(int n) {
        String[][] arr = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.toString(i) + Integer.toString(j);
            }
        }
        return arr;
    }

    public ArrayList<ArrayList<String>> solveNQueens(int n) {
        ArrayList<ArrayList<String>> result;
        String[][] arr = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.toString(i) + Integer.toString(j);
            }
        }
        ArrayList<ArrayList<String>> prevRes = new ArrayList<>();
        result = solveNqueenRec(n, n, arr, prevRes);
        result.remove(result.size() - 1);

        for (int i = 0; i < result.size(); i++) {
            ArrayList<String> a = result.get(i);
            for (int j = 0; j < a.size(); j++) {
                String temp = a.get(j);
                String temp1 = new String();
                int row = temp.charAt(0) - 48;
                int col = temp.charAt(1) - 48;
                for (int k = 0; k < n; k++) {
                    if (col == k) {
                        temp1 = temp1.concat("Q");
                    } else {
                        temp1 = temp1.concat(".");
                    }
                }
                a.set(j, temp1);
            }
            result.set(i, a);
        }
        return result;
    }

    private ArrayList<ArrayList<String>> solveNqueenRec(int n, int norig, String[][] arr, ArrayList<ArrayList<String>> resultPassed) {
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
                        solveNqueenRec(n - 1, norig, arrpassed, resultPassed);
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

    public ArrayList<ArrayList<Integer>> permutation(ArrayList<Integer> arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> result1;
        if (arr.size() == 1) {
            result.add(arr);
        } else {
            /*result1 = permutation(new ArrayList<Integer> (arr.subList(0, arr.size() - 1)));*/
            result1 = permutation(new ArrayList<Integer>(arr.subList(1, arr.size())));
            for (ArrayList<Integer> integers : result1) {
                for (int i = 0; i < arr.size(); i++) {
                    ArrayList<Integer> temp1 = new ArrayList<>();
                    temp1.addAll(integers);
                    /*temp1.add(i, arr.get(arr.size()-1));*/
                    temp1.add(i, arr.get(0));
                    result.add(temp1);
                }
            }
        }
        return result;
    }

    public ArrayList<Integer> grayCode(int a) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<String> strList = new ArrayList<>();

        while (a > 0) {
            boolean setZero = false;
            if (strList.size() == 0) {
                strList.add("0");
                strList.add("1");
                setZero = false;
            } else {
                ArrayList<String> strListTemp = new ArrayList<>();
                boolean oneSet = false;
                boolean zeroSet = false;
                for (String string : strList) {
                    if (!(oneSet || zeroSet)) {
                        strListTemp.add(string + "0");
                        strListTemp.add(string + "1");
                        oneSet = true;
                        zeroSet = true;
                        setZero = false;
                    } else {
                        if (setZero) {
                            strListTemp.add(string + "0");
                            strListTemp.add(string + "1");
                            setZero = false;
                        } else {
                            strListTemp.add(string + "1");
                            strListTemp.add(string + "0");
                            setZero = true;
                        }
                    }
                }
                strList = strListTemp;
            }
            a--;
        }
        System.out.println(strList);
        for (String s : strList) {
            result.add(Integer.parseInt(s, 2));
        }
        return result;
    }

    // Recursive way
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Collections.sort(a);

        return result;
    }

    // Iterative solution
    /*public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Collections.sort(a);
        for (int i=a.size();i>0;i--) {
            if (result.size()==0){
                ArrayList<Integer> temp = new ArrayList<Integer>();
                temp.add(a.get(i-1));
                result.add(0,temp);
            }else {
                ArrayList<ArrayList<Integer>> copyResult = new ArrayList<>();
                for (int j = result.size(); j > 0; j--) {
                    ArrayList<Integer> list = result.get(j-1);
                    ArrayList<Integer> temp = new ArrayList<Integer>(list.size());
                    for (Integer integer : list) {
                        temp.add(integer);
                    }
                    temp.add(0,a.get(i-1));
                    copyResult.add(0,temp);
                }
                ArrayList<Integer> temp = new ArrayList<Integer>();
                temp.add(a.get(i-1));
                copyResult.add(0,temp);
                result.addAll(0,copyResult);
            }
        }
        result.add(0,new ArrayList<Integer>());
        return result;
    }*/


    public ArrayList<String> letterCombinations(String a) {
        if (a != null && a.length() == 0) return null;
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < a.length(); i++) {
            ArrayList<String> temp = new ArrayList<>();
            char ch = a.charAt(i);
            if (result.size() == 0) {
                String s = new String();
                switch (ch) {
                    case 1 + 48:
                        temp.add(s.concat("1"));
                        break;
                    case 0 + 48:
                        temp.add(s.concat("0"));
                        break;
                    case 2 + 48:
                        temp.add(s.concat("a"));
                        temp.add(s.concat("b"));
                        temp.add(s.concat("c"));
                        break;
                    case 3 + 48:
                        temp.add(s.concat("d"));
                        temp.add(s.concat("e"));
                        temp.add(s.concat("f"));
                        break;
                    case 4 + 48:
                        temp.add(s.concat("g"));
                        temp.add(s.concat("h"));
                        temp.add(s.concat("i"));
                        break;
                    case 5 + 48:
                        temp.add(s.concat("j"));
                        temp.add(s.concat("k"));
                        temp.add(s.concat("l"));
                        break;
                    case 6 + 48:
                        temp.add(s.concat("m"));
                        temp.add(s.concat("n"));
                        temp.add(s.concat("o"));
                        break;
                    case 7 + 48:
                        temp.add(s.concat("p"));
                        temp.add(s.concat("q"));
                        temp.add(s.concat("r"));
                        temp.add(s.concat("s"));
                        break;
                    case 8 + 48:
                        temp.add(s.concat("t"));
                        temp.add(s.concat("u"));
                        temp.add(s.concat("v"));
                        break;
                    case 9 + 48:
                        temp.add(s.concat("w"));
                        temp.add(s.concat("x"));
                        temp.add(s.concat("y"));
                        temp.add(s.concat("z"));
                        break;
                }

            } else {
                for (String s : result) {
                    switch (ch) {
                        case 1 + 48:
                            temp.add(s.concat("1"));
                            break;
                        case 0 + 48:
                            temp.add(s.concat("0"));
                            break;
                        case 2 + 48:
                            temp.add(s.concat("a"));
                            temp.add(s.concat("b"));
                            temp.add(s.concat("c"));
                            break;
                        case 3 + 48:
                            temp.add(s.concat("d"));
                            temp.add(s.concat("e"));
                            temp.add(s.concat("f"));
                            break;
                        case 4 + 48:
                            temp.add(s.concat("g"));
                            temp.add(s.concat("h"));
                            temp.add(s.concat("i"));
                            break;
                        case 5 + 48:
                            temp.add(s.concat("j"));
                            temp.add(s.concat("k"));
                            temp.add(s.concat("l"));
                            break;
                        case 6 + 48:
                            temp.add(s.concat("m"));
                            temp.add(s.concat("n"));
                            temp.add(s.concat("o"));
                            break;
                        case 7 + 48:
                            temp.add(s.concat("p"));
                            temp.add(s.concat("q"));
                            temp.add(s.concat("r"));
                            temp.add(s.concat("s"));
                            break;
                        case 8 + 48:
                            temp.add(s.concat("t"));
                            temp.add(s.concat("u"));
                            temp.add(s.concat("v"));
                            break;
                        case 9 + 48:
                            temp.add(s.concat("w"));
                            temp.add(s.concat("x"));
                            temp.add(s.concat("y"));
                            temp.add(s.concat("z"));
                            break;
                    }
                }
            }
            result = temp;
        }
        return result;
    }

    /*private ArrayList<String> applyChar(char ch, ArrayList<String> s) {
        ArrayList<String> temp = new ArrayList<>()
        switch (ch){
            case 1+48:
                temp.add(s.concat("1"));
                break;
            case 0+48:
                temp.add(s.concat("0"));
                break;
            case 2+48:
                temp.add(s.concat("a"));
                temp.add(s.concat("b"));
                temp.add(s.concat("c"));
                break;
            case 3+48:
                temp.add(s.concat("d"));
                temp.add(s.concat("e"));
                temp.add(s.concat("f"));
                break;
            case 4+48:
                temp.add(s.concat("g"));
                temp.add(s.concat("h"));
                temp.add(s.concat("i"));
                break;
            case 5+48:
                temp.add(s.concat("j"));
                temp.add(s.concat("k"));
                temp.add(s.concat("l"));
                break;
            case 6+48:
                temp.add(s.concat("m"));
                temp.add(s.concat("n"));
                temp.add(s.concat("o"));
                break;
            case 7+48:
                temp.add(s.concat("p"));
                temp.add(s.concat("q"));
                temp.add(s.concat("r"));
                temp.add(s.concat("s"));
                break;
            case 8+48:
                temp.add(s.concat("t"));
                temp.add(s.concat("u"));
                temp.add(s.concat("v"));
                break;
            case 9+48:
                temp.add(s.concat("w"));
                temp.add(s.concat("x"));
                temp.add(s.concat("y"));
                temp.add(s.concat("z"));
                break;
        }
        return temp;
    }*/

    public static int Mod(int a, int b, int c) {
        if (a == 0) return 0;
        int res = 0;
        if (b == 0) return 1;
        else if (b % 2 == 0) {
            int a1 = Mod(a, b / 2, c);
            int a11 = a1 % c;
            res = (a11 * a11) % c;
        } else {
            int a2 = (a % c) % c;
            int a21 = Mod(a, b - 1, c) % c;
            res = (a2 * a21) % c;
        }
        if (res < 0) {
            return res + c;
        } else {
            return res;
        }
    }

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public SolutionLevel5() {

    }

    public void push(int x) {
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
        stack.push(x);
    }

    public void pop() {
        if (!stack.isEmpty()) {
            if (stack.peek().equals(minStack.peek())) {
                stack.pop();
                minStack.pop();
            } else {
                stack.pop();
            }
        }
    }

    public int top() {
        if (stack.isEmpty()) return -1;
        else {
            return stack.peek();
        }
    }

    public int getMin() {
        if (minStack.isEmpty()) return -1;
        else return minStack.peek();
    }

    /*private Stack<Integer> stack = new Stack<>();
    private int min = -1;

    public SolutionLevel5(){

    }
    public void push(int x) {
        if(stack.isEmpty()) {
            min=x;
        }
        else if(x<min) {
            min=x;
        }
        stack.push(x | (min << 16));
    }

    public void pop() {
        if(!stack.isEmpty()) {
            stack.pop();
        }
    }

    public int top() {
        if(stack.isEmpty()) return -1;
        else return stack.peek() & 0xFFFF;
    }

    public int getMin() {
        if(stack.isEmpty()) return -1;
        else return (stack.peek() >> 16) & 0xFFFF;
    }*/

    public int braces(String a) {
        int res = 0;
        if (a == null || a.length() == 0) {
            return 0;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ')') {
                boolean subExpPresent = false;
                int count = 0;
                while (stack.peek() != '(') {
                    stack.pop();
                    count++;
                    if (count > 1) {
                        subExpPresent = true;
                    }
                }
                if (!subExpPresent) {
                    return 1;
                } else {
                    stack.pop();
                }

            } else {
                stack.push(a.charAt(i));
            }
        }
        return res;
    }

    public int maxArea(ArrayList<Integer> a) {
        int result = 0;
        if (a.size() == 1) {
            return a.get(0);
        } else if (a.size() == 0) {
            return result;
        }

        Stack<Integer> stack = new Stack<>();
        int maxArea = -1;

        for (int i = 0; i < a.size(); ) {
            if (stack.size() == 0) {
                stack.push(i);
                i++;
            } else if (stack.size() > 0 && a.get(i) >= a.get(stack.peek())) {
                stack.push(i);
                i++;
            } else {
                int h = a.get(stack.pop());
                int w = stack.empty() ? i : i - stack.peek() - 1;
                int area = h * w;
                if (area > maxArea) maxArea = area;
            }
        }


        while (stack.size() > 0) {
            int h = a.get(stack.pop());
            int w = stack.empty() ? a.size() : a.size() - stack.peek() - 1;
            int area = h * w;
            if (area > maxArea) maxArea = area;
        }

        return maxArea;
    }

    public int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        Stack<Integer> stack = new Stack<Integer>();

        int max = 0;
        int i = 0;

        while (i < height.length) {
            //push index to stack when the current height is larger than the previous one
            if (stack.isEmpty() || height[i] >= height[stack.peek()]) {
                stack.push(i);
                i++;
            } else {
                //calculate max value when the current height is less than the previous one
                int p = stack.pop();
                int h = height[p];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(h * w, max);
            }

        }

        while (!stack.isEmpty()) {
            int p = stack.pop();
            int h = height[p];
            /*int w = stack.isEmpty() ? i : i - stack.peek() - 1;*/
            int w = stack.isEmpty() ? height.length : height.length - stack.peek() - 1;
            max = Math.max(h * w, max);
        }

        return max;
    }


    public int evalRPN(ArrayList<String> a) {
        int result = 0;
        Stack<Integer> stackInt = new Stack();
        if (a == null) {
            return result;
        } else if (a.size() == 1) {
            return Integer.parseInt(a.get(0));
        }

        String temp = new String();
        for (int i = 0; i < a.size(); i++) {
            temp = a.get(i);
            if (temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/")) {
                int a2 = stackInt.pop();
                int a1 = stackInt.pop();
                switch (temp.charAt(0)) {
                    case '+':
                        stackInt.push(new Integer(a1 + a2));
                        break;
                    case '-':
                        stackInt.push(new Integer(a1 - a2));
                        break;
                    case '*':
                        stackInt.push(new Integer(a1 * a2));
                        break;
                    case '/':
                        stackInt.push(new Integer(a1 / a2));
                        break;
                    case '%':
                        stackInt.push(new Integer(a1 % a2));
                        break;
                }
            } else {
                stackInt.add(Integer.parseInt(a.get(i)));
            }
        }

        return stackInt.pop();
    }

    public int evalExp(String a) {
        int result = 0;
        Stack<String> stack = new Stack();
        Stack<Integer> stackInt = new Stack();
        if (a == null) {
            return result;
        } else if (a.length() == 1) {
            return Integer.parseInt(a);
        }

        String temp = new String();
        boolean previousDisgit = false;
        a = a.replaceAll("\\s+", "");
        for (int i = 0; i < a.length(); i++) {
            temp = a.substring(i, i + 1);
            if (temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/") || temp.equals("%")) {
                previousDisgit = false;
                /*stack.push(temp);*/
                String prevOp = null;
                if (!stack.isEmpty()) {
                    prevOp = stack.peek();
                } else {
                    stack.push(temp);
                    continue;
                }

                if (precedenceLevel(temp) < precedenceLevel(prevOp)) {
                    int a1 = stackInt.pop();
                    int a2 = stackInt.pop();
                    switch (temp.charAt(0)) {
                        case '+':
                            stackInt.push(new Integer(a1 + a2));
                            break;
                        case '-':
                            stackInt.push(new Integer(a1 - a2));
                            break;
                        case '*':
                            stackInt.push(new Integer(a1 * a2));
                            break;
                        case '/':
                            stackInt.push(new Integer(a1 / a2));
                            break;
                        case '%':
                            stackInt.push(new Integer(a1 % a2));
                            break;
                    }
                } else {
                    stack.push(temp);
                }
            } else if (temp.equals("(") || temp.equals("{") || temp.equals("[")) {
                previousDisgit = false;
                if (!stack.isEmpty())
                    stack.add(a.substring(i, i + 1));
            } else if (temp.equals(")") || temp.equals("}") || temp.equals("]")) {
                previousDisgit = false;
                String op = null;
                while (!(stack.peek().equals("(") || stack.peek().equals("{") || stack.peek().equals("["))) {
                    op = stack.pop();
                    int a2 = stackInt.pop();
                    int a1 = stackInt.pop();
                    switch (op.charAt(0)) {
                        case '+':
                            stackInt.push(new Integer(a1 + a2));
                            break;
                        case '-':
                            stackInt.push(new Integer(a1 - a2));
                            break;
                        case '*':
                            stackInt.push(new Integer(a1 * a2));
                            break;
                        case '/':
                            stackInt.push(new Integer(a1 / a2));
                            break;
                        case '%':
                            stackInt.push(new Integer(a1 % a2));
                            break;
                    }
                }
            } else {
                if (previousDisgit) {
                    stackInt.push(Integer.valueOf(stackInt.pop().toString() + String.valueOf(a.charAt(i))));
                } else {
                    stackInt.add((int) (a.charAt(i) - 48));
                }
                previousDisgit = true;
            }
        }

        while (!stack.isEmpty()) {
            String op = stack.pop();
            while (op.equals("(") || op.equals("{") || op.equals("[")) {
                op = stack.pop();
            }
            int a2 = stackInt.pop();
            int a1 = stackInt.pop();
            switch (op.charAt(0)) {
                case '+':
                    stackInt.push(new Integer(a1 + a2));
                    break;
                case '-':
                    stackInt.push(new Integer(a1 - a2));
                    break;
                case '*':
                    stackInt.push(new Integer(a1 * a2));
                    break;
                case '/':
                    stackInt.push(new Integer(a1 / a2));
                    break;
                case '%':
                    stackInt.push(new Integer(a1 % a2));
                    break;
            }
        }

        return stackInt.pop();
    }

    int precedenceLevel(String op) {
        switch (op) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
            case "%":
                return 2;
            case "^":
                return 3;
            case ")":
            case "}":
            case "]":
                return 4;
            default:
                /*throw new IllegalArgumentException("Operator unknown: " + op);*/
                return 0;
        }
    }

    public String reverseString(String a) {
        String result = new String();
        Stack<String> stack = new Stack();

        if (a == null && a.length() <= 1) {
            return a;
        } else {
            for (int i = 0; i < a.length(); i++) {
                stack.add(a.substring(i, i + 1));
            }
        }

        for (int i = 0; i < a.length(); i++) {
            result = result.concat(stack.pop());
        }

        return result;
    }

    public ListNode1 sortList(ListNode1 a) {
        ListNode1 res = null;

        ListNode1 inp = a;

        if (a == null) {
            return null;
        }

        int n = 1;
        while (a.next != null) {
            n++;
            a = a.next;
        }

        ListNode1 left = null;
        ListNode1 right = null;

        int mid = n / 2;
        if (mid >= 1) {
            left = inp;
            while (mid > 0) {
                mid--;
                inp = inp.next;
            }
            right = inp;
            ListNode1 res1 = this.mergeSort(left, n / 2);
            ListNode1 res2 = this.mergeSort(right, n - (n / 2));
            res = merge(res1, res2);
        } else {
            res = a;
        }

        return res;
    }

    private ListNode1 merge(ListNode1 res1, ListNode1 res2) {
        if (res1 == null) return res2;
        if (res2 == null) return res1;

        ListNode1 head, temp;
        if (res1.val > res2.val) {
            temp = res1;
            res1 = res2;
            res2 = temp;
        }
        head = res1;

        while (res1.next != null && res2 != null) {
            if (res1.next.val > res2.val) {
                temp = res1.next;
                res1.next = res2;
                res2 = temp;
            } else {
                res1 = res1.next;
            }
        }
        if (res1.next == null) res1.next = res2;

        return head;
    }

    public ListNode1 mergeTwoLists(ListNode1 a, ListNode1 b) {
        if (a == null) return b;
        if (b == null) return a;

        ListNode1 head, temp;
        if (a.val > b.val) {
            temp = a;
            a = b;
            b = temp;
        }
        head = a;

        while (a.next != null && b != null) {
            if (a.next.val > b.val) {
                temp = a.next;
                a.next = b;
                b = temp;
            } else {
                a = a.next;
            }
        }
        if (a.next == null) a.next = b;

        return head;
    }

    /*private List<ListNode1> merge(ListNode1 res1, ListNode1 a) {
        List<ListNode1> result = new ArrayList<>();

        while (res1!=null && res2!=null) {
            if (res1.val < res2.val){
                result.add(res1);
                res1 = res1.next;
            }else {
                result.add(res2);
                res2 = res2.next;
            }
        }
        while (res1!=null){
            result.add(res1);
            res1 = res1.next;
        }
        while (res2!=null){
            result.add(res2);
            res2 = res2.next;
        }

        return result;
    }*/

    public ListNode1 mergeSort(ListNode1 tbs, int length) {

        ListNode1 res = null;

        ListNode1 inp = tbs;

        if (tbs == null) {
            return null;
        }

        int n = length;

        ListNode1 left = null;
        ListNode1 right = null;

        int mid = n / 2;

        if (mid > 0) {
            left = inp;
            while (mid > 0) {
                mid--;
                inp = inp.next;
            }
            right = inp;
            ListNode1 res1 = this.mergeSort(left, n / 2);
            ListNode1 res2 = this.mergeSort(right, length - (n / 2));
            res = merge(res1, res2);

        } else {
            res = new ListNode1(tbs.val);
        }

        return res;
    }

    public ListNode1 detectCycle(ListNode1 a) {
        ListNode1 res = null, slow = null, fast = null, circleStartNode = null;
        if (a.next != null) {
            slow = a.next;
        } else {
            return null;
        }
        if (a.next.next != null) {
            fast = a.next.next;
        } else {
            return null;
        }

        boolean circleExists = false;

        while (true) {
            if (slow == fast) {
                circleExists = true;
                break;
            }
            if (slow.next != null && fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            } else {
                /*circleExists = true;*/

                break;
            }
        }

        if (circleExists) {
            slow = a;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            circleStartNode = slow;
            res = circleStartNode;
        }

        return res;
    }

/*
    public List<ListNode1> listCycles(ListNode1 listNode){
        ListNode1 slow =null, fast=null, circleStartNode= null;
        List<ListNode1> res = new ArrayList<>();
        if(listNode.next!= null){
            slow = listNode.next;
        }else {
            return null;
        }
        if(listNode.next.next!= null){
            fast = listNode.next.next;
        }else {
            return null;
        }

        boolean circleExists=false;
        */
/*ListNode1 circleStartNode = null;*//*


        while (true){
            if (slow == fast){
                circleExists = true;
                circleStartNode = slow;
                break;
            }
            if (slow.next!=null && fast.next!=null && fast.next.next !=null){
                slow = slow.next;
                fast = fast.next.next;
            }else {
                */
/*circleExists = true;*//*

                break;
            }
        }

        if(circleExists){
            res.add(circleStartNode);
            slow = slow.next;
            fast = fast.next;
            */
/*slow = listNode;*//*

            while (slow!=circleStartNode) {
                res.add(slow);
                slow = slow.next;
                fast = fast.next;
            }
            */
/*circleStartNode = slow;
            res = circleStartNode;*//*

        }


        return res;
    }
*/

    /*public ListNode1 reverseBetween(ListNode1 head, int m, int n) {
        if(m==n) return head;

        ListNode1 prev = null;//track (m-1)th node
        ListNode1 first = new ListNode1(0);//first's next points to mth
        ListNode1 second = new ListNode1(0);//second's next points to (n+1)th

        int i=0;
        ListNode1 p = head;
        while(p!=null){
            i++;
            if(i==m-1){
                prev = p;
            }

            if(i==m){
                first.next = p;
            }

            if(i==n){
                second.next = p.next;
                p.next = null;
            }

            p= p.next;
        }
        if(first.next == null)
            return head;

        // reverse list [m, n]
        ListNode1 p1 = first.next;
        ListNode1 p2 = p1.next;
        p1.next = second.next;
        while (p1!= null && p2 != null){
            ListNode1 temp = p2.next;
            p2.next = p1;
            p1 =p2;
            p2 = temp;
        }


        //connect to previous part
        if(prev!=null)
            prev.next = p1;
        else
            return p1;

        return head;
    }
*/
    /*public ListNode1 reverseBetween(ListNode1 A, int m, int n) {

        int i;
        ListNode1 node = A;
        ListNode1 prev = null;
        m--;
        n--;

        for (i = 0; i < m; i++) {
            prev = node;
            node = node.next;
        }

        if (prev != null)
            prev.next = reverseList(node, n - m + 1);
        else
            A = reverseList(node, n - m + 1);

        return A;
    }

    public ListNode1 reverseList(ListNode1 A, int count) {

        ListNode1 node, prev, temp, last;

        node = A;
        last = A;

        if (node == null)
            return null;

        prev = null;

        while (node != null && count > 0) {

            *//*temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;*//*
            temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;

            count--;
        }

        last.next = node;

        return prev;
    }*/

    public ListNode1 reverseBetween(ListNode1 a, int m, int n) {
        ListNode1 node, prev, temp, result;
        temp = null;

        node = a;

        if (node == null)
            return null;

        result = null;
        int i = 1;
        if (node != null) {
            result = recurseNodes(node, i, m, n);
        }
        return result;
    }

    private ListNode1 recurseNodes(ListNode1 node, int i, int m, int n) {

        ListNode1 res = null;
        ListNode1 temp = null;
        ListNode1 temp1 = node;

        int j = n - m;
        if (node.next != null) {

            if (i == m) {
                return temp = reverseLinkedList(node, n - m + 1);
            }

            while (node.next != null) {
                res = recurseNodes(node.next, ++i, m, n);
                node.next = res;
                if (temp != null) {
                    temp.next = node;
                    res = temp;
                    return temp;
                } else {
                    res = node;
                    return node;
                }
            }
            return res;
        } else {
            return node;
        }
    }

    private ListNode1 reverseLinkedList(ListNode1 A1, int i) {


        ListNode1 node, temp, prev, temp1;

        node = A1;
        temp1 = A1;

        boolean first = false;

        if (node == null)
            return null;

        prev = null;

        while (node != null && i > 0) {

            temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
            i--;
        }

        temp1.next = node;

        return prev;
    }


    /*
        private ListNode1 reverseLinkedList(ListNode1 A1, ListNode1 prev,ListNode1 next, int i) {


            ListNode1 node, temp;

            node = A1;

            if (node == null)
                return null;


            while (node != null && i>0) {

                temp = node.next;
                node.next = prev;
                prev = node;
                node = temp;
                i--;
            }

            return prev;
        }
    */
    public ListNode1 reverseList(ListNode1 A) {

        ListNode1 node, prev, temp;

        node = A;

        if (node == null)
            return null;

        prev = null;

        while (node != null) {

            temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
            /*temp = node.next;
            node.next = node;
            prev.next = temp;
            node = temp;*/

        }

        return prev;
    }

    public void take2IntegersAsOne(int x) {
        // int1 is stored in the bottom half of x, so take just that part.
        int int1 = x & 0xFFFF;
        System.out.println(int1);

        // int2 is stored in the top half of x, so slide that part of the number
        // into the bottom half, and take just that part.
        int int2 = (x >> 16) & 0xFFFF;
        System.out.println(int2);

        // use int1 and int2 here. They must both be less than 0xFFFF or 65535 in decimal

    }


    public void pass2() {
        int int1 = 345;
        int int2 = 2342;
        take2IntegersAsOne(int1 | (int2 << 16));
    }
}