package jp.techacademy.takaaki.mekaru.javalog;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Half;
        import android.util.Log;    // ここを追加
        import android.util.LogPrinter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("山田次郎", 25, "映画鑑賞");     // 名前を山田太郎、年齢25歳で、Humanのインスタンスを作る

        human.think();
        human.say();

            }
}
