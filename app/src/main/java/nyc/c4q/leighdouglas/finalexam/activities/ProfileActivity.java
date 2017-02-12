package nyc.c4q.leighdouglas.finalexam.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import nyc.c4q.leighdouglas.finalexam.CustomClickListener;
import nyc.c4q.leighdouglas.finalexam.R;
import nyc.c4q.leighdouglas.finalexam.navrecyclerview.NavAdapter;

/**
 * Created by leighdouglas on 2/12/17.
 */

public class ProfileActivity extends AppCompatActivity implements CustomClickListener.Listener {

    private RecyclerView navRV;
    private ImageView profilePic;
    private ImageView navProfilePic;
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
        profilePic = (ImageView) findViewById(R.id.profile_image);
        navProfilePic = (ImageView) findViewById(R.id.nav_imageview);
        bttn1 = (ImageButton) findViewById(R.id.button1);
        bttn2 = (ImageButton) findViewById(R.id.button2);
        bttn3 = (ImageButton) findViewById(R.id.button3);
        bttn4 = (ImageButton) findViewById(R.id.button4);

        bttn1.setOnClickListener(new CustomClickListener(getApplicationContext(), this));
        bttn2.setOnClickListener(new CustomClickListener(getApplicationContext(), this));
        bttn3.setOnClickListener(new CustomClickListener(getApplicationContext(), this));
        bttn4.setOnClickListener(new CustomClickListener(getApplicationContext(), this));

        loadImage(profilePic);
        loadImage(navProfilePic);

        navRV = (RecyclerView) findViewById(R.id.nav_recyclerview);
        navRV.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        navRV.setAdapter(new NavAdapter(this));

    }

    private void loadImage(ImageView imageView){
        Picasso
                .with(getApplicationContext())
                .load("http://www.aspirehire.co.uk/aspirehire-co-uk/_img/profile.svg")
                .error(R.drawable.profile_placeholder)
                .into(imageView);
    }

    @Override
    public void quitApplication() {
        this.finishAffinity();
    }
}
