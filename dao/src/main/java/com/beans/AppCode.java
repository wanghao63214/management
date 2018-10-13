package com.beans;

import java.io.Serializable;

/**
 * @author 
 */
public class AppCode implements Serializable {
    /**
     * 序号
     */
    private Integer id;

    /**
     * tomcat端口（一个tomcat负载一个应用）
     */
    private String port;

    /**
     * tomcat端口下数据源序号
     */
    private String db_id;

    /**
     * 数据源名称
     */
    private String db_name;

    /**
     * 门店美团订单数据是否传回drp 1:是,2:否
     */
    private Integer is_online;

    /**
     * 门店代码
     */
    private String shop_id;

    /**
     * APP方门店id
     */
    private String app_poi_code;

    /**
     * 门店名称
     */
    private String shop_name;

    /**
     * 打包袋skuid
     */
    private String package_bag_skuid;

    /**
     * 美团分配给APP方的id
     */
    private String app_id;

    /**
     * 美团门店密码
     */
    private String app_secret;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getDb_id() {
        return db_id;
    }

    public void setDb_id(String db_id) {
        this.db_id = db_id;
    }

    public String getDb_name() {
        return db_name;
    }

    public void setDb_name(String db_name) {
        this.db_name = db_name;
    }

    public Integer getIs_online() {
        return is_online;
    }

    public void setIs_online(Integer is_online) {
        this.is_online = is_online;
    }

    public String getShop_id() {
        return shop_id;
    }

    public void setShop_id(String shop_id) {
        this.shop_id = shop_id;
    }

    public String getApp_poi_code() {
        return app_poi_code;
    }

    public void setApp_poi_code(String app_poi_code) {
        this.app_poi_code = app_poi_code;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getPackage_bag_skuid() {
        return package_bag_skuid;
    }

    public void setPackage_bag_skuid(String package_bag_skuid) {
        this.package_bag_skuid = package_bag_skuid;
    }

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public String getApp_secret() {
        return app_secret;
    }

    public void setApp_secret(String app_secret) {
        this.app_secret = app_secret;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AppCode other = (AppCode) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPort() == null ? other.getPort() == null : this.getPort().equals(other.getPort()))
            && (this.getDb_id() == null ? other.getDb_id() == null : this.getDb_id().equals(other.getDb_id()))
            && (this.getDb_name() == null ? other.getDb_name() == null : this.getDb_name().equals(other.getDb_name()))
            && (this.getIs_online() == null ? other.getIs_online() == null : this.getIs_online().equals(other.getIs_online()))
            && (this.getShop_id() == null ? other.getShop_id() == null : this.getShop_id().equals(other.getShop_id()))
            && (this.getApp_poi_code() == null ? other.getApp_poi_code() == null : this.getApp_poi_code().equals(other.getApp_poi_code()))
            && (this.getShop_name() == null ? other.getShop_name() == null : this.getShop_name().equals(other.getShop_name()))
            && (this.getPackage_bag_skuid() == null ? other.getPackage_bag_skuid() == null : this.getPackage_bag_skuid().equals(other.getPackage_bag_skuid()))
            && (this.getApp_id() == null ? other.getApp_id() == null : this.getApp_id().equals(other.getApp_id()))
            && (this.getApp_secret() == null ? other.getApp_secret() == null : this.getApp_secret().equals(other.getApp_secret()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPort() == null) ? 0 : getPort().hashCode());
        result = prime * result + ((getDb_id() == null) ? 0 : getDb_id().hashCode());
        result = prime * result + ((getDb_name() == null) ? 0 : getDb_name().hashCode());
        result = prime * result + ((getIs_online() == null) ? 0 : getIs_online().hashCode());
        result = prime * result + ((getShop_id() == null) ? 0 : getShop_id().hashCode());
        result = prime * result + ((getApp_poi_code() == null) ? 0 : getApp_poi_code().hashCode());
        result = prime * result + ((getShop_name() == null) ? 0 : getShop_name().hashCode());
        result = prime * result + ((getPackage_bag_skuid() == null) ? 0 : getPackage_bag_skuid().hashCode());
        result = prime * result + ((getApp_id() == null) ? 0 : getApp_id().hashCode());
        result = prime * result + ((getApp_secret() == null) ? 0 : getApp_secret().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", port=").append(port);
        sb.append(", db_id=").append(db_id);
        sb.append(", db_name=").append(db_name);
        sb.append(", is_online=").append(is_online);
        sb.append(", shop_id=").append(shop_id);
        sb.append(", app_poi_code=").append(app_poi_code);
        sb.append(", shop_name=").append(shop_name);
        sb.append(", package_bag_skuid=").append(package_bag_skuid);
        sb.append(", app_id=").append(app_id);
        sb.append(", app_secret=").append(app_secret);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}