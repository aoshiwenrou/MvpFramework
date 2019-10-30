package com.evs.echarge.mvpframework;

import android.os.Parcel;
import android.os.Parcelable;

import com.blankj.utilcode.util.GsonUtils;

public class PoiBean implements Parcelable {
    private String id;
    private String name; //名称
    private Object address; //地址
    private String location; //经纬度。格式为 "经度,纬度"
//    private String pname; //省名称
//    private String cityname; //市名称
//    private String adname; //区名称

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(GsonUtils.toJson(address));
        dest.writeString(this.location);
    }

    public PoiBean() {
    }

    protected PoiBean(Parcel in) {
        this.id = in.readString();
        this.name = in.readString();
        this.address = in.readString();
        this.location = in.readString();
    }

    public static final Creator<PoiBean> CREATOR = new Creator<PoiBean>() {
        @Override
        public PoiBean createFromParcel(Parcel source) {
            return new PoiBean(source);
        }

        @Override
        public PoiBean[] newArray(int size) {
            return new PoiBean[size];
        }
    };
}
