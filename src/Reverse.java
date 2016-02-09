
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,5,8,34,78,23,56};
		
	
		
		//metReverse r = new metReverse();
		int[] r1 = metReverse.getReverse(arr);
		metReverse.getDisplay(r1);
	}

}

class metReverse{
	
	   public static void getDisplay(int[] input){
		   for(int i=0; i < input.length; i++){
			   System.out.println(input[i]);
		   }
		   
	   }
	   
	   public static int[] getReverse(int[] input){
		   int[] reverse = new int[input.length];
		   for(int i=0,j = reverse.length-1;i < input.length; i++,j--){ 
			   reverse[j] = input[i];   
		   }
		   
		   return reverse;
	   }
}

