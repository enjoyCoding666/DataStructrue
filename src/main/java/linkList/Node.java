package linkList;

/**
 *  @author lin
 *  自定义链表
 **/
public class Node {
     Node next;    //存放下一个节点
     Object element;   //存放元素


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
}
