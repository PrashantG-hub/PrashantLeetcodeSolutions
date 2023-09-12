class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int idx=0,sumG=0,sumC=0,total=0;
        for(int i=0;i<gas.length;i++){
            sumG+=gas[i];
            sumC+=cost[i];
        }
        if(sumG<sumC)
        return -1;

        for(int i=0;i<gas.length;i++){
            total+=gas[i]-cost[i];

            if(total<0){
                idx=i+1;
                total=0;
            }
        }
        return idx;
    }
}