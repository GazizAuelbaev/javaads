import java.util.*;
public class MyStack<T>{
    private ArrayList<T> List;

    public MyStack()
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

    public T pop()
    {
        return List.remove(size()-1);
    }

    public T push(T item)
    {
        List.add(item);
        return item;
    }

    public T peek()
    {
        return List.get(size()-1);
    }





}