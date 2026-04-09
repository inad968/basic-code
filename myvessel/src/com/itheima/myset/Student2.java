package com.itheima.myset;

public class Student2 implements Comparable<Student2> {
    private String name;
    private int age;
    private int chinese;
    private int math;
    private int english;

    public Student2() {
    }

    public Student2(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return chinese
     */
    public int getChinese() {
        return chinese;
    }

    /**
     * 设置
     *
     * @param chinese
     */
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     *
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     *
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    /**
     * 获取
     *
     * @return english
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     *
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
    }

    public String toString() {
        return "Student2{name = " + name + ", age = " + age + ", chinese = " + chinese + ", math = " + math + ", english = " + english + "}";
    }

    @Override
    public int compareTo(Student2 o) {
        //一定要有this和o,一个表示要添加的元素，一个表示已存在的元素
        //两者相减得到的i只表示正数，负数，0，进而表示存右边，还是存左边，还是不存
        int sum1 = this.getChinese() + this.getMath() + this.getEnglish();
        int sum2 = o.getChinese() + o.getMath() + o.getEnglish();
        //i等于谁i=?就表示要比较谁
        int i = sum1 - sum2;
        //表示总成绩是否相等，若相等，则继续比较语文成绩
        i = i == 0 ? this.getChinese() - o.getChinese() : i;
        //表示语文成绩是否相等，若相等，则继续比较数学成绩
        i = i == 0 ? this.getMath() - o.getMath() : i;
        //表示数学成绩是否相等，若相等，则继续比较英语成绩
        i = i == 0 ? this.getEnglish() - o.getEnglish() : i;
        //表示英语成绩是否相等，若相等，则继续比较年龄
        i = i == 0 ? this.age - o.age : i;
        //表示年龄是否相等，若相等，则继续比较名字
        //由于名字是字符串，所以默认按照ASCII码表，比较首字母顺序
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i;
    }
}
