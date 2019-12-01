package com.example.materialdesignhomeworck;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText editText;
    Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        initUi();
    }

    protected  void initUi() {
        editText = findViewById(R.id.editText);
        editText.setOnKeyListener(new View.OnKeyListener()
        {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if( editText.getText().length() > 10 ) {
                      Toast.makeText(v.getContext(), "так то-же не работает $ \n это перекрывает клавиатуру ", Toast.LENGTH_SHORT).show();
                    }

                return false;
            }


        });

    }

    public void buttonClick(View view) {

        if(editText.getText().length()== 0){
            Snackbar.make( view, "Так не работает", Snackbar.LENGTH_SHORT).show();

        }


    }


}
