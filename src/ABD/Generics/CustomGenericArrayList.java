package ABD.Generics;
//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;

public class CustomGenericArrayList<T> {
    private Object[] data;
    private static final int DEFAULT_SIZE=10;
    private int size =0;

    public CustomGenericArrayList(){
        this.data=new Object[DEFAULT_SIZE];
    }

    public void add(T num ){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    private void resize(){
        Object[] temp= new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }
    public boolean isFull(){
        return size==data.length;
    }
    public T remove(){
        T removed=(T)(data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public int size(){
        return size;
    }
    public void set(int index,T value){
        data[index]=value;

    }

    @Override
    public String toString() {
        return "CustomGenericArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list=new ArrayList();

//      list.add(3);
//      list.add(5);
//      list.add(9);
//      list.add(8);
//      System.out.println(list);

//      list1.add("avf");
        CustomGenericArrayList<Integer> list2=new CustomGenericArrayList<>();
        list2.add(89);
        list2.add(87);
        System.out.println(list2);
    }
}
