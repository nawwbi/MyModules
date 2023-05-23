package sg.edu.rp.c346.id22024713.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView c346mod, c206mod, c203mod, c218mod, c235mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c346mod = findViewById(R.id.c346);
        c206mod = findViewById(R.id.c206);
        c203mod = findViewById(R.id.c203);
        c218mod = findViewById(R.id.c218);
        c235mod = findViewById(R.id.c235);

        c346mod.setOnClickListener(new View.OnClickListener() {
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

        c206mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllActivity.class);
                intent.putExtra("Code", "C206");
                intent.putExtra("Name", "Software Development");
                intent.putExtra("Year",2023);
                intent.putExtra("Sem", 1);
                intent.putExtra("Credit", 4);
                intent.putExtra("Venue", "W64P");
                startActivity(intent);
            }
        });

        c203mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllActivity.class);
                intent.putExtra("Code", "C203");
                intent.putExtra("Name", "Web App Development in PHP");
                intent.putExtra("Year",2023);
                intent.putExtra("Sem", 1);
                intent.putExtra("Credit", 4);
                intent.putExtra("Venue", "W64N");
                startActivity(intent);
            }
        });

        c218mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllActivity.class);
                intent.putExtra("Code", "C218");
                intent.putExtra("Name", "UI/UX Design for Apps");
                intent.putExtra("Year",2023);
                intent.putExtra("Sem", 1);
                intent.putExtra("Credit", 4);
                intent.putExtra("Venue", "W64P");
                startActivity(intent);
            }
        });

        c235mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllActivity.class);
                intent.putExtra("Code", "C235");
                intent.putExtra("Name", "IT Security and Management");
                intent.putExtra("Year",2023);
                intent.putExtra("Sem", 1);
                intent.putExtra("Credit", 4);
                intent.putExtra("Venue", "W65A");
                startActivity(intent);
            }
        });

    }
}