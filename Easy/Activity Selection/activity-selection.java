//{ Driver Code Starts
import java.io.*; 
import java.util.*; 
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException  
    {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//testcases
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-- > 0)
		{
		    String inputLine[] = br.readLine().trim().split(" ");
		    //size of array
		    int n = Integer.parseInt(inputLine[0]);
		    int start[] = new int[n];
		    int end[] = new int[n];
		    
		    //adding elements to arrays start and end
		    inputLine = br.readLine().trim().split(" ");
		    for(int i = 0; i < n; i++)
		     start[i] = Integer.parseInt(inputLine[i]);
		    
		    inputLine = br.readLine().trim().split(" ");
		    for(int i= 0; i < n; i++)
		      end[i] = Integer.parseInt(inputLine[i]);
		    
		    //function call
		    System.out.println(new Solution().activitySelection(start, end, n));
		}
    }
}


// } Driver Code Ends

class Solution
{
    static class Activity{
        int startTime;
        int endTime;
        Activity(int startTime,int endTime){
        this.startTime=startTime;
        this.endTime=endTime; 
        }
    }

    public static int activitySelection(int start[], int end[], int n)
    {
        int c=1;
        // add your code here
        PriorityQueue<Activity> pq = new PriorityQueue<>(
        (a,b)-> {return a.endTime-b.endTime ;} 
        );
        
        for(int i=0;i<n;i++){
            pq.add(new Activity(start[i],end[i]));
        }
        
      Activity prev=pq.poll();
      
      while(!pq.isEmpty()){
          Activity curr=pq.poll();
          if(curr.startTime > prev.endTime){
              c++;
              prev=curr;
          }
      }
        return c;
    }
}
