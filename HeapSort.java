package Project;
import java.util.Arrays;

public class HeapSort {
	public static int size;
	public static void heapSort(short A[]){
	    buildHeap(A);//heap is built
	    for(int i=A.length-1;i>=0;i--){ //starting from end heap to beginning
	        //swap maxHeap value and reorder
	        short temp = A[0];
	        A[0]=A[i];
	        A[i]=temp;        
	        size  = size-1;
	        maxHeap(A,0);//call maxHeap on the smaller heap
	    }
	}
	public static void buildHeap(short A[]){
	    size = A.length;
	    for(int i=A.length/2; i>=0;i--)//since n/2 is a leaf
	    {
	        maxHeap(A, i);//call maxHeap of n/2
	    }
	}
	public static void maxHeap(short A[],int i){
	    int l=left(i);
	    int r=right(i);
	    int largestElementIndex = -1;//index can't be negative 
	    if(l<size && A[l]>A[i]){//if element at left index is greater then max heap property is violated
	        largestElementIndex = l;
	    }
	    else{ //if max heap property is not violated copy the root's index in largestElementIndex
	    
	        largestElementIndex=i;
	    }
	    if(r<size && A[r]>A[largestElementIndex]){//check to see the right sub tree for max heap property violation
		    largestElementIndex = r;
	    }
	   if(largestElementIndex!=i){//swap
	        short temp = A[i];
	        A[i]=A[largestElementIndex];
	        A[largestElementIndex]=temp;
	        //recursively call the maxHeap on the largest index
	        maxHeap(A, largestElementIndex);
	    }

	}
	public static int left(int i){//returns left index of a zero index based array
    return 2*i+1;
	}
	public static int right(int i){ //returns right index of a zero based array 
    return 2*i+2;
	}
	public static void main(String[] args) {
	short A[]= new short[1000];
	for(int i=0; i<A.length; i++){
		A[i]=(short) (Math.random()*1);
	}
	short B[]= new short[1000];
	for(int i=0; i<A.length; i++){
		B[i]=(short) (Math.random()*10000);
	}
    heapSort(A);
    heapSort(B);
    System.out.println(Arrays.toString(A));
    System.out.println(Arrays.toString(B));
	}
}
