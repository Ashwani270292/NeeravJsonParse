package com.ashwani.jsonparser;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ashwani.jsonparser.models.AboutProfileResponse;
import com.ashwani.jsonparser.models.Coworker;
import com.ashwani.jsonparser.models.Image;
import com.ashwani.jsonparser.models.OfficeCoworker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;

public class MainActivity extends AppCompatActivity {

    AboutProfileResponse aboutProfileResponse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String str = "";
        try
        {
            AssetManager assetManager = getAssets();
            InputStream in = assetManager.open("myJsonFile.txt");
            InputStreamReader isr = new InputStreamReader(in);
            char [] inputBuffer = new char[100];

            int charRead;
            while((charRead = isr.read(inputBuffer))>0)
            {
                String readString = String.copyValueOf(inputBuffer,0,charRead);
                str += readString;
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }

        Gson gson = new Gson();
        Type type = new TypeToken<AboutProfileResponse>(){}.getType();
        aboutProfileResponse = gson.fromJson(str, type);

        Log.e("Parser","Done Parsing");

        for(Coworker c : aboutProfileResponse.getOfficeCoworkers().get(0).getCoworkers()){
            if(c.getImage() instanceof Boolean){
                Log.e("Parser","Image not available");
            }else{
                Log.e("Parser","Image available");
                String img = c.getImage().toString();
                Log.e("Parser","Image json : \n"+img);
                //parse image object using Gson itself
            }
        }

    }
}
