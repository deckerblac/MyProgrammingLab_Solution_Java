
public class BubbleSort {

	public static void main(String[] args) {
	 int[] arr = {1,56,3,67,89,4,2,5,7,13,10,20,34};
       System.out.println(arr.length);
       display(bubbleSort(arr));
       
	}

	public static void display(int[] input){
		for (int i : input) {
			System.out.print(i+" ");
		}
	}
	public static int[] bubbleSort(int[] list){
		/*i is going to be the out loop and j is going to be the inner loop. Temp is going 
	     *hold the value of j so that it can be swapped.
	     */
		int i,j,temp =0; 
		for ( i = 0; i < list.length - 1; i++) {
		     for (j = i; j < list.length - 1 ; j++) {
				if(list[j] >list[j + 1 ]){
					temp = list[j];
				    list[j] = list[j + 1];
				    list[j + 1] = temp;
				}
			}
		}
		
		return list;
	}
}

/*int i, j, temp = 0;
for (i = 0; i < list.length - 1; i++) {
	for (j = 0; j < list.length - 1 - i; j++) {
		if (list[j] > list[j + 1]) {
			temp = list[j];
			list[j] = list[j + 1];
			list[j + 1] = temp;
		}
	}
}
return list;*/
