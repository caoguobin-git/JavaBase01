/***********************************************
 * File Name: Transform
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 30 05 2019 17:45
 ***********************************************/

package com.javabase.day08.day0801;

public class Transform {
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon == null) {
            System.out.println("没有兵器");
            return;
        }
        String type = getWeaponType(weapon.getType());
        // 武器名
        String name = weapon.getName();
        System.out.println(
                "使用" + type + name + "进攻");
        weapon.kill();
    }

    private String getWeaponType(int type) {
        String s = "";
        switch (type) {
            case Weapon.TYPE_COLD:
                s = "冷兵器";
                break;
            case Weapon.TYPE_HOT:
                s = "热武器";
                break;
            case Weapon.TYPE_NUCLEAR:
                s = "核武器";
                break;
            default:
                s = "空手";
                break;
        }
        return s;
    }
}
