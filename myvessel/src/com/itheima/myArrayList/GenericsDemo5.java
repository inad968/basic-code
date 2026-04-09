package com.itheima.myArrayList;

import java.util.ArrayList;

public class GenericsDemo5 {
    public static void main(String[] args) {
        //这里使用泛型的通配符，即表示可以传入任意的数据
        //但是?的后面加了限定条件，只能传入具有继承结构的数据
        ArrayList<Ye1> list1 = new ArrayList<>();
        ArrayList<Fu1> list2 = new ArrayList<>();
        ArrayList<zi1> list3 = new ArrayList<>();
        ArrayList<Student> list4 = new ArrayList<>();

        method1(list1);
        method1(list2);
        method1(list3);
//        method1(list4);  会报错
    }

    public static void method1(ArrayList<? extends Ye1> list) {
        //  这里的?时通配符。表示传入的数据必须继承Ye1或者是Ye1本身
        //  即 ? extends E  ||  ? super E
    }
}

class Student{}
class Ye1 {
}

class Fu1 extends Ye1 {
}

class zi1 extends Fu1 {
}