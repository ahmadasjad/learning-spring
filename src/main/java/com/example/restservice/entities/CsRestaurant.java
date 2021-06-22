package com.example.restservice.entities;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "cs_restaurant", schema = "menudrive", catalog = "")
public class CsRestaurant {
    @Id
    private int restaurantid;
    private Integer ownerid;
    private String restaurantname;
    private String restaurantUrl;
    private int numberOfLocations;
    private String city;
    private String address;
    private Integer state;
    private Integer zip;
    private String cuisinetype;

    @Column(name = "accInfo")
    private String accInfo;
    private String phone;
    private String faxNumber;
    private String faxProvider;
    private String faxSource;
    private byte restaurantstatus;
    private byte restaurantstatusMobile;
    private String logo;
    private String websiteurl;
    private Time lastdeliveryorderbefore;
    private Time lasttakeoutorderbefore;
    private Double minorderamount;
    private Double deliverycharge;
    private String deliverytype;
    private String paymentaccepted;
    private String preprationtime;
    private String mailOrFax;
    private String licenseexp;
    private String msLogin;
    private String msPassword;
    private String msId;
    private String msDeviceId;
    private Integer ccPayment;
    private int giftPayment;
    private int deliveryNoticeMins;
    private int requireCustomerLogin;
    private byte whitelabel;
    private String activeGateway;
    private byte deliveryChargeType;
    private byte geofencingStatus;

    @Enumerated(EnumType.STRING)
    private AsapOrderType asapOrderType;
    private byte isPaymentLocked;
    private byte isAdminLocked;

    @Id
    @Column(name = "restaurantid")
    public int getRestaurantid() {
        return restaurantid;
    }

    public void setRestaurantid(int restaurantid) {
        this.restaurantid = restaurantid;
    }

    @Basic
    @Column(name = "ownerid")
    public Integer getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
    }

    @Basic
    @Column(name = "restaurantname")
    public String getRestaurantname() {
        return restaurantname;
    }

    public void setRestaurantname(String restaurantname) {
        this.restaurantname = restaurantname;
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
    @Column(name = "number_of_locations")
    public int getNumberOfLocations() {
        return numberOfLocations;
    }

    public void setNumberOfLocations(int numberOfLocations) {
        this.numberOfLocations = numberOfLocations;
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
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "state")
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Basic
    @Column(name = "zip")
    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    @Basic
    @Column(name = "cuisinetype")
    public String getCuisinetype() {
        return cuisinetype;
    }

    public void setCuisinetype(String cuisinetype) {
        this.cuisinetype = cuisinetype;
    }

    @Basic
    @Column(name = "accInfo")
    public String getAccInfo() {
        return accInfo;
    }

    public void setAccInfo(String accInfo) {
        this.accInfo = accInfo;
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
    @Column(name = "fax_number")
    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    @Basic
    @Column(name = "fax_provider")
    public String getFaxProvider() {
        return faxProvider;
    }

    public void setFaxProvider(String faxProvider) {
        this.faxProvider = faxProvider;
    }

    @Basic
    @Column(name = "fax_source")
    public String getFaxSource() {
        return faxSource;
    }

    public void setFaxSource(String faxSource) {
        this.faxSource = faxSource;
    }

    @Basic
    @Column(name = "restaurantstatus")
    public byte getRestaurantstatus() {
        return restaurantstatus;
    }

    public void setRestaurantstatus(byte restaurantstatus) {
        this.restaurantstatus = restaurantstatus;
    }

    @Basic
    @Column(name = "restaurantstatus_mobile")
    public byte getRestaurantstatusMobile() {
        return restaurantstatusMobile;
    }

    public void setRestaurantstatusMobile(byte restaurantstatusMobile) {
        this.restaurantstatusMobile = restaurantstatusMobile;
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
    @Column(name = "websiteurl")
    public String getWebsiteurl() {
        return websiteurl;
    }

    public void setWebsiteurl(String websiteurl) {
        this.websiteurl = websiteurl;
    }

    @Basic
    @Column(name = "lastdeliveryorderbefore")
    public Time getLastdeliveryorderbefore() {
        return lastdeliveryorderbefore;
    }

    public void setLastdeliveryorderbefore(Time lastdeliveryorderbefore) {
        this.lastdeliveryorderbefore = lastdeliveryorderbefore;
    }

    @Basic
    @Column(name = "lasttakeoutorderbefore")
    public Time getLasttakeoutorderbefore() {
        return lasttakeoutorderbefore;
    }

    public void setLasttakeoutorderbefore(Time lasttakeoutorderbefore) {
        this.lasttakeoutorderbefore = lasttakeoutorderbefore;
    }

    @Basic
    @Column(name = "minorderamount")
    public Double getMinorderamount() {
        return minorderamount;
    }

    public void setMinorderamount(Double minorderamount) {
        this.minorderamount = minorderamount;
    }

    @Basic
    @Column(name = "deliverycharge")
    public Double getDeliverycharge() {
        return deliverycharge;
    }

    public void setDeliverycharge(Double deliverycharge) {
        this.deliverycharge = deliverycharge;
    }

    @Basic
    @Column(name = "deliverytype")
    public String getDeliverytype() {
        return deliverytype;
    }

    public void setDeliverytype(String deliverytype) {
        this.deliverytype = deliverytype;
    }

    @Basic
    @Column(name = "paymentaccepted")
    public String getPaymentaccepted() {
        return paymentaccepted;
    }

    public void setPaymentaccepted(String paymentaccepted) {
        this.paymentaccepted = paymentaccepted;
    }

    @Basic
    @Column(name = "preprationtime")
    public String getPreprationtime() {
        return preprationtime;
    }

    public void setPreprationtime(String preprationtime) {
        this.preprationtime = preprationtime;
    }

    @Basic
    @Column(name = "mail_or_fax")
    public String getMailOrFax() {
        return mailOrFax;
    }

    public void setMailOrFax(String mailOrFax) {
        this.mailOrFax = mailOrFax;
    }

    @Basic
    @Column(name = "licenseexp")
    public String getLicenseexp() {
        return licenseexp;
    }

    public void setLicenseexp(String licenseexp) {
        this.licenseexp = licenseexp;
    }

    @Basic
    @Column(name = "ms_login")
    public String getMsLogin() {
        return msLogin;
    }

    public void setMsLogin(String msLogin) {
        this.msLogin = msLogin;
    }

    @Basic
    @Column(name = "ms_password")
    public String getMsPassword() {
        return msPassword;
    }

    public void setMsPassword(String msPassword) {
        this.msPassword = msPassword;
    }

    @Basic
    @Column(name = "ms_id")
    public String getMsId() {
        return msId;
    }

    public void setMsId(String msId) {
        this.msId = msId;
    }

    @Basic
    @Column(name = "ms_device_id")
    public String getMsDeviceId() {
        return msDeviceId;
    }

    public void setMsDeviceId(String msDeviceId) {
        this.msDeviceId = msDeviceId;
    }

    @Basic
    @Column(name = "cc_payment")
    public Integer getCcPayment() {
        return ccPayment;
    }

    public void setCcPayment(Integer ccPayment) {
        this.ccPayment = ccPayment;
    }

    @Basic
    @Column(name = "gift_payment")
    public int getGiftPayment() {
        return giftPayment;
    }

    public void setGiftPayment(int giftPayment) {
        this.giftPayment = giftPayment;
    }

    @Basic
    @Column(name = "delivery_notice_mins")
    public int getDeliveryNoticeMins() {
        return deliveryNoticeMins;
    }

    public void setDeliveryNoticeMins(int deliveryNoticeMins) {
        this.deliveryNoticeMins = deliveryNoticeMins;
    }

    @Basic
    @Column(name = "require_customer_login")
    public int getRequireCustomerLogin() {
        return requireCustomerLogin;
    }

    public void setRequireCustomerLogin(int requireCustomerLogin) {
        this.requireCustomerLogin = requireCustomerLogin;
    }

    @Basic
    @Column(name = "whitelabel")
    public byte getWhitelabel() {
        return whitelabel;
    }

    public void setWhitelabel(byte whitelabel) {
        this.whitelabel = whitelabel;
    }

    @Basic
    @Column(name = "active_gateway")
    public String getActiveGateway() {
        return activeGateway;
    }

    public void setActiveGateway(String activeGateway) {
        this.activeGateway = activeGateway;
    }

    @Basic
    @Column(name = "delivery_charge_type")
    public byte getDeliveryChargeType() {
        return deliveryChargeType;
    }

    public void setDeliveryChargeType(byte deliveryChargeType) {
        this.deliveryChargeType = deliveryChargeType;
    }

    @Basic
    @Column(name = "geofencing_status")
    public byte getGeofencingStatus() {
        return geofencingStatus;
    }

    public void setGeofencingStatus(byte geofencingStatus) {
        this.geofencingStatus = geofencingStatus;
    }

    @Basic
    @Column(name = "asap_order_type")
    public AsapOrderType getAsapOrderType() {
        return asapOrderType;
    }

    public void setAsapOrderType(AsapOrderType asapOrderType) {
        this.asapOrderType = asapOrderType;
    }

    @Basic
    @Column(name = "is_payment_locked")
    public byte getIsPaymentLocked() {
        return isPaymentLocked;
    }

    public void setIsPaymentLocked(byte isPaymentLocked) {
        this.isPaymentLocked = isPaymentLocked;
    }

    @Basic
    @Column(name = "is_admin_locked")
    public byte getIsAdminLocked() {
        return isAdminLocked;
    }

    public void setIsAdminLocked(byte isAdminLocked) {
        this.isAdminLocked = isAdminLocked;
    }

}
