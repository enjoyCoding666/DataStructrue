package linkList;

/**
 *  @author lin
 *  自定义链表
 **/
public class Node {
     Node next;
     Object element;


    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public  int getIntElement() {
        return  Integer.parseInt( String.valueOf( element ) );
    }

    public Node(Object element){
        this.element=element;
    }

    public Node( Object element,Node next) {
        this.next = next;
        this.element = element;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (next != null ? !next.equals(node.next) : node.next != null) return false;
        return element != null ? element.equals(node.element) : node.element == null;
    }

    @Override
    public int hashCode() {
        int result = next != null ? next.hashCode() : 0;
        result = 31 * result + (element != null ? element.hashCode() : 0);
        return result;
    }
}
