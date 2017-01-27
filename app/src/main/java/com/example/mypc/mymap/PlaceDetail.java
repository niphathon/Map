package com.example.mypc.mymap;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by MY PC on 1/21/2017.
 */

public class PlaceDetail extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.placedetail);

        Bundle bundle = getIntent().getExtras();
        double Lat = bundle.getDouble("Latitude");
        double Lng = bundle.getDouble("Longitude");

        if(bundle != null){
            TextView txt = (TextView) findViewById(R.id.textView2);
            txt.setText("Latitude is "+String.valueOf(Lat)+"\n"+"Longitude is "+String.valueOf(Lng));
        }
    }


}
