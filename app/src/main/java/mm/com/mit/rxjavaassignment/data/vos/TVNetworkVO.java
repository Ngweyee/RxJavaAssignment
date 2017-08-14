package mm.com.mit.rxjavaassignment.data.vos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.google.gson.annotations.SerializedName;


import java.util.ArrayList;

/**
 * Created by aung on 3/20/16.
 */
public class TVNetworkVO {

    @SerializedName("id")
    private int networkId;

    @SerializedName("name")
    private String name;

    public int getNetworkId() {
        return networkId;
    }

    public String getName() {
        return name;
    }


}
