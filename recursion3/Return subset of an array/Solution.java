public class solution {

	// Return a 2D array that contains all the subsets
	public static int[][] subsets(int input[]) {
		// Write your code here
        return subsets(input, 0);
	}
    public static int[][] subsets(int input[], int start)
    {
        int len=input.length;
        if(start>len-1)
        {
            int output[][]=new int[1][0];//0th row point to null
            return output;
        }
        int small[][] = subsets(input, start+1);
        int output[][]=new int[2*small.length][];
        for(int i=0;i<small.length;i++)
        {
            output[i]=new int[small[i].length];//ith row will be small[i].length size 
            for(int j=0;j<output[i].length;j++)
            {  // copy previous content 
                output[i][j]=small[i][j];
            }
        }
        for(int i=small.length;i<2*small.length;i++)
        {
            output[i]=new int[small[i-small.length].length+1];
            output[i][0]=input[start];
            for(int j=1;j<=small[i-small.length].length;j++)
            {
                output[i][j]=small[i-small.length][j-1];
            }
        }
        return output;
    }
}
