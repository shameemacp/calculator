package jaya.speechapp.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    TextView t;
    int a,b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ed1=findViewById(R.id.editText);
       ed2=findViewById(R.id.editText2);
       t=findViewById(R.id.textView);




    }
    public  void c(View view)
    {  a=Integer.parseInt(ed1.getText().toString());
        b=Integer.parseInt(ed2.getText().toString());

        int id=view.getId();
        switch (id)
        {
            case R.id.add:
                t.setText(String.valueOf(a+b));
                break;
            case R.id.substract:
                t.setText(String.valueOf(a-b));
                break;
            case R.id.mult:
                t.setText(String.valueOf(a*b));
                break;
            case R.id.division:

                try {
                    t.setText(String.valueOf(a/b));
                }
                catch(ArithmeticException e)
                {
                    t.setText(e.toString());
                }
                break;

        }
    }

}
