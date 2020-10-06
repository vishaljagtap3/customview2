package in.bitcode.customview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mListTasks;
    private ListView mListViewTasks;
    private AdapterTasks mAdapterTasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init() {
        mListViewTasks = findViewById(R.id.listViewTasks);
        mListTasks = new ArrayList<String>();
        mAdapterTasks = new AdapterTasks(
                this,
                mListTasks
        );
        mListViewTasks.setAdapter(mAdapterTasks);

        mListTasks.add("1 Complete the assignments!");
        mListTasks.add("2 Pay utility bills");
        mListTasks.add("3 Email office");
        mListTasks.add("4 Close the issues");
        mListTasks.add("5 Complete the assignments!");
        mListTasks.add("6 Pay utility bills");
        mListTasks.add("7  Email office");
        mListTasks.add("8 Close the issues");
        mListTasks.add("9 Complete the assignments!");
        mListTasks.add("10 Pay utility bills");
        mListTasks.add("11 Email office");
        mListTasks.add("12 Close the issues");
        mListTasks.add("13 Complete the assignments!");
        mListTasks.add("14 Pay utility bills");
        mListTasks.add("15 Email office");
        mListTasks.add("16 Close the issues");
        mListTasks.add("17 Complete the assignments!");
        mListTasks.add("18 Pay utility bills");
        mListTasks.add("19 Email office");
        mListTasks.add("20 Close the issues");

    }
}