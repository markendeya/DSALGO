
public class SelectionSort {

	public static void main(String[] args) {
	 
		int arr[]= {2,5,3,1,0};
		selectionSort(arr);
		

	}
	private static void selectionSort(int[] arr) {
		int n=arr.length;
	for(int i=0;i<n;i++) {
	  int min=i;
	  for(int j=i+1;j<n;j++) {
		  if(arr[min]>arr[j]) {
			  min=j;
		  }
	  }
	  int temp=arr[min];
	  arr[min]=arr[i];
	  arr[i]=temp;
	  for(int k=0;k<n;k++) {
	//  System.out.print(arr[k]+" ");
	  }
	//  System.out.println();
	}
	 for(int k=0;k<n;k++) {
			  System.out.print(arr[k]+" ");
			  }	
	}

}
