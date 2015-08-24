package com.example.alexa.xy;


import android.app.AlertDialog;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener
        {
            ImageButton bt1;
            ImageButton bt2;
            ImageButton bt3;
            ImageButton bt4;
            ImageButton bt5;
            ImageButton bt6;
            ImageButton bt7;
            ImageButton bt8;
            ImageButton bt9;
            ImageButton btp;

            int counter=0;
            int counter1=0;
            int pp;
            String ppp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1=(ImageButton) findViewById(R.id.bt1);
        bt2=(ImageButton) findViewById(R.id.bt2);
        bt3=(ImageButton) findViewById(R.id.bt3);
        bt4=(ImageButton) findViewById(R.id.bt4);
        bt5=(ImageButton) findViewById(R.id.bt5);
        bt6=(ImageButton) findViewById(R.id.bt6);
        bt7=(ImageButton) findViewById(R.id.bt7);
        bt8=(ImageButton) findViewById(R.id.bt8);
        bt9=(ImageButton) findViewById(R.id.bt9);
        btp=(ImageButton) findViewById(R.id.btp);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        btp.setOnClickListener(this);

    }


    public void onClick(View v) {
        if (v.getId() == R.id.bt1) {
            play(bt1);
        } else if (v.getId() == R.id.bt2) {
            play(bt2);
        }
        if (v.getId() == R.id.bt3) {
            play(bt3);
        } else if (v.getId() == R.id.bt4) {
            play(bt4);
        }
        if (v.getId() == R.id.bt5) {
            play(bt5);
        } else if (v.getId() == R.id.bt6) {
            play(bt6);
        }
        if (v.getId() == R.id.bt8) {
            play(bt8);
        } else if (v.getId() == R.id.bt7) {
            play(bt7);
        }
        if (v.getId() == R.id.bt9) {
            play(bt9);
        } else if (v.getId() == R.id.btp) {
            end();
        }

    }




public void end ()
{
    bt1.setImageResource(R.drawable.bg1);
    bt2.setImageResource(R.drawable.bg2);
    bt3.setImageResource(R.drawable.bg3);
    bt4.setImageResource(R.drawable.bg4);
    bt5.setImageResource(R.drawable.bg5);
    bt6.setImageResource(R.drawable.bg6);
    bt7.setImageResource(R.drawable.bg7);
    bt8.setImageResource(R.drawable.bg8);
    bt9.setImageResource(R.drawable.bg9);
    bt1.setContentDescription("a");
    bt2.setContentDescription("b");
    bt3.setContentDescription("c");
    bt4.setContentDescription("d");
    bt5.setContentDescription("e");
    bt6.setContentDescription("f");
    bt7.setContentDescription("g");
    bt8.setContentDescription("h");
    bt9.setContentDescription("i");
    counter = 0;

}
   public void play (ImageButton but) {

       if (counter == 0) {
           but.setImageResource(R.drawable.x);
           but.setContentDescription("x");
           counter++;
           counter1++;
       } else
       {
           but.setImageResource(R.drawable.y);
           but.setContentDescription("y");
          // tvv.setText("מזל טוב לY");
           counter = 0;
           counter1++;
       }

       if(bt1.getContentDescription()==bt2.getContentDescription()&&bt1.getContentDescription()==bt3.getContentDescription())
       {popup();}
       else if(bt4.getContentDescription()==bt5.getContentDescription()&&bt5.getContentDescription()==bt6.getContentDescription())
       {popup();}
       if(bt7.getContentDescription()==bt8.getContentDescription()&&bt8.getContentDescription()==bt9.getContentDescription())
       {popup();}
       else if(bt1.getContentDescription()==bt4.getContentDescription()&&bt4.getContentDescription()==bt7.getContentDescription())
       {popup();}
       if(bt2.getContentDescription()==bt5.getContentDescription()&&bt5.getContentDescription()==bt8.getContentDescription())
       {popup();}
       else if(bt3.getContentDescription()==bt6.getContentDescription()&&bt6.getContentDescription()==bt9.getContentDescription())
       {popup();}
       if(bt1.getContentDescription()==bt5.getContentDescription()&&bt5.getContentDescription()==bt9.getContentDescription())
       {popup();}
       else if(bt3.getContentDescription()==bt5.getContentDescription()&&bt5.getContentDescription()==bt7.getContentDescription())
       {popup();}


           }



        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

private void popup() {

    pp=counter;
    if (pp==0){
        ppp="O";
            }
    else{
        ppp="X";
    }

    new AlertDialog.Builder(MainActivity.this)
            .setTitle("יש לנו מנצח")
            .setMessage(ppp)
            .setCancelable(false)
            .setPositiveButton("סגור", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    end();
                }
            })  .create().show();

}

            @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

