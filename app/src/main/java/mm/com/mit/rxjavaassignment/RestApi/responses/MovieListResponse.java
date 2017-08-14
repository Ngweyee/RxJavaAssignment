package mm.com.mit.rxjavaassignment.RestApi.responses;

import java.util.ArrayList;

import mm.com.mit.rxjavaassignment.data.vos.MovieVO;

/**
 * Created by MIT on 8/14/2017.
 */

public class MovieListResponse {

    private int page;
    private ArrayList<MovieVO> results;
    private int total_results;
    private int total_pages;

    public int getPage() {
        return page;
    }

    public ArrayList<MovieVO> getResults() {
        return results;
    }

    public int getTotal_results() {
        return total_results;
    }

    public int getTotal_pages() {
        return total_pages;
    }
}
