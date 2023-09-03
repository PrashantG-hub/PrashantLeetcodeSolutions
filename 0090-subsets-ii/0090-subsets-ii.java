class Solution {
    Set<List<Integer>> hash=new HashSet<>();
  public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums);
        IsSubset(0,nums, new ArrayList<>());
        List<List<Integer>> result= new ArrayList<>(hash);

        return result;    
    }
    public void IsSubset(int i,int[] nums,List<Integer> current){
        if (i==nums.length){
            hash.add(new ArrayList<>(current));
            return;
        }
        //IsSubset(i+1,s,nums,current);
        current.add(nums[i]);
        IsSubset(i+1,nums,current);
        current.remove(current.size()-1);
        IsSubset(i+1,nums,current);   
    }
}