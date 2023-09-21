class Solution {
     List<String> list=new ArrayList<>();
     String keypad[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
        return list;
        String ans="";
        Findallcombinations(digits,ans);
        return list;
    }

   void Findallcombinations(String digits,String ans){
      if(digits.length()==0)
      {
          list.add(ans);
          return;
      }

     String key=keypad[digits.charAt(0)-48];
     for(int i=0;i<key.length();i++){
      Findallcombinations(digits.substring(1),ans+key.charAt(i));
     }

    }
}