package com.example.mikemedoff.scoutingapp2017gearaffes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class DisplayMessageActivity extends AppCompatActivity {

    TextView teamName;
    Spinner gearEndPoint;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        //String message = intent.getStringExtra(EXTRA_MESSAGE);
        String message = "hello";
        gearEndPoint = (Spinner) findViewById(R.id.Gear_end_point);
        adapter = ArrayAdapter.createFromResource(this,R.array.finish_point, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gearEndPoint.setAdapter(adapter);


        teamName = (TextView) findViewById(R.id.teamName);

        teamName.setText(message);
        /*TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);*/

        /*ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);*/
    }
}
