package com.itheima.test4;

public class GameTest {
    public static void main(String[] args) {
        Role role1 = new Role("程昱", 100);
        Role role2 = new Role("张角", 100);
//        回合制进行攻击，直到有一方血量为0，break，游戏结束
        while (true) {
            //        相当于程昱向张角发起决斗，两人进入决斗场
            role1.attack(role2);
            if (role2.getBlood() == 0) {
                System.out.println(role2.getName() + "的血量为0，战斗结束。" + role1.getName() + "获胜");
                break;
            }
            //        相当于张角向程昱发起决斗，两人进入决斗场
            role2.attack(role1);
            if (role1.getBlood() == 0) {
                System.out.println(role1.getName() + "的血量为0，战斗结束。" + role2.getName() + "获胜");
                break;
            }
        }
    }
}
