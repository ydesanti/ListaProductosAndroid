package llbean.tarealistadecompras;

/**
 * Created by ydesanti on 11/16/2016.
 */

public class Productos {
    private String mName;
    private int mCantidad, mPrecio, mTotal;

    public Productos(String mName, int mCantidad, int mPrecio) {
        setmName(mName);
        setmCantidad(mCantidad);
        setmPrecio(mPrecio);
        setmTotal(getmPrecio()*getmCantidad());
    }

    public String getmName() {
        return mName;
    }
    public int getmCantidad() {
        return mCantidad;
    }
    public int getmPrecio() {
        return mPrecio;
    }
    public int getmTotal() {
        return mTotal;
    }

    private void setmName(String mName) {
        this.mName = mName;
    }
    private void setmCantidad(int mCantidad) {
        this.mCantidad = mCantidad;
    }
    private void setmPrecio(int mPrecio) {
        this.mPrecio = mPrecio;
    }
    private void setmTotal(int mTotal) {
        this.mTotal = mTotal;
    }
}
