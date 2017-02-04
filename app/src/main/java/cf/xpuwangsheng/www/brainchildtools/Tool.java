package cf.xpuwangsheng.www.brainchildtools;

/**
 * Created by xpuwangsheng on 2/4/17.
 */

public class Tool {
    /** Tools' title */
    private String mTitle;

    private Class mCla;

    /**
     * 构造一个新的 {@link Tool} 对象。
     * @param title
     */
    public Tool(String title, Class cla) {
        mTitle = title;
        mCla = cla;
    }

    public String getTitle() {
        return mTitle;
    }

    public Class getCla() {
        return mCla;
    }
}
