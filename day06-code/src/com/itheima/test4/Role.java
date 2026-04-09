package com.itheima.test4;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Role role) {
        Random random = new Random();
        int hurt = random.nextInt(20) + 1;
        int remainBlood = role.getBlood() - hurt;
//        三元运算符，判断剩余血量是否小于0，如果小于0，剩余血量为0，否则为remainBlood
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        //        刷新被攻击角色的血量
        role.setBlood(remainBlood);
        System.out.println(this.name + "对" + role.getName() + "发动普通攻击，造成了" + hurt + "点伤害。"
                + role.getName() + "还剩余" + remainBlood + "点血量");
    }
}
