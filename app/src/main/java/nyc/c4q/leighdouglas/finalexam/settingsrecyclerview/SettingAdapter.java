package nyc.c4q.leighdouglas.finalexam.settingsrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.leighdouglas.finalexam.R;

/**
 * Created by leighdouglas on 2/12/17.
 */

public class SettingAdapter extends RecyclerView.Adapter<SettingsViewHolder> {

    @Override
    public SettingsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.settings_viewholder, parent, false);
        return new SettingsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SettingsViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }
}
