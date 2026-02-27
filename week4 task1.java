class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() /2;
        int count1=0,count2=0;

        for(int i=0;i<mid;i++){
            if(isVowel(s.charAt(i))) count1++;
            if(isVowel(s.charAt(i+mid))) count2++;
        }
        return count1==count2;
    }
    boolean isVowel(char c){
        c=Character.toLowerCase(c);
        return c=='a' || c=='e'|| c=='i' || c=='o' || c=='u';
            }
}