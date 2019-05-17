package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvAnswer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswer1 = findViewById(R.id.textView);

        Intent intentReceived = getIntent();
        String value1 = intentReceived.getStringExtra("value1");
        String value2 = intentReceived.getStringExtra("value2");
        String value3 = intentReceived.getStringExtra("value3");
        String value4 = intentReceived.getStringExtra("value4");
        String value5 = intentReceived.getStringExtra("value5");
        String value6 = intentReceived.getStringExtra("value6");
        tvAnswer1.setText("Module Code: " + value1 + "\nModule Name: " + value2 + "\nAcademic Year: " + value3 + "\nSemester: "+ value4 + "\nModule Credit: " + value5 + "\nVenue: " + value6);

    }
}
