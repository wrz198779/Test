package activitytest.example.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wurenzhong on 2020-04-23.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
