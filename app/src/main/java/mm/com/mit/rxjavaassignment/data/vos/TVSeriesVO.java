package mm.com.mit.rxjavaassignment.data.vos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

import com.google.gson.annotations.SerializedName;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by aung on 3/19/16.
 */
public class TVSeriesVO {

    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("popularity")
    private float popularity;

    @SerializedName("id")
    private int tvSerieId;

    @SerializedName("backdrop_path")
    private String backdropPath;

    @SerializedName("vote_average")
    private double voteAverage;

    @SerializedName("overview")
    private String overview;

    @SerializedName("first_air_date")
    private String firstAirDateText;

    @SerializedName("origin_country")
    private String[] originCountries;

    @SerializedName("genre_ids")
    private int[] genreIds;

    @SerializedName("original_language")
    private String originalLanguage;

    @SerializedName("vote_count")
    private int voteCount;

    @SerializedName("name")
    private String name;

    @SerializedName("original_name")
    private String originalName;

    private int tvSeriesType;
    private boolean isStar;
    private boolean isDetailLoaded;
    private List<TrailerVO> trailerList;

    @SerializedName("genres")
    private ArrayList<GenreVO> genreList; //detail

    @SerializedName("homepage")
    private String homepage; //detail

    @SerializedName("last_air_date")
    private String lastAirDateText;

    @SerializedName("networks")
    private ArrayList<TVNetworkVO> networkList;

    @SerializedName("number_of_episodes")
    private int numberOfEpisodes;

    @SerializedName("number_of_seasons")
    private int numberOfSeasons;

    @SerializedName("production_companies")
    private ArrayList<ProductionCompanyVO> productionCompanyList; //detail

    @SerializedName("seasons")
    private ArrayList<TVSeasonVO> seasonList;

    @SerializedName("status")
    private String status;

    @SerializedName("episode_run_time")
    private int[] episodeRuntime;

    public String getPosterPath() {
        return null;
    }

    public float getPopularity() {
        return popularity;
    }

    public int getTvSerieId() {
        return tvSerieId;
    }

    public String getBackdropPath() {
        return null;
    }

    public String getVoteAverage() {
        return String.format("%.1f", voteAverage);
    }

    public String getOverview() {
        return overview;
    }

    public String getFirstAirDateText() {
        return null;
    }

    public String[] getOriginCountries() {
        return originCountries;
    }

    public int[] getGenreIds() {
        return genreIds;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public String getName() {
        return name;
    }

    public String getOriginalName() {
        return originalName;
    }

    public int getTvSeriesType() {
        return tvSeriesType;
    }

    public void setTvSeriesType(int tvSeriesType) {
        this.tvSeriesType = tvSeriesType;
    }

    public ArrayList<GenreVO> getGenreList() {
        return genreList;
    }

    public void setGenreList(ArrayList<GenreVO> genreList) {
        this.genreList = genreList;
    }

    public String getHomepage() {
        return homepage;
    }

    public String getLastAirDateText() {
        return lastAirDateText;
    }

    public ArrayList<TVNetworkVO> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<TVNetworkVO> networkList) {
        this.networkList = networkList;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public ArrayList<ProductionCompanyVO> getProductionCompanyList() {
        return productionCompanyList;
    }

    public void setProductionCompanyList(ArrayList<ProductionCompanyVO> productionCompanyList) {
        this.productionCompanyList = productionCompanyList;
    }

    public ArrayList<TVSeasonVO> getSeasonList() {
        return seasonList;
    }

    public void setSeasonList(ArrayList<TVSeasonVO> seasonList) {
        this.seasonList = seasonList;
    }

    public String getStatus() {
        return status;
    }

    public boolean isStar() {
        return isStar;
    }

    public void setStar(boolean isStar) {
        this.isStar = isStar;
    }

    public boolean isDetailLoaded() {
        return isDetailLoaded;
    }

    public void setDetailLoaded(boolean isDetailLoaded) {
        this.isDetailLoaded = isDetailLoaded;
    }

    public String getEpisodeRuntime() {
        if (episodeRuntime != null && episodeRuntime.length > 0) {
            return null;
        }

        return null;
    }

    public List<TrailerVO> getTrailerList() {
        return trailerList;
    }

    public void setTrailerList(List<TrailerVO> trailerList) {
        this.trailerList = trailerList;
    }


}
