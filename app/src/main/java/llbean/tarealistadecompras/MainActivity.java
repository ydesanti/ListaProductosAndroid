package llbean.tarealistadecompras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final private int REQ_CODE = 1;

    RecyclerView recyclerView;
    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.listProductos);
        adapter = new RecyclerViewAdapter(LlenarListaDefault.crearListaProductos());

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        int dividerHeight = getResources().getDimensionPixelSize(R.dimen.divider);
        DividerDecorator dividerDecorator = new DividerDecorator(dividerHeight);
        recyclerView.addItemDecoration(dividerDecorator);

        recyclerView.setAdapter(adapter);

        Button incluirProducto = (Button) findViewById(R.id.btnAgregar);
        incluirProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addProd = new Intent(getApplicationContext(), AddProduct.class);
                startActivityForResult(addProd, REQ_CODE);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQ_CODE && resultCode == RESULT_OK && data != null) {
            LlenarListaDefault.productos.add(
                    new Productos(
                        data.getStringExtra("nombre"),
                        Integer.parseInt(data.getStringExtra("cant")),
                        Integer.parseInt(data.getStringExtra("precio"))
                   )
            );

            adapter.notifyDataSetChanged();
            Toast.makeText(getApplicationContext(), "Nuevo Producto Insertado", Toast.LENGTH_SHORT).show();
        }
    }
}
