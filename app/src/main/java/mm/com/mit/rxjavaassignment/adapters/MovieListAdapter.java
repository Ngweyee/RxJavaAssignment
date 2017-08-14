package mm.com.mit.rxjavaassignment.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import mm.com.mit.rxjavaassignment.R;
import mm.com.mit.rxjavaassignment.data.vos.MovieVO;
import mm.com.mit.rxjavaassignment.views.pods.viewholders.MovieViewHolder;

public class MovieListAdapter extends BaseRecyclerAdapter<MovieViewHolder, MovieVO> {


    public MovieListAdapter(Context applicationContext) {
        super(applicationContext);

    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mLayoutInflater.inflate(R.layout.view_item_movie_full_width, parent, false);
        return new MovieViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        holder.bind(mData.get(position));
    }
}
