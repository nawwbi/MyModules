package sg.edu.rp.c346.id22024713.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AllActivity extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4, tv5, tv6;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);

        tv1 = findViewById(R.id.textView2);
        tv2 = findViewById(R.id.textView3);
        tv3 = findViewById(R.id.textView4);
        tv4 = findViewById(R.id.textView5);
        tv5 = findViewById(R.id.textView6);
        tv6 = findViewById(R.id.textView7);
        btn = findViewById(R.id.button);

        Intent intentReceived = getIntent();
        String Code = intentReceived.getStringExtra("Code");
        tv1.setText("Module Code: " + Code);

        String Name = intentReceived.getStringExtra("Name");
        tv2.setText("Module Name: " + Name);

        int Year = intentReceived.getIntExtra("Year", 0);
        tv3.setText("Academic Year: " + Year);

        int Sem = intentReceived.getIntExtra("Sem", 0);
        tv4.setText("Semester: " + Sem);

        int Credit = intentReceived.getIntExtra("Credit", 0);
        tv5.setText("Module Credit: " + Credit);

        String Venue = intentReceived.getStringExtra("Venue");
        tv6.setText("Venue: " + Venue);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}