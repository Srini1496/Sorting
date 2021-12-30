public class heap {
	static int size=0;
	public static int left(int pos) {
		return 2*pos+1;
	}
	public static int right(int pos) {
		return 2*pos+2;
	}
	public static void swap(int[] arr,int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static void maxHeapify(int[] arr,int pos) {		
		int l =left(pos);
		int r=right(pos);
		int largest=0;
		if(l<=size-1 && arr[l]>arr[pos]) {
			largest=l;			
		}else{
			largest=pos;
		}
		if(r<=size-1 && arr[r]>arr[largest]) {
			largest=r;		
		}
		if(largest!=pos) {
			swap(arr,pos,largest);
			maxHeapify(arr,largest);
		}
			
	}	
	public static void creatHeap(int[] arr) {
		int len=arr.length;
		
		  for(int i=(len/2)-1;i>=0;i--) { 
			  maxHeapify(arr,i); 
			  }
		 
		
	}
	public static void heapSort(int[] arr) {
		if(size!=1) {
			swap(arr,0,size-1);		
			size--;
			maxHeapify(arr,0);
			heapSort(arr);
		}
		
	}
	
	
	public static void main(String[] args) {
		int[] arr= {3,2,1,4,5,6,9};
		size=arr.length;
		//Print Input Array
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		
		//Creat head DS
		creatHeap(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		
		//Sort Max heap to get array in descending order
		heapSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
