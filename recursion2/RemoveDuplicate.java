/* Remove Duplicates Recursively
Send Feedback
Given a string S, remove consecutive duplicates from it recursively.
Input Format :
String S
Output Format :
Output string */
public class RemoveDuplicate {

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
        //xxxyyyzwwzzz->xyzwz
           if(s.length()==0 || s.length()==1){
               return s;
           }
        String smalloutput=removeConsecutiveDuplicates(s.substring(1));
        if(s.charAt(0)==smalloutput.charAt(0)){
            return smalloutput;
        }else{
            return s.charAt(0)+smalloutput;
        }
	}

}
