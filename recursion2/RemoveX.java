
public class RemoveX {

	// Return the changed string
	public static String removeX(String input){
		////method -1 here first big problem divide in two part and i have done my work at last first recursive is done;
        //   if(input.length()==0){
        //       return "";
        //   }
        //   String smalloutput=removeX(input.substring(1));
        // if(input.charAt(0)=='x'){
        //     return smalloutput;
        // }else{
        //     return input.charAt(0)+smalloutput;
        // }
        
        //method -2 here first big problem divide in two part and i have done my work first then recursive;
         if(input.length()==0){
              return "";
          }
         if(input.charAt(0)=='x'){
             return removeX(input.substring(1));
         }else{
             return input.charAt(0)+removeX(input.substring(1));
         }
        
        
	}
}
