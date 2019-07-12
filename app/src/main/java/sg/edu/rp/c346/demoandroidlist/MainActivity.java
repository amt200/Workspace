package sg.edu.rp.c346.demoandroidlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
CustomAdapter androidAA;
ArrayList<AndroidVersion> versions;
ListView lvVersions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        androidAA = new CustomAdapter(MainActivity.this, R.layout.row, versions);
        versions = new ArrayList<AndroidVersion>();
        lvVersions = findViewById(R.id.listViewAndroid);

        versions.add(new AndroidVersion("Pie","9.0"));
        versions.add(new AndroidVersion("Oreo","8.0-8.1"));
        versions.add(new AndroidVersion("Nougat","7.0-7.1.2"));
        lvVersions.setAdapter(androidAA);
        androidAA.notifyDataSetChanged();
    }
}
