package llbean.tarealistadecompras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddProduct extends AppCompatActivity implements View.OnClickListener{

    private EditText nombre, cant, precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_product_layout);

        nombre = (EditText) findViewById(R.id.textFieldName);
        cant = (EditText) findViewById(R.id.textFieldCant);
        precio = (EditText) findViewById(R.id.textFieldPrecio);
        Button insert = (Button) findViewById(R.id.btnInsert);
        insert.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnInsert) {
            if (checkData())
            {
                Intent resultado = new Intent();
                resultado.putExtra("nombre", nombre.getText().toString());
                resultado.putExtra("cant", cant.getText().toString());
                resultado.putExtra("precio", precio.getText().toString());

                setResult(RESULT_OK, resultado);
                finish();
            }
            else
                Toast.makeText(getApplicationContext(),"Por Favor, ingrese todos los datos e intente de nuevo",Toast.LENGTH_SHORT).show();
        }
    }

    public Boolean checkData () {
        if (nombre.getText() == null || cant.getText() == null || precio.getText() == null) {
            return false;
        }

        return true;
    }
}
