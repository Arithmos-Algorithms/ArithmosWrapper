package com.scrappers.arithmoswrapper;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import main.TestCase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // test
        TestCase.main(null);
    }
}