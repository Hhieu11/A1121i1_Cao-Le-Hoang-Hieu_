package ss10.ArrayList.BaiTap;



public class MyLinkedList<E> {


    public MyLinkedList() {

    }

    private class Node {
        public Node next;
        public Object data;

        public Node(Object data){
            this.data=data;
        }
        public Object getData() {
            return this.data;
        }
    }
//  phần tử đầu tiên trong danh sách liên kết
    private Node head;
    private int numNodes =0;

    public MyLinkedList(Object data) {
//        head = new Node(data);
    }

public  void addFirst (E element){
        //khai báo 1 biến temp tror đến giá trị của head
    Node temp=head;
    // biến head sẽ nhận 1 node mới
    head = new Node(element);
    //head.next trỏ đến temp
    head.next=temp;
    numNodes++;
}
    public void addLast (E element){
        //khai báo biến temp trỏ đến head
        Node temp=head;
        //trỏ đến phần tử cuối cùng trong danh sách
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(element);
        numNodes++;
    }
//thêm phần tử chỉ định
    public void add(int index, E element){
        //Khai bao temp dến head
        Node temp=head;
        //khai báo 1 node holder
        Node holder;
        // cho con trỏ đến vị trí -1
        for(int i=0;i<index-1&&temp.next!=null;i++){
            temp=temp.next;

        }
        //cho holđẻr tham chiếu tơi index
        holder=temp.next;
        //node tạo vị trí index -1 sẽ trỏ tới node mới
        temp.next=new Node(element);
        // node mới sẽ trỏ đến holder
        temp.next.next=holder;
        //tăng số lượng pt lên 1
        numNodes++;
    }
    public Object get (int index){
        Node temp=head;
        for (int i=0;i<index;i++){
            temp=temp.next;

        }
        return temp.data;
    }
    public int size(){
        return numNodes;
    }

    public E remove(int index){
        if(index<0||index>numNodes){
            throw  new IllegalArgumentException("Lỗi "+index);

        }
        Node temp=head;
        Object data;
        //nếu index =0 thì trả về data hiện tại
        if(index==0){
            data=temp.data;
            head=head.next;
            numNodes--;
        }else{
            for(int i=0;i<index-1 &&temp.next!=null;i++){
                temp=temp.next;
            }
            data=temp.next.data;
            temp.next=temp.next.next;
            numNodes--;
        }
        return (E) data;
    }
//    public  boolean remove(E element){
//
//    }

}
