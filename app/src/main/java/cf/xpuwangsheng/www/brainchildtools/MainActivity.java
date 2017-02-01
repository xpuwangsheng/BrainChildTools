package cf.xpuwangsheng.www.brainchildtools;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import cf.xpuwangsheng.www.brainchildtools.MyFragment.MyFragmentActivity;
import cf.xpuwangsheng.www.brainchildtools.OpenCVExample.OpenCVActivity;
import cf.xpuwangsheng.www.brainchildtools.PhotoIntent.PhotoIntentActivity;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"myFragment",
                "showOpenCV",
                "TakePhoto"};
        //Define a new Adapter
        //First Parameter - Context
        //Second Parameter - Layout for the row
        //Third Parameter - ID of the TextView to which the data is written
        //Forth Parameter - the Array of data
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,android.R.id.text1,values);
        //Assign adapter to ListView
        listView.setAdapter(adapter);
        //ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //ListView Clicked item index
                int itemPosition = position;
                //ListView Clicked item value
                switch (itemPosition){
                    case 0:
                        Intent intent0 = new Intent(view.getContext(), MyFragmentActivity.class);
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 = new Intent(view.getContext(),OpenCVActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(view.getContext(), PhotoIntentActivity.class);
                        startActivity(intent2);
                        break;
                }
            }
        });
    }
}
