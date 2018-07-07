package cn.gowild.hotfixtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void fix(View view){
        FixEngine fixEngine = new FixEngine(MainActivity.this);
        fixEngine.copyDexFileToAppAndFix(this,"fix_dex.dex",true);

    }

    public void bug(View view){
            new TestClass().showToast(null,getApplication());
    }

}
