package mm.com.mit.rxjavaassignment.data.vos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.google.gson.annotations.SerializedName;


import java.util.ArrayList;

/**
 * Created by aung on 12/16/15.
 */
public class ProductionCountryVO {

    @SerializedName("iso_3166_1")
    private String iso_3166_1;

    @SerializedName("name")
    private String name;

    public String getIso_3166_1() {
        return iso_3166_1;
    }

    public String getName() {
        return name;
    }


}
