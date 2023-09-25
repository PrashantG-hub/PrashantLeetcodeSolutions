class Solution {
    public int[] twoSum(int[] nums, int target){
     // for(i=0;i<nums.length-1;i++){
    //     for(j=i+1;j<nums.length;j++){
    //     sum=nums[i]+nums[j];
      
    //   if(sum==target){
    //     ans[0] = i;
    //     ans[1] = j;
    //     k=1;
    //     }

         
    //     }
    //     if(k==1)
    //    break;
     
    //    }

    // 2 7 11 15

//     int i=0,j=nums.length-1;
//    int a[]=new int[2];
//     while(i<j){
//      int sum=nums[i]+nums[j];
//         if(sum==target){
//          a[0]=i;
//          a[1]=j;
//          break;
//         }
//         else if((sum != target) && i!=j-1)
//         j--;
//         else{
//          i++;
//          j=nums.length-1;
//         }
        
//     }
//     return a;

int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }
    }
