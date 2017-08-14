package mm.com.mit.rxjavaassignment.activities;

import android.graphics.Movie;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import mm.com.mit.rxjavaassignment.R;
import mm.com.mit.rxjavaassignment.RestApi.responses.MovieListResponse;
import mm.com.mit.rxjavaassignment.RxJavaApp;
import mm.com.mit.rxjavaassignment.adapters.MovieListAdapter;
import mm.com.mit.rxjavaassignment.components.rvset.SmartRecyclerView;
import mm.com.mit.rxjavaassignment.data.vos.MovieVO;
import mm.com.mit.rxjavaassignment.views.pods.EmptyViewPod;

public class MainActivity extends BaseActivity {

    @BindView(R.id.rv_movies)
    SmartRecyclerView rvMostPopularMovie;

    @BindView(R.id.vp_empty_movie_list)
    EmptyViewPod vpEmptyMovieList;

    private MovieListAdapter movieListAdapter;

    private ArrayList<MovieVO> movieVOs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this, this);

        NavigateToMostPopularMovie();
        movieListAdapter = new MovieListAdapter(getApplicationContext());

        vpEmptyMovieList.setEmptyLabel(getString(R.string.msg_no_movie));
        vpEmptyMovieList.setEmptyImage(R.drawable.empty_data_placeholder);
        rvMostPopularMovie.setEmptyView(vpEmptyMovieList);
        rvMostPopularMovie.setAdapter(movieListAdapter);



    }


    public void NavigateToMostPopularMovie() {

        final Observable<MovieListResponse> movieListResponseObservable = getMostPopularMovieListResponseObservable();

        movieListResponseObservable
                .subscribeOn(Schedulers.io())
                .map(new Function<MovieListResponse, ArrayList<MovieVO>>() {
                    @Override
                    public ArrayList<MovieVO> apply(@NonNull MovieListResponse restaurantListResponse) throws Exception {
                        Log.d(RxJavaApp.TAG, "apply: " + restaurantListResponse.getResults().size());
                        return restaurantListResponse.getResults();
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ArrayList<MovieVO>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull ArrayList<MovieVO> readableText) {
                        movieVOs = new ArrayList<MovieVO>();
                        for (int i = 0; i < readableText.size(); i++) {
                            movieVOs.add(readableText.get(i));
                        }

                        movieListAdapter.setNewData(movieVOs);


                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }


    private Observable<MovieListResponse> getMostPopularMovieListResponseObservable() {
        RxJavaApp rxJavaApp = (RxJavaApp) getApplication();
        return rxJavaApp.getMovieApi().getPopularMovies(getString(R.string.THE_MOVIE_API_KEY), 1);
    }
}
