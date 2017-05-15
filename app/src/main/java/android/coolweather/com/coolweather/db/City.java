package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by wj on 2017/5/15.
 */

public class City extends DataSupport {
    private int id;
    private String cityNmae;
    private int cityCode;
    private int provinceId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCityNmae(String cityNmae) {
        this.cityNmae = cityNmae;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getId() {
        return id;
    }

    public String getCityNmae() {
        return cityNmae;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }
}
