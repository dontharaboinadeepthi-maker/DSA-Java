import java.util.Arrays;

public class MaxHeap {
    private int[] heap;
    private int size;

    public MaxHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    private int parent(int i) { return (i - 1) / 2; }
    private int left(int i)   { return 2 * i + 1; }
    private int right(int i)  { return 2 * i + 2; }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void insert(int value) {
        if (size == heap.length) throw new IllegalStateException("Heap is full");
        heap[size] = value;
        heapifyUp(size);
        size++;
    }

    // Delete the root (the maximum element)
    public int deleteRoot() {
        if (size == 0) throw new IllegalStateException("Heap is empty");
        int root = heap[0];
        heap[0] = heap[size - 1];   // move last element to root
        size--;
        heapifyDown(0);             // restore heap property
        return root;
    }

    // Delete the node at any index i
    public void delete(int i) {
        if (i < 0 || i >= size) throw new IndexOutOfBoundsException("Invalid index");
        heap[i] = heap[size - 1];   // replace with last element
        size--;
        if (i == size) return;      // we deleted the last element itself
        // The replacement may need to go up or down
        if (i > 0 && heap[i] > heap[parent(i)]) {
            heapifyUp(i);
        } else {
            heapifyDown(i);
        }
    }

    private void heapifyUp(int i) {
        while (i > 0 && heap[i] > heap[parent(i)]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    private void heapifyDown(int i) {
        while (true) {
            int largest = i;
            int l = left(i), r = right(i);
            if (l < size && heap[l] > heap[largest]) largest = l;
            if (r < size && heap[r] > heap[largest]) largest = r;
            if (largest == i) break;
            swap(i, largest);
            i = largest;
        }
    }

    public void print() {
        System.out.println(Arrays.toString(Arrays.copyOf(heap, size)));
    }

    public static void main(String[] args) {
        MaxHeap h = new MaxHeap(20);
        int[] values = {50, 30, 40, 10, 20, 35, 25};
        for (int v : values) h.insert(v);

        System.out.print("Initial heap: ");
        h.print();

        System.out.println("Deleted root: " + h.deleteRoot());
        System.out.print("After deleteRoot: ");
        h.print();

        h.delete(2);  // delete node at index 2
        System.out.print("After delete(2): ");
        h.print();
    }
}