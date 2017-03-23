package quejatec.proyecto.compumovil.udea.edu.co.quejatec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView tvRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvRegistrar=(TextView) findViewById(R.id.txtvRegister);

        tvRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itFormRegister=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(itFormRegister);
            }
        });
    }
}
