package android.example.com.allinone;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;


public class basic_buttons_usage extends AppCompatActivity {
    private TextView textViewSpinner;
    private TextView textViewButton;
    private TextView textViewToggleButton;
    private TextView textViewSwitch;
    private TextView textViewCheckBox;
    private TextView textViewRadioButton;
    private TextView textViewImageButton;

    private TextView mainTextView;

    private Spinner spinner;

    private CheckBox checkBox;

    private RadioGroup radioGroup;
    private RatingBar ratingBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_buttons_usage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textViewSpinner=(TextView)findViewById(R.id.textViewSpinner);
        textViewButton=(TextView)findViewById(R.id.textViewButton);
        textViewToggleButton=(TextView)findViewById(R.id.textViewToggleButton);
        textViewSwitch=(TextView)findViewById(R.id.textViewSwitch);
        textViewCheckBox=(TextView)findViewById(R.id.textViewCheckBox);
        textViewRadioButton=(TextView)findViewById(R.id.textViewRadioButton);
        textViewImageButton=(TextView)findViewById(R.id.textViewImageButton);
        mainTextView=(TextView)findViewById(R.id.mainTextView);

        spinner=(Spinner)findViewById(R.id.spinner);

        checkBox=(CheckBox)findViewById(R.id.checkBox);

        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        ratingBar=(RatingBar)findViewById(R.id.ratingBar);
    }
    //call when the user clicks the button
    public void onButtonClicked(View view){
        String string=String.valueOf(spinner.getSelectedItem());
        textViewSpinner.setText(string);
        string="Atta Boy. You clicked me. Keep it up";
        textViewButton.setText(string);
        mainTextView.setText("Dont forget to scroll down :P.");
    }

    public void onToggleButtonClicked(View view) {
        boolean on = ((ToggleButton) view).isChecked();
        if(on) {
            textViewToggleButton.setText("Oh! You have turned me on. XD!");
        }
        else {
            textViewToggleButton.setText("Hey! You moron. Can't you see I am still off");
        }
    }

    public void onSwitchClicked(View view) {
        boolean on = ((Switch) view).isChecked();
        if(on) {
            textViewSwitch.setText("Oh! You have turned me on. XD!");
        }
    }

    public void onCheckBoxClicked(View view) {
        boolean checked = checkBox.isChecked();
        if(checked) {
            textViewCheckBox.setText("CheckBox is checked");
        }
        /*
        We can use switchcase also in case we have multiple chekckboxes
        // Retrieve which checkbox was clicked
            switch(view.getId()) {
                case R.id.checkbox_milk:
                    if (checked)
                        // Milky coffee
                    else
                        // Black as the midnight sky on a moonless night
                        break;
                case R.id.checkbox_sugar:
                    if (checked)
                        // Sweet
                    else
                        // Keep it bitter
                        break;
            }
        */

    }
    public void onImageButtonClicked(View view) {
        boolean checked = checkBox.isChecked();
        if (checked) {
            textViewImageButton.setText("So you clicked the checkBox too!");
        }
        else {
            textViewImageButton.setText("What about the above two buttons -_-");
        }
        int id = radioGroup.getCheckedRadioButtonId();
        if(id==-1){
            textViewRadioButton.setText("I am radio Button. Click me");
            //No selected items codition
        }
        else {
           // RadioButton radioButton=findViewById(id);
        }
    }

    public void onSmallButtonClicked(View view) {

        String rating=String.valueOf(ratingBar.getRating());
        Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();
    }

}
