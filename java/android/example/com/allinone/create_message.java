package android.example.com.allinone;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class create_message extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onButtonClicked(View view) {
        EditText messageView = (EditText)findViewById(R.id.message);
        String messageText=messageView.getText().toString();
        /*Here we can send the message to already decided activity or we can let the android decide that.
        If we explicity dont give the activity name and do as is done here then android gives all the
        list of apps having activities that can handle
        ACTION_SEND   have it in their android_manifest file
        text/plain    in their android_mainfest file.
        */
        //1 Intent intent = new Intent(this, ReceiveMessageActivity.class);
        //1 intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,messageText); //instead of creating an intent thats explictly for
        //1 receiveMessageActivity .. we are creating an intent that uses a send action.
        //2 startActivity(intent);
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,messageText);
        String chooserTitle="Now choose the app you want to use to send the message";
        Intent choosenIntent= Intent.createChooser(intent, chooserTitle);
        startActivity(choosenIntent);

    }

}
