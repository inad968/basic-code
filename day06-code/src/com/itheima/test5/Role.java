package com.itheima.test5;

import java.util.Random;

public class Role {
//    长相描述
    String[] manFace = {"风流俊雅", "英俊潇洒", "相貌平平", "面目狰狞"};
    String[] womanFace = {"美奂绝伦", "沉鱼落雁", "闭月羞花", "相貌平平"};
//    技能描述
    String[] skill = {
            "%s发动战法【十面埋伏】",
            "%s发动战法【四面楚歌】",
            "%s发动战法【夺魂挟魄】",
            "%s发动战法【上兵伐谋】",
            "%s发动战法【十面埋伏】",
};
//    受伤描述
    String[] state = {
            "%s由于%s【十面埋伏】的伤害，无法回复血量",
            "%s由于%s【四面楚歌】的伤害，持续中毒",
            "%s由于%s【上兵伐谋】的效果，无法使用技能",
            "%s由于%s【夺魂挟魄】的伤害，智力下降",
};
    private String name;
    private int hp;
    private String face;
    private char gender;

    public Role() {
    }

    public Role(String name, int hp, char gender) {
//        长相通过性别随机生成，不需要传入参数
        this.name = name;
        this.hp = hp;
        setFace(gender);
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
//        通过性别随机生成一个外貌
        Random random = new Random();
        if (gender == '男') {
            int index = random.nextInt(manFace.length);
            this.face = manFace[index];
        } else if (gender == '女') {
            int index = random.nextInt(womanFace.length);
            this.face = womanFace[index];
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void attack(Role role) {
//        技能描述：通过随机数生成一个技能状态
        Random random = new Random();
        int index = random.nextInt(skill.length);
        String skillName = skill[index];
        System.out.printf(skillName,this.getName(),role.getName());
        System.out.println();
//        伤害描述：通过随机数生成一个伤害值，造成伤害后更新对方的血量，并输出伤害结果
        int hurt = random.nextInt(20) + 1;
        int currentHp = role.getHp() - hurt;
        currentHp = currentHp < 0 ? 0 : currentHp;
        role.setHp(currentHp);
        /*System.out.println(this.name + "对" + role.getName() + "发起了普通攻击，造成了" + hurt + "点伤害，"
                + role.getName() + "剩余血量为" + currentHp);*/
//        状态描述：通过随机数生成一个状态，输出状态结果
        int index1 = random.nextInt(state.length);
        String stateName = state[index1];
        System.out.printf(state[index1],role.getName(),this.getName());
        System.out.println();
    }

    public void showRoleInfo() {
        System.out.println("角色信息：");
        System.out.println("姓名：" + getName());
        System.out.println("血量：" + getHp());
        System.out.println("外貌：" + getFace());
        System.out.println("性别：" + getGender());
    }
}
