package com.tesji.runers;
import com.tesji.runers.model.MainActivityModel;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity {

    private TextInputEditText txMinutos1;
    private TextInputEditText txSegundos1;
    private TextInputEditText txMinutos2;
    private TextInputEditText txSegundos2;
    private Button btEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txMinutos1 = findViewById(R.id.txtMinutos1);
        txSegundos1 = findViewById(R.id.txtSegundos1);
        txMinutos2 = findViewById(R.id.txtMinutos2);
        txSegundos2 = findViewById(R.id.txtSegundos2);
        btEnviar = findViewById(R.id.btnEnviar);
        //3. Generar el evento clic para el boton
        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Validando las cajas de textp

                if ((txMinutos1.getText().toString().trim().isEmpty())) {
                    txMinutos1.setText(null);
                    txMinutos1.setError("Ingrese un puntaje valido");
                    txMinutos1.requestFocus();
                }else if ((txMinutos2.getText().toString().trim().isEmpty())) {
                    txMinutos2.setText(null);
                    txMinutos2.setError("Ingrese un puntaje valido");
                    txMinutos2.requestFocus();
                } else if ((txSegundos1.getText().toString().trim().isEmpty())) {
                    txSegundos1.setText(null);
                    txSegundos1.setError("Ingrese un puntaje valido");
                    txSegundos1.requestFocus();
                } else if  ((txSegundos2.getText().toString().trim().isEmpty())) {
                    txSegundos2.setText(null);
                    txSegundos2.setError("Ingrese un puntaje valido");
                    txSegundos2.requestFocus();
                }else {
                    //Enviando y la peticion al modelo mediante una instancia
                    MainActivityModel objModel;
                    objModel = new MainActivityModel();


                    //objModel.anioNac = Integer.parseInt(txAnacimiento.getText().toString());
                    objModel.setMinutos1(Integer.parseInt(txMinutos1.getText().toString()));
                    objModel.setMinutos2(Integer.parseInt(txMinutos2.getText().toString()));
                    objModel.setSegundos1(Integer.parseInt(txSegundos1.getText().toString()));
                    objModel.setSegundos2(Integer.parseInt(txSegundos2.getText().toString()));

                    //
                    Toast.makeText(getApplicationContext(),
                            objModel.sumaTiempos(), Toast.LENGTH_LONG).show();

                }
            }
        });
    }

}