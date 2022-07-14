public class solution {

	public static void permutations(String input){
		permutationsHelper(input,"");

	}
    public static void permutationsHelper(String input,String ans){
        if(input.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=input.charAt(0);
        for(int i=0;i<=ans.length();i++){
            String f=ans.substring(0,i);
            String s=ans.substring(i,ans.length());
            permutationsHelper(input.substring(1),f+ch+s);
            
        }
    }
}
