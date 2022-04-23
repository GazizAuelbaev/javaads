import java.util.*;
public class MyQueue<T>{
    private ArrayList<T> List;

    public MyQueue()
    {
        List = new ArrayList<>();
    }

    public int size()
    {
        return List.size();
    }

    public boolean isEmpty() {
        return (List.size() == 0);
    }

    public T enqueue(T item)
    {
        List.add(item);
        return item;
    }

    public T dequeue()
    {
        return List.remove(0);
    }

    public T front()
    {
        return List.get(0);
    }
}