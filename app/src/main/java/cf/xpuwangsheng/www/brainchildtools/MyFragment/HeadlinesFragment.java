package cf.xpuwangsheng.www.brainchildtools.MyFragment;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import cf.xpuwangsheng.www.brainchildtools.R;

/**
 * Created by ymwm on 17-1-5.
 */

public class HeadlinesFragment extends ListFragment {
    OnHeadLineSelectedListener mCallback;

    private final String Tag = "HeadLinesFragment";

    public interface OnHeadLineSelectedListener{
        public void onArticleSelected(int position);
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        int layout = Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB ?
                android.R.layout.simple_list_item_activated_1 : android.R.layout.simple_list_item_1;

        setListAdapter(new ArrayAdapter<String>(getActivity(), layout, Ipsum.Headlines));
    }

    @Override
    public void onStart(){
        super.onStart();
        if(getFragmentManager().findFragmentById(R.id.article_fragment) != null){
            Log.i(Tag,"find article_fragment in HeadlinesFragment");
            getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        }else {
            Log.d(Tag,"not find the article_fragment");
        }
    }

    @Override
    public void onAttach (Activity activity){
        super.onAttach(activity);
        try{
            mCallback = (OnHeadLineSelectedListener) activity;
        }catch(ClassCastException e){
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        mCallback.onArticleSelected(position);
        getListView().setItemChecked(position, true);
    }
}
