package bader.bowlingscoresheet;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

public class RowAdapter extends RecyclerView.Adapter<RowAdapter.RowViewHolder> {
    private ArrayList<ScoresRow> mDataset;
    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class RowViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public LinearLayout row;
        public RowViewHolder(LinearLayout r) {
            super(r);
            row = r;
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public RowAdapter(ArrayList<ScoresRow> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public RowAdapter.RowViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        // create a new view
        final View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_layout, parent, false);
        RowViewHolder vh = new RowViewHolder((LinearLayout) v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(RowViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public void add(ScoresRow sr) {
        mDataset.add(sr);
        notifyItemInserted(mDataset.size() - 1);
    }
}
