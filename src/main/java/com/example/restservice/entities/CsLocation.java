package com.example.restservice.entities;

import com.example.restservice.repository.RestaurantRepository;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "cs_location", schema = "menudrive", catalog = "")
public class CsLocation {

    @Id
    private int locationid;
    private Integer restaurantid;
    private String locationname;
    private String addressTitle;
    private String address;
    private String line2;
    private String city;
    private Integer stateid;
    private String zip;
    private String phone;
    private String fax;
    private Byte onlineordering;
    private String email;
    private String message;
    private String status;
    private Double localtax;
    private byte applyTaxBeforeDiscount;
    private byte applyTaxOnDeliveryCharge;
    private Double deliveryRange;
    private String addressLatitude;
    private String addressLongitude;
    private String cellnumber;
    private String logo;
    private String storePhoto;
    private String headerImage;
    private String locationtype;
    private String restaurantUrl;
    private String checkNotifiy;
    private int userId;
    private String opId;
    private String timezone;
    private Integer countryId;
    private int allowGroupOrder;
    private byte showTipField;
    private int orderTypeAlert;
    private String orderTypeDisclaimer;
    private String orderTypeHours;
    private int orderTypeAlertRequired;
    private int allowFacebookLogin;
    private int showReceiptSig;
    private int showTipLine;
    private String defaultLanguageCode;
    private Timestamp insertedTimestamp;
    private byte onboarded;
    private String surveyStatus;

    @Id
    @Column(name = "locationid")
    public int getLocationid() {
        return locationid;
    }

    public void setLocationid(int locationid) {
        this.locationid = locationid;
    }

    @Basic
    @Column(name = "restaurantid")
    public Integer getRestaurantid() {
        return restaurantid;
    }

    public void setRestaurantid(Integer restaurantid) {
        this.restaurantid = restaurantid;
    }

    @Basic
    @Column(name = "locationname")
    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname;
    }

    @Basic
    @Column(name = "address_title")
    public String getAddressTitle() {
        return addressTitle;
    }

    public void setAddressTitle(String addressTitle) {
        this.addressTitle = addressTitle;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "line2")
    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "stateid")
    public Integer getStateid() {
        return stateid;
    }

    public void setStateid(Integer stateid) {
        this.stateid = stateid;
    }

    @Basic
    @Column(name = "zip")
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "fax")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "onlineordering")
    public Byte getOnlineordering() {
        return onlineordering;
    }

    public void setOnlineordering(Byte onlineordering) {
        this.onlineordering = onlineordering;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "localtax")
    public Double getLocaltax() {
        return localtax;
    }

    public void setLocaltax(Double localtax) {
        this.localtax = localtax;
    }

    @Basic
    @Column(name = "apply_tax_before_discount")
    public byte getApplyTaxBeforeDiscount() {
        return applyTaxBeforeDiscount;
    }

    public void setApplyTaxBeforeDiscount(byte applyTaxBeforeDiscount) {
        this.applyTaxBeforeDiscount = applyTaxBeforeDiscount;
    }

    @Basic
    @Column(name = "apply_tax_on_delivery_charge")
    public byte getApplyTaxOnDeliveryCharge() {
        return applyTaxOnDeliveryCharge;
    }

    public void setApplyTaxOnDeliveryCharge(byte applyTaxOnDeliveryCharge) {
        this.applyTaxOnDeliveryCharge = applyTaxOnDeliveryCharge;
    }

    @Basic
    @Column(name = "delivery_range")
    public Double getDeliveryRange() {
        return deliveryRange;
    }

    public void setDeliveryRange(Double deliveryRange) {
        this.deliveryRange = deliveryRange;
    }

    @Basic
    @Column(name = "address_latitude")
    public String getAddressLatitude() {
        return addressLatitude;
    }

    public void setAddressLatitude(String addressLatitude) {
        this.addressLatitude = addressLatitude;
    }

    @Basic
    @Column(name = "address_longitude")
    public String getAddressLongitude() {
        return addressLongitude;
    }

    public void setAddressLongitude(String addressLongitude) {
        this.addressLongitude = addressLongitude;
    }

    @Basic
    @Column(name = "cellnumber")
    public String getCellnumber() {
        return cellnumber;
    }

    public void setCellnumber(String cellnumber) {
        this.cellnumber = cellnumber;
    }

    @Basic
    @Column(name = "logo")
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Basic
    @Column(name = "store_photo")
    public String getStorePhoto() {
        return storePhoto;
    }

    public void setStorePhoto(String storePhoto) {
        this.storePhoto = storePhoto;
    }

    @Basic
    @Column(name = "header_image")
    public String getHeaderImage() {
        return headerImage;
    }

    public void setHeaderImage(String headerImage) {
        this.headerImage = headerImage;
    }

    @Basic
    @Column(name = "locationtype")
    public String getLocationtype() {
        return locationtype;
    }

    public void setLocationtype(String locationtype) {
        this.locationtype = locationtype;
    }

    @Basic
    @Column(name = "restaurant_url")
    public String getRestaurantUrl() {
        return restaurantUrl;
    }

    public void setRestaurantUrl(String restaurantUrl) {
        this.restaurantUrl = restaurantUrl;
    }

    @Basic
    @Column(name = "check_notifiy")
    public String getCheckNotifiy() {
        return checkNotifiy;
    }

    public void setCheckNotifiy(String checkNotifiy) {
        this.checkNotifiy = checkNotifiy;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "op_id")
    public String getOpId() {
        return opId;
    }

    public void setOpId(String opId) {
        this.opId = opId;
    }

    @Basic
    @Column(name = "timezone")
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Basic
    @Column(name = "country_id")
    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    @Basic
    @Column(name = "allow_group_order")
    public int getAllowGroupOrder() {
        return allowGroupOrder;
    }

    public void setAllowGroupOrder(int allowGroupOrder) {
        this.allowGroupOrder = allowGroupOrder;
    }

    @Basic
    @Column(name = "show_tip_field")
    public byte getShowTipField() {
        return showTipField;
    }

    public void setShowTipField(byte showTipField) {
        this.showTipField = showTipField;
    }

    @Basic
    @Column(name = "order_type_alert")
    public int getOrderTypeAlert() {
        return orderTypeAlert;
    }

    public void setOrderTypeAlert(int orderTypeAlert) {
        this.orderTypeAlert = orderTypeAlert;
    }

    @Basic
    @Column(name = "order_type_disclaimer")
    public String getOrderTypeDisclaimer() {
        return orderTypeDisclaimer;
    }

    public void setOrderTypeDisclaimer(String orderTypeDisclaimer) {
        this.orderTypeDisclaimer = orderTypeDisclaimer;
    }

    @Basic
    @Column(name = "order_type_hours")
    public String getOrderTypeHours() {
        return orderTypeHours;
    }

    public void setOrderTypeHours(String orderTypeHours) {
        this.orderTypeHours = orderTypeHours;
    }

    @Basic
    @Column(name = "order_type_alert_required")
    public int getOrderTypeAlertRequired() {
        return orderTypeAlertRequired;
    }

    public void setOrderTypeAlertRequired(int orderTypeAlertRequired) {
        this.orderTypeAlertRequired = orderTypeAlertRequired;
    }

    @Basic
    @Column(name = "allow_facebook_login")
    public int getAllowFacebookLogin() {
        return allowFacebookLogin;
    }

    public void setAllowFacebookLogin(int allowFacebookLogin) {
        this.allowFacebookLogin = allowFacebookLogin;
    }

    @Basic
    @Column(name = "show_receipt_sig")
    public int getShowReceiptSig() {
        return showReceiptSig;
    }

    public void setShowReceiptSig(int showReceiptSig) {
        this.showReceiptSig = showReceiptSig;
    }

    @Basic
    @Column(name = "show_tip_line")
    public int getShowTipLine() {
        return showTipLine;
    }

    public void setShowTipLine(int showTipLine) {
        this.showTipLine = showTipLine;
    }

    @Basic
    @Column(name = "default_language_code")
    public String getDefaultLanguageCode() {
        return defaultLanguageCode;
    }

    public void setDefaultLanguageCode(String defaultLanguageCode) {
        this.defaultLanguageCode = defaultLanguageCode;
    }

    @Basic
    @Column(name = "inserted_timestamp")
    public Timestamp getInsertedTimestamp() {
        return insertedTimestamp;
    }

    public void setInsertedTimestamp(Timestamp insertedTimestamp) {
        this.insertedTimestamp = insertedTimestamp;
    }

    @Basic
    @Column(name = "onboarded")
    public byte getOnboarded() {
        return onboarded;
    }

    public void setOnboarded(byte onboarded) {
        this.onboarded = onboarded;
    }

    @Basic
    @Column(name = "survey_status")
    public String getSurveyStatus() {
        return surveyStatus;
    }

    public void setSurveyStatus(String surveyStatus) {
        this.surveyStatus = surveyStatus;
    }

}
