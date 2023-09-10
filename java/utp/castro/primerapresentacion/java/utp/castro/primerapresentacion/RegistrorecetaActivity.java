package utp.castro.primerapresentacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class RegistrorecetaActivity extends AppCompatActivity {
    private EditText txtnombre,txtprecio,txtingredientes;
    private Button btnGuardar,btnatras;
    private Spinner cboDpto;
    private RadioButton rboUnahora,rboDoshoras,rboTreshoras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registroreceta);

        txtnombre=findViewById(R.id.txtnombre);
        txtprecio=findViewById(R.id.txtprecio);
        txtingredientes=findViewById(R.id.txtingredientes);
        btnGuardar=findViewById(R.id.btnGuardar);
        btnatras=findViewById(R.id.btnatras);
        cboDpto=findViewById(R.id.cboDpto);
        rboUnahora=findViewById(R.id.rboUnahora);
        rboDoshoras=findViewById(R.id.rboDoshoras);
        rboTreshoras=findViewById(R.id.rboTreshoras);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtnombre.getText().toString().equals("") || txtprecio.getText().toString().equals("")) {
                    Toast.makeText(RegistrorecetaActivity.this, "Debe ingresar nombre y precio", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent=new Intent(RegistrorecetaActivity.this,GuardarActivity.class);
                    intent.putExtra("txtnombre",txtnombre.getText().toString());
                    intent.putExtra("txtprecio",txtprecio.getText().toString());
                    intent.putExtra("etingredientes",txtingredientes.getText().toString());
                    intent.putExtra("cboDeptos",cboDpto.getSelectedItem().toString());

                    String dato="";
                    if(rboUnahora.isChecked()){
                        dato="1 hora";
                    }else if (rboDoshoras.isChecked()){
                        dato="2 horas";
                    }else if(rboTreshoras.isChecked()){
                        dato="3 horas";
                    }
                    intent.putExtra("dato",dato);
                    startActivity(intent);
                }
            }
        });

        btnatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistrorecetaActivity.this,PlatosregistradosActivity.class);
                startActivity(intent);
            }
    });
  }
}