/// Recursively sorts a slice using the Bubble Sort algorithm.
fn recursive_bubble_sort<T: PartialOrd>(slice: &mut [T]) {
    let n = slice.len();

    // Base case: If the slice has 1 or 0 elements, it is already sorted
    if n <= 1 {
        return;
    }

    let mut swapped = false;

    // One pass of Bubble Sort: 
    // Compare adjacent elements and swap if they are in the wrong order.
    // This moves the largest element to the very end of the slice.
    for i in 0..n - 1 {
        if slice[i] > slice[i + 1] {
            slice.swap(i, i + 1);
            swapped = true;
        }
    }

    // Optimization: If no elements were swapped, the slice is already sorted.
    if !swapped {
        return;
    }

    // Recur for the first n-1 elements, as the last element is now in its correct place.
    recursive_bubble_sort(&mut slice[0..n - 1]);
}

fn main() {
    let mut data = vec![64, 34, 25, 12, 22, 11, 90];
    
    println!("Original array: {:?}", data);

    // Call recursive sort on the mutable slice
    recursive_bubble_sort(&mut data);

    println!("Sorted array:   {:?}", data);
}
