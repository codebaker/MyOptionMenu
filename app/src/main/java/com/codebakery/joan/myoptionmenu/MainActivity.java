package com.codebakery.joan.myoptionmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.linearLayout);
        button = findViewById(R.id.button);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.itemRed :
                linearLayout.setBackgroundColor(Color.RED);
                break;
            case R.id.itemGreen :
                linearLayout.setBackgroundColor(Color.GREEN);
                break;
            case R.id.itemBlue:
                linearLayout.setBackgroundColor(Color.BLUE);
                break;
            case R.id.subRotate :
                button.setRotation(45);
            break;
            case R.id.subSize :
                button.setScaleX(2);
            break;
            default:
                return true;
        }

        return false;
    }


}
