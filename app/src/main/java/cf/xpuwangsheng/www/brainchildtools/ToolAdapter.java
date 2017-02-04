package cf.xpuwangsheng.www.brainchildtools;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by xpuwangsheng on 2/4/17.
 */

public class ToolAdapter extends ArrayAdapter<Tool> {

    public ToolAdapter(Context context, List<Tool> tools) {
        super(context, 0, tools);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (convertView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.tool_list_item, parent, false);
        }

        Tool currentTool = getItem(position);

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentTool.getTitle());

        return listItemView;
    }
}
