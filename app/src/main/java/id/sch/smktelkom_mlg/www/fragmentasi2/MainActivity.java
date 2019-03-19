package id.sch.smktelkom_mlg.www.fragmentasi2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import id.sch.smktelkom_mlg.www.fragmentasi2.Fragment.MultipleFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void multiple(View view) {
        Intent intent = new Intent(getApplicationContext(), MultipleFragment.class);
        startActivity(intent);
    }
}
