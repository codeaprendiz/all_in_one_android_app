package android.example.com.allinone;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class calculator extends AppCompatActivity {
    private static  final String TAG ="Calculator2";
    Button zero,one,two,three,four,five,six,seven, eight, nine, plus,minus,mul,div,eq,ac;
    TextView viewText;
    String a="",lastButton="nothing",secondLastButton="0";
    float aa=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Log.i(TAG,"onCreate");

        zero = (Button) findViewById(R.id.button0);
        one = (Button) findViewById(R.id.button1);
        two = (Button) findViewById(R.id.button2);
        three = (Button) findViewById(R.id.button3);
        four = (Button) findViewById(R.id.button4);
        five = (Button) findViewById(R.id.button5);
        six = (Button) findViewById(R.id.button6);
        seven = (Button) findViewById(R.id.button7);
        eight = (Button) findViewById(R.id.button8);
        nine = (Button) findViewById(R.id.button9);
        plus = (Button) findViewById(R.id.buttonp);
        minus = (Button) findViewById(R.id.buttonm);
        mul = (Button) findViewById(R.id.buttonmul);
        div = (Button) findViewById(R.id.buttondiv);
        eq = (Button) findViewById(R.id.buttoneq);
        ac = (Button) findViewById(R.id.buttonac);
        viewText = (TextView) findViewById(R.id.textView);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v0) {
                a = a + "0";
                viewText.setText(a);
                aa=calculateResult(aa,"0",lastButton);
                viewText.setText(String.valueOf(aa));
                lastButton="0";
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                a = a + "1";
                viewText.setText(a);
                aa=calculateResult(aa,"1",lastButton);
                viewText.setText(String.valueOf(aa));
                lastButton="1";
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                a = a + "2";
                viewText.setText(a);
                aa=calculateResult(aa,"2",lastButton);
                viewText.setText(String.valueOf(aa));
                lastButton="2";
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a + "3";
                viewText.setText(a);
                aa=calculateResult(aa,"3",lastButton);
                viewText.setText(String.valueOf(aa));
                lastButton="3";
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a + "4";
                viewText.setText(a);
                aa=calculateResult(aa,"4",lastButton);
                viewText.setText(String.valueOf(aa));
                lastButton="4";
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a + "5";
                viewText.setText(a);
                aa=calculateResult(aa,"5",lastButton);
                viewText.setText(String.valueOf(aa));
                lastButton="5";
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a + "6";
                viewText.setText(a);
                aa=calculateResult(aa,"6",lastButton);
                viewText.setText(String.valueOf(aa));
                lastButton="6";
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a + "7";
                viewText.setText(a);
                aa=calculateResult(aa,"7",lastButton);
                viewText.setText(String.valueOf(aa));
                lastButton="7";
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a + "8";
                viewText.setText(a);
                aa=calculateResult(aa,"8",lastButton);
                viewText.setText(String.valueOf(aa));
                lastButton="8";
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = a + "9";
                viewText.setText(a);
                aa=calculateResult(aa,"9",lastButton);
                viewText.setText(String.valueOf(aa));
                lastButton="9";
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aa=calculateResult(aa,"+",lastButton);
                viewText.setText(String.valueOf(aa));
                a = "";
                secondLastButton="+";
                lastButton="+";
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aa=calculateResult(aa,"-",lastButton);
                viewText.setText(String.valueOf(aa));
                a = "";
                secondLastButton="-";
                lastButton="-";
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aa=calculateResult(aa,"*",lastButton);
                viewText.setText(String.valueOf(aa));
                a = "";
                secondLastButton="*";
                lastButton="*";
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aa=calculateResult(aa,"/",lastButton);
                viewText.setText(String.valueOf(aa));
                a = "";
                secondLastButton="/";
                lastButton="/";
            }
        });

        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aa=calculateResult(aa,secondLastButton,lastButton);
                viewText.setText(String.valueOf(aa));
                a = "";
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = "";
                aa = 0;
                viewText.setText(a);
                lastButton="nothing";
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");
    }

    public float calculateResult(float aa,String currentButton,String lastButton) {
        switch (lastButton) {
            case "+" :
                switch (currentButton) {
                    case "0":
                    case "1":
                        aa=aa+Float.valueOf(currentButton);
                        break;
                    case "2":
                        aa=aa+Float.valueOf(currentButton);
                        break;
                    case "3":
                        aa=aa+Float.valueOf(currentButton);
                        break;
                    case "4":
                        aa=aa+Float.valueOf(currentButton);
                        break;
                    case "5":
                        aa=aa+Float.valueOf(currentButton);
                        break;
                    case "6":
                        aa=aa+Float.valueOf(currentButton);
                        break;
                    case "7":
                        aa=aa+Float.valueOf(currentButton);
                        break;
                    case "8":
                        aa=aa+Float.valueOf(currentButton);
                        break;
                    case "9":
                        aa=aa+Float.valueOf(currentButton);
                        break;
                    default :
                        ;
                }
                break;
            case "-":
                switch (currentButton) {
                    case "0":
                    case "1":
                        aa=aa-Float.valueOf(currentButton);
                        break;
                    case "2":
                        aa=aa-Float.valueOf(currentButton);
                        break;
                    case "3":
                        aa=aa-Float.valueOf(currentButton);
                        break;
                    case "4":
                        aa=aa-Float.valueOf(currentButton);
                        break;
                    case "5":
                        aa=aa-Float.valueOf(currentButton);
                        break;
                    case "6":
                        aa=aa-Float.valueOf(currentButton);
                        break;
                    case "7":
                        aa=aa-Float.valueOf(currentButton);
                        break;
                    case "8":
                        aa=aa-Float.valueOf(currentButton);
                        break;
                    case "9":
                        aa=aa-Float.valueOf(currentButton);
                        break;
                    default :
                        ;
                }
                break;
            case "*":
                switch (currentButton) {
                    case "0":
                        aa=aa*Float.valueOf(currentButton);
                        break;
                    case "1":
                        aa=aa*Float.valueOf(currentButton);
                        break;
                    case "2":
                        aa=aa*Float.valueOf(currentButton);
                        break;
                    case "3":
                        aa=aa*Float.valueOf(currentButton);
                        break;
                    case "4":
                        aa=aa*Float.valueOf(currentButton);
                        break;
                    case "5":
                        aa=aa*Float.valueOf(currentButton);
                        break;
                    case "6":
                        aa=aa*Float.valueOf(currentButton);
                        break;
                    case "7":
                        aa=aa*Float.valueOf(currentButton);
                        break;
                    case "8":
                        aa=aa*Float.valueOf(currentButton);
                        break;
                    case "9":
                        aa=aa*Float.valueOf(currentButton);
                        break;
                    default :
                        ;
                }
                break;
            case "/":
                switch (currentButton) {
                    case "1":
                        aa=aa/Float.valueOf(currentButton);
                        break;
                    case "2":
                        aa=aa/Float.valueOf(currentButton);
                        break;
                    case "3":
                        aa=aa/Float.valueOf(currentButton);
                        break;
                    case "4":
                        aa=aa/Float.valueOf(currentButton);
                        break;
                    case "5":
                        aa=aa/Float.valueOf(currentButton);
                        break;
                    case "6":
                        aa=aa/Float.valueOf(currentButton);
                        break;
                    case "7":
                        aa=aa/Float.valueOf(currentButton);
                        break;
                    case "8":
                        aa=aa/Float.valueOf(currentButton);
                        break;
                    case "9":
                        aa=aa/Float.valueOf(currentButton);
                        break;
                    default :
                        ;
                }
                break;
            case "nothing":
                switch (currentButton) {
                    case "0":
                    case "1":
                        aa=aa+Float.valueOf(currentButton);
                        break;
                    case "2":
                        aa=aa+Float.valueOf(currentButton);
                        break;
                    case "3":
                        aa=aa+Float.valueOf(currentButton);
                        break;
                    case "4":
                        aa=aa+Float.valueOf(currentButton);
                        break;
                    case "5":
                        aa=aa+Float.valueOf(currentButton);
                        break;
                    case "6":
                        aa=aa+Float.valueOf(currentButton);
                        break;
                    case "7":
                        aa=aa+Float.valueOf(currentButton);
                        break;
                    case "8":
                        aa=aa+Float.valueOf(currentButton);
                        break;
                    case "9":
                        aa=aa+Float.valueOf(currentButton);
                        break;
                    default :
                        ;
                }
                break;
            case "1":
                switch(currentButton) {
                    case "1":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "2":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "3":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "4":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "5":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "6":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "7":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "8":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "9":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    default:
                        break;
                }
                break;

            case "2":
                switch(currentButton) {
                    case "1":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "2":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "3":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "4":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "5":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "6":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "7":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "8":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "9":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    default:
                        break;
                }
                break;

            case "3":
                switch(currentButton) {
                    case "1":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "2":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "3":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "4":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "5":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "6":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "7":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "8":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "9":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    default:
                        break;
                }
                break;

            case "4":
                switch(currentButton) {
                    case "1":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "2":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "3":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "4":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "5":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "6":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "7":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "8":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "9":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    default:
                        break;
                }
                break;
            case "5":
                switch(currentButton) {
                    case "1":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "2":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "3":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "4":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "5":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "6":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "7":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "8":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "9":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    default:
                        break;
                }
                break;
            case "6":
                switch(currentButton) {
                    case "1":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "2":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "3":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "4":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "5":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "6":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "7":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "8":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "9":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    default:
                        break;
                }
                break;
            case "7":
                switch(currentButton) {
                    case "1":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "2":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "3":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "4":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "5":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "6":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "7":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "8":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "9":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    default:
                        break;
                }
                break;
            case "8":
                switch(currentButton) {
                    case "1":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "2":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "3":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "4":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "5":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "6":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "7":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "8":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "9":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    default:
                        break;
                }
                break;
            case "9":
                switch(currentButton) {
                    case "1":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "2":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "3":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "4":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "5":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "6":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "7":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "8":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    case "9":
                        aa=aa*10+Float.valueOf(currentButton);
                        break;
                    default:
                        break;
                }
            default:
                break;
        }
        return aa;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        //return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        // int id = item.getItemId();

        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(getBaseContext(), "Work in progress for Settings :P", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                fragment_calculator frag=new fragment_calculator();
                //no idea why i have to give the following id. It should be fragmentLinearLayoutCalculator
                ft.add(R.id.mainLinearLayoutCalculator,frag);
                ft.addToBackStack(null);
                ft.commit();
                break;
        }
        return true;
        //noinspection SimplifiableIfStatement
        /*
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
        */
    }

    @Override
    public void onBackPressed() {

        if(getFragmentManager().getBackStackEntryCount() == 0)
            android.os.Process.killProcess(android.os.Process.myPid());
        else
            getFragmentManager().popBackStack();

    }

}
