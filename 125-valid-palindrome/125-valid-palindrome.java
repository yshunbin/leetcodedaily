class Solution {
    public boolean isPalindrome(String s) {
        for (int i=0, j=s.length()-1; i<j; i++, j--) {
            while (i<j && !Character.isLetterOrDigit(s.charAt(i))) { //if it's space
                i++;
            }
            while (i<j && !Character.isLetterOrDigit(s.charAt(j))) { //if it's space
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}
//two pointers: time - O(n), space - O(1)