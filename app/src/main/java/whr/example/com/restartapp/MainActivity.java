package whr.example.com.restartapp;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private TextView textView;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.pid);
        button.setOnClickListener(this);
        textView.setText("currentpid:"+ Process.myPid());
        mContext = this;
    }

    @Override
    public void onClick(View v) {
        int tag = v.getId();
        switch (tag){
            case R.id.button:
                Intent intent = new Intent(MainActivity.this,MidActivity.class);
                mContext.startActivity(intent);
                break;
        }

    }
}
