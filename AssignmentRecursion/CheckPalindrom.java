
public class CheckPalindrom {

	public static boolean isStringPalindrome(String input) {
		// Write your code here
       if(input.length()==1 || input.length()==0){
           return true;
       }
        if(input.charAt(0)!=input.charAt(input.length()-1)){
            return false;
        }else{
           boolean ans= isStringPalindrome(input.substring(1,input.length()-1));
            return ans;
        }
	}
}
