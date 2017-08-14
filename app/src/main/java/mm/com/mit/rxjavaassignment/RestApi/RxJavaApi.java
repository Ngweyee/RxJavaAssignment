package mm.com.mit.rxjavaassignment.RestApi;

import io.reactivex.Observable;
import mm.com.mit.rxjavaassignment.RestApi.responses.MovieListResponse;
import mm.com.mit.rxjavaassignment.util.RxJavaConstants;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by MIT on 8/14/2017.
 */

public interface RxJavaApi {

    @GET(RxJavaConstants.API_GET_MOST_POPULAR_MOVIE)
    Observable<MovieListResponse> getPopularMovies(
            @Query("api_key") String apiKey,
            @Query("page") int pageNumber
    );
}
