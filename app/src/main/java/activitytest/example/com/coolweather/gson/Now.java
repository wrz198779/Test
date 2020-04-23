package activitytest.example.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wurenzhong on 2020-04-23.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
