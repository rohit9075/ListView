package rohit.com.modeldata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import rohit.com.modeldata.model.DataItem;
import rohit.com.modeldata.sample.SampleDataProvider;

public class MainActivity extends AppCompatActivity {

    List<DataItem> dataItemList = SampleDataProvider.dataItemList;
    List<String> itemsName = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        for (DataItem item : dataItemList ){
            itemsName.add(item.getItemName());
        }

        Collections.sort(itemsName);
        ArrayAdapter<String> arrayAdapter =  new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,itemsName);
        ListView listView = findViewById(android.R.id.list);
        listView.setAdapter(arrayAdapter);
    }
}
