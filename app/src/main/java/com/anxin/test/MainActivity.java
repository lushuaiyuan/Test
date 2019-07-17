package com.anxin.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anxin.mylibrary.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void main(String[]args){
        Test test = new Test();
        System.out.print( test.addition(0.1, 0.2));
    }
}
