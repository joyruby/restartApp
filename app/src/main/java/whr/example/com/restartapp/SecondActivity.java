package whr.example.com.restartapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    private Button killProcess;
    private Button newTask;
    private Button clearTop;
    private Button startMid;
    private Button startMain;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mContext = this;
        killProcess = (Button) findViewById(R.id.killprocess);
        newTask = (Button) findViewById(R.id.newTask);
        clearTop = (Button) findViewById(R.id.clearTop);
        startMid = (Button) findViewById(R.id.mid);
        startMain = (Button) findViewById(R.id.main);
        killProcess.setOnClickListener(this);
        newTask.setOnClickListener(this);
        clearTop.setOnClickListener(this);
        startMid.setOnClickListener(this);
        startMain.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.killprocess:
                restartUtls.killProcess();
                break;
            case R.id.newTask:
                restartUtls.restartApp(mContext, Intent.FLAG_ACTIVITY_NEW_TASK);
                break;
            case R.id.clearTop:
                restartUtls.restartApp(mContext,Intent.FLAG_ACTIVITY_CLEAR_TOP);
                break;
            case R.id.mid:
                startActivity(new Intent(SecondActivity.this,MidActivity.class));
                break;
            case R.id.main:
                startActivity(new Intent(SecondActivity.this,MainActivity.class));
                break;
        }
    }
}
