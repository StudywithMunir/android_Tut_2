package com.example.android_tut_2;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;


//we are extending activity_2 class with Activity
//now we can use Activity class methods
//public=accessible by other classes
public class activity_2 extends Activity {

    //adding onCreate method
    //right click between method>Generate>Override Method>then choose>OnCreate with Bundle savedInstanceState>ok


//    @Override
    //onCreate method is using parameters = Bundle variable type & savedInstanceState can be anything like MunirLovesCoding
//    protected void onCreate(Bundle MunirLovesCoding) {
            //we are sending MunirLovesCoding variable to super class and sending some data like MunirLovesCoding

//        super.onCreate(MunirLovesCoding);
//    }


    @Override
    //onCreate method is using parameters = Bundle variable type & savedInstanceState can be anything
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setting tut_2_layout for activity_2 with the help of setContentView
        setContentView(R.layout.tut_2_layout);

        //doing modifications in AndroidManifest so we can open activity_2 before activity_main.xml

    }



}
