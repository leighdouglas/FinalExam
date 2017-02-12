package nyc.c4q.leighdouglas.finalexam.settingsrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.leighdouglas.finalexam.R;

/**
 * Created by leighdouglas on 2/12/17.
 */

public class SettingsViewHolder extends RecyclerView.ViewHolder {
    private TextView settingTxtView;
    public SettingsViewHolder(View itemView) {
        super(itemView);
        settingTxtView = (TextView) itemView.findViewById(R.id.settings_rv_textview);

    }

    public void bind(int position){
        String string = "Setting - " + String.valueOf(position);
        settingTxtView.setText(string);
    }
}
