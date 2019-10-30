package com.evs.echarge.testclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Test test = new Test<Integer>();
        test.testData = 1;

        Obs obs = new Obs<Test>();

        Test result = (Test) doit(new Gson().toJson(test), obs);
        Log.d("---->" , "" + result.testData);
    }

    public <T> T doit(String text, Obs<T> obs){
        T t = new Gson().fromJson(text, new TypeToken<T>(){}.getType());
        return t;
    }

    class Obs<T>{
        public T obsData;
    }

    class Test<T>{
        public T testData;
    }
}
