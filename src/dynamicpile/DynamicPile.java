package dynamicpile;

public class DynamicPile<T> {

    private class Element {

        T object;
        Element next;

        public Element(T object, Element next) {
            this.object = object;
            this.next = next;
        }

    }

    private Element lastadded = null;

    public boolean isEmpty() {
        return lastadded == null;
    }

    public int size() {
        int i = 0;
        if (!isEmpty()) {
            Element node = lastadded;
            while (node != null) {
                node = node.next;
                i++;
            }
        }
        return i;
    }

    public void add(T object) {
        Element added = new Element(object, null);
        added.next = lastadded;
        lastadded = added;
    }

    public boolean remove() {
        if(isEmpty()) {
            return false;
        }
        lastadded = lastadded.next;
        return true;
    }
}
