package umgapp.gt.umgapplogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText correo;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        correo = (EditText) findViewById(R.id.correo);
        password = (EditText) findViewById(R.id.password);
    }

    public void acceder(View view)
    {
        String miCorreo = correo.getText().toString();
        String miPassword = password.getText().toString();

        if(miCorreo.endsWith("@catedratico.gt") && miPassword.equals("posgrado"))
        {
           // Toast notification = Toast.makeText(this, "Bienvenido Catedradico", Toast.LENGTH_SHORT);
            //notification.show();
            Intent intent = new Intent(this, TeacherActivity.class);
            startActivity(intent);

        }
        else
        {
            Toast notification = Toast.makeText(this,"Credenciales Invalidas", Toast.LENGTH_SHORT);
            notification.show();
        }

    }
}
