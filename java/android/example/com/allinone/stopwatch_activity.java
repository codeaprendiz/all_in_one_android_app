package android.example.com.allinone;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class stopwatch_activity extends AppCompatActivity {
    private int seconds=0;
    private boolean running;
    private boolean wasRunning;//to record whether the stopwatch was running before the onCreate() was called.
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("seconds",seconds);
        savedInstanceState.putBoolean("running",running);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(savedInstanceState!=null) {
            seconds=savedInstanceState.getInt("seconds");
            running=savedInstanceState.getBoolean("running");
            wasRunning=savedInstanceState.getBoolean("wasRunning");
        }
        runTimer();//we are using a separate method to update the stopwatch. We are starting it when the activity starts.
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    protected void onStop() {
        super.onStop();
        wasRunning=true;
        running=false;
    }

    /*
    @Override
    protected void onPause() {
        super.onPause();
        wasRunning = true;
        running = false;
    }
    */
    @Override
    protected void onStart() {
        super.onStart();
        if(wasRunning) {
            running=true;
        }
    }
    /*
    @Override
    protected void onResume() {
        super.onResume();
        if (wasRunning) {
            running = true;
        }
    }
    */
    //Start the stopwatch running when the start button is clicked.
    public void onClickStart(View view) {
        running=true;
    }

    //Stop the stopwatch running when the Stop button is clicked.

    public void onClickStop(View view) {
        running=false;
    }

    public void onClickReset(View view){
        running=false;
        seconds=0;
    }
    //sets the number of seconds on the timer.
    private void runTimer() {
        final TextView timeView=(TextView)findViewById(R.id.time_view);
        final Handler handler=new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds / 3600;
                int minutes = (seconds % 3600) / 60;
                int secs = seconds % 60;
                String time = String.format("%d:%02d:%02d",
                        hours, minutes, secs);
                timeView.setText(time);
                if (running) {
                    seconds++;
                }
                handler.postDelayed(this, 1000);//Post the code again with a Delay of 1 second.
            }
        });
    }
}
