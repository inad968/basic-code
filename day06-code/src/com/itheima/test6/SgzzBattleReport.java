package com.itheima.test6;

import java.util.Random;

public class SgzzBattleReport {
    //    角色性格描述
    String[] WEI_CHARACTER = {
            "乱世枭雄，生性多疑，雄才大略",    // 曹操
            "奇谋之士，心思缜密，性情刚戾",    // 程昱
            "冢虎，老谋深算，隐忍狠厉",        // 司马懿
            "忠勇刚烈，治军严谨，不畏强敌",    // 夏侯惇
            "沉稳持重，善守能攻，顾全大局"     // 曹仁
    };
    String[] SHU_CHARACTER = {
            "仁德之主，知人善任，弘毅宽厚",    // 刘备
            "卧龙先生，足智多谋，鞠躬尽瘁",    // 诸葛亮
            "武圣，忠义无双，刚愎自用",        // 关羽
            "燕人张翼德，勇猛粗犷，嫉恶如仇",  // 张飞
            "义胆雄心，智勇双全，志在兴汉"     // 姜维
    };
    //    技能描述
    String[] SKILL_DESCRIPTIONS = {
            "%s发动乱世奸雄，为主将分担伤害并提升全队属性",
            "%s发动十面埋伏，对敌军群体施加叛逃状态",
            "%s发动鹰视狼顾，对敌军全体造成谋略伤害并汲取兵力",
            "%s发动神机妙算，打断敌军主动技能并造成谋略伤害",
            "%s发动义胆雄心，提升自身战法发动概率并造成高额谋略伤害",
            "%s发动威震华夏，对敌军单体造成高额兵刃伤害并概率缴械",
            "%s发动仁德载世，为我军群体恢复兵力",
            "%s发动燕人咆哮，对敌军群体造成兵刃伤害并概率震慑"
    };
    //    受到伤害描述
    String[] DAMAGE_DESCRIPTIONS = {
            "%s受到%s的十面埋伏的谋略伤害，被施加叛逃状态，持续损失兵力",
            "%s受到%s的五雷轰顶的谋略伤害，被震慑，无法发动任何技能",
            "%s受到%s的义胆雄心的谋略伤害，属性被降低，战力下滑",
            "%s受到%s的威震华夏的兵刃伤害，被缴械，无法进行普通攻击",
            "%s受到%s的神机妙算的反制伤害，主动技能被打断，未能释放",
            "%s受到%s的鹰视狼顾的谋略伤害，兵力被汲取，无法恢复",
            "%s受到%s的燕人咆哮的兵刃伤害，被震慑，无法行动一回合",
            "%s受到%s的乱世奸雄的反伤效果，自身兵力小幅损失"
    };
    private String name;
    private String character;
    private char camp;
    private int hp;

    public SgzzBattleReport() {
    }

    public SgzzBattleReport(String name, char camp, int hp) {
        this.name = name;
        this.camp = camp;
        this.hp = hp;
        setCharacter(camp);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(char camp) {
//        通过阵营随机生成一个角色性格描述
        Random random = new Random();
        if (camp == '魏') {
            int index = random.nextInt(WEI_CHARACTER.length);
            this.character = WEI_CHARACTER[index];
        } else if (camp == '蜀') {
            int index = random.nextInt(SHU_CHARACTER.length);
            this.character = SHU_CHARACTER[index];
        }
    }

    public char getCamp() {
        return camp;
    }

    public void setCamp(char camp) {
        this.camp = camp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void showBattleReport() {
        System.out.println("角色信息：");
        System.out.println("角色姓名：" + name);
        System.out.println("角色阵营：" + camp);
        System.out.println("角色性格：" + character);
        System.out.println("角色血量：" + hp);
    }
    public void attack(SgzzBattleReport role) {
//        技能描述：通过随机数生成一个技能状态
        Random random = new Random();
        int index = random.nextInt(SKILL_DESCRIPTIONS.length);
        String skillDescription = SKILL_DESCRIPTIONS[index];
        System.out.printf(skillDescription,this.getName());
        System.out.println();
//        状态描述：通过随机数生成一个状态描述
        int damageIndex = random.nextInt(DAMAGE_DESCRIPTIONS.length);
        String damageDescription = DAMAGE_DESCRIPTIONS[damageIndex];
        System.out.printf(damageDescription,role.getName(),this.getName());
        System.out.println();
//        受到伤害描述：通过随机数生成一个受到伤害描述，并输出
        int hurt = random.nextInt(20) + 1;
        int newHp = role.getHp() - hurt;
        newHp = newHp < 0 ? 0 : newHp;
        role.setHp(newHp);
    }
}
