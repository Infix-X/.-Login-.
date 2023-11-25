public class QueueMeth {
    private static int arr[];
    private static int rear = -1;

    QueueMeth() {
        arr = new int[10]; // Default initial size, you can change it as needed
    }

    public static boolean isEmpty() {
        return rear == -1;
    }

    public static int add(int data) {
        // Check if the array is full, resize if needed
        if (rear == arr.length - 1) {
            resizeArray();
        }
        rear++;
        arr[rear] = data;
        return data;
    }

    private static void resizeArray() {
        int newSize = arr.length * 2; // You can adjust the resizing strategy as needed
        int newArr[] = new int[newSize];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    public static int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return front;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[0];
    }

    public static void main(String[] args) {
        QueueMeth q = new QueueMeth();
        q.add(6);
        q.add(8);
        q.add(9);
        q.add(10);

        // while (!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        // }

        

        //gPrinting the queue
        for (int i = 0; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
