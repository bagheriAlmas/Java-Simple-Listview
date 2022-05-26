package ir.almasapps.javasimplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import ir.almasapps.javasimplelistview.Data.DataSource;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);

        listView.setAdapter(new AppAdapter(this,new DataSource().getAppsList()));
    }
}