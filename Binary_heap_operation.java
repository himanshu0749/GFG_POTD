class MinHeap {
    int[] harr;
    int capacity;
    int heap_size;

    // Constructor: Initializes a heap with given capacity.
    MinHeap(int cap) {
        heap_size = 0;
        capacity = cap;
        harr = new int[cap];
    }

    // Returns the index of the parent of the node at index i.
    int parent(int i) { return (i - 1) / 2; }

    // Returns the index of the left child of the node at index i.
    int left(int i) { return (2 * i + 1); }

    // Returns the index of the right child of the node at index i.
    int right(int i) { return (2 * i + 2); }

    // Function to extract the minimum value in the heap and then to store the next minimum value at the first index.
    int extractMin() {
        if (heap_size <= 0)
            return -1;
        if (heap_size == 1) {
            heap_size--;
            return harr[0];
        }

        // Store the minimum value, and remove it from heap
        int root = harr[0];
        harr[0] = harr[heap_size - 1];
        heap_size--;
        MinHeapify(0);

        return root;
    }

    // Function to insert a value in the Heap.
    void insertKey(int k) {
        if (heap_size == capacity) {
            System.out.println("Overflow: Could not insertKey");
            return;
        }

        // First insert the new key at the end
        int i = heap_size;
        harr[i] = k;
        heap_size++;

        // Fix the min heap property if it is violated
        while (i != 0 && harr[parent(i)] > harr[i]) {
            int temp = harr[i];
            harr[i] = harr[parent(i)];
            harr[parent(i)] = temp;
            i = parent(i);
        }
    }

    // Function to delete a key at index i.
    void deleteKey(int i) {
        if (i < heap_size) {
            decreaseKey(i, Integer.MIN_VALUE);
            extractMin();
        }
    }

    // Function to decrease the value at index i to new_val.
    void decreaseKey(int i, int new_val) {
        harr[i] = new_val;
        while (i != 0 && harr[parent(i)] > harr[i]) {
            int temp = harr[i];
            harr[i] = harr[parent(i)];
            harr[parent(i)] = temp;
            i = parent(i);
        }
    }

    // MinHeapify function to maintain heap property.
    void MinHeapify(int i) {
        int l = left(i);
        int r = right(i);
        int smallest = i;
        if (l < heap_size && harr[l] < harr[i])
            smallest = l;
        if (r < heap_size && harr[r] < harr[smallest])
            smallest = r;
        if (smallest != i) {
            int temp = harr[i];
            harr[i] = harr[smallest];
            harr[smallest] = temp;
            MinHeapify(smallest);
        }
    }
}
