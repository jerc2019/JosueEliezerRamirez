package sv.edu.utec.primerparcialjosueramirez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etUser,etcontrase;
    TextView txrespuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUser=findViewById(R.id.edtuser);
        etcontrase=findViewById(R.id.edtcontrase);
        txrespuesta=findViewById(R.id.txvresultado);

    }

    public void ingresar (View v){
        String User, Contrase;

        User = etUser.getText().toString();
        Contrase=etcontrase.getText().toString();

        if(User.equals("parcialETps1")&&(Contrase.equals("p4rC14l#tp$"))){
            Intent intento=new Intent(this,IMC.class);
            startActivity(intento);

        }
        else {
            txrespuesta.setText("contraseña y usuario no son correctos");
        }

    }
}