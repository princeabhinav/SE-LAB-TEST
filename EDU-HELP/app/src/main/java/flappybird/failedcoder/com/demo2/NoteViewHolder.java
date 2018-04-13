package flappybird.failedcoder.com.demo2;

import android.support.v7.widget.*;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by com on 30-03-2018.
 */

public class NoteViewHolder extends RecyclerView.ViewHolder {

    View mView;

    TextView textTitle, textTime;
    CardView noteCard;

    public NoteViewHolder(View itemView) {
        super(itemView);

        mView = itemView;

        textTitle = mView.findViewById(R.id.note_title);
        textTime = mView.findViewById(R.id.note_time);
        noteCard = mView.findViewById(R.id.note_card);

    }

    public void setNoteTitle(String title) {
        textTitle.setText(title);
    }

    public void setNoteTime(String time) {
        textTime.setText(time);
    }

}
