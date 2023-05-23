package sg.edu.rp.c346.id22024713.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.modules);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllActivity.class);
                intent.putExtra("Code", "C346");
                intent.putExtra("Name", "Android Programming");
                intent.putExtra("Year",2023);
                intent.putExtra("Sem", 1);
                intent.putExtra("Credit", 4);
                intent.putExtra("Venue", "W66M");
                startActivity(intent);
            }
        });


    }
}