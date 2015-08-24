/* package com.example.alexa.xy;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;


public class XY extends AppCompatActivity implements View.OnClickListener
{



  ImageButton bt1=(ImageButton) findViewById(R.id.bt1);
  ImageButton bt2=(ImageButton) findViewById(R.id.bt2);
  ImageButton bt3=(ImageButton) findViewById(R.id.bt3);
  ImageButton bt4=(ImageButton) findViewById(R.id.bt4);
  ImageButton bt5=(ImageButton) findViewById(R.id.bt5);
  ImageButton bt6=(ImageButton) findViewById(R.id.bt6);
  ImageButton bt7=(ImageButton) findViewById(R.id.bt7);
  ImageButton bt8=(ImageButton) findViewById(R.id.bt8);
  ImageButton bt9=(ImageButton) findViewById(R.id.bt9);
  ImageButton btPlay=(ImageButton) findViewById(R.id.btplay);

  int counter=0;
  int counter1=0;


    public void play (ImageButton button)
    {
        if(counter==0) {
            button.setImageResource(R.drawable.x);
            button.setVisibility(View.VISIBLE);
            counter++;
            counter1++;
        }
        button.setImageResource(R.drawable.y);
        button.setVisibility(View.VISIBLE);

        counter=0;
        counter1++;
    }
    @Override
    public View findViewById(int id) {
        return super.findViewById(id);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.bt1)
        {
            play(bt1);
        }
        else if(v.getId() == R.id.bt2)
        {
            play(bt2);
        }
        if (v.getId() == R.id.bt3)
        {
            play(bt3);
        }
        else if(v.getId() == R.id.bt4)
        {
            play(bt4);
        }
        if (v.getId() == R.id.bt5)
        {
            play(bt5);
        }
        else if(v.getId() == R.id.bt6)
        {
            play(bt6);
        }
        if (v.getId() == R.id.bt8)
        {
            play(bt8);
        }
        else if(v.getId() == R.id.bt7)
        {
            play(bt7);
        }        if (v.getId() == R.id.bt9)
        {
            play(bt9);
        }
        else if(v.getId() == R.id.btplay)
        {
            play(btPlay);
        }




    }

}



*/