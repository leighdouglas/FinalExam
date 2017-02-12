package nyc.c4q.leighdouglas.finalexam.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageButton;

import nyc.c4q.leighdouglas.finalexam.CustomClickListener;
import nyc.c4q.leighdouglas.finalexam.R;
import nyc.c4q.leighdouglas.finalexam.navrecyclerview.NavAdapter;

/**
 * Created by leighdouglas on 2/12/17.
 */

public class ProfileActivity extends AppCompatActivity implements CustomClickListener.Listener {

    private RecyclerView navRV;
    private ImageButton bttn1;
    private ImageButton bttn2;
    private ImageButton bttn3;
    private ImageButton bttn4;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_with_nav_drawer);
        initViews();

    }

    private void initViews() {
        bttn1 = (ImageButton) findViewById(R.id.button1);
        bttn2 = (ImageButton) findViewById(R.id.button2);
        bttn3 = (ImageButton) findViewById(R.id.button3);
        bttn4 = (ImageButton) findViewById(R.id.button4);

        bttn1.setOnClickListener(new CustomClickListener(getApplicationContext(), this));
        bttn2.setOnClickListener(new CustomClickListener(getApplicationContext(), this));
        bttn3.setOnClickListener(new CustomClickListener(getApplicationContext(), this));
        bttn4.setOnClickListener(new CustomClickListener(getApplicationContext(), this));

        navRV = (RecyclerView) findViewById(R.id.nav_recyclerview);
        navRV.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        navRV.setAdapter(new NavAdapter(this));

    }

    @Override
    public void quitApplication() {
        this.finishAffinity();
    }
}
