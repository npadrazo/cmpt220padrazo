/**
 * file: Prob10_10.java
 * author: nicole padrazo
 * course: CMPT 220
 * assignment: lab 7
 * due date: october 27, 2016
 * version: 1.3
 * 
 * This file contains problem 10 - 10
 */

public class Prob10_10 {
  public static void main(String[] args) {
    Queue queue = new Queue();
    for (int i = 0; i<= 20; i++)
      queue.enqueue(i);

    while (!queue.empty())
      System.out.print(queue.dequeue() + " ");
  }
}

//queue class 
class Queue {
  private int[] elements;
  private int size;

  //constructing a queue
  public Queue() {
    elements = new int[8];
  }

  // adding to the queue 
  public void enqueue(int value) {
    if (size >= elements.length) {
      int[] temp = new int[elements.length * 2];
      System.arraycopy(elements, 0, temp, 0, elements.length);
      elements = temp; 
    }

    elements[size++] = value;
  }

  // moving the elements in the queue
  public int dequeue() {
    int j = elements[0];

    // shifting the elements
    for (int i = 0; i < size - 1; i++) {
      elements[i] = elements[i + 1];
    }

    size--;

    return j;
  }

  // testing the queue
  public boolean empty() {
    return size == 0; 
  }

  // returning the number to the user 
  public int getSize() {
    return size;
  }
}