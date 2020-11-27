package mx.edu.tesoem.ctol.a7s212021prac0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre = findViewById(R.id.txtnombre);

    }
    public void saluda(View v){
        Toast.makeText(this, "Bienvenido " + txtnombre.getText(), Toast.LENGTH_LONG).show();
    }
}