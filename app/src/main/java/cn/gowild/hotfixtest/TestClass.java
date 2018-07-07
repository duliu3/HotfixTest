package cn.gowild.hotfixtest;

import android.app.Application;
import android.widget.Toast;

class TestClass {
    public void showToast(String str,Application context){
        Toast.makeText(context,"i am bug!"+1/0,Toast.LENGTH_SHORT).show();
    }
}
