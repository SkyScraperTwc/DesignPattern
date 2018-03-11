package indi.twc.pattern.proxy.dynamic;

public class Book implements BookInterface{
    @Override
    public void addBook() {
        System.out.println("add book....");
    }
}
