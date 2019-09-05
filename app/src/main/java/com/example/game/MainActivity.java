package com.example.game;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {
    private Button mButtonTic;
    private Button mButtonRow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonTic = findViewById(R.id.button_TicTac);
        mButtonRow = findViewById(R.id.button_4raw);

        mButtonTic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);

                fragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, new TicTakToe())/////
                        .commit();
            }
        });


        mButtonRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);

                fragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, new Rawin4())/////
                        .commit();
            }
        });


    }


}
