package com.example.notekeeperjavaa;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NoteRecyclerAdapter extends RecyclerView.Adapter<NoteRecyclerAdapter.ViewHolder>{

       private final Context mContext;
       private final List<NoteInfo>mNotes;
       private final LayoutInflater mLayoutInflator;

    public NoteRecyclerAdapter(Context mContext1, Context mContext, List<NoteInfo> notes) {
        this.mContext = mContext;
        mContext = mContext;
        mNotes    =notes;
        mLayoutInflator=LayoutInflater.from ( mContext );
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView=mLayoutInflator.inflate ( R.layout.item_note_list,parent,false );
        return new ViewHolder ( itemView );
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
          NoteInfo note= mNotes.get(position);
          //holder.mTextCourse.setText(note.getCourse().getTitle());
          //holder.mTextTitle.setText ( note.getTitle );

    }
    
    @Override
    public int getItemCount() {
        return mNotes.size ();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public final TextView mTextCourse;
        public final TextView mTextTitle;

        public ViewHolder(View itemView) {

            super ( itemView );

            mTextCourse = (TextView) itemView.findViewById ( R.id.text_course );
            mTextTitle = (TextView) itemView.findViewById ( R.id.text_title );
        }
    }
}
