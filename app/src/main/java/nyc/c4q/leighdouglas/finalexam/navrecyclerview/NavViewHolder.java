package nyc.c4q.leighdouglas.finalexam.navrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import nyc.c4q.leighdouglas.finalexam.CustomClickListener;
import nyc.c4q.leighdouglas.finalexam.R;

/**
 * Created by leighdouglas on 2/12/17.
 */

public class NavViewHolder extends RecyclerView.ViewHolder implements CustomClickListener.Listener {
    private CustomClickListener.Listener mlistener;
    private ImageView icon;
    private TextView menuText;

    public NavViewHolder(View itemView, CustomClickListener.Listener listener) {
        super(itemView);
        mlistener = listener;
        icon = (ImageView) itemView.findViewById(R.id.nav_icon);
        menuText = (TextView) itemView.findViewById(R.id.nav_text);
    }

    public void bind(int position) {
        switch (position) {
            case 0:
                icon.setImageResource(R.drawable.ic_favorite_black_48dp);
                menuText.setText(R.string.profile_bttn1);
                itemView.setOnClickListener(new CustomClickListener(position, itemView.getContext(), this));
                break;

            case 1:
                icon.setImageResource(R.drawable.mailicon);
                menuText.setText(R.string.profile_bttn2);
                itemView.setOnClickListener(new CustomClickListener(position, itemView.getContext(), this));
                break;
            case 2:
                icon.setImageResource(R.drawable.addressbook2);
                menuText.setText(R.string.profile_bttn3);
                itemView.setOnClickListener(new CustomClickListener(position, itemView.getContext(), this));
                break;

            case 3:
                icon.setImageResource(R.drawable.logout);
                menuText.setText(R.string.profile_bttn_logout);
                itemView.setOnClickListener(new CustomClickListener(position, itemView.getContext(), this));
        }
    }

    @Override
    public void quitApplication() {
        mlistener.quitApplication();
    }
}
