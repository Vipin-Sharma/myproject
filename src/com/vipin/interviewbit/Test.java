package com.vipin.interviewbit;


import java.math.BigInteger;
import java.util.*;

/**
 * Created by Ekta on 12/13/2015.
 */

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

class IntervalComparator implements Comparator<Interval> {
    public int compare(Interval i1, Interval i2) {
        return i1.start - i2.start;
    }
}

class MyComparator implements Comparator<Integer> {
    public int compare(Integer X, Integer Y) {
        String XY = X.toString().concat(Y.toString());
        String YX = Y.toString().concat(X.toString());
        /*return new java.math.BigInteger(YX).compareTo(new java.math.BigInteger(XY));*/
        return YX.compareTo(XY);
    }
}
public class Test {
    public static void main(String[] args) {

        int a = 4;
        int b = 6;
        /*List<Integer> a1 = new ArrayList<>();
        a1.add(3);
        a1.add(1);
        a1.add(2);
        a1.add(5);
        a1.add(3);
        ArrayList<Integer> res = new Test().repeatedNumber(a1);
        System.out.println(res.get(0)+ " " + res.get(1));*/

        /*System.out.println(new Test().isPrime(1));*/
        /*System.out.println(new Test().gcd(a,b));*/
        /*System.out.println(new Test().titleToNumber("ZABCD"));*/

        /*System.out.println(new Test().primesum(4).toString());*/
        /*System.out.println(new Test().isPalindrome(0));*/
        /*System.out.println(new Test().uniquePaths(4, 4));*/
     /*   ArrayList<String> a1 = new ArrayList<>();
        *//*1, 7, 67, 133, 178*//*
        a1.add("abc");
        a1.add("abcdefg");
        a1.add("abcgfr");
        a1.add("ab");
        a1.add("a");*/
        /*System.out.println(new Test().longestCommonPrefix(a1));*/
        /*a1.add(4);*/
        /*[ 4, 0, 2, 1, 3 ]*/
        /*a1.add(5);
        a1.add(3);
        *//*ArrayList<Integer> res = new Test().repeatedNumber(a1);
        System.out.println(res.get(0)+ " " + res.get(1));*/
        /*new Test().arrange(a1);*/
        /*System.out.println(new Test().findCount(a1, 1));*/
        /*System.out.println(new Test().searchInsert(a1, 902));*/
        /*System.out.println(new Test().sqrt(2147483647));*/
        /*System.out.println(new Test().sqrt(2));*/
        /*System.out.println(new Test().pow(71045970,41535484,64735492));*/
        /*System.out.println(new Test().search(a1,1));*/

        /*Arrays.fill(arr, BigInteger.valueOf(0));
        arr[1]=BigInteger.valueOf(2);
        arr[2]=BigInteger.valueOf(2*2);
        System.out.println(new Test().findpow(2, 320));*/

        /*System.out.println(new Test().lengthOfLastWord("my name is vipin  "));*/
        /*System.out.println(new Test().strStr("agdcldcabc", "abc"));*/
        /*System.out.println(new Test().strStr("bbaabbbbbaabbaabbbbbbabbbabaabbbabbabbbbababbbabbabaaababbbaabaaaba", "babaaa"));*/

        /*ArrayList<String>  output = new Test().prettyJSON("{A:\"B\",C:{D:\"E\",F:{G:\"H\",I:\"J\"}}}");*/
        /*ArrayList<String>  output = new Test().prettyJSON("{\"attributes\":[{\"nm\":\"ACCOUNT\",\"lv\":[{\"v\":{\"Id\":null,\"State\":null},\"vt\":\"java.util.Map\",\"cn\":1}],\"vt\":\"java.util.Map\",\"status\":\"SUCCESS\",\"lmd\":13585},{\"nm\":\"PROFILE\",\"lv\":[{\"v\":{\"Party\":null,\"Ads\":null},\"vt\":\"java.util.Map\",\"cn\":2}],\"vt\":\"java.util.Map\",\"status\":\"SUCCESS\",\"lmd\":41962}]}");
        for (String s : output) {
            System.out.println(s);
        }*/

        /*System.out.println(new Test().romanToInt("MDCCCIV"));*/
        /*System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);*/
        /*System.out.println(new Test().atoi("-6435D56183011M11 "));*/
        /*System.out.println(new Test().numSetBits(-123456L));*/
        /*ArrayList<Integer> a1 = new ArrayList<>();*/
        /*a1.add();*/
        //[ 2, 2, 27, 27, 32, 36, 43, 48, 64, 70, 79, 85, 89, 89, 90, 92, 98 ]
        /*a1.add(2);
        a1.add(2);
        a1.add(27);
        a1.add(27);
        a1.add(32);
        a1.add(36);
        a1.add(43);
        a1.add(48);
        a1.add(64);
        a1.add(70);
        a1.add(79);
        a1.add(85);
        a1.add(89);
        a1.add(89);
        a1.add(90);
        a1.add(92);
        a1.add(98);*/
        ArrayList<Integer> a1 = new ArrayList<>();
        /*1 2 3 3 4 5 6*/
        a1.add(2);
        a1.add(0);
        a1.add(1);
        a1.add(1);
        a1.add(0);
        a1.add(2);
        a1.add(2);
        a1.add(0);
        a1.add(1);
        a1.add(2);
        a1.add(1);
        a1.add(0);
        a1.add(1);
        a1.add(2);

        /*a1.add(4);
        a1.add(5);
        a1.add(6);*/
        /*ArrayList<Integer> res = new Test().repeatedNumber(a1);*/

        /*System.out.println(new Test().singleNumber(a1));*/
        /*System.out.println(new Test().diffPossible(a1, 4));*/
        List<Integer> a2= new ArrayList<>();
        a2.add(10000000);
        /*a2.add(3);*/
        /*a2.add(5);*/
        /*System.out.println(new Test().maxArea(a1));*/
        /*new Test().sortColors(a1);*/
        /*System.out.println(new Test().longestPalindrome("aaaabaaa"));*/
        /*System.out.println(new Test().longestPalindrome("abb"));*/
        /*System.out.println(new Test().longestPalindrome("cacaccbabcabbbaacbbbbcaaaccaacbabcaccbccaacccaacbbaaabbbabcaaabc"));*/
        /*System.out.println(new Test().longestPalindrome("bb"));*/
        /*System.out.println(new Test().longestPalindrome("abbccccab"));*/
    }

    public String longestPalindrome(String a) {
        String result = null;
        int size=a.length()-1;

        for (int i = 0; i < a.length(); i++) {
            StringBuilder temp= new StringBuilder();
            StringBuilder tempEven= new StringBuilder();
            temp.append(a.charAt(i));
            /*tempEven.append(a.charAt(i));*/
            int j=i-1;
            int k=i+1;

            while (j>=0 && k <a.length() && a.charAt(j) == a.charAt(k)){
                temp.insert(0, a.charAt(j));
                temp.append(a.charAt(k));
                j--;
                k++;
            }

            j=i;
            k=i+1;

            while (j>=0 && k <a.length() && a.charAt(j) == a.charAt(k)){
                tempEven.insert(0, a.charAt(j));
                tempEven.append(a.charAt(k));
                j--;
                k++;
            }

            if(result==null){
                if(temp.length()>tempEven.length()){
                    result = temp.toString();
                }else {
                    result = tempEven.toString();
                }

            }else if (temp.length()>result.length()){
                result = temp.toString();
            }else if (tempEven.length()>result.length()) {
                result = tempEven.toString();
            }

            if(temp.length()<tempEven.length()){
                temp=tempEven;
            }
            if(result==null){
                result=temp.toString();
            }else if(result.length()<temp.length()){
                result = temp.toString();
            }
        }

        return result;
    }
    public void sortColors(ArrayList<Integer> a) {
        int i =0;
        int j =a.size()-1;

        /*for (Integer integer : a) {*/
        for(int counter=0;counter<a.size();counter++){
            int integer=a.get(counter);
            if(integer==0 && i <= counter){
                /*while (i==counter && a.get(i)!=0){
                    i++;
                }*/
                if(a.get(i)==2){
                    int temp = a.get(counter);
                    a.set(counter,a.get(i));
                    a.set(i,temp);
                    counter-=1;
                }else {
                    int temp = a.get(counter);
                    a.set(counter, a.get(i));
                    a.set(i, temp);
                }
                i++;

            }else if(integer==2 && j>counter-1){
                while (a.get(j)==2 && j>counter){
                    j--;
                }
                if(a.get(j)==0){
                    int temp = a.get(counter);
                    a.set(counter,a.get(j));
                    a.set(j,temp);
                    counter-=1;

                }else {
                    int temp = a.get(counter);
                    a.set(counter,a.get(j));
                    a.set(j,temp);
                }
                j--;
            }else {

            }

        }
        System.out.println(a.toString());
    }

    /*private void swap(Integer integer, Integer integer1) {

    }*/

    public int maxArea(ArrayList<Integer> a) {
        int result = 0;

        int i=0;
        int j=a.size()-1;

        while (i<j) {
            int min;
            int minpos = findMin(a.get(i), a.get(j));
            if (minpos == 0) {
                min = a.get(i);
            } else min = a.get(j);

            if (result < min * (j - i)) {
                result = min * (j - i);
            }

            if (minpos == 0) {
                do {
                    i = i + 1;
                }
                while (i < j && a.get(i) < a.get(i - 1));
            }else {
                do {
                    j = j - 1;
                }
                while (i < j &&  a.get(j) < a.get(j+1));
            }
        }

        return result;
    }

    private int findMin(Integer integer, Integer integer1) {
        if(integer<integer1){
            return 0;
        }else return 1;
    }

    public ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>();

        int i=0;
        int j=0;

        while (i<a.size() && j<b.size()){
            if(a.get(i).equals(b.get(j))){
                result.add(a.get(i));
                j++;
                i++;
            }else if(a.get(i)<b.get(j)){
                i=i+1;
            }else{
                j=j+1;
            }
        }

        return result;
    }
    public int diffPossible(ArrayList<Integer> a, int b) {

        if(a.size()==1){
            return 0;
        }

        int result=0;
        int count=-1;

        for (Integer var : a) {
            count++;
            int low=count;
            int mid;
            /*int low=0;*/
            int high=a.size()-1;
            while (low<=high){
                mid = low + (high-low)/2;
                if(mid==count){
                    if(mid<high)
                        mid=mid+1;
                    else {
                        break;
                    }
                }
                if (Math.abs(a.get(count)-a.get(mid))==b){
                    return 1;
                }else if (Math.abs(a.get(count)-a.get(mid))<b){
                    low=mid+1;
                }else {
                    high=mid-1;
                }
            }
        }

        return result;
    }

    public int diffPossibleInterviewbit(ArrayList<Integer> A, int B) {
        int start, end;
        int n = A.size();
        int diff;

        start = 0;
        end = 1;

        while (start <= end && end < n) {

            diff = A.get(end) - A.get(start);

            if (diff == B && start != end) {
                return 1;
            } else if (diff <= B) {
                end++;
            } else {
                start++;
            }
        }

        return 0;
    }

    public int singleNumber(final List<Integer> a) {
        int result = 0;
        boolean encountered = false;

        for (Integer x : a) {
            if(!encountered){
                encountered=true;
                result=x;
                continue;
            }
            result = result ^ x;
        }
        return result;
    }
    public int numSetBits(long a) {
        int result =0;
        String temp =Long.toBinaryString(a);
        char[] arr = temp.toCharArray();
        for (char c : arr) {
            if(c==49){
                result=result+1;
            }
        }

        return result;
    }
    public int atoi(final String a) {
        boolean numericFound=false;
        boolean garbageFound=false;
        boolean spaceFound=false;
        boolean negateFound=false;
        boolean positiveFound=false;
        StringBuilder resut = new StringBuilder();

        char[] arr = a.toCharArray();
        int rs = 0;
        /*int[] res = new int[arr.length];
        int i=0;*/
        int a1 = 10;

        for (char el : arr) {
            if(numericFound && el==' ')
                return rs;
            if(!numericFound && garbageFound)
                return 0;
            if (negateFound && el==' '){
                return 0;
            }
            if (positiveFound && el==' '){
                return 0;
            }
            /*if (spaceFound && el==' '){
                return 0;
            }*/

            if(!numericFound && el==' ') {
                spaceFound = true;
                continue;
            }
            else if(el=='-'){
                negateFound=true;
            }
            else if(el=='+' && !numericFound){
                positiveFound=true;
                continue;
            }

            else if(el >=48 && el<=57) {
                /*resut.append(el);
                res[i] = el;*/
                long maximum = Integer.signum(a1) == Integer.signum(rs) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                if (a1 != 0 && (rs > 0 && rs > maximum / a1))
                {
                    return Integer.MAX_VALUE;
                }

                if (a1 != 0 && (rs < 0 && rs < maximum / a1))
                {
                    return Integer.MIN_VALUE;
                }
                if(numericFound){
                    rs*=a1;
                }

                if(negateFound){
                    rs=rs-(el-48);
                }else {
                    rs=rs+el-48;
                }

                if (negateFound && rs>0){
                    rs=rs*-1;
                }
                /*i++;*/
                numericFound = true;
            }
            else{
                garbageFound=true;
                return rs;
            }
        }

        return rs;
    }

    public int romanToInt(String a) {
        int result = 0;

        HashMap<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        char[] array = a.toCharArray();
        int[] intarray = new int[100];
        boolean decreasing=false;
        int counter=0;
        int previous=0;

        for (int x = array.length-1; x >=0 ; x--) {
        /*for (char c : array) {*/
            char c = array[x];

            if ((99-counter) != 99 && (99-counter) >0 && map.get(String.valueOf(c))<intarray[previous]){
                decreasing=true;
            }else {
                decreasing=false;
            }

            if(decreasing){
                intarray[previous]=intarray[previous] - map.get(String.valueOf(c));
            }else {
                intarray[99-counter]=map.get(String.valueOf(c));
                previous=99-counter;
                counter+=1;
            }
        }

        /*int j = intarray.length;
        int k =0;*/
        for (int i : intarray) {
            result+=i;
        }

        return result;
    }

    public ArrayList<String> prettyJSON(String a) {

        ArrayList<String> result = new ArrayList<>();

        if (a=="{}"){
            result.add("{}");
            return result;
        }
        if (a==null || a.length()<1){
            return null;
        }

        char[] inp = a.toCharArray();

        int tab =0;

        int pos =-1;
        boolean charFound = false;
        boolean prevIncr = false;

        for (char c : inp) {
            if(c=='{' || c=='['){
                charFound=false;
                if(!prevIncr){
                    pos+=1;
                }
                if (tab>0){
                    for (int i = 0; i < tab; i++) {
                        if (i==0){
                            result.add(pos,"\t");
                        }else {
                            result.set(pos, result.get(pos) + "\t");
                        }
                    }
                    result.set(pos,result.get(pos)+Character.toString(c));
                }else {
                    result.add(pos,Character.toString(c));
                }
                //result.add("");
                pos+=1;
                prevIncr=true;
                tab+=1;
            }else if (c==','){
                charFound=false;
                /*for (int i = 0; i < tab; i++) {
                    result.add(pos,result.get(pos)+"\t");
                }*/
                result.set(pos,result.get(pos)+Character.toString(c));
                pos+=1;
                prevIncr=true;
            }else if (c=='}' || c==']'){
                prevIncr=false;
                charFound=false;
                pos+=1;
                prevIncr=true;
                tab-=1;
                /*for (int i = 0; i < tab; i++) {
                    result.add(pos,result.get(pos)+"\t");
                }*/
                if (tab>0){
                    for (int i = 0; i < tab; i++) {
                        if (i==0){
                            result.add(pos,"\t");
                        }else {
                            result.set(pos, result.get(pos) + "\t");
                        }
                    }
                    result.set(pos,result.get(pos)+Character.toString(c));
                }else {
                    result.add(pos,Character.toString(c));
                }
            }else {
                prevIncr=false;
                if (!charFound){
                    for (int i = 0; i < tab; i++) {
                        if (i == 0) {
                            result.add(pos,"\t");
                        }else {
                            result.set(pos, result.get(pos) + "\t");
                        }
                    }
                    /*pos+=1;*/
                }
                result.set(pos,result.get(pos)+Character.toString(c));
                charFound=true;
            }
        }
        return result;
    }
    public int strStr(final String haystack, final String needle) {
        int result=-1;

        String from = haystack;
        String find = needle;
        if(from.length()<1 || find.length()<1){
            return result;
        }

        char[] fromArray = haystack.toCharArray();
        char[] findArray = needle.toCharArray();

        for (int i=0,j=0;i<fromArray.length;i++) {
            while(i< fromArray.length && (fromArray[i]==findArray[j])){
                j++;
                if (j==findArray.length){
                    if (i==0){
                        return i;
                    }
                    return i-j+1;
                }
                i++;
            }
            i=i-j;
            j=0;
        }
        return result;
    }

    public int lengthOfLastWord(final String a) {
        int ans=0;

        int len=0;

        char[] chars = a.toCharArray();

        boolean newString=true;

        boolean wordEncountered = false;

        for (int i = chars.length-1; i >= 0; i--) {
            if (chars[i]==' '){
                if(wordEncountered){
                    break;
                }
                continue;
            }else {
                wordEncountered=true;
                len=len+1;
                if (len>ans){
                    ans=len;
                }
            }
        }

        return ans;
    }

    public String longestCommonPrefix(ArrayList<String> a) {
        String ans =null;

        StringBuilder temp = new StringBuilder();

        Collections.sort(a);

        int smallest;

        if(a.get(0).length()<a.get(a.size()-1).length()){
            smallest = a.get(0).length();
        }else {
            smallest = a.get(a.size()-1).length();
        }

        for (int i = 0; i < smallest ; i++) {
            if(a.get(0).charAt(i)==a.get(a.size()-1).charAt(i)){
                temp.append(a.get(0).charAt(i));
            }else {
                break;
            }
        }

        return temp.toString();
    }

    // DO NOT MODIFY THE LIST
    public int search(final List<Integer> a, int b) {
        int ans=-1;

        int low = 0;
        int high = a.size()-1;
        int mid = 0;
        int pivot=-1;

        while (low <=high){
            mid = low + (high-low)/2;


            //check if mid=0 or mid = high
            if (mid==0 || mid == a.size()-1){
                pivot=mid;
                break;
            }
            if (a.get(mid)>a.get(mid-1) && a.get(mid) < a.get(mid+1)){
                if(a.get(mid)>a.get(high)){
                    low=mid;
                }else {
                    high= mid-1;
                }

            }else {
                if (a.get(mid)<a.get(mid-1) && a.get(mid) < a.get(mid+1)){
                    pivot=mid;
                    break;
                }else {
                    pivot=mid+1;
                    break;
                }
            }
        }

        //return pivot;

        if(b<a.get(a.size()-1)){
            high=a.size()-1;
            low=pivot;
        }else {
            low=0;
            high=pivot-1;
        }

        while (low<=high){
            mid=low+ (high-low)/2;

            if (a.get(mid)==b){
                return mid;
            }else if (a.get(mid)<b){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }

        return ans;
    }

/*
    public static BigInteger[] arr = new BigInteger[320+1];
    public int pow(int x, int n, int d) {
        BigInteger result= null;
        int tempr =0;

        if (d<=x) {
            tempr = x % d;
            arr = new BigInteger[tempr+1];
            Arrays.fill(arr, BigInteger.valueOf(0));
            arr[1]=BigInteger.valueOf(x);
            arr[2]=BigInteger.valueOf(x).multiply(BigInteger.valueOf(x));
            result = findpow(x, tempr);
        }else {
            arr = new BigInteger[n+1];
            arr[1]=BigInteger.valueOf(x);
            arr[2]=BigInteger.valueOf(x).multiply(BigInteger.valueOf(x));
            result= findpow(x, n);
        }

        if(result.compareTo(BigInteger.valueOf(0))<0){
            result = result.remainder(BigInteger.valueOf(d));
            result=result.add(BigInteger.valueOf(d));
        }else {
            result = result.remainder(BigInteger.valueOf(d));
        }
        return result.intValue();
    }
    private BigInteger findpow(int x, int tempr) {
        long result=0;
        int low=1;
        int high = tempr;
        int mid=0;

        mid = low +(high-low)/2;
        if(mid>low && mid<high){
            if(arr[high-low+1]!=BigInteger.valueOf(0)){
                return arr[high-low+1];
            }else {
                arr[high-low+1] = (findpow(x, (mid - low)).add(findpow(x,(high-low)))).add(BigInteger.valueOf(x));
                return arr[high-low+1];
            }
        }else if ((mid==low && mid<high)||(mid==high && mid>low)){
            if(arr[high-low+1]!=BigInteger.valueOf(0)){
                return arr[high-low+1];
            }else {
                arr[high-low+1] = findpow(x,(high-low+1)).add(BigInteger.valueOf(x));
                return arr[high-low+1];
            }
        }else {
            return BigInteger.valueOf(x);
        }
    }
*/
    public int pow(int x, int n, int d) {

    long a = x;
    long res = 1L;

    while (n > 0) {

        if (n % 2 == 1) {
            res *= a;
            res %= d;
        }

        a *= a;
        a %= d;
        n = n >> 1;

    }

    res = (res + d) % d;

    return (int) res;

    }

    public int sqrt(int a) {
        int sqrt=0;

        long low =0;
        long mid =0;
        long high = a;
        boolean l = false;

        while (low<=high){
            mid = low + (high-low)/2;
            if(mid*mid==a){
                return (int) mid;
            }
            else if (mid*mid>a){
                high = mid - 1;
                l=false;
            }
            else{
                low=mid+1;
                l=true;
            }
        }

        return  (l ? (int)mid : (int)(mid-1));
    }

    /*public int sqrt(int a) {
        int sqrt=0;

        int low =0;
        int mid =0;
        int high = a;

        while (low<=high){
            mid = low + (high-low)/2;
            if(mid*mid==a){
                sqrt=mid;
                return sqrt;
            }
            else if (mid*mid>a){

                if((mid-1)*(mid-1)<a){
                        sqrt=mid;
                        return sqrt;
                }
                else {
                    high = mid - 1;
                }
            }else{

                if ((mid + 1) * (mid + 1) > a) {
                        sqrt = mid;
                        return sqrt;
                    }
                else {
                    low=mid+1;
                }
            }
        }

        return sqrt;
    }
*/
    public int searchInsert(ArrayList<Integer> a, int b) {

        if (a.size()==1){
            if(a.get(0)==b)
                return 0;
            else if (a.get(0)>b)
                return 0;
            else return 1;
        }

        int low = 0;
        int high = a.size()-1;
        int pos = 0;

        while (low<=high){
            int mid = low + (high-low)/2;

            if (a.get(mid)==b){
                return mid;
            }else if (a.get(mid)<b){
                low = mid +1;
                pos= mid +1;
            }else {
                high = mid-1;
                pos= mid;
            }
        }
        return pos;
    }
    /*{

        if (a.size()==1){
            if(a.get(0)==b)
                return 0;
            else if (a.get(0)>b)
            else return 1;
                return 0;
        }

        int[] A= new int[a.size()];
        int i=0;
        for (Integer integer : a) {
            A[i]=integer.intValue();
            i++;
        }

        int low = 0;
        int high = A.length-1;
        int pos = 0;

        while (low<=high){
            int mid = low + (high-low)/2;

            if (A[mid]==b){
                return mid;
            }else if (A[mid]<b){
                low = mid +1;
                pos= mid +1;
            }else {
                high = mid-1;
                pos= mid;
            }
        }
    return pos;
    }*/

    public int findCount(final List<Integer> a, int b) {

        if (a.size()==1){
            if(a.get(0)==b)
                return 1;
            else return 0;
        }

        /*int[] A= { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };*/
        /*int[] A= { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10};*/
        int[] A = { 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 8, 8, 9, 9, 10, 10, 10 };
        /*int[] A= new int[a.size()];
        int i=0;
        for (Integer integer : a) {
            A[i]=integer.intValue();
            i++;
        }*/

        int count=0;

        int low = 0;
        int high = A.length-1;

        while (low<=high){
            int mid = low + (high-low)/2;
            if (b==A[mid]){
                count++;
                int nlow=0;
                int nhigh=0;
                nlow=mid-1;
                nhigh=mid+1;
                while ((nlow!=-1 || nhigh!=-1)){
                    if (nlow>=0 && nlow!=-1 && A[nlow]==b){
                        count++;
                        nlow=nlow-1;
                    }else {
                        nlow=-1;
                    }
                    if(nhigh<=A.length-1 && nhigh!=-1 && A[nhigh]==b ){
                        count++;
                        nhigh=nhigh+1;
                    }else {
                        nhigh=-1;
                    }
                }
                return count;

            }else if (b<A[mid]){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }

        return count;
    }

    public void arrange(ArrayList<Integer> a) {
        ArrayList<Integer> acopy = new ArrayList<>(a);
        for (int i = 0; i < a.size(); i++) {
            /*int temp = a.get(i);*/
            a.set(i, acopy.get(acopy.get(i)));
            /*a.set(a.get(a.get(i)), temp);*/
        }
        for (Integer integer : a) {
            System.out.println(integer);
        }
    }

    public void setZeroes(ArrayList<ArrayList<Integer>> a) {

    }
    public int uniquePaths(int a, int b) {
        int rows =a;
        int cols =b;
        int romve =0;
        int dmove =0;
        int ways =0;
        boolean rf =false;
        boolean df =false;

        if (b>1){
            /*ways++;*/
            /*romve++;*/
            ways+=uniquePaths(a,b-1);
        }else {
            /*ways++;*/
            rf = true;
        }
        if (a>1){
            /*ways++;*/
            /*dmove++;*/
            ways+=uniquePaths(a-1,b);
        }else {
            /*ways++;*/
            df = true;
        }
        if(rf & df){
            ways++;
        }

        return ways;
    }

    private void findways(int a, int b) {
    }

    public boolean isPalindrome(int a) {
        boolean result = true;
        if(a<0){
            return false;
        }
        else if (a<10){
            return true;
        }
        else{
            String str = new Integer(a).toString();

            for (int i = 0,j=str.length()-1; i < str.length()/2; i++,j--) {
                if(str.charAt(i)!=str.charAt(j)){
                    return false;
                }
            }
        }
        return result;
    }


    public ArrayList<Integer> primesum(int a) {

        int input = a;
        ArrayList<Integer> primes = new ArrayList<>();
        ArrayList<Integer> primeSum = new ArrayList<>();

        // loop through the numbers one by one
        for (int i = 2; i < input; i++) {
            boolean isPrimeNumber = true;

            // check to see if the number is prime
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break; // exit the inner for loop
                }
            }

            // print the number if prime
            if (isPrimeNumber) {
                if(isPrime(a-i)==1){
                    primeSum.add(i);
                    primeSum.add(a-i);
                    return primeSum;
                }
            }
        }
        return primeSum;
    }

    private void printPrimeNumbersInRange(int a, int b) {
        boolean even = false;

        if (a == 1) {
            a = a + 2;
            System.out.println(2);
        }
        if (a == 2) {
            a = a + 1;
            System.out.println(2);
        }

        if (a % 2 == 0) {
            a = a + 1;
        }


        for (int i = a; i <= b; i = i + 2) {
            int z = (int) Math.sqrt(i);
            z++;
            if (i % 2 == 0) {
                continue;
            }
            boolean flag = true;
            for (int j = 3; j <= z; j = j + 2) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }

    public int titleToNumber(String a) {
        int out=0;
        StringBuilder sb = new StringBuilder();

        for (int i = a.length(),j=0; i > 0 ; i--,j++) {
            int temp = a.charAt(j);
            temp = temp-64;
            out= out + ((int)java.lang.Math.pow(26,i-1))*temp;
        }
        return out;
    }

    public int gcd(int a, int b) {
        int maxInt = 0;
        int maxInp = 0;

        if(a>=b){
            maxInp=a;
        }else {
            maxInp=b;
        }

        for (int i = 1; i <= maxInp; i++) {
            if (a%i==0 & b%i==0){
                maxInt=i;
            }
        }

        return maxInt;
    }
    public int isPrime(int A) {
        if (A==1) return 0;
        int upperLimit = (int)(Math.sqrt(A));
        for (int i = 2; i <= upperLimit; i++) {
            if (i < A && A % i == 0) return 0;
        }
        return 1;
    }

    public static String convert(int number, int base)
    {
        int quotient = number / base;
        int remainder = number % base;

        if(quotient == 0) // base case
        {
            return Integer.toString(remainder);
        }
        else
        {
            return convert(quotient, base) + Integer.toString(remainder);
        }
    }
    public ArrayList<Integer> repeatedNumber(final List<Integer> a) {

        ArrayList<Integer> result = new ArrayList<>();
        /*long sum2 =0;
        long actsum2 = 0;
        long sum =0;
        long actsum = 0;
        long x=0;
        long x2=0;*/
        BigInteger sum2 =new BigInteger("0");
        BigInteger actsum2 = new BigInteger("0");
        BigInteger sum =new BigInteger("0");
        BigInteger actsum = new BigInteger("0");
        BigInteger x=new BigInteger("0");
        BigInteger x2=new BigInteger("0");
        int A=0;
        int B = 0;

        if (a.size() > 0) {
            sum=(BigInteger.valueOf(a.size()).multiply((BigInteger.valueOf(a.size()).add(new BigInteger("1"))))).divide(new BigInteger("2"));
            sum2=BigInteger.valueOf(a.size()).multiply((BigInteger.valueOf(a.size()).add(new BigInteger("1")))).multiply((new BigInteger("2").multiply(BigInteger.valueOf(a.size()))).add(new BigInteger("1"))).divide(new BigInteger("6"));
            for (Integer integer : a) {
                actsum = actsum.add(new BigInteger(integer.toString()));
                actsum2 = actsum2.add(new BigInteger(integer.toString()).multiply(new BigInteger(integer.toString())));
            }
            x2=sum2.subtract(actsum2);
            x=sum.subtract(actsum);

            A = (((x2.divide(x)).subtract(x)).divide( new BigInteger("2"))).intValue();
            B = A + x.intValue();

            result.add(A);
            result.add(B);
        }
        return result;
    }

    public String largestNumber(final List<Integer> a) {
        String output = new String();

        Collections.sort(a,new MyComparator());

        for (Integer integer : a) {
            output =output.concat(integer.toString());
        }

        /*BigInteger a1 = new BigInteger(output);
        return a1.toString();*/
        return output.replaceFirst("^0+(?!$)", "");
    }

//    public String largestNumber(final List<Integer> a) {
//
//        int modulo = 10;
//        Collections.sort(a);
//        List<Integer> temp = new ArrayList<>();
//        List<String> output = new ArrayList<>();
//        String out = new String();
//
//        for (int i = 0; i < a.size();) {
//
//            if(a.get(i)/modulo==0){
//                temp.add(a.get(i));
//                i++;
//            }else {
//                modulo=modulo*10;
//                for (int j = temp.size()-1; j >=0; j--) {
//                    /*output.add(temp.get(j).toString());*/
//                    out = out.concat(temp.get(j).toString());
//                }
//                temp=new ArrayList<>();
//            }
//        }
//
//        for (int j = temp.size()-1; j >=0; j--) {
//            out = out.concat(temp.get(j).toString());
//        }
//
//        return out;
//    }

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        if(intervals.size()<1){
            return null;
        }
        Collections.sort(intervals,new IntervalComparator());
        ArrayList<Interval> mergedIntervals= new ArrayList<>();

        Interval prevInterval = null;
        Interval mergedInterval = null;

        for (Interval interval : intervals) {
            if (prevInterval==null){
                prevInterval=interval;
                continue;
            }else{
                if(interval.start<=prevInterval.end){
                    prevInterval= new Interval(prevInterval.start,prevInterval.end>interval.end? prevInterval.end:interval.end);
                }else {
                    mergedIntervals.add(prevInterval);
                    prevInterval=interval;
                }
            }
        }

        mergedIntervals.add(prevInterval);
        return mergedIntervals;
    }

}
