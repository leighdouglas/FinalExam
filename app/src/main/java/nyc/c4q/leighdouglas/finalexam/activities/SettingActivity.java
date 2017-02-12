package nyc.c4q.leighdouglas.finalexam.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageButton;
import android.widget.ImageView;

import nyc.c4q.leighdouglas.finalexam.CustomClickListener;
import nyc.c4q.leighdouglas.finalexam.R;
import nyc.c4q.leighdouglas.finalexam.navrecyclerview.NavAdapter;
import nyc.c4q.leighdouglas.finalexam.settingsrecyclerview.SettingAdapter;

/**
 * Created by leighdouglas on 2/12/17.
 */

public class SettingActivity extends AppCompatActivity {
    private RecyclerView settingRV;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        initViews();
    }

    private void initViews() {

        settingRV= (RecyclerView) findViewById(R.id.settings_rv);
        settingRV.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        settingRV.setAdapter(new SettingAdapter());

    }
}
