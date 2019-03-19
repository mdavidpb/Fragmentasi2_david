package id.sch.smktelkom_mlg.www.fragmentasi2.Fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import id.sch.smktelkom_mlg.www.fragmentasi2.R;

public class MultipleFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_fragment);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.menuContainer, new id.sch.smktelkom_mlg.www.fragmentasi2.Fragment.MenuFragment()).commit();
        }
    }
}

