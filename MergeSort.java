public class mergeSort {

	public static void mergeSortAlgo(int[] arr,int start,int end) {
		
		if(start<end) {		
			int mid=start +(end-start)/2;
			mergeSortAlgo(arr,start,mid);
			mergeSortAlgo(arr,mid+1,end);
			helper(arr,start,mid,end);
		}
	}
	public static void helper(int[] arr,int p,int q,int r) {
		int n1=q-p+1;
		int n2=r-q;
		int[] left=new int[n1+1];
		int[] right=new int[n2+1];
		for(int i=0;i<n1;i++) {
			left[i]=arr[p+i];
		}
		for(int j=0;j<n2;j++) {
			right[j]=arr[q+j+1];
		}
		left[n1]=Integer.MAX_VALUE;
		right[n2]=Integer.MAX_VALUE;
		int i=0,j=0;
		for(int k=p;k<=r;k++) {
			if(left[i]<=right[j]) {
				arr[k]=left[i];
				i++;
			}else {
				arr[k]=right[j];
				j++;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {5,7,1,2,3,6,4};
		mergeSortAlgo(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}
