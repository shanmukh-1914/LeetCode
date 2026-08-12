class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> m = new HashMap<>();
        Map<Character,Character> m1=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(m.containsKey(a) && m.get(a)!=b){
                return false;
            }
            if(m1.containsKey(b) && m1.get(b)!=a){
                return false;
            }
            m.put(a,b);
            m1.put(b,a);
        }
        return true;
    }
}