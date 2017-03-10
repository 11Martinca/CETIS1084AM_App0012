package mx.edu.cetis108.cetis1084am_app001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnSaludar_click(View v) {
        TextView lblSaludo = (TextView)findViewById(R.id.txtNombre);
        EditText EditarText  = (EditText)findViewById(R.id.editText);

        lblSaludo.setText("Hola!" + EditarText.getText());
    }
}
