package in.bitcode.customview2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AdapterTasks extends BaseAdapter {

    private ArrayList<String> mListTasks;
    private Context mContext;

    public AdapterTasks(Context context, ArrayList<String> tasks) {
        mContext = context;
        mListTasks = tasks;
    }

    @Override
    public int getCount() {
        if( mListTasks == null)
            return 0;

        return mListTasks.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        TaskView taskView;

        if( convertView == null ) {
            taskView = new TaskView(mContext);
            taskView.setLayoutParams(new ListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        }
        else {
            taskView = (TaskView) convertView;
        }

        taskView.setText(mListTasks.get(position));

        return taskView;
    }
}
