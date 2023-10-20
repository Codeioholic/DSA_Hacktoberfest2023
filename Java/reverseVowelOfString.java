/*
345. Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:

Input: s = "hello"
Output: "holle"
*/

class Solution {
    public String reverseVowels(String s) {
        char [] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;

        while(left < right) {
            if(isVowel(arr[left]) && isVowel(arr[right])) {
                swap(arr,left,right);
                left++;
                right--;
            }
            if(!isVowel(arr[left])){
                left++;
            }
            if(!isVowel(arr[right])) {
                right--;
            }
        }
        return new String(arr);
    }

    private boolean isVowel(char letter) {
        char a = Character.toLowerCase(letter);
        return a == 'a' || a=='e' || a=='i' || a=='o' || a=='u';
    }

    private void swap(char [] arr, int i, int j) {
        char temp;
        temp=arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
