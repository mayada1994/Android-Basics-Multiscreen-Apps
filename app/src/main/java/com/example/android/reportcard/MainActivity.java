package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        com.example.android.reportcard.ReportCard reportCard = new com.example.android.reportcard.ReportCard("Zane", "Gale", 94, 99);

        TextView report = (TextView)findViewById(R.id.report);
        report.setText(reportCard.toString());
    }
}
