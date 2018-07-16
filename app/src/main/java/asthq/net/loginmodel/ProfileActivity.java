package asthq.net.loginmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.google.android.material.appbar.AppBarLayout;

public class ProfileActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private AppBarLayout appBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        toolbar = findViewById(R.id.toolBarProfile);

        setSupportActionBar(toolbar);

        appBarLayout = findViewById(R.id.appBarLayout);

        /*final List<TextInputLayout> textInputLayouts = Utils.findViewsWithType(
                rootView, TextInputLayout.class);*/ //use in fragment
    }
}
