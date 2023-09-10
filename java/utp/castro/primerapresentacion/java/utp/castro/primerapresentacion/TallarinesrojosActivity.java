package utp.castro.primerapresentacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TallarinesrojosActivity extends AppCompatActivity {

    Button btnatras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tallarinesrojos);

        btnatras=findViewById(R.id.btnatras);

        btnatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TallarinesrojosActivity.this,PlatosregistradosActivity.class);
                startActivity(intent);
            }
        });
    }
}