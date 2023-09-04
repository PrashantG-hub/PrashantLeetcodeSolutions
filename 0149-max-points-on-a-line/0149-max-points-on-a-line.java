class Solution {
    public int maxPoints(int[][] points) {
        double slope;
        int max=2;
        if(points.length==1)
        return 1;

        for(int i=0;i<points.length;i++){
            HashMap<Double,Integer> hm=new HashMap<>();
            for(int j=0;j<points.length;j++){
                if(i!=j){
                   slope=Math.atan2((points[j][1]-points[i][1]),(points[j][0]-points[i][0]));

            hm.put(slope,hm.getOrDefault(slope,1)+1);
            //max=Math.max(max,hm.get(slope));       
                }
                }
                for(int val:hm.values())
                max=Math.max(max,val);
        }
        return max;
    }
}