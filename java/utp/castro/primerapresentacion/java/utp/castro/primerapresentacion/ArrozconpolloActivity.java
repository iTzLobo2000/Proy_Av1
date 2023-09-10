package utp.castro.primerapresentacion;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArrozconpolloActivity extends AppCompatActivity {

Button btnatras;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrozconpollo);

        btnatras=findViewById(R.id.btnatras);

        btnatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ArrozconpolloActivity.this,PlatosregistradosActivity.class);
                startActivity(intent);
            }
        });
    }
}