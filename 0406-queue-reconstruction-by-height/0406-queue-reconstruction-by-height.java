class Solution {
    public int[][] reconstructQueue(int[][] people) {
        
        List<int[]> result =new ArrayList<>();
        Arrays.sort(people, (a,b) ->(a[0]==b[0]? a[1]-b[1] :b[0]-a[0]));  
        //a[1]-b[1];//sort in accesding order according to 2nd column
        //b[0]-a[0];//sort in descending order according to 1st column

        for( int[] x : people)
        {
            result.add(x[1],x);
        }
        return result.toArray(new int[people.length][2]);
    }
}