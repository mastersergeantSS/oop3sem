package pr8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

interface IWaitList<E>
{
    public void add(E element);
    public E remove();
    public boolean contains(E o);
    public boolean containsAll(Collection<E> c);
    public boolean isEmpty();
}

class WaitList<E> implements IWaitList<E>
{
    protected ConcurrentLinkedQueue<E> content;
    public WaitList()
    {
        content  = new ConcurrentLinkedQueue<E>();
    }
    public WaitList(Collection<E> c)
    {
        content  = new ConcurrentLinkedQueue<E>();
        content.addAll(c);
    }

    @Override
    public void add(E element)
    {
        content.add(element);
    }

    @Override
    public E remove() {
        return content.remove();
    }

    @Override
    public boolean contains(E o) {
        return content.contains(o);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty()
    {
        return content.isEmpty();
    }
}

class BoundedWaitList<E> extends WaitList<E>
{
    private int capacity;
    public BoundedWaitList(int _capacity)
    {
        capacity = _capacity;
        content = new ConcurrentLinkedQueue<E>();
    }
    public int getCapacity()
    {
        return capacity;
    }

    @Override
    public void add(E element)
    {
        if (content.size() < capacity)
        {
            super.add(element);
        }
        else throw new OutOfMemoryError();
    }
}

class UnfairWaitList<E> extends WaitList<E>
{
    public UnfairWaitList()
    {
        content = new ConcurrentLinkedQueue<E>();
    }

    public E remove(E o)
    {
        content.remove(o);
    }
    public void moveToBack()
    {
        E temp = content.remove();
        content.add(temp);
    }
}

public class Practice8
{
    public static void main(String[] args)
    {
        UnfairWaitList<Integer> uwl = new UnfairWaitList<>();
        for (int i = 0; i < 10; i++) {
            uwl.add(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(uwl.remove(i));
        }
    }
}
