public class Main {

    public static void main(String[] args) {
        testMyArrayList();
        testMyLinkedList();
        testMyStack();
        testMyQueue();
        testMyMinHeap();
    }

    static void testMyArrayList() {
        System.out.println("===== MyArrayList =====");
        MyArrayList<Integer> list = new MyArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(5);
        list.addLast(40);
        System.out.println("After adds: " + arrayToString(list.toArray()));

        list.add(2, 15);
        System.out.println("After add(2, 15): " + arrayToString(list.toArray()));

        list.set(0, 1);
        System.out.println("After set(0, 1): " + arrayToString(list.toArray()));

        System.out.println("get(3): " + list.get(3));
        System.out.println("getFirst(): " + list.getFirst());
        System.out.println("getLast(): " + list.getLast());

        list.remove(0);
        System.out.println("After remove(0): " + arrayToString(list.toArray()));

        list.removeFirst();
        System.out.println("After removeFirst(): " + arrayToString(list.toArray()));

        list.removeLast();
        System.out.println("After removeLast(): " + arrayToString(list.toArray()));

        list.add(5);
        list.add(1);
        list.add(99);
        list.sort();
        System.out.println("After sort(): " + arrayToString(list.toArray()));

        System.out.println("indexOf(15): " + list.indexOf(15));
        System.out.println("lastIndexOf(15): " + list.lastIndexOf(15));
        System.out.println("exists(99): " + list.exists(99));
        System.out.println("size(): " + list.size());

        System.out.println("Iterator: ");
        for (int val : list) System.out.print(val + " ");
        System.out.println();

        list.clear();
        System.out.println("After clear(), size: " + list.size());
        System.out.println();
    }

    static void testMyLinkedList() {
        System.out.println("===== MyLinkedList =====");
        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("banana");
        list.add("cherry");
        list.addFirst("apple");
        list.addLast("date");
        System.out.println("After adds: " + arrayToString(list.toArray()));

        list.add(2, "blueberry");
        System.out.println("After add(2, blueberry): " + arrayToString(list.toArray()));

        list.set(1, "APPLE");
        System.out.println("After set(1, APPLE): " + arrayToString(list.toArray()));

        System.out.println("get(2): " + list.get(2));
        System.out.println("getFirst(): " + list.getFirst());
        System.out.println("getLast(): " + list.getLast());

        list.remove(1);
        System.out.println("After remove(1): " + arrayToString(list.toArray()));

        list.removeFirst();
        System.out.println("After removeFirst(): " + arrayToString(list.toArray()));

        list.removeLast();
        System.out.println("After removeLast(): " + arrayToString(list.toArray()));

        list.sort();
        System.out.println("After sort(): " + arrayToString(list.toArray()));

        System.out.println("indexOf(cherry): " + list.indexOf("cherry"));
        System.out.println("lastIndexOf(banana): " + list.lastIndexOf("banana"));
        System.out.println("exists(banana): " + list.exists("banana"));
        System.out.println("size(): " + list.size());

        System.out.println("Iterator: ");
        for (String val : list) System.out.print(val + " ");
        System.out.println();

        list.clear();
        System.out.println("After clear(), size: " + list.size());
        System.out.println();
    }

    static void testMyStack() {
        System.out.println("===== MyStack =====");
        MyStack<Integer> stack = new MyStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("peek(): " + stack.peek());
        System.out.println("pop(): " + stack.pop());
        System.out.println("pop(): " + stack.pop());
        System.out.println("size(): " + stack.size());
        System.out.println("isEmpty(): " + stack.isEmpty());
        System.out.println();
    }

    static void testMyQueue() {
        System.out.println("===== MyQueue =====");
        MyQueue<String> queue = new MyQueue<>();

        queue.enqueue("first");
        queue.enqueue("second");
        queue.enqueue("third");
        System.out.println("peek(): " + queue.peek());
        System.out.println("dequeue(): " + queue.dequeue());
        System.out.println("dequeue(): " + queue.dequeue());
        System.out.println("size(): " + queue.size());
        System.out.println("isEmpty(): " + queue.isEmpty());
        System.out.println();
    }

    static void testMyMinHeap() {
        System.out.println("===== MyMinHeap =====");
        MyMinHeap<Integer> heap = new MyMinHeap<>();

        heap.insert(40);
        heap.insert(10);
        heap.insert(30);
        heap.insert(5);
        heap.insert(20);

        System.out.println("getMin(): " + heap.getMin());
        System.out.println("extractMin(): " + heap.extractMin());
        System.out.println("extractMin(): " + heap.extractMin());
        System.out.println("extractMin(): " + heap.extractMin());
        System.out.println("size(): " + heap.size());
        System.out.println("isEmpty(): " + heap.isEmpty());
        System.out.println();
    }

    static String arrayToString(Object[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
