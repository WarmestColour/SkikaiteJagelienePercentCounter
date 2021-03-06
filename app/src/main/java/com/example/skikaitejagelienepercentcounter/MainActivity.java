package com.example.skikaitejagelienepercentcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editAmount;
    private TextView seekbarPercent;
    private SeekBar seekbar;
    private TextView tip;
    private TextView tipResult;
    private TextView total;
    private TextView totalResult;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAmount = findViewById(R.id.editAmount);
        seekbarPercent = findViewById(R.id.seekbarPercent);
        seekbar = findViewById(R.id.seekbar);
        tip = findViewById(R.id.tip);
        tipResult = findViewById(R.id.tipResult);
        total = findViewById(R.id.total);
        totalResult = findViewById(R.id.totalResult);
        result = findViewById(R.id.result);

//Negaliu aš parašyti logikos, neišeina ir nesuprantu.


        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int num1 = Integer.parseInt(editAmount.getText().toString());
                } catch (NumberFormatException ignored) {

                }

            }
        });

    }

}