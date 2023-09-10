package utp.castro.primerapresentacion;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class GuardarActivity extends AppCompatActivity {

    EditText et1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardar);

        et1=findViewById(R.id.txtnombre);
        tv1=findViewById(R.id.txtcontenido);

        String datos="Region: "+getIntent().getStringExtra("cboDeptos") +
                "\n\nPrecio en soles: "+getIntent().getStringExtra("txtprecio")+
                "\n\nTiempo que demora: "+getIntent().getStringExtra("dato") +
                "\n\nIngredientes:\n\n "+getIntent().getStringExtra("etingredientes");

        et1.setText(getIntent().getStringExtra("txtnombre"));
        tv1.setText(datos);
    }
}