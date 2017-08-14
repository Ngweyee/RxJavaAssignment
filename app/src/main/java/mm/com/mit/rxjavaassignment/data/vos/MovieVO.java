package mm.com.mit.rxjavaassignment.data.vos;

import com.google.gson.annotations.SerializedName;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import mm.com.mit.rxjavaassignment.util.DateFormatUtils;

/**
 * Immutable.
 * Created by aung on 12/12/15.
 */
public class MovieVO {

    private static final String RUNTIME_FORMAT = "%1$d hrs %2$d mins";

    @SerializedName("id")
    private int id; //list - d

    @SerializedName("poster_path")
    private String posterPath; //list - d

    @SerializedName("overview")
    private String overview; //list - d

    @SerializedName("release_date")
    private String releaseDateText; //list - d

    @SerializedName("genre_ids")
    private int[] genreIds; //list

    @SerializedName("original_title")
    private String originalTitle; //list - d

    @SerializedName("original_language")
    private String originalLanguage; //list - d

    @SerializedName("title")
    private String title; //list - d

    @SerializedName("backdrop_path")
    private String backdropPath; //list - d

    @SerializedName("popularity")
    private float popularity; //list - d

    @SerializedName("vote_count")
    private int voteCount; //list - d

    @SerializedName("vote_average")
    private float voteAverage; //list - d

    @SerializedName("adult")
    private boolean isAdult; //list - d

    @SerializedName("video")
    private boolean isVideo; //list

    @SerializedName("belongs_to_collection")
    private CollectionVO collection; //detail

    @SerializedName("budget")
    private long budget; //detail

    @SerializedName("genres")
    private ArrayList<GenreVO> genreList; //detail

    @SerializedName("homepage")
    private String homepage; //detail

    @SerializedName("imdb_id")
    private String imdbId; //detail

    @SerializedName("production_companies")
    private ArrayList<ProductionCompanyVO> productionCompanyList; //detail

    @SerializedName("production_countries")
    private ArrayList<ProductionCountryVO> productionCountryList; //detail

    @SerializedName("revenue")
    private long revenue; //detail

    @SerializedName("runtime")
    private int runtime; //detail

    @SerializedName("spoken_languages")
    private ArrayList<SpokenLanguageVO> spokenLanguageList; //detail

    @SerializedName("status")
    private String status; //detail

    @SerializedName("tagline")
    private String tagline; //detail

    private List<TrailerVO> trailerList;
    private boolean isDetailLoaded;
    private Date releaseDate;
    private int collectionId;
    private int movieType;
    private boolean isStar;

    private List<MovieReviewVO> reviewList;

    public int getId() {
        return id;
    }

    public String getPosterPath() {
        return MovieManiacConstants.IMAGE_BASE_PATH + MovieManiacConstants.IMAGE_SIZE_W500 + posterPath;
    }

    public String getOverview() {
        return overview;
    }

    public Date getReleaseDate() {
        if (releaseDate == null) {
            try {
                releaseDate = DateFormatUtils.sdf_yyyy_mm_dd.parse(releaseDateText);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return releaseDate;
    }

    public String getReleaseDateDisplay() {
        if (releaseDate == null) {
            try {
                releaseDate = DateFormatUtils.sdf_yyyy_mm_dd.parse(releaseDateText);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return DateFormatUtils.sdf_MMMM_yyyy.format(releaseDate);
    }

    public int[] getGenreIds() {
        return genreIds;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getTitle() {
        return title;
    }

    public String getBackdropPath() {
        return MovieManiacConstants.IMAGE_BASE_PATH + MovieManiacConstants.IMAGE_SIZE_W500 + backdropPath;
    }

    public float getPopularity() {
        return popularity;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public boolean isVideo() {
        return isVideo;
    }

    public String getVoteAverageText() {
        return String.format("%.1f", voteAverage);
    }

    public float getVoteAverage() {
        return voteAverage;
    }

    public CollectionVO getCollection() {
        return collection;
    }

    public void setCollection(CollectionVO collection) {
        this.collection = collection;
    }

    public long getBudget() {
        return budget;
    }

    public void setGenreList(ArrayList<GenreVO> genreList) {
        this.genreList = genreList;
    }

    public ArrayList<GenreVO> getGenreList() {
        return genreList;
    }

    public String getHomepage() {
        return homepage;
    }

    public String getImdbId() {
        return imdbId;
    }

    public ArrayList<ProductionCompanyVO> getProductionCompanyList() {
        return productionCompanyList;
    }

    public void setProductionCompanyList(ArrayList<ProductionCompanyVO> productionCompanyList) {
        this.productionCompanyList = productionCompanyList;
    }

    public ArrayList<ProductionCountryVO> getProductionCountryList() {
        return productionCountryList;
    }

    public void setProductionCountryList(ArrayList<ProductionCountryVO> productionCountryList) {
        this.productionCountryList = productionCountryList;
    }

    public long getRevenue() {
        return revenue;
    }

    public int getRuntime() {
        return runtime;
    }

    public String getRuntimeDisplay() {
        int hour = runtime / 60;
        int minute = runtime % 60;
        return String.format(RUNTIME_FORMAT, hour, minute);
    }

    public ArrayList<SpokenLanguageVO> getSpokenLanguageList() {
        return spokenLanguageList;
    }

    public void setSpokenLanguageList(ArrayList<SpokenLanguageVO> spokenLanguageList) {
        this.spokenLanguageList = spokenLanguageList;
    }

    public String getStatus() {
        return status;
    }

    public String getTagline() {
        return tagline;
    }

    public List<TrailerVO> getTrailerList() {
        return trailerList;
    }

    public void setTrailerList(List<TrailerVO> trailerList) {
        this.trailerList = trailerList;
    }

    public boolean isDetailLoaded() {
        return isDetailLoaded;
    }

    public void setIsDetailLoaded(boolean isDetailLoaded) {
        this.isDetailLoaded = isDetailLoaded;
    }

    public int getCollectionId() {
        return collectionId;
    }

    public int getMovieType() {
        return movieType;
    }

    public void setMovieType(int movieType) {
        this.movieType = movieType;
    }

    public List<MovieReviewVO> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<MovieReviewVO> reviewList) {
        this.reviewList = reviewList;
    }

    public boolean isStar() {
        return isStar;
    }

    public void setStar(boolean star) {
        isStar = star;
    }








}
