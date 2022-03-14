package ss10.ArrayList.BaiTap;

import java.util.Arrays;

public class MyArrayList <E> {
    //so luong phan tu chua trong Myarray
  public int size = 0;

    //suc chua cua mang
    public static final int DEFAULT_CAPACITY = 10;

    //Mang chua cac phan tu

    Object elements[];

    //suc chua mac dinh khi tao bang contructor kh co tham so

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // phuong thuc contructor voi suc chua truyen vao;
    //
    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity " + capacity);
        }

    }

    // phuong thuc tra ve so luong phan tu
    public int size() {
        return this.size;
    }

    // phuong thuc clear array
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);

        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i =size+1;i>=index;i--){
                elements[i]=elements[i-1];
            }
            elements[index]=element;
            size++;

        }
    }



    //them phan tu
   public boolean add(E element){
        if(elements.length==size){
            this.ensureCapacity(5);
        }
        elements[size]=element;
        size++;
        return true;
    }
    public   void ensureCapacity(int minCapacity){
        if(minCapacity>=0){
            int newSize=this.elements.length+minCapacity;
            elements= Arrays.copyOf(elements,newSize);
        }
        else{
            throw  new IllegalArgumentException("minCapacity "+minCapacity);
        }
    }
//phương thức lấy 1 element tai vi tri index
    public E get(int index){
        return (E) elements[index];
    }

    //Phương thức lấy kiểm tra index
    public int indexOf(E element){
        int index=-1;
        for (int i=0;i<size;i++){
            if(this.elements[i].equals((element))){
                return i;
            }
        }
        return  index;
    }
    //phương thức kiểm tra 1 phần tử có trong array
    public  boolean contains(E element){
        //lớn hơn 0 trả về true
        return this.indexOf(element)>=0;
    }

    public MyArrayList<E> clone(){
        MyArrayList<E> v=new MyArrayList<>();
        v.elements=Arrays.copyOf(this.elements,this.size);
        v.size=this.size;
        return v;
    }
}
