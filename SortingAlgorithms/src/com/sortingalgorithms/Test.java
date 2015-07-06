package com.sortingalgorithms;
import com.sortingalgorithms.SortAlgs;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {5,2,65,2,-1,5,-12,8};
		
		//basic example
		SortAlgs.arrayShuffle(array);
		SortAlgs.arrayPrint(array);
		SortAlgs.quickSort(array, 0, array.length-1);
		SortAlgs.arrayPrint(array);
		
	}

}
