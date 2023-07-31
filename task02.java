// Реализация метода HashSet


package sem6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class task02 {

    public static void main(String[] args) {

        MySet<Integer> myset = new MySet<>();
        System.out.println(myset.add(4165));
        System.out.println(myset.add(5328));
        System.out.println(myset.add(4165));
        System.out.println(myset.add(0));
        myset.tostring();
        // HashSet<E> qwe;
        // qwe.add();
        System.out.println(myset.remove(4165));
        myset.tostring();
        System.out.println(myset.add(4165));
        myset.tostring();
        Iterator<Integer> iter = myset.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        

    }    
}


class MySet<T>{
    
    private HashMap<T, Object> map = new HashMap<>();
    private static final Object myo = new Object(); 
    //ArrayList<Integer> val = new ArrayList<>();

    public boolean add(T value){
        // if(val.contains(value)) return false;
        // val.add(value);
        // return true;
        return map.put(value,myo) == null;
    }
    

    public boolean remove(T value){
        return map.remove(value) == myo;

        // if (val.contains(value)){
        //     val.remove(value);
        //     return true;
        // }
        // return false;
    }
    public void tostring(){
        System.out.println(map.keySet().toString());
    }
    public Iterator<T> iterator(){
        return map.keySet().iterator();
    }
    
}




    

