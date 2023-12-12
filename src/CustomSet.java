import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CustomSet<E> implements Set<E> {

    private HashMap<E, Object> map;
    private static final Object DEFAULT_VALUE = new Object();

    public CustomSet() {
        map = new HashMap<>();
    }

    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    public int size() {
        return map.size();
    }

    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    public boolean add(E e) {
        return map.put(e, DEFAULT_VALUE) == null;
    }

    public boolean remove(Object o) {
        return map.remove(o) != null;
    }

    public boolean containsAll(Collection<?> c) {
        return map.keySet().containsAll(c);
    }


    public boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for (E element : c) {
            if (!map.containsKey(element)) {
                map.put(element, new Object());
                modified = true;
            }
        }
        return modified;
    }

    public boolean retainAll(Collection<?> c) {
        return map.keySet().retainAll(c);
    }

    public boolean removeAll(Collection<?> c) {
        return map.keySet().removeAll(c);
    }
    public void clear() {
        map.clear();
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }
    public Object[] toArray() {
        return map.keySet().toArray();
    }

    public <T> T[] toArray(T[] a) {
        return map.keySet().toArray(a);
    }

    public void printSet() {
        for (E element : map.keySet()) {
            System.out.print(element + " ");
        }
        System.out.println( ); // Add a new line after printing all elements
    }
}
