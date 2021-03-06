/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listen;


// KLasse für Doppelt verkette Liste: Jedes Node kennt sowohl VOR  und Nachfolger
public class DoublyLinkedNode {
private DoublyLinkedListNode head; private DoublyLinkedListNode tail;
public DoublyLinkedNode() {
    this.head = null; 
    this.tail = null;
}
public void enqueue(String value) {
    DoublyLinkedListNode node = new DoublyLinkedListNode(value, this.tail); 
    if (this.tail != null) 
    {
        this.tail.setNext(node); 
    }
    this.tail = node;
    if (this.head == null) {
        this.head = node;
    }
}

public String dequeue() { 
    if (this.head == null) {
    return null; 
}
String value = this.head.getEntry(); 
this.head = this.head.getNext(); 
return value;
}
}
