package main

import "fmt"

// RecursiveBubbleSort sorts a slice of integers using recursion.
func recursiveBubbleSort(arr []int, n int) {
	// Base case: if slice size is 1, it is already sorted
	if n <= 1 {
		return
	}

	swapped := false

	// One pass of bubble sort. After this loop,
	// the largest element among the first 'n' elements
	// is moved to index n-1.
	for i := 0; i < n-1; i++ {
		if arr[i] > arr[i+1] {
			// Swap elements
			arr[i], arr[i+1] = arr[i+1], arr[i]
			swapped = true
		}
	}

	// Optimization: If no two elements were swapped by inner loop, then break
	if !swapped {
		return
	}

	// Recur for the remaining n-1 elements
	recursiveBubbleSort(arr, n-1)
}

func main() {
	data := []int{64, 34, 25, 12, 22, 11, 90}
	fmt.Printf("Original slice: %v\n", data)

	// Call recursive function with the initial length of the slice
	recursiveBubbleSort(data, len(data))

	fmt.Printf("Sorted slice:   %v\n", data)
}
