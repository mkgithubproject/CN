//m-1
public class CheckNumberInArray {
	
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		if(input.length==0){
            return false;
        }
        if(input[0]==x){
            return true;
        }
        int smallarray[]=new int[input.length-1];
        for(int i=1;i<input.length;i++){
            smallarray[i-1]=input[i];
        }
        boolean result=checkNumber(smallarray,x);
        return result;
	}
}
//m-2
public class CheckNumberInArray {

    

    public static boolean checkNumber(int input[], int x, int startIndex) {

        if(startIndex == input.length) {

            return false;

        }

        if(input[startIndex] == x) {

            return true;

        }

        return checkNumber(input, x, startIndex + 1);

    }

    

    public static boolean checkNumber(int input[], int x) {
        return checkNumber(input, x, 0);

    }

}
