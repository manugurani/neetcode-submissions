class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        // int[] hashArrayS=new int[26];
        // int[] hashArrayt=new int[26];
        // for(int i=0;i<s.length();i++){
        //     int indexs=s.charAt(i)-'a';
        //     int indext=t.charAt(i)-'a';
        //     hashArrayS[indexs]= hashArrayS[indexs]+1;
        //     hashArrayt[indext]= hashArrayt[indext]+1;
        // }
        //   for(int i=0;i<s.length();i++){
        //     int indexs=s.charAt(i)-'a';
        //     if(hashArrayS[indexs]!=hashArrayt[indexs]){
        //         return false;
        //     }
        // }

        // return true;
        Map<Character,Integer> mapS= new HashMap<>();
         for(int i=0;i<s.length();i++){
            mapS.put(s.charAt(i),mapS.getOrDefault(s.charAt(i),0)+1);
        }
        Map<Character,Integer> mapT= new HashMap<>();
         for(int i=0;i<t.length();i++){
            mapT.put(t.charAt(i),mapT.getOrDefault(t.charAt(i),0)+1);
        }
    

        return mapS.equals(mapT);

    }
}
