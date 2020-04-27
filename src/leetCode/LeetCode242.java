package leetCode;

/**
 * ================================================
 * Author：feiyi_xi
 * E-mail：	xifeiyi.dev@gmail.com
 * version：1.0
 * ClassName：LeetCode242
 * Create date： 2020/4/19 13:52
 * Description：TODO
 * Update history：
 * ================================================
 */

/**
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 */

import java.util.HashMap;

public class LeetCode242 {

    /**
     * 利用map去存相应的信息。
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram(String s, String t) {
        if (s.equals(t)) {
            return true;
        }

        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        HashMap<Character,Integer> hm_s = new HashMap<>();
        HashMap<Character,Integer> hm_t = new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            if (hm_s.containsKey(s.charAt(i)))
                hm_s.put(s.charAt(i),hm_s.get(s.charAt(i))+1);
            else
                hm_s.put(s.charAt(i),1);
        }

        for (int i = 0; i <t.length() ; i++) {
            if (hm_t.containsKey(t.charAt(i)))
                hm_t.put(t.charAt(i),hm_t.get(t.charAt(i))+1);
            else
                hm_t.put(t.charAt(i),1);
        }
        for (Character key : hm_s.keySet()){
            if (!hm_t.containsKey(key)||!hm_t.get(key).equals(hm_s.get(key)))
                return false;
        }
        return true;
    }


    public static boolean isAnagram_2(String s, String t){
        int []arr = new int[26];
        for(char ch:s.toCharArray())
            arr[ch-'a']++;

        for(char ch:t.toCharArray())
            arr[ch-'a']--;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
                return false;
        }
        return true;
    }


    public static boolean isAnagram_3(String s, String t){
        if (s.equals(t)) {
            return true;
        }

        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        int[] arr= new int[26];
        for (int i = 0; i <s.length() ; i++) {
            arr[s.charAt(i)-'a']++;
        }
        for (int i = 0; i <t.length() ; i++) {
            arr[t.charAt(i)-'a']--;
        }
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]!=0)
                return false;
        }
        return true;
    }


    public static void main(String[] args){
        System.out.print(isAnagram_2("ratt","tarr"));

    }
}
