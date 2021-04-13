package adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.tranvantuan.R;

import java.util.List;

import entity.ProductEntity;

public class ProductAdapter extends RecyclerView.Adapter {

    private Activity activity;
    private List<ProductEntity> listProduct;

    public ProductAdapter(Activity activity, List<ProductEntity> listProduct) {
        this.activity = activity;
        this.listProduct = listProduct;
    }

    public void ReloadData(List<ProductEntity> list) {
        this.listProduct = list;
        this.notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = activity.getLayoutInflater().inflate(R.layout.lay_main, parent, false);
        ProductHolder holder = new ProductHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ProductHolder userHolder = (ProductHolder) holder;
        ProductEntity model = listProduct.get(position);
        userHolder.tvId.setText(String.valueOf(model.id));
        userHolder.tvName.setText(model.name);
        userHolder.tvQua.setText(String.valueOf(model.quantity));
    }

    @Override
    public int getItemCount() {
        return listProduct.size();
    }

    public class ProductHolder extends RecyclerView.ViewHolder {
        TextView tvId, tvName, tvQua;

        public ProductHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tvName);
            tvQua = itemView.findViewById(R.id.tvQuantity);
        }
    }
}
