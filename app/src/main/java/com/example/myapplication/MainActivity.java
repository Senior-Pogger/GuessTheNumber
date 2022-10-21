package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;

import android.content.Intent;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView background;
    private int number;
    Button button1_100;
    Button button1_50;
    Button button1_10;
    Button buttonEnter;
    Button buttonZero;
    Button buttonTen;
    Button buttonOne;
    Button buttonMinus;
    private int numberG=0;
    private int counter;
    TextView responseTextView;
    TextView numberTextView;
    TextView CountText;
    Button buttonRestart;
    Button btnsave;
    String strfname,strlname;
    EditText etFname , etLname;
    SharedPreferences sp;
    TextView name;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        super.onOptionsItemSelected(item);

        if(item.getItemId()==R.id.action_first)
        {
            background.setImageResource(R.drawable.background);
            View a = findViewById(R.id.button_one);
            a.setVisibility(View.GONE);
            View c = findViewById(R.id.button2);
            c.setVisibility(View.GONE);
            View d = findViewById(R.id.button3);
            d.setVisibility(View.GONE);
            View z = findViewById(R.id.button4);
            z.setVisibility(View.GONE);
            View v =findViewById(R.id.button5);
            v.setVisibility(View.GONE);
            View l =findViewById(R.id.button6);
            l.setVisibility(View.GONE);
            View o =findViewById(R.id.button7);
            o.setVisibility(View.GONE);
            View k =findViewById(R.id.textView);
            k.setVisibility(View.GONE);
            View M =findViewById(R.id.button8);
            M.setVisibility(View.GONE);
            View w =findViewById(R.id.button);
            w.setVisibility(View.GONE);
            CountText.setText("");
            numberG=0;

            return true;

        }
        if(item.getItemId()==R.id.action_second)
        {
            View a = findViewById(R.id.button_one);
            a.setVisibility(View.VISIBLE);
            View c = findViewById(R.id.button2);
            c.setVisibility(View.VISIBLE);
            View d = findViewById(R.id.button3);
            d.setVisibility(View.VISIBLE);
            background.setImageResource(R.drawable.game);
            numberG=0;
            responseTextView.setText("");
            name.setText("");
            btnsave.setVisibility(View.GONE);
            CountText.setText("");
            View e = findViewById(R.id.button);
            e.setVisibility(View.GONE);
            return true;
        }

        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        background = findViewById(R.id.imageView2);

        button1_100 = findViewById(R.id.button_one);
        button1_50 = findViewById(R.id.button2);
        button1_10 = findViewById(R.id.button3);
        buttonEnter = findViewById(R.id.button4);
        buttonZero = findViewById(R.id.button5);
        buttonTen = findViewById(R.id.button6);
        buttonOne = findViewById(R.id.button7);
        buttonRestart = findViewById(R.id.button);
        numberTextView =findViewById(R.id.textView);
        numberTextView.setText(""+numberG);
        responseTextView = findViewById(R.id.textView2);
        CountText = findViewById(R.id.textView3);
        buttonMinus = findViewById(R.id.button8);
        btnsave = findViewById(R.id.button9);
        etFname=(EditText)findViewById(R.id.etFname);
        etLname=(EditText)findViewById(R.id.etLname);
        name=(TextView) findViewById(R.id.textView4);


        sp = getSharedPreferences("details1",0);

        strfname = sp.getString("fname",null);
        strlname = sp.getString("lname",null);
        if(strfname!=null&&strlname!=null)
        {

        }

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnsave == v)
                {
                    SharedPreferences.Editor editor = sp.edit();
                    editor.putString("fname",etFname.getText().toString());
                    editor.putString("lname",etLname.getText().toString());
                    editor.commit();
                    View a = findViewById(R.id.imageView2);
                    a.setVisibility(View.VISIBLE);
                    View b =findViewById(R.id.etLname);
                    b.setVisibility(View.GONE);
                    View c =findViewById(R.id.etFname);
                    c.setVisibility(View.GONE);
                    View d =findViewById(R.id.button9);
                    d.setVisibility(View.GONE);
                    View e =findViewById(R.id.textView4);
                    e.setVisibility(View.VISIBLE);
                    strfname = sp.getString("fname",null);
                    strlname = sp.getString("lname",null);
                    name.setText("Hello: "+strfname+" "+strlname);

                }
            }
        });



        button1_100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=0;
                number=(int)(Math.random()*100)+1;
                View z = findViewById(R.id.button4);
                z.setVisibility(View.VISIBLE);
                View v =findViewById(R.id.button5);
                v.setVisibility(View.VISIBLE);
                View l =findViewById(R.id.button6);
                l.setVisibility(View.VISIBLE);
                View o =findViewById(R.id.button7);
                o.setVisibility(View.VISIBLE);
                View k =findViewById(R.id.textView);
                k.setVisibility(View.VISIBLE);
                View m =findViewById(R.id.button8);
                m.setVisibility(View.VISIBLE);
                responseTextView.setText("");
                numberG=0;
                numberTextView.setText(""+numberG);
            }
        });
        button1_50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=0;
                number=(int)(Math.random()*50)+1;
                View z = findViewById(R.id.button4);
                z.setVisibility(View.VISIBLE);
                View v =findViewById(R.id.button5);
                v.setVisibility(View.VISIBLE);
                View l =findViewById(R.id.button6);
                l.setVisibility(View.VISIBLE);
                View o =findViewById(R.id.button7);
                o.setVisibility(View.VISIBLE);
                View k =findViewById(R.id.textView);
                k.setVisibility(View.VISIBLE);
                View m =findViewById(R.id.button8);
                m.setVisibility(View.VISIBLE);
                responseTextView.setText("");
                numberG=0;
                numberTextView.setText(""+numberG);
            }
        });
        button1_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=0;
                number=(int)(Math.random()*10)+1;
                View z = findViewById(R.id.button4);
                z.setVisibility(View.VISIBLE);
                View v =findViewById(R.id.button5);
                v.setVisibility(View.VISIBLE);
                View l =findViewById(R.id.button6);
                l.setVisibility(View.VISIBLE);
                View o =findViewById(R.id.button7);
                o.setVisibility(View.VISIBLE);
                View k =findViewById(R.id.textView);
                k.setVisibility(View.VISIBLE);
                View m =findViewById(R.id.button8);
                m.setVisibility(View.VISIBLE);
                responseTextView.setText("");
                numberG=0;
                numberTextView.setText(""+numberG);
            }
        });
        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("guess");
                alert.setMessage("are you sure you want to enter your guess?");
                alert.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        counter++;
                        if(numberG>number)
                        {
                            responseTextView.setText("Too High");

                        }
                        if(numberG<number)
                        {
                            responseTextView.setText("Too Low");

                        }
                        if(numberG==number)
                        {
                            background.setImageResource(R.drawable.winscreen);
                            CountText.setText(counter+" Tries");
                            counter=0;
                            responseTextView.setText("");
                            numberTextView.setText("");
                            View a = findViewById(R.id.button_one);
                            a.setVisibility(View.GONE);
                            View c = findViewById(R.id.button2);
                            c.setVisibility(View.GONE);
                            View d = findViewById(R.id.button3);
                            d.setVisibility(View.GONE);
                            View z = findViewById(R.id.button4);
                            z.setVisibility(View.GONE);
                            View v =findViewById(R.id.button5);
                            v.setVisibility(View.GONE);
                            View l =findViewById(R.id.button6);
                            l.setVisibility(View.GONE);
                            View o =findViewById(R.id.button7);
                            o.setVisibility(View.GONE);
                            View k =findViewById(R.id.textView);
                            k.setVisibility(View.GONE);
                            View M =findViewById(R.id.button8);
                            M.setVisibility(View.GONE);
                            View w =findViewById(R.id.button);
                            w.setVisibility(View.VISIBLE);

                        }


                    }


                });
                alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                alert.create().show();
            }
        });

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberG=0;
                numberTextView.setText(""+numberG);


            }
        });
        buttonTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberG+=10;
                numberTextView.setText(""+numberG);


            }
        });
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberG++;
                numberTextView.setText(""+numberG);


            }

        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberG--;
                numberTextView.setText(""+numberG);
            }
        });
        buttonRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View a = findViewById(R.id.button_one);
                a.setVisibility(View.VISIBLE);
                View c = findViewById(R.id.button2);
                c.setVisibility(View.VISIBLE);
                View d = findViewById(R.id.button3);
                d.setVisibility(View.VISIBLE);
                View w = findViewById(R.id.button);
                w.setVisibility(View.GONE);
                View h = findViewById(R.id.button8);
                h.setVisibility(View.GONE);
                CountText.setText("");
                background.setImageResource(R.drawable.game);
                numberG=0;
            }
        });



    }
}