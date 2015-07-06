package com.sortingalgorithms;
import java.util.Random;

public class SortAlgs {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static void selectionSort(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i < n; i++)
		{
			int index = getMinElementIndex(arr, i, n);
			if(i!=index)
				swap(arr, i, index);
		}
	}
	
	public static void insertionSort(int arr[])
	{
		int n = arr.length;
		for(int i = 1; i < n; i++)
		{
			int value = arr[i];
			int index = i;
			while(index > 0 && arr[index-1] > value)
			{
				arr[index] = arr[index-1];
				index--;
			}
			arr[index] = value;
		}
	}
	
	public static void bubbleSort(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i < n-1; i++)
		{
			boolean isSorted = true;
			for(int j = 0; j < n-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					swap(arr, j, j+1);
					isSorted = false;
				}
			}
			if(isSorted)
				break;
		}
	}
	
	public static void quickSort(int arr[], int leftIndex, int rightIndex)
	{
		if(leftIndex < rightIndex)
		{
			int pivotIndex = (rightIndex - leftIndex)/2 + leftIndex;
			int pivotValue = arr[pivotIndex];
			swap(arr, pivotIndex, rightIndex);
			int storeIndex = leftIndex;
			for(int i = leftIndex; i < rightIndex; i++)
			{
				if(arr[i] < pivotValue)
				{
					swap(arr, i, storeIndex);
					storeIndex++;
				}
			}
			swap(arr, storeIndex, rightIndex);
			quickSort(arr, leftIndex, storeIndex-1);
			quickSort(arr, storeIndex+1, rightIndex);
		}
	}
	
	public static void arrayShuffle(int arr[])
	{
		Random rand = new Random();
		int n = arr.length;
		for(int i = n-1; i >= 0; i--)
		{
			rand.setSeed(System.currentTimeMillis()*i + System.currentTimeMillis());
			swap(arr, i, Math.abs(rand.nextInt())%n);
		}
	}
	
	public static void arrayPrint(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.print('\n');
	}
	
	private static int getMinElementIndex(int arr[], int startIndex, int endIndex)
	{
		int min = arr[startIndex];
		int index = startIndex;
		for(int i = startIndex+1; i < endIndex; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
				index = i;
			}
		}
		return index;
	}
	
	private static void swap(int arr[], int firstIndex, int secondIndex)
	{
		int temp = arr[firstIndex];
		arr[firstIndex] = arr[secondIndex];
		arr[secondIndex] = temp;
	}
	
}
