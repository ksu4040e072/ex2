package a4040e072.ex2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
     private EditText etname;
     private EditText etpassword;
     private EditText etphone;
     private EditText etage;
     private Button clear;
     private TextView tvmessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews(){
        etname = (EditText) findViewById(R.id.etname);
        etpassword= (EditText) findViewById(R.id.etpassword);
        etphone= (EditText) findViewById(R.id.etphone);
        etage= (EditText) findViewById(R.id.etage);
        clear= (Button) findViewById(R.id.text_clear);
        tvmessage =(TextView) findViewById(R.id.tvmessage);

        clear.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            etname.setText(null);
            etpassword.setText(null);
            etphone.setText(null);
            etage.setText(null);
            tvmessage.setText(null);
            Toast.makeText(
                    MainActivity.this,
                    R.string.msg_ClearAllFields,
                    Toast.LENGTH_SHORT
            ).show();
        }
    });
  }
        public void onSubmitClick(View view){
            String name= etname.getText().toString().trim();
            String password= etpassword.getText().toString().trim();
            String phone= etphone.getText().toString().trim();
            String age= etage.getText().toString().trim();
            String text="";
            text += "user name = " + name + "\n";
            text += "password = " + password + "\n";
            text += "phone number = " + phone + "\n";
            text += "age = " + age + "\n";
            tvmessage.setText(text);
        }
    }

