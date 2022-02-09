public class Solution {
    public static void quicksort(int[] arr, int si, int ei) {
			// your code goes here
           if(si>=ei){
               return;
           }
          int pivotIndex=partition(arr,si,ei);
          quicksort(arr,si,pivotIndex-1);
          quicksort(arr,pivotIndex+1,ei);
        
		}
    public static int partition(int arr[], int si,int ei ){
        int count_pivot_poistion=0;
        for(int i=si+1;i<=ei;i++){
            if(arr[si]>arr[i]){
                count_pivot_poistion++;
            }
        }
        int temp=arr[si];
        arr[si]=arr[si+count_pivot_poistion];
        arr[si+count_pivot_poistion]=temp;
        int i=si,j=ei;
        while(i<j){
            if(arr[i]<arr[si+count_pivot_poistion]){
                i++;
            }else if(arr[j]>=arr[si+count_pivot_poistion]){
                j--;
            }else{
                temp=arr[i]; 
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return si+count_pivot_poistion;
    }
	
	public static void quickSort(int[] input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		quicksort(input, 0, input.length - 1);
	}
	
}
