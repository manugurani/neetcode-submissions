class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length==0){
            return false;
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int k  : nums){
            map.put(k,map.getOrDefault(k,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                return true;
            }
        }

        return false;
        
    }
}