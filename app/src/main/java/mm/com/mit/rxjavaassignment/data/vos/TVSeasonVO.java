package mm.com.mit.rxjavaassignment.data.vos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by aung on 3/20/16.
 */
public class TVSeasonVO {

    @SerializedName("air_date")
    private String airDateText;

    @SerializedName("episode_count")
    private int episodeCount;

    @SerializedName("id")
    private int seasonId;

    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("season_number")
    private int seasonNumber;

    public String getAirDateText() {
        return null;
    }

    public String getEpisodeCount() {
        return null;
    }

    public int getSeasonId() {
        return seasonId;
    }

    public String getPosterPath() {
        return null;
    }

    public String getSeasonNumber() {
        return null;
    }



}
