package com.evs.echarge.mvpframework;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 站模型
 */
public class StationBean implements Parcelable {

    private String id;// 站id
    private int feature;// 特性。距离最近/充电最快/充电
    private String featureStr;// 特性。距离最近/充电最快/充电
    private int stationType;
    private String stationTypeStr;
    private int spendTime;//
    private String address;//地址
    private int opeartor;//运营商
    private double distance;//距离
    private String name;// 站点名称
    private int status;//状态
    private int dc_avaliable;//直流电可用
    private int dc_total;//直流电总数
    private int ac_avaliable;//交流电可用
    private int ac_total;//交流电总数
    private double electrcityFee;//充电费
    private double serviceFee;//服务费
    private int gb2015;//国标2015
    private int gb2011;//国标2011
    private int usa;
    private int eu;
    private int other;
    private int minOutputPower;//最小功率
    private int maxOutputPower;//最大功率
    private String parkFee;//停车费
    private String parkOpenTime;//开始营业时间
    private String parkCloseTime;//结束营业时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getFeature() {
        return feature;
    }

    public void setFeature(int feature) {
        this.feature = feature;
    }

    public String getFeatureStr() {
        return featureStr;
    }

    public void setFeatureStr(String featureStr) {
        this.featureStr = featureStr;
    }

    public int getStationType() {
        return stationType;
    }

    public void setStationType(int stationType) {
        this.stationType = stationType;
    }

    public String getStationTypeStr() {
        return stationTypeStr;
    }

    public void setStationTypeStr(String stationTypeStr) {
        this.stationTypeStr = stationTypeStr;
    }

    public int getSpendTime() {
        return spendTime;
    }

    public void setSpendTime(int spendTime) {
        this.spendTime = spendTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getOpeartor() {
        return opeartor;
    }

    public void setOpeartor(int opeartor) {
        this.opeartor = opeartor;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getDc_avaliable() {
        return dc_avaliable;
    }

    public void setDc_avaliable(int dc_avaliable) {
        this.dc_avaliable = dc_avaliable;
    }

    public int getDc_total() {
        return dc_total;
    }

    public void setDc_total(int dc_total) {
        this.dc_total = dc_total;
    }

    public int getAc_avaliable() {
        return ac_avaliable;
    }

    public void setAc_avaliable(int ac_avaliable) {
        this.ac_avaliable = ac_avaliable;
    }

    public int getAc_total() {
        return ac_total;
    }

    public void setAc_total(int ac_total) {
        this.ac_total = ac_total;
    }

    public double getElectrcityFee() {
        return electrcityFee;
    }

    public void setElectrcityFee(double electrcityFee) {
        this.electrcityFee = electrcityFee;
    }

    public double getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(double serviceFee) {
        this.serviceFee = serviceFee;
    }

    public int getGb2015() {
        return gb2015;
    }

    public void setGb2015(int gb2015) {
        this.gb2015 = gb2015;
    }

    public int getGb2011() {
        return gb2011;
    }

    public void setGb2011(int gb2011) {
        this.gb2011 = gb2011;
    }

    public int getUsa() {
        return usa;
    }

    public void setUsa(int usa) {
        this.usa = usa;
    }

    public int getEu() {
        return eu;
    }

    public void setEu(int eu) {
        this.eu = eu;
    }

    public int getOther() {
        return other;
    }

    public void setOther(int other) {
        this.other = other;
    }

    public int getMinOutputPower() {
        return minOutputPower;
    }

    public void setMinOutputPower(int minOutputPower) {
        this.minOutputPower = minOutputPower;
    }

    public int getMaxOutputPower() {
        return maxOutputPower;
    }

    public void setMaxOutputPower(int maxOutputPower) {
        this.maxOutputPower = maxOutputPower;
    }

    public String getParkFee() {
        return parkFee;
    }

    public void setParkFee(String parkFee) {
        this.parkFee = parkFee;
    }

    public String getParkOpenTime() {
        return parkOpenTime;
    }

    public void setParkOpenTime(String parkOpenTime) {
        this.parkOpenTime = parkOpenTime;
    }

    public String getParkCloseTime() {
        return parkCloseTime;
    }

    public void setParkCloseTime(String parkCloseTime) {
        this.parkCloseTime = parkCloseTime;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeInt(this.feature);
        dest.writeString(this.featureStr);
        dest.writeInt(this.stationType);
        dest.writeString(this.stationTypeStr);
        dest.writeInt(this.spendTime);
        dest.writeString(this.address);
        dest.writeInt(this.opeartor);
        dest.writeDouble(this.distance);
        dest.writeString(this.name);
        dest.writeInt(this.status);
        dest.writeInt(this.dc_avaliable);
        dest.writeInt(this.dc_total);
        dest.writeInt(this.ac_avaliable);
        dest.writeInt(this.ac_total);
        dest.writeDouble(this.electrcityFee);
        dest.writeDouble(this.serviceFee);
        dest.writeInt(this.gb2015);
        dest.writeInt(this.gb2011);
        dest.writeInt(this.usa);
        dest.writeInt(this.eu);
        dest.writeInt(this.other);
        dest.writeInt(this.minOutputPower);
        dest.writeInt(this.maxOutputPower);
        dest.writeString(this.parkFee);
        dest.writeString(this.parkOpenTime);
        dest.writeString(this.parkCloseTime);
    }

    public StationBean() {
    }

    protected StationBean(Parcel in) {
        this.id = in.readString();
        this.feature = in.readInt();
        this.featureStr = in.readString();
        this.stationType = in.readInt();
        this.stationTypeStr = in.readString();
        this.spendTime = in.readInt();
        this.address = in.readString();
        this.opeartor = in.readInt();
        this.distance = in.readDouble();
        this.name = in.readString();
        this.status = in.readInt();
        this.dc_avaliable = in.readInt();
        this.dc_total = in.readInt();
        this.ac_avaliable = in.readInt();
        this.ac_total = in.readInt();
        this.electrcityFee = in.readDouble();
        this.serviceFee = in.readDouble();
        this.gb2015 = in.readInt();
        this.gb2011 = in.readInt();
        this.usa = in.readInt();
        this.eu = in.readInt();
        this.other = in.readInt();
        this.minOutputPower = in.readInt();
        this.maxOutputPower = in.readInt();
        this.parkFee = in.readString();
        this.parkOpenTime = in.readString();
        this.parkCloseTime = in.readString();
    }

    public static final Creator<StationBean> CREATOR = new Creator<StationBean>() {
        @Override
        public StationBean createFromParcel(Parcel source) {
            return new StationBean(source);
        }

        @Override
        public StationBean[] newArray(int size) {
            return new StationBean[size];
        }
    };
}
