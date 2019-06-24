package com.mrjuoss.dicoding.simplefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    Button btnHome, btnAbout, btnHelp, btnExit;
    HomeFragment homeFragment;
    AboutFragment aboutFragment;
    HelpFragment helpFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHome = findViewById(R.id.btn_home);
        btnAbout = findViewById(R.id.btn_about);
        btnHelp = findViewById(R.id.btn_help);
        btnExit = findViewById(R.id.btn_exit);

        btnHome.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
        btnHelp.setOnClickListener(this);
        btnExit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_home:
                mHome();
                break;
            case R.id.btn_about:
                mAbout();
                break;
            case R.id.btn_help:
                mHelp();
                break;
            case R.id.btn_exit:
                mExit();
                break;
        }
    }

    private void mHome() {
        homeFragment = new HomeFragment();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, homeFragment);
        ft.commit();
    }

    private void mAbout() {
        aboutFragment = new AboutFragment();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, aboutFragment);
        ft.commit();
    }

    private void mHelp() {
        helpFragment = new HelpFragment();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, helpFragment);
        ft.commit();
    }

    private void mExit() {
        finish();
    }
}
