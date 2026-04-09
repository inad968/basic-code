package com.itheima.a02test;

public class GirlFriend {
    private String name;
    private int age;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
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
        //该方法被调用，需要传入参数，所以我们需要对参数进行校验
        if (name.length() < 3 || name.length() > 10) {
            throw new NameFormatException(name + "格式有误，名字的长度：3~10");
        }
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
        //该方法被调用，需要传入参数，所以我们需要对参数进行校验
        if (age < 18 || age > 30) {
            throw new AgeOutOfBoundsException(age + "不符合规定");
        }
        this.age = age;
    }

    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + "}";
    }
}
