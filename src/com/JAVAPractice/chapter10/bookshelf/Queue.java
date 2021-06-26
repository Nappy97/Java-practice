package com.JAVAPractice.chapter10.bookshelf;

public interface Queue {
    void enQueue(String title);
    String deQueue();
    int getSize();
}
