def recursive_bubble_sort(arr, n=None):
    """
    Recursively sorts an array using Bubble Sort.
    :param arr: The list of elements to be sorted.
    :param n: The number of elements to consider in the current pass.
    """
    # Initial call setup
    if n is None:
        n = len(arr)

    # Base case: array of size 1 is already sorted
    if n <= 1:
        return

    swapped = False
    
    # One pass of bubble sort: move the largest element to the end (index n-1)
    for i in range(n - 1):
        if arr[i] > arr[i + 1]:
            # Swap adjacent elements
            arr[i], arr[i + 1] = arr[i + 1], arr[i]
            swapped = True

    # Optimization: if no two elements were swapped, array is sorted
    if not swapped:
        return

    # Recur for the remaining (n-1) elements
    recursive_bubble_sort(arr, n - 1)

def main():
    """Driver code to test the algorithm."""
    data = [64, 34, 25, 12, 22, 11, 90]
    
    print(f"Original Array: {data}")
    
    # Perform in-place recursive sort
    recursive_bubble_sort(data)
    
    print(f"Sorted Array:   {data}")

if __name__ == "__main__":
    main()
