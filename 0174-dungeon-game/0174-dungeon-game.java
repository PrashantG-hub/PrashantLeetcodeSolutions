class Solution {
    int m,n,health=Integer.MAX_VALUE;
    public int calculateMinimumHP(int[][] dungeon) {
        m=dungeon.length;
        n=dungeon[0].length;
        if(m==0 || n==0)
        return 0;

        HashMap<String,Integer> hm=new HashMap<>();

        return calculateMinimumHPHelper(dungeon,0,0,hm);
    }
    int calculateMinimumHPHelper(int[][] dungeon,int i,int j,HashMap<String,Integer> hm){
   
     if(i>=m || j>=n)
     return Integer.MAX_VALUE;
     
     String key=i+"x"+j;
     if(hm.containsKey(key))
     return hm.get(key);
     health=Math.min(calculateMinimumHPHelper(dungeon,i+1,j,hm),calculateMinimumHPHelper(dungeon,i,j+1,hm));

     if(health==Integer.MAX_VALUE)
     health=1;
     
     int res=0;
     res=Math.max(health-dungeon[i][j],1);
     hm.put(key,res);
     
return res;
    }
}