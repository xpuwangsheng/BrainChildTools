package cf.xpuwangsheng.www.brainchildtools;

import java.util.ArrayList;
import java.util.List;

import cf.xpuwangsheng.www.brainchildtools.AsyncTaskLoader.AsyncTaskLoaderActivity;
import cf.xpuwangsheng.www.brainchildtools.MyFragment.MyFragmentActivity;
import cf.xpuwangsheng.www.brainchildtools.OpenCVExample.OpenCVActivity;
import cf.xpuwangsheng.www.brainchildtools.PhotoIntent.PhotoIntentActivity;

/**
 * Created by xpuwangsheng on 2/4/17.
 */

public final class ToolUtils {

    private ToolUtils(){

    }

    public static List<Tool> fetchToolData(){
        List<Tool> tools = new ArrayList<>();
        tools.add(new Tool("My Fragment", MyFragmentActivity.class));
        tools.add(new Tool("Show OpenCV", OpenCVActivity.class));
        tools.add(new Tool("Take Photo", PhotoIntentActivity.class));
        tools.add(new Tool("Async Task Loader", AsyncTaskLoaderActivity.class));

        return tools;
    }
}
