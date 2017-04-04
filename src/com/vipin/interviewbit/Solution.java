package com.vipin.interviewbit;

import org.w3c.dom.NodeList;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Ekta on 7/23/2016.
 */

class Trie {
    char c;

    Trie(char c) {
        this.c = c;
    }

    LinkedHashMap<Character, Trie> children = new LinkedHashMap<>();

    public Trie() {

    }
}

class TreeNode {
    int val;
    String valString;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    TreeNode(String x) {
        valString = x;
    }
}


class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {

    public static void main(String[] args, int a) {
    }


    public static void main(String[] args) {
        /*TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(7);

        root.left.left.left = new TreeNode(8);
        *//*root.left.left.right = new TreeNode(9);*//*
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);
        root.right.right.left = new TreeNode(14);
        root.right.right.right = new TreeNode(15);

        root.left.left.left.left = new TreeNode(16);
        root.left.left.left.right = new TreeNode(17);
        root.right.right.right.right = new TreeNode(31);*/

        /*TreeNode root = new TreeNode(7);

        root.left = new TreeNode(10);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(12);
        root.right.left = new TreeNode(2);

        root.left.left.left = new TreeNode(11);
        root.left.left.left.right = new TreeNode(6);

        root.left.right.right= new TreeNode(1);
        root.left.right.right.left = new TreeNode(3);

        root.right.left.left= new TreeNode(8);
        root.right.left.right = new TreeNode(4);*/

        /*TreeNode root = new TreeNode(4);

        root.left = new TreeNode(1);
        root.right = new TreeNode(5);

        root.left.right = new TreeNode(2);
        root.left.right.right = new TreeNode(3);*/


        /*TreeNode root1 = new TreeNode(1);

        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        root1.right.left = new TreeNode(4);
        root1.right.left.right = new TreeNode(5);*/
        /*root1.right.right.right = new TreeNode(8);*/


        /*new Solution().print(root);*/
        /*System.out.println(new Solution().isBalanced(root));*/
        /*System.out.println(new Solution().invertTree(root));*/
        /*int k = 3;*/
        /*ArrayList<String> inorder = new ArrayList<>();
        inorder.add("D");
        inorder.add("B");
        inorder.add("E");
        inorder.add("A");
        inorder.add("F");
        inorder.add("C");
        ArrayList<String> preorder = new ArrayList<>();
        preorder.add("A");
        preorder.add("B");
        preorder.add("D");
        preorder.add("E");
        preorder.add("C");
        preorder.add("F");*/
        /*Inorder sequence: D B E A F C
        Preorder sequence: A B D E C F*/
        /*int inorderarr[] = {4, 2, 5, 1, 6, 3};
        int preorderarr[] = {1, 2, 4, 5, 3, 6};

        List<Integer> preorder = createList(preorderarr);
        List<Integer> inorder = createList(inorderarr);*/

        ArrayList preOrder = new ArrayList();
        preOrder.add(new Integer(1));
        preOrder.add(new Integer(2));
        preOrder.add(new Integer(4));
        preOrder.add(new Integer(8));
        preOrder.add(new Integer(9));
        preOrder.add(new Integer(10));
        preOrder.add(new Integer(11));
        preOrder.add(new Integer(5));
        preOrder.add(new Integer(3));
        preOrder.add(new Integer(6));
        preOrder.add(new Integer(7));

        ArrayList inOrder = new ArrayList();
        inOrder.add(new Integer(8));
        inOrder.add(new Integer(4));
        inOrder.add(new Integer(10));
        inOrder.add(new Integer(9));
        inOrder.add(new Integer(11));
        inOrder.add(new Integer(2));
        inOrder.add(new Integer(5));
        inOrder.add(new Integer(1));
        inOrder.add(new Integer(6));
        inOrder.add(new Integer(3));
        inOrder.add(new Integer(7));

        /*System.out.println(new Solution().kthsmallest(root, k));*/
        /*System.out.println(new Solution().createTree(inorder, preorder));*/
        /*System.out.println(new Solution().createTree(inOrder, preOrder));*/
        /*System.out.println(new Solution().buildTree(preOrder, inOrder));*/
        /*System.out.println(new Solution().identicalTrees(root, root1));*/
        ArrayList<String> a = new ArrayList<>();
        /*a.add("zebra");
        a.add("dog");
        a.add("duck");
        a.add("dove");*/
        a.add("bearcat");
        a.add("bert");
        /*System.out.println(new Solution().isSameTree(root, root1));*/
        /*System.out.println(new Solution().prefix(a));*/
        int a1 = 7;
        int a2 = 3;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(3);
        int k = 3;
        /*System.out.println(new Solution().lca(root, a1, a2));*/
        /*TreeNode result = new Solution().flatten(root1);*/
        /*System.out.println(new Solution().flatten(root1));*/
        /*System.out.println(new Solution().zigzagLevelOrder(root));*/

        ArrayList<ListNode> ar = new ArrayList<>();

        ListNode lt = new ListNode(1);
        lt.next = new ListNode(1);
        lt.next.next = new ListNode(2);

        ListNode lt2 = new ListNode(3);
        lt2.next = new ListNode(1);
        lt2.next.next = new ListNode(4);

        ar.add(lt);
        ar.add(lt2);

        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(6);

        root.left.right = new TreeNode(3);
        /*root.left.right.left = new TreeNode(8);
        root.left.right.right = new TreeNode(9);*/
        root.left.left = new TreeNode(1);
        /*root.left.left.left = new TreeNode(10);
        root.left.left.right = new TreeNode(11);*/
        root.right.left = new TreeNode(5);
        /*root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(13);*/
        root.right.right = new TreeNode(7);
        /*root.right.right.left = new TreeNode(14);
        root.right.right.right = new TreeNode(15);*/


        /*System.out.println(new Solution().mergeKLists(ar));*/
        /*System.out.println(new Solution().dNums(arr, 3));*/

        /*TreeNode root1 = new TreeNode(1);

        root1.right = new TreeNode(2);

        root1.right.left = new TreeNode(3);*/

        TreeNode root1 = new TreeNode(1000);
        root1.left = new TreeNode(200);
        /*root1.right = new TreeNode(3);
        root1.right.left = new TreeNode(4);
        root1.right.left.right = new TreeNode(5);
*/
        /*System.out.println(new Solution().inorderTraversal(root1));*/
        /*System.out.println(new Solution().hasPathSum(root1, 1000));*/
        /*System.out.println(new Solution().hasPathSum(root, 15));*/
        List<Integer> lst = new ArrayList<>();
        /*lst.add(1);
        lst.add(2);
        lst.add(3);//2
        lst.add(0);
        lst.add(7);
        lst.add(9);
        lst.add(5);*/

        /*System.out.println(new Solution().maxProfit(lst));*/
        System.out.println(new Solution().minDistance("b" , "a"));
        System.out.println(new Solution().minDistance("Anshuman" , "Antihuman"));
        System.out.println(new Solution().minDistance("aa" , "aaa"));
        System.out.println(new Solution().minDistance("bbbaabaa", "aababbabb"));
    }


    public int minDistance(String a, String b) {
        int result=0;

        char[] fromarr = a.toCharArray();
        char[] toarr = b.toCharArray();

        int m = a.length();
        int n = b.length();

        int[][] dp = new int[m+1][n+1];

        for (int i = 0; i <= fromarr.length; i++) {
            for (int j = 0; j <= toarr.length; j++) {

                if(i==0) dp[i][j]= j ;

                else if (j==0) dp[i][j]= i;

                else if (toarr[j]==fromarr[i]) dp[i][j]= dp[i-1][j-1];

                else {
                    dp[i][j]=  1 + min(dp[i][j-1], dp[i-1][j], dp[i-1][j-1]);
                }
            }
        }
        return dp[m][n];
    }

    private int min(int i, int i1, int i2) {
        int firstMin = (i<i1) ? i: i;
        int secondMin = (i2<firstMin) ? i2 : firstMin;
        return secondMin;
    }

    /*public int minDistance(String a, String b) {

        for (int i =0; i<a.length() && i<b.length();i++){
            if(a.charAt(i)==b.charAt(i)){
                a = a.substring(0, i) + a.substring(i + 1);
                b = b.substring(0, i) + b.substring(i + 1);
                i =i-1;
            }
        }

        String str1 = a;
        int len1 = a.length();
        String str2 = b;
        int len2 = b.length();
        int result = 0;
        int index = 0;


        if(str1.length()==str2.length() || str2.length()>str1.length()){
            return str2.length();
        }else{
            return str1.length();
        }

        while (index < str2.length() || str2.length() != 0) {
            if (str1.length() == index) {
                return result+ str2.length()-str1.length();
            }
            if(str1.charAt(index) == str2.charAt(index)) {
                //index++;
            }
            else if (str1.length() > str2.length()) {
                if (index >= str2.length()) {
                    str1 = str1.substring(0, index) + str2.charAt(index) + str1.substring(index + 1);
                    result++;
                } else if (str1.charAt(index) != str2.charAt(index)) {
                    str1 = str1.substring(0, index) + str1.substring(index + 1);
                    len1--;
                    result++;
                } else {
                    str1 = str1.substring(0, index) + str1.substring(index + 1);
                    len1--;
                    str2 = str2.substring(0, index) + str2.substring(index + 1);
                    len2--;
                }
            } else if (str1.length() < str2.length()) {
                if (index >= str1.length()) {
                    str1 = str2.charAt(index) + str1;
                    result++;
                } else if (str1.charAt(index) != str2.charAt(index)) {
                    str1 = str2.charAt(index) + str1;
                    result++;
                } else {
                    str1 = str1.substring(0, index) + str1.substring(index + 1);
                    len1--;
                    str2 = str2.substring(0, index) + str2.substring(index + 1);
                    len2--;
                }
            } else {
                if (str1.charAt(index) != str2.charAt(index)) {
                    str1 = str1.substring(0, index) + str2.charAt(index) + str1.substring(index + 1);
                    str1 = str2.charAt(index) + str1;
                    result++;
                } else {
                    str1 = str1.substring(0, index) + str1.substring(index + 1);
                    len1--;
                    str2 = str2.substring(0, index) + str2.substring(index + 1);
                    len2--;
                }
            }
            index++;
        }
        return result;
    }


    if (str1.charAt(0) != str2.charAt(0)) {
        if (len1 > len2) {
            str1 = str1.substring(1);
            len1--;
            result++;
        } else if (len1 < len2) {
            str1 = str2.charAt(0) + str1;
            len1++;
            result++;
        } else {
            str1 = str1.substring(1);
            str1 = str2.charAt(0) + str1;
            result++;
        }
    } else {
        str1 = str1.substring(1);
        len1--;
        str2 = str2.substring(1);
        len2--;
    }*/

    public int maxProfit(final List<Integer> a) {
        if (a == null || a.size() == 0) return 0;
        int buy = a.get(0);
        int profit = 0;
        int currentProfit = 0;

        for (int i = 1; i < a.size(); i++) {
            if (a.get(i) < a.get(i - 1)) {
                profit = currentProfit + profit;
                currentProfit = 0;
                buy = a.get(i);
            } else if (a.get(i) > a.get(i - 1)) {
                currentProfit = a.get(i) - buy;
            }
        }
        return profit + currentProfit;
    }

    public int hasPathSum(TreeNode a, int b) {
        int result = 0;

        if (a.left == null && a.right == null) {
            if (b == a.val) {
                return 1;
            } else {
                return 0;
            }
        }

        if (a.left != null) {
            result = hasPathSum(a.left, b - a.val);
        }

        if (result == 1) {
            return 1;
        }

        if (a.right != null) {
            result = hasPathSum(a.right, b - a.val);
        }

        if (result == 1) {
            return 1;
        }

        return 0;
    }

    /*public int hasPathSum(TreeNode a, int b) {
        int result = 0;

        if (a.left == null && a.right==null) {
            if (b == a.val) {
                return 1;
            } else {
                return 0;
            }
        }

        if (a.left == null) {
            if (b == a.val) {
                return 1;
            } else {
                //return 0;
            }
        } else {
            result = hasPathSum(a.left, b - a.val);
        }

        if (result == 1) {
            return 1;
        }

        if (a.right == null) {
            if (b == a.val) {
                return 1;
            } else {
                //return 0;
            }
        } else {
            result = hasPathSum(a.right, b - a.val);
        }

        if (result == 1) {
            return 1;
        }

        return 0;
    }*/

    public ArrayList<Integer> inorderTraversal(TreeNode a) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, TreeNode> map = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(a);
        while (!stack.isEmpty()) {

            a = stack.pop();

            if ((a.left == null || map.containsKey(a.left.val)) && (a.right == null || map.containsKey(a.right.val))) {
                result.add(a.val);
                map.put(a.val, a);
            } else if ((a.left != null && !map.containsKey(a.left.val)) && (a.right != null && !map.containsKey(a.right.val))) {
                stack.push(a);
                stack.push(a.left);
            } else if ((a.right != null && !map.containsKey(a.right.val))) {
                result.add(a.val);
                map.put(a.val, a);
                stack.push(a.right);
            } else {
                stack.push(a);
                stack.push(a.left);
            }
        }

        return result;
    }

    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {

        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        if (B > A.size()) {
            return result;
        }

        int index = 0;
        for (Integer integer : A) {
            if (map.containsKey(integer)) {
                map.put(integer, map.get(integer) + 1);
            } else {
                map.put(integer, 1);
            }

            if (index >= B - 1) {
                result.add(map.size());
                if (map.get(A.get(index - (B - 1))) > 1) {
                    map.put(A.get(index - (B - 1)), map.get(A.get(index - (B - 1))) - 1);
                } else {
                    map.remove(A.get(index - (B - 1)));
                }
            }
            index++;
        }

        return result;
    }

    public ListNode mergeKLists(ArrayList<ListNode> a) {
        ListNode result = null;

        TreeMap<ListNode, Integer> map = new TreeMap<>(new ValueComparator());

        for (ListNode node : a) {
            while (node != null) {
                if (map.containsKey(node)) {
                    map.put(node, map.get(node) + 1);
                } else {
                    map.put(node, 1);
                }
                node = node.next;
            }
        }

        ListNode current = null;

        for (ListNode node : map.keySet()) {
            node.next = null;
            for (int i = 0; i < map.get(node); i++) {
                if (result == null) {
                    result = new ListNode(node.val);
                    current = result;
                } else {
                    current.next = new ListNode(node.val);
                    current = current.next;
                }
            }
        }
        current.next = null;
        return result;
    }

    /*public void Mymethod() {
        ListNode result = null;
        ListNode temp = new ListNode(10);
        int j = 0;
        for (int k = 0; k < 10; k++) {
            for (int i = 0; i < 2; i++) {
                if (j == 0) {
                    j++;
                    result = new ListNode(1);
                    result.next = temp;
                    continue;
                }
                temp = new ListNode(2);
            }
        }
    }*/


    private static <K, V> Map<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Object>() {
            @SuppressWarnings("unchecked")
            public int compare(Object o1, Object o2) {
                return ((Comparable<V>) ((Map.Entry<K, V>) (o1)).getValue()).compareTo(((Map.Entry<K, V>) (o2)).getValue());
            }
        });

        Map<K, V> result = new LinkedHashMap<>();
        for (Iterator<Map.Entry<K, V>> it = list.iterator(); it.hasNext(); ) {
            Map.Entry<K, V> entry = (Map.Entry<K, V>) it.next();
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }

    class ValueComparator implements Comparator<ListNode> {

        // Note: this comparator imposes orderings that are inconsistent with
        // equals.
        public int compare(ListNode a, ListNode b) {
            if (a.val < b.val) {
                return -1;
            } else if (a.val == b.val) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    /*public static <K, V extends Comparable<? super V>> Map<K, V>
    sortByValue(Map<K, V> map) {
        Map<K, V> result = new LinkedHashMap<>();
        Stream<Map.Entry<K, V>> st = map.entrySet().stream();

        st.sorted(Map.Entry.comparingByValue())
                .forEachOrdered(e -> result.put(e.getKey(), e.getValue()));

        return result;
    }*/


    public int countInversions(ArrayList<Integer> a) {
        int result = 0;
        ArrayList<Integer> sorted = new ArrayList<>();
        for (Integer integer : a) {
            sorted.add(integer);
        }
        Collections.sort(sorted);
        HashMap<Integer, Integer> map = new HashMap<>();
        int counter = 0;
        for (Integer integer : sorted) {
            if (!map.containsKey(integer)) {
                map.put(integer, counter);
            }
            counter++;
        }

        for (Integer integer : a) {
            map.get(integer);
        }

        return result;
    }

    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        int level = 1;

        result = createLevelOrder(a, level, result);

        boolean zigzag = false;
        for (int i = 0; i < result.size(); i++) {
            if (zigzag) {
                ArrayList<Integer> temp = result.get(i);
                ArrayList<Integer> tempOut = new ArrayList<>();
                for (int j = temp.size() - 1; j >= 0; j--) {
                    tempOut.add(temp.get(j));
                }
                result.remove(i);
                result.add(i, tempOut);
            }
            zigzag = !zigzag;
        }
        return result;
    }

    private ArrayList<ArrayList<Integer>> createLevelOrder(TreeNode a, int level, ArrayList<ArrayList<Integer>> result) {
        ArrayList<Integer> res = new ArrayList<>();
        if (result.size() > level - 1) {
            res = result.get(level - 1);
            result.remove(level - 1);
        }
        res.add(a.val);
        result.add(level - 1, res);

        if (a.left != null) {
            result = createLevelOrder(a.left, level + 1, result);
        }
        if (a.right != null) {
            result = createLevelOrder(a.right, level + 1, result);
        }
        return result;
    }


    public TreeNode flatten(TreeNode a) {
        if (a == null) {
            return null;
        }
        TreeNode result = new TreeNode(a.val);
        result.right = flatten(a.left);
        TreeNode temp = result.right;

        if (temp != null) {
            while (temp.right != null) {
                temp = temp.right;
            }
            temp.right = flatten(a.right);
        } else {
            result.right = flatten(a.right);
        }
        return result;
    }


    public int lca(TreeNode a, int val1, int val2) {

        HashMap<TreeNode, Integer> map1;
        HashMap<TreeNode, Integer> map2;

        if (a.val == val1 && a.val == val2) {
            return a.val;
        }

        int level = 1;
        map1 = findAncestors(a, val1, level);
        map2 = findAncestors(a, val2, level);

        int leastVal = 0;
        int leastlevel = 0;

        if (map1 == null || map2 == null) {
            return -1;
        } else {
            for (TreeNode node : map1.keySet()) {
                if (map2.containsKey(node) && map2.get(node) > leastlevel) {
                    leastlevel = map2.get(node);
                    leastVal = node.val;
                }
            }
        }
        return leastVal;

    }

    private HashMap<TreeNode, Integer> findAncestors(TreeNode a, int val, int level) {
        HashMap<TreeNode, Integer> map = new HashMap<>();

        if (a == null) {
            return null;
        }
        if (a.val == val) {
            map.put(a, level);
            return map;
        }
        map = findAncestors(a.left, val, level + 1);

        if (map == null) {
            map = findAncestors(a.right, val, level + 1);
        }

        if (map != null && map.size() > 0) {
            map.put(a, level);
        }

        return map;
    }

    /*public int lca(TreeNode a, int val1, int val2) {

        HashMap<TreeNode, Integer> map = new HashMap<>();

        TreeNode temp = a;

        while (temp != null) {
            map.put(temp, temp.val);
            if (val1 == temp.val) {
                break;
            } else if (val1 < temp.val) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }

        TreeNode leastCommon = null;

        while (a != null) {
            if (map.containsKey(a)) {
                leastCommon = a;
            } else {
                break;
            }
            if (val2 == a.val) {
                break;
            } else if (val2 < a.val) {
                a = a.left;
            } else {
                a = a.right;
            }
        }
        if(leastCommon!=null){
            return leastCommon.val;
        }else {
            return -1;
        }

    }*/


    public Trie root = new Trie();

    public ArrayList<String> prefix(ArrayList<String> a) {
        ArrayList<String> result = new ArrayList<>();
        LinkedHashMap<Character, Trie> children;

        for (String s : a) {
            children = root.children;
            for (int i = 0; i < s.length(); i++) {
                if (children.containsKey(s.charAt(i))) {
                    children = children.get(s.charAt(i)).children;
                } else {
                    Trie trie = new Trie(s.charAt(i));
                    children.put(s.charAt(i), trie);
                    children = trie.children;
                }
            }
        }

        /*result = getUniquePrefix(root);*/
        for (String s : a) {
            result.add(getUniquePrefixSeq(root, s));
        }

        return result;
    }

    private String getUniquePrefixSeq(Trie root, String a) {

        String res = new String();
        String temp = new String();
        LinkedHashMap<Character, Trie> children;
        Trie trie;
        boolean flag = true;

        for (int i = 0; i < a.length(); i++) {
            if (flag) temp = res.concat(String.valueOf(a.charAt(i)));
            trie = root.children.get(a.charAt(i));
            if (trie.children != null) {
                if (trie.children.size() > 1) {
                    flag = true;
                } else {
                    flag = false;
                }
                res = res.concat(String.valueOf(a.charAt(i)));
                root = trie;
            } else {
                res = res.concat(String.valueOf(a.charAt(i)));
                break;
            }
        }

        return temp;
    }

    private ArrayList<String> getUniquePrefix(Trie trie) {
        ArrayList<String> res = new ArrayList<>();
        Character c = trie.c;
        ArrayList<String> temp;

        if (trie.children.size() > 1) {
            for (Character character : trie.children.keySet()) {
                temp = getUniquePrefix(trie.children.get(character));
                for (String s : temp) {
                    res.add(c + s);
                }
            }
        }
        if (res.size() == 0 && c != ' ') {
            res.add(String.valueOf(c));
        }

        return res;
    }


    public int isSameTree(TreeNode a, TreeNode b) {
        {
            int leftTrue = 0;
            int rightTrue = 0;
            if (a != null && b != null) {
                if (a.val == b.val) {
                    leftTrue = isSameTree(a.left, b.left);
                    rightTrue = isSameTree(a.right, b.right);
                } else {
                    return 0;
                }

            } else if (a == null && b != null) {
                return 0;
            } else if (b == null && a != null) {
                return 0;
            } else {
                return 1;
            }

            if ((leftTrue == 0) || (rightTrue == 0)) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public boolean identicalTrees(TreeNode root, TreeNode root1) {
        boolean leftTrue = false;
        boolean rightTrue = false;
        if (root != null && root1 != null) {
            if (root.val == root1.val) {
                leftTrue = identicalTrees(root.left, root1.left);
                rightTrue = identicalTrees(root.right, root1.right);
            } else {
                return false;
            }

        } else if (root == null && root1 != null) {
            return false;
        } else if (root1 == null && root != null) {
            return false;
        } else {
            return true;
        }

        if (!leftTrue || !rightTrue) {
            return false;
        } else {
            return true;
        }
    }


    public TreeNode buildTree(List<Integer> preorder, List<Integer> inorder) {

        /*if (inorder.size() == 0 || preorder.size() == 0) {
            return null;
        }*/

        TreeNode root = new TreeNode(preorder.get(0));

        int a = inorder.indexOf(preorder.get(0));
        preorder.remove(0);

        if (inorder.size() == 1) {
            return root;
        }

        if (a > 0) {
            root.left = buildTree(preorder, inorder.subList(0, a));
        }

        if (inorder.size() > (a + 1)) {
            root.right = buildTree(preorder, inorder.subList(a + 1, inorder.size()));
        }

        return root;
    }

    public static List<Integer> createList(int[] array) {
        List<Integer> list = new ArrayList<Integer>(array.length);
        for (int i = 0; i < array.length; ++i) {
            list.add(array[i]);
        }
        return list;
    }

    public int kthsmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        int counter = 1;

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            if (!stack.isEmpty()) {
                TreeNode p = stack.pop();
                if (counter == k) {
                    return p.val;
                }
                counter++;
                root = p.right;
            }
        }
        return 0;
    }


    /*public int findKthSmallest(TreeNode root, int k){
        Integer counter = new Integer(1);
        return findKthSmallestRec(root,counter, k).val;
    }

    private TreeNode findKthSmallestRec(TreeNode root, Integer counter, int k) {
        TreeNode result;
        if(root==null){
            return null;
        }

        if(root.left!=null){
            if(counter==k){
                return root.left;
            }
            result = findKthSmallestRec(root.left,counter, k);
            if (result!=null){
                return result;
            }
            counter++;
        }

        if(counter==k){
            return root;
        }
        counter++;

        if(root.right!=null){
            if(counter==k){
                return root.right;
            }
            result = findKthSmallestRec(root.right,counter,k);
            if (result!=null){
                return result;
            }
            counter++;
        }
        return null;
    }*/

    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }
        TreeNode left, right;

        if (root.left == null && root.right == null) {
            return root;
        } else {
            left = invertTree(root.left);
            right = invertTree(root.right);
            root.left = right;
            root.right = left;
        }

        return root;
    }


    public int isBalanced(TreeNode a) {
        boolean result = true;

        int isLeftBalanced = 1;
        int isRightBalanced = 1;

        int leftheight = 0;
        int rightheight = 0;

        if (a.left != null) {
            isLeftBalanced = isBalanced(a.left);
            leftheight = getHeightOfTree(a.left);
        }
        if (a.right != null) {
            isRightBalanced = isBalanced(a.right);
            rightheight = getHeightOfTree(a.right);
        }

        if ((isLeftBalanced == 1) && (isRightBalanced == 1) && (Math.abs(leftheight - rightheight) <= 1)) {
            return 1;
        } else {
            return 0;
        }
    }

    private int getHeightOfTree(TreeNode a) {
        int leftheight = 1;
        int rightheight = 1;
        if (a.left != null) {
            leftheight = getHeightOfTree(a.left);
            leftheight++;
        }
        if (a.right != null) {
            rightheight = getHeightOfTree(a.right);
            rightheight++;
        }
        return Math.max(leftheight, rightheight);

    }


    private void print(TreeNode root) {
        int counter = 1;
        System.out.print(root.val);
        printRecursive(root, true, counter);
        System.out.print(root.val);
        printRecursive(root, false, counter);
    }

    private void printRecursive(TreeNode root, boolean bool, int counter) {
        TreeNode print = root;
        if (bool) {
            for (int i = 0; i < counter; i++) {
                print = print.left;
            }
            System.out.print(" " + print.val);
            if (print.left != null) {
                counter++;
                printRecursive(root, !bool, counter);
            } else {
                System.out.println();
            }

        } else {
            for (int i = 0; i < counter; i++) {
                print = print.right;
            }
            System.out.print(" " + print.val);
            if (print.right != null) {
                counter++;
                printRecursive(root, !bool, counter);
            } else {
                System.out.println();
            }
        }
    }

}
