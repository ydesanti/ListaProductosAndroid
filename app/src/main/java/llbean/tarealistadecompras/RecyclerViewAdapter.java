package llbean.tarealistadecompras;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by ydesanti on 11/16/2016.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolderClass> {

    private List<Productos> mProdList;
    public RecyclerViewAdapter(List<Productos> productos) {
        mProdList = productos;
    }

    @Override
    public ViewHolderClass onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_row_view, parent, false);
       return new ViewHolderClass(v);
    }

    @Override
    public void onBindViewHolder(ViewHolderClass holder, int position) {
        Productos producto = mProdList.get(position);
        holder.mProdList.setProductInfo(producto);
    }

    @Override
    public int getItemCount() {
        return mProdList.size();
    }

    class ViewHolderClass extends RecyclerView.ViewHolder {

        CustomLayoutForProductsRow mProdList;

        public ViewHolderClass(View itemView) {
            super(itemView);

            mProdList = (CustomLayoutForProductsRow) itemView.findViewById(R.id.customProdView);
        }
    }

}
