package whr.example.com.restartapp;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Process;

/**
 * Created by whrwhr446 on 07/08/2017.
 */

public class restartUtls {
    public static String getPackageName(Context context){
        if(context == null) return "";
        return context.getPackageName();
    }
    public  static void restartApp(Context context,int flag){
        String pakageName = getPackageName(context);
        PackageManager packageManager = context.getPackageManager();
        Intent intent = packageManager.getLaunchIntentForPackage(pakageName);
        intent.setFlags(flag);
        context.startActivity(intent);
    }
    public static void killProcess(){
        Process.killProcess(Process.myPid());
    }
}
