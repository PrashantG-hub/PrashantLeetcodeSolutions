class Solution {
    public boolean isPalindrome(int x) {
        int s=0,d,u=0;
        u=x;
        while(x>0){                // 1 2 3 2 1
                                   
         d=x%10;               // 2
         s=s*10+d;           // 12
         x=x/10;   // 1232
        }

        if(s==u)
        return true;
        return false;
       }
    }


//0x10+1=1, 1x10+2=12), 12x10+3=123
  //   123x10+2=1232, 1232x10+1=12321