package com.lilei1998.generic.generic;

/**
 * Created by lilei on 2017/8/24 下午6:45.
 */
public class GenericTest {

//    public static void main(String[] args) {
////        不使用泛型而使用强制类型转换
////        List list = new ArrayList();
////        list.add("sansa");
////        list.add("arya");
////        list.add(100);
////        for (int i = 0; i < list.size(); i++) {
////            String name = (String) list.get(i); // 出现 ClassCastException 异常
////            System.out.println("name: " + name);
////        }
//
//        // 采用泛型的写法
//        List<String> list = new ArrayList<>();
//        list.add("Sansa");
//        list.add("Arya");
////        list.add(100);   //  不能添加 Integer 类型
//        for (int i = 0; i < list.size(); i++) {
//            String name = list.get(i);
//            System.out.println("name: " + name);
//        }
//    }

    public static void main(String[] args) {

        Box<String> name = new Box<String>("Jon");
        Box<Integer> age = new Box<Integer>(520);
        Box<Number> number = new Box<Number>(1314);

        getData(name);
        getData(age);
        getData(number);
    }

    public static void getData(Box<?> data) {    // 使用类型通配符
        System.out.println("data :" + data.getData());
    }
}

class Box<T> {

    private T data;

    public Box() {

    }

    public Box(T data) {
        setData(data);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}


