class Solution {
    public int strStr(String haystack, String needle) {
        int ans=0;
        if(haystack.length()>=needle.length()){
            for(int i=0;i<haystack.length()-needle.length()+1;i++){
                if(haystack.substring(i,i+needle.length()).equals(needle)){
                    ans=i;
                    break;
                }
                else{
                    ans=-1;
                }
            }
            return ans;
        }
        return -1;
    }
}