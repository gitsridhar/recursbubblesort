import Foundation

/**
 Sorts an array using a recursive Bubble Sort approach.
 - Parameters:
   - array: The array to be sorted (passed by reference).
   - n: The number of elements to consider in the current pass.
 */
func recursiveBubbleSort<T: Comparable>(_ array: inout [T], _ n: Int) {
    // Base case: if array size is 1, it's already sorted
    if n <= 1 {
        return
    }

    var swapped = false

    // One pass of Bubble Sort
    // Moves the largest element in the range 0...n-1 to the end
    for i in 0..<n - 1 {
        if array[i] > array[i + 1] {
            array.swapAt(i, i + 1)
            swapped = true
        }
    }

    // Optimization: If no elements were swapped, the array is already sorted
    if !swapped {
        return
    }

    // Recur for the remaining n-1 elements
    recursiveBubbleSort(&array, n - 1)
}

// MARK: - Main Execution
func main() {
    var data = [64, 34, 25, 12, 22, 11, 90]
    
    print("Original Array: \(data)")
    
    // Perform recursive sort on the full length of the array
    recursiveBubbleSort(&data, data.count)
    
    print("Sorted Array:   \(data)")
}

// Call the main function
main()
