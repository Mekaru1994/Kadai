package jp.techacademy.takaaki.mekaru.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable {
    // 変数
    String name;      // 名前
    int age;    // 年齢
    String hobby;      // 趣味

    //引数付きコンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // メソッド
    @Override
    public void say() {
        Log.d("javatest", "(私は" + this.name + "です。)" + "(年は" + this.age + "歳です。)");
    }

    public void think() {
        Log.d("javatest",  "(私の趣味は" + this.hobby + "です。)" );
    }
}