package com.itheima.test6;

public class GameTest {
    public static void main(String[] args) {
        SgzzBattleReport role1 = new SgzzBattleReport("曹操", '魏', 100);
        SgzzBattleReport role2 = new SgzzBattleReport("刘备", '蜀', 100);
        role1.showBattleReport();
        System.out.println("-------------------");
        role2.showBattleReport();

        while (true) {
            //        相当于程昱向张角发起决斗，两人进入决斗场
            role1.attack(role2);
            if (role2.getHp() == 0) {
                System.out.println(role2.getName() + "的血量为0，战斗结束。" + role1.getName() + "获胜");
                break;
            }
            //        相当于张角向程昱发起决斗，两人进入决斗场
            role2.attack(role1);
            if (role1.getHp() == 0) {
                System.out.println(role1.getName() + "的血量为0，战斗结束。" + role2.getName() + "获胜");
                break;
            }
        }
    }
}
