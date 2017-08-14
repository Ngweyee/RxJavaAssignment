package mm.com.mit.rxjavaassignment;

import android.app.Application;

import com.google.gson.Gson;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.concurrent.TimeUnit;

import mm.com.mit.rxjavaassignment.RestApi.RxJavaApi;
import mm.com.mit.rxjavaassignment.util.RxJavaConstants;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by MIT on 8/14/2017.
 */

public class RxJavaApp extends Application {

    public static final String TAG = "RxJavaApp";

    private  RxJavaApi theApi;

    @Override
    public void onCreate() {
        super.onCreate();
        initRestaurantApi();
    }

    public RxJavaApi getMovieApi() {
        return theApi;
    }

    private void initRestaurantApi() {
        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RxJavaConstants.MOST_POPULAR_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build();

        theApi = retrofit.create(RxJavaApi.class);
    }
}
