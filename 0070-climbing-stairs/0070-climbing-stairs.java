class Solution {
    int c=0;
    public int climbStairs(int n) {
     if(n<=3)
     return n;

     int n1=2;
     int n2=3;
     for(int i=4;i<=n;i++){
        c=n1+n2;
        n1=n2;
        n2=c; 
     }
     return c;

     }
}