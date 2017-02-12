package nyc.c4q.leighdouglas.finalexam.navrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.leighdouglas.finalexam.CustomClickListener;
import nyc.c4q.leighdouglas.finalexam.R;

/**
 * Created by leighdouglas on 2/12/17.
 */

public class NavAdapter extends RecyclerView.Adapter<NavViewHolder> {
    private CustomClickListener.Listener listener;
    public NavAdapter(CustomClickListener.Listener listener){
        this.listener = listener;
    }

    @Override
    public NavViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.nav_item_viewholder, parent, false);
        return new NavViewHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(NavViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
