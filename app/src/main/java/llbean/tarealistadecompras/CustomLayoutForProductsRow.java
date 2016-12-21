package llbean.tarealistadecompras;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by ydesanti on 11/16/2016.
 */

public class CustomLayoutForProductsRow extends LinearLayout {
    public CustomLayoutForProductsRow(Context context) {
        super(context);
        init(context);
    }

    public CustomLayoutForProductsRow(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public CustomLayoutForProductsRow(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        setOrientation(VERTICAL);
        setBackgroundResource(R.drawable.productrowbackground);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.default_product_row, this, true);
    }

    public void setProductInfo(Productos prod) {
        TextView prodName = (TextView) findViewById(R.id.productName);
        TextView prodPrice = (TextView) findViewById(R.id.productPrice);
        TextView prodQty = (TextView) findViewById(R.id.productQty);
        TextView prodTotal = (TextView) findViewById(R.id.productTotal);

        prodName.setText(prod.getmName());
        prodPrice.setText("Precio: "+prod.getmPrecio()+"");
        prodQty.setText("Cantidad: "+prod.getmCantidad()+"");
        prodTotal.setText("Valor Total: "+prod.getmTotal()+"");
    }
}
