public class MyQueue {

    public int total = 0;
    private Node first; 
    private Node last;

    private class Node {
        private String value;
        private Node next;
    }

    public void add(String s){
        Node curr = last;
        last = new Node();
        last.value = s;
        total++;
        if (total == 1) first = last;
        else curr.next = last;
    }
    
    public void concat(MyQueue other){
        last.next = other.first;
        last = other.last;
        total += other.total;
        while (other.total > 0) other.remove();
    }

    public String remove(){
        if (total == 0) throw new NullPointerException();
        String value = first.value;
        first = first.next;
        total--;
        if (total == 0) last = null;
        return value;
    }
 
}