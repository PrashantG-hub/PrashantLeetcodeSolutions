class Solution {
    public int[] sortArray(int[] arr) {
        mergeSort(arr,0,arr.length-1);
        return arr;
    }

    private static void mergeSort(int[] arr,int left,int right){
        if(left<right){
            int middle=left+(right-left)/2;
            mergeSort(arr,left,middle);
            mergeSort(arr,middle+1,right);

            merge(arr,left,middle,right);
        }
    }

   private static void merge(int[] arr, int left, int middle, int right){
        int n1=middle+1-left;
        int n2=right-middle;

        int[] leftarray=new int[n1];
        int[] rightarray=new int[n2];

        System.arraycopy(arr,left,leftarray,0,n1);
        System.arraycopy(arr,middle+1,rightarray,0,n2);

        int i=0,j=0;
        int k=left;

        while(i<n1 && j<n2){
            if(leftarray[i]<=rightarray[j]){
                arr[k]=leftarray[i];
                i++;
            }
            else{
                arr[k]=rightarray[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=leftarray[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k]=rightarray[j];
            j++;
            k++;
        }
    }
}