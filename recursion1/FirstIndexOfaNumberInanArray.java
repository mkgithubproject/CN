/*First Index Of a Number in an Array - Question
Send Feedback
Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
first index or -1
Constraints :
1 <= N <= 10^3
Sample Input :
4
9 8 10 8
8
Sample Output :
1 */
//m-1
public class FirstIndexOfaNumberInanArray {

	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        if(input.length==0){
            return -1;
        }
        if(input[0]==x){
            return 0;
        }
        int smallarray[]=new int[input.length-1];
        for(int i=1;i<input.length;i++){
            smallarray[i-1]=input[i];
        }
        int ans=firstIndex(smallarray,x);
        if(ans==-1){
            return -1;
        }else{
            return ans+1;
        }
		
	}
	
}

//m-2

public class FirstIndexOfaNumberInanArray {

    public static int firstIndex(int input[], int x, int startIndex) {

        if(startIndex == input.length) {

        }

        if(input[startIndex] == x) {

            return startIndex;

        }


    }

    

    public static int firstIndex(int input[], int x) {

        return firstIndex(input, x, 0);

    }

}
