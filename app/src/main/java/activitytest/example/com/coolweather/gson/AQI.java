package activitytest.example.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wurenzhong on 2020-04-23.
 */

public class AQI {
    @SerializedName("city")
    public AQICity city;
    public class AQICity {
        @SerializedName("aqi")
        public String aqi;
        @SerializedName("pm25")
        public String pm25;
    }
}
