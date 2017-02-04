package cf.xpuwangsheng.www.brainchildtools;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ToolAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get ListView object from xml
        ListView toolListView = (ListView) findViewById(R.id.list);

        mAdapter = new ToolAdapter(this, new ArrayList<Tool>());

        toolListView.setAdapter(mAdapter);

        toolListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Tool currentTool = mAdapter.getItem(position);
                Class toolClass = currentTool.getCla();
                Intent toolIntent = new Intent(view.getContext(), toolClass);

                startActivity(toolIntent);
            }
        });


        List<Tool> result = ToolUtils.fetchToolData();
        mAdapter.clear();
        mAdapter.addAll(result);

    }
}
