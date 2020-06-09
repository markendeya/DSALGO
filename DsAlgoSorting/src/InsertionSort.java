
public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,0};
       insertionSort(arr);
	}

	private static void insertionSort(int[] arr) {
		int j,v;
		for(int i=1;i<arr.length;i++) {
			j=i;
			v=arr[i];
			while(j>=1 && arr[j-1]>v) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=v;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
