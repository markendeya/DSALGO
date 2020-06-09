
public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {3,5,2,1,8,6};
		bubbleSort(arr);

	}
private static void bubbleSort(int[] arr) {
	int n=arr.length;
	for(int i=n-1;i>=0;i--) {
		for(int j=0;j<i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
