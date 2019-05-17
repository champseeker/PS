package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC346;
    TextView tvC349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC346 = findViewById(R.id.C346);
        tvC349 = findViewById(R.id.C349);

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                intent.putExtra("value1","C346");
                intent.putExtra("value2","Android Programming");
                intent.putExtra("value3","2018");
                intent.putExtra("value4", "1");
                intent.putExtra("value5","4");
                intent.putExtra("value6", "W66M");
                startActivity(intent);

            }
        });

        tvC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), ThirdActivity.class);
                intent.putExtra("value1","C349");
                intent.putExtra("value2","Ipad Programming");
                intent.putExtra("value3","2019");
                intent.putExtra("value4", "1");
                intent.putExtra("value5","4");
                intent.putExtra("value6", "W65Q");
                startActivity(intent);

            }
        });

    }
}
