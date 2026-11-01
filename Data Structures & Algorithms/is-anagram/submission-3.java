class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] hashArrayS=new int[26];
        int[] hashArrayt=new int[26];
        for(int i=0;i<s.length();i++){
            int indexs=s.charAt(i)-'a';
            int indext=t.charAt(i)-'a';
            hashArrayS[indexs]= hashArrayS[indexs]+1;
            hashArrayt[indext]= hashArrayt[indext]+1;
        }
          for(int i=0;i<s.length();i++){
            int indexs=s.charAt(i)-'a';
            if(hashArrayS[indexs]!=hashArrayt[indexs]){
                return false;
            }
        }

        return true;


    }
}
