package nyc.c4q.leighdouglas.finalexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText editUsername;
    private EditText editPassword;
    private Button submitBttn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
    }

    private void initViews() {

        editUsername = (EditText) findViewById(R.id.username_edit_txt);
        editPassword = (EditText) findViewById(R.id.password_edit_txt);
        submitBttn = (Button) findViewById(R.id.submit_button);

        submitBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editUsername
                        .getText()
                        .toString()
                        .isEmpty()) {
                    Toast.makeText(view.getContext(), getResources().getString(R.string.empty_username), Toast.LENGTH_SHORT).show();
                }
                if (editPassword
                        .getText()
                        .toString()
                        .isEmpty()) {
                    Toast.makeText(view.getContext(), getResources().getString(R.string.empty_password), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
