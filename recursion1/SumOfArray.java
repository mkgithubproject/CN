// m-1
public class SumOfArray {

	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        if(input.length==0){
            return 0;
        }
        int smallarray[]=new int[input.length-1];
        for(int i=1;i<input.length;i++){
            smallarray[i-1]=input[i];
        }
        int sum=sum(smallarray);
        return input[0]+sum;
		
	}
}
 //m-2

public class Solution {

    public static int sum(int input[], int startIndex) {
       if(startIndex == input.length) {

            return 0;

        }

        return input[startIndex] + sum(input, startIndex + 1);

    }

    

    public static int sum(int input[]) {

        return sum(input, 0);

    }

}
