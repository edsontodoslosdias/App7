package com.example.app07;


///AYALA VEGA EDSON MIGUEL
//2019030333
//9-3
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtUsuario;
    private EditText txtContraseña;
    private Button btnIngresar;
    private Usuarios user = new Usuarios();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciar();
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtUsuario.getText().toString().matches("") ||
                   txtContraseña.getText().toString().matches("")){
                    Toast.makeText(MainActivity.this,"Falta Capturar Informacion",Toast.LENGTH_SHORT).show();
                } else {
                    if(txtUsuario.getText().toString().matches(user.getUser()) &&
                            txtContraseña.getText().toString().matches(user.getContraseña())){
                        Intent intent = new
                                Intent(MainActivity.this,LstActivity.class);
                        //intent.putExtra("usuario",txtUsuario.getText());
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("usuario",user);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this,"Usuario y contraseña invalidos",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private void iniciar(){
        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtContraseña = (EditText) findViewById(R.id.txtContraseña);
        btnIngresar = (Button) findViewById(R.id.btnIngresar);
        user.setUser(getResources().getString(R.string.userName));
        user.setContraseña(getResources().getString(R.string.contraseña));
        user.setNombreCompleto(getResources().getString(R.string.nombre));
        user.setEmail(getResources().getString(R.string.email));
    }

}