package cf.xpuwangsheng.www.brainchildtools.AsyncTaskLoader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import cf.xpuwangsheng.www.brainchildtools.R;

/**
 * Created by root on 2/4/17.
 */

public class EmployeeAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private List<Employee> employees = new ArrayList<Employee>();
    public EmployeeAdapter(Context context, List<Employee> employees) {
        this.employees = employees;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Employee emp = (Employee) getItem(position);
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.employeedata, null);
        }
        TextView empid = (TextView) convertView.findViewById(R.id.empid);
        empid.setText(emp.empid);
        TextView empname = (TextView) convertView.findViewById(R.id.empname);
        empname.setText(emp.name);
        return convertView;
    }

    @Override
    public Object getItem(int position) {
        return employees.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return employees.size();
    }


    public void setEmployees(List<Employee> data) {
        employees.addAll(data);
        notifyDataSetChanged();
    }



}
