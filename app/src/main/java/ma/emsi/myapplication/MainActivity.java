package ma.emsi.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    TextView t2;
    TextView t3;
    EditText n1;
    Button btn;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        n1=findViewById(R.id.n1);
        btn=findViewById(R.id.btn);
        btn2=findViewById(R.id.btn2);

        btn2.setOnClickListener (v -> {
            double rst=Integer.parseInt(n1.getText().toString())*0.095;
            t3.setText(rst+ " $");
        });

        btn.setOnClickListener (v -> {
            double rst=Integer.parseInt(n1.getText().toString())*0.091;
            t3.setText(rst+ " Euro");
        });

    }
}