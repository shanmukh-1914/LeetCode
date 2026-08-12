class Solution {
    public String reverseWords(String s) {
        char[] a = s.toCharArray();
        int start=0;
        for(int i=0;i<=a.length;i++){
            if(i==a.length || a[i]==' '){
                int left=start;
                int right=i-1;
                while(left<right){
                    char temp=a[left];
                    a[left]=a[right];
                    a[right]=temp;
                    left++;
                    right--;
                }
                start=i+1;
            }
        }
        return new String(a);
    }
}