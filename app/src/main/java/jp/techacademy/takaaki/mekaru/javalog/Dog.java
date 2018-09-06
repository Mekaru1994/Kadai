package jp.techacademy.takaaki.mekaru.javalog;

import android.util.Log;

import java.security.PublicKey;

class Dog extends Animal implements Movable{
    //クラス変数
    static String to_jp ="犬";

    //コンストラクタ
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    //クラス関数
    public static void intoroduce(){
        Log.d("javatest" , "これは犬クラスです。");
    }
    //メンバ関数
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }

    @Override
    public void move() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った。");
    }
}