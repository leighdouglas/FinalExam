package nyc.c4q.leighdouglas.finalexam;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import nyc.c4q.leighdouglas.finalexam.activities.SettingActivity;

/**
 * Created by leighdouglas on 2/12/17.
 */

public class CustomClickListener implements View.OnClickListener {
    private Listener listener;
    private int position = -1;
    private Context context;

    public CustomClickListener(Context context, Listener listener) {
        this.context = context;
        this.listener = listener;
    }

    public CustomClickListener(int position, Context context, Listener listener) {
        this.context = context;
        this.position = position;
        this.listener = listener;
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.button1 || position == 0) {
            customToast("Selected Heart Activity");
        } else if (view.getId() == R.id.button2 || position == 1) {
            customToast("Selected Message Activity");
        } else if (view.getId() == R.id.button3 || position == 2) {
            context.startActivity(new Intent(context, SettingActivity.class));
        } else if (view.getId() == R.id.button4 || position == 3) {
            customToast("Selected Logout Activity");
            listener.quitApplication();
        }
    }


    private void customToast(String customText) {
        Toast.makeText(context, customText, Toast.LENGTH_SHORT).show();
    }

    public interface Listener {
        void quitApplication();
    }
}
