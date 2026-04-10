# Assignment 2 - ArrayList and LinkedList

## Overview

This project implements custom data structures in Java without using `java.util.*` (except `Iterator`).

## Project Structure

```
src/
├── MyList.java        - Interface for all list implementations
├── MyArrayList.java   - Dynamic array implementation
├── MyLinkedList.java  - Doubly linked list implementation
├── MyStack.java       - Stack based on MyArrayList
├── MyQueue.java       - Queue based on MyLinkedList
├── MyMinHeap.java     - Min-Heap based on MyArrayList
└── Main.java          - Tests for all classes
```

## Data Structures

### MyArrayList
- Backed by a resizable `Object[]` array
- Auto-grows when capacity is exceeded (doubles in size)
- O(1) access by index, O(n) insert/remove at arbitrary index

### MyLinkedList (Doubly)
- Uses inner `MyNode` class with `next` and `prev` references
- O(1) insert/remove at head or tail
- Traverses from nearest end for faster `nodeAt(index)`

### MyStack (uses MyArrayList)
- LIFO: `push`, `pop`, `peek`
- ArrayLists O(1) `addLast` / `removeLast` make it ideal for stacks

### MyQueue (uses MyLinkedList)
- FIFO: `enqueue`, `dequeue`, `peek`
- LinkedLists O(1) `addLast` / `removeFirst` make it ideal for queues

### MyMinHeap (uses MyArrayList)
- Min-Heap: always extracts the smallest element
- Operations: `insert`, `getMin`, `extractMin`
- Uses `heapifyUp` and `heapifyDown` to maintain heap property

## How to Run

```bash
javac *.java
java Main
```

## Design Decisions

- `MyStack` uses `MyArrayList` because index-based access and `addLast`/`removeLast` are O(1).
- `MyQueue` uses `MyLinkedList` because `addLast` and `removeFirst` are both O(1), avoiding the O(n) shift cost of an array.
- `MyMinHeap` uses `MyArrayList` because heap index arithmetic (`parent`, `leftChild`, `rightChild`) requires O(1) random access.
