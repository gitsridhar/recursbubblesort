#include <stdio.h>

void swap(int *left, int *right) {
    int temp = *left;
    *left = *right;
    *right = temp;
}

void bubblesort(int data[], int n) {
    if (n == 1)
        return;

    for(int i=0; i<n-1; i++) {
        if (data[i] > data[i+1]) {
            swap(&data[i], &data[i+1]);
        }
    }
    bubblesort(data, n-1);
}

int main() {
    int data[] = {1,9,2,8,3,7,4,6,5};
    bubblesort(data, sizeof(data)/sizeof(data[0]));
    for (int i=0; i<sizeof(data)/sizeof(data[0]); i++) {
        printf("%d ", data[i]);
    }
    return 0;
}
