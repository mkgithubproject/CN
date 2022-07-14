public class solution {
	public static void printSubsets(int input[]) {
        int ans[]=new int[0];
       int  index=0;
		printSubsetsHelper(input,ans,index);

	}
    public static void printSubsetsHelper(int input[],int ans[],int index){
        if(index==input.length){
            for(int i=0;i<ans.length;i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
            //return;
        }
        int newAns[]=new int[ans.length+1];
        int i;
        for( i=0;i<ans.length;i++){
            newAns[i]=ans[i];
        }
        newAns[i]=input[index];
        printSubsetsHelper(input,newAns,index+1);
       printSubsetsHelper(input,ans,index+1);
    }
}
