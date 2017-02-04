package cf.xpuwangsheng.www.brainchildtools.AsyncTaskLoader;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import cf.xpuwangsheng.www.brainchildtools.R;

public class AsyncTaskLoaderActivity extends FragmentActivity implements LoaderManager.LoaderCallbacks<List<Employee>> {
    EmployeeAdapter empAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task_loader);
        empAdapter = new EmployeeAdapter(this, new ArrayList<Employee>());
        ListView employeeListView = (ListView) findViewById(R.id.employees);
        employeeListView.setAdapter(empAdapter);
        getSupportLoaderManager().initLoader(1, null, this).forceLoad();
    }

    @Override
    public Loader<List<Employee>> onCreateLoader(int id, Bundle args) {
        return new EmployeeLoader(AsyncTaskLoaderActivity.this);
    }

    @Override
    public void onLoadFinished(Loader<List<Employee>> loader, List<Employee> data) {
        empAdapter.setEmployees(data);
    }

    @Override
    public void onLoaderReset(Loader<List<Employee>> loader) {
        empAdapter.setEmployees(new ArrayList<Employee>());
    }
}
