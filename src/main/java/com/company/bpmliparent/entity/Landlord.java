package com.company.bpmliparent.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@JmixEntity
@Table(name = "LANDLORD", indexes = {
        @Index(name = "IDX_LANDLORD_NATIONALITY_ID", columnList = "NATIONALITY_ID")
})
@Entity
public class Landlord {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "NATIONALITY_ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Nationality nationality;

    @NotNull
    @Column(name = "LASTNAME", nullable = false, length = 50)
    private String lastname;

    @NotNull
    @InstanceName
    @Column(name = "FIRSTNAME", nullable = false, length = 50)
    private String firstname;

    @Column(name = "MIDDLENAME", length = 50)
    private String middlename;

    @Column(name = "IDENTIFICATION_NUMBER", nullable = false, length = 50)
    @NotNull
    private String identificationNumber;

    @Column(name = "ADDRESS", nullable = false, length = 50)
    @NotNull
    private String address;

    @Column(name = "MOBILE_NO", length = 15)
    private String mobileNo;

    @Email(message = "enter a valid email")
    @Column(name = "EMAIL", nullable = false, length = 50)
    @NotNull
    private String email;

    @Column(name = "DATE_OF_BIRTH", nullable = false)
    @NotNull
    private LocalDate dateOfBirth;

    @Column(name = "NEXT_OF_KIN_FIRSTNAME", nullable = false, length = 50)
    @NotNull
    private String nextOfKinFirstname;

    @Column(name = "NEXT_OF_KIN_LASTNAME", nullable = false, length = 50)
    @NotNull
    private String nextOfKinLastname;

    @Column(name = "NEXT_OF_KIN_MIDDLE", length = 50)
    private String nextOfKinMiddle;

    @Column(name = "NEXT_OF_KIN_ADDRESS", nullable = false, length = 50)
    @NotNull
    private String nextOfKinAddress;

    @Column(name = "NEXT_OF_KIN_MOBILE_NO", nullable = false, length = 50)
    @NotNull
    private String nextOfKinMobileNo;

    @Column(name = "NEXT_OF_KIN_EMAIL_ADDRESS", nullable = false, length = 100)
    @NotNull
    private String nextOfKinEmailAddress;

    @Column(name = "LANDLORD_TYPE", nullable = false, length = 50)
    @NotNull
    private String landlordType;

    @Column(name = "PROPERTY_TYPE", nullable = false, length = 50)
    @NotNull
    private String propertyType;

    @Column(name = "PROPERTY_NAME", nullable = false, length = 50)
    @NotNull
    private String propertyName;

    @Column(name = "BEDROOM", nullable = false, length = 50)
    @NotNull
    private String bedroom;

    @Column(name = "PROPERTY_IDENTITY", nullable = false, length = 50)
    @NotNull
    private String propertyIdentity;

    @Column(name = "ROAD", length = 50)
    private String road;

    @Column(name = "GPS_LOCATION", nullable = false, length = 100)
    @NotNull
    private String gpsLocation;

    @Column(name = "MINIMUM_OCCUPANCY", nullable = false)
    @NotNull
    private Integer minimumOccupancy;

    @Column(name = "TOTAL_YEARLY_RENT", nullable = false)
    @NotNull
    private Long totalYearlyRent;

    @Column(name = "ONE_MONTH_RRENT", nullable = false)
    @NotNull
    private Long oneMonthRrent;

    @Column(name = "THREE_MONTHS_RENT", nullable = false)
    @NotNull
    private Long threeMonthsRent;

    @Column(name = "PROPERT_ADDRESS", nullable = false, length = 50)
    @NotNull
    private String propertAddress;

    @Column(name = "PROPERTY_MOBILE_NO", nullable = false, length = 15)
    @NotNull
    private String propertyMobileNo;

    @Email(message = "Enter a valid email")
    @Column(name = "PROPERTY_EMAIL_ADDRESS", nullable = false)
    @NotNull
    private String propertyEmailAddress;

    @Column(name = "REGION", nullable = false, length = 50)
    @NotNull
    private String region;

    @Column(name = "LANDLORD_REQUEST_AMOUNT")
    private Integer landlordRequestAmount;

    @Column(name = "TOTAL_DISBURSEMENT")
    private Long totalDisbursement;

    @Column(name = "LANDLORD_DISBURSEMENT_SCHEDULE", nullable = false, length = 50)
    @NotNull
    private String landlordDisbursementSchedule;

    @Column(name = "LANDLORD_DIBURSEMENT", nullable = false)
    @NotNull
    private String landlordDibursement;

    public String getLandlordDibursement() {
        return landlordDibursement;
    }

    public void setLandlordDibursement(String landlordDibursement) {
        this.landlordDibursement = landlordDibursement;
    }

    public String getLandlordDisbursementSchedule() {
        return landlordDisbursementSchedule;
    }

    public void setLandlordDisbursementSchedule(String landlordDisbursementSchedule) {
        this.landlordDisbursementSchedule = landlordDisbursementSchedule;
    }

    public Long getTotalDisbursement() {
        return totalDisbursement;
    }

    public void setTotalDisbursement(Long totalDisbursement) {
        this.totalDisbursement = totalDisbursement;
    }

    public Integer getLandlordRequestAmount() {
        return landlordRequestAmount;
    }

    public void setLandlordRequestAmount(Integer landlordRequestAmount) {
        this.landlordRequestAmount = landlordRequestAmount;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPropertyEmailAddress() {
        return propertyEmailAddress;
    }

    public void setPropertyEmailAddress(String propertyEmailAddress) {
        this.propertyEmailAddress = propertyEmailAddress;
    }

    public String getPropertyMobileNo() {
        return propertyMobileNo;
    }

    public void setPropertyMobileNo(String propertyMobileNo) {
        this.propertyMobileNo = propertyMobileNo;
    }

    public String getPropertAddress() {
        return propertAddress;
    }

    public void setPropertAddress(String propertAddress) {
        this.propertAddress = propertAddress;
    }

    public Long getThreeMonthsRent() {
        return threeMonthsRent;
    }

    public void setThreeMonthsRent(Long threeMonthsRent) {
        this.threeMonthsRent = threeMonthsRent;
    }

    public Long getOneMonthRrent() {
        return oneMonthRrent;
    }

    public void setOneMonthRrent(Long oneMonthRrent) {
        this.oneMonthRrent = oneMonthRrent;
    }

    public Long getTotalYearlyRent() {
        return totalYearlyRent;
    }

    public void setTotalYearlyRent(Long totalYearlyRent) {
        this.totalYearlyRent = totalYearlyRent;
    }

    public Integer getMinimumOccupancy() {
        return minimumOccupancy;
    }

    public void setMinimumOccupancy(Integer minimumOccupancy) {
        this.minimumOccupancy = minimumOccupancy;
    }

    public String getGpsLocation() {
        return gpsLocation;
    }

    public void setGpsLocation(String gpsLocation) {
        this.gpsLocation = gpsLocation;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getPropertyIdentity() {
        return propertyIdentity;
    }

    public void setPropertyIdentity(String propertyIdentity) {
        this.propertyIdentity = propertyIdentity;
    }

    public String getBedroom() {
        return bedroom;
    }

    public void setBedroom(String bedroom) {
        this.bedroom = bedroom;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getLandlordType() {
        return landlordType;
    }

    public void setLandlordType(String landlordType) {
        this.landlordType = landlordType;
    }

    public String getNextOfKinEmailAddress() {
        return nextOfKinEmailAddress;
    }

    public void setNextOfKinEmailAddress(String nextOfKinEmailAddress) {
        this.nextOfKinEmailAddress = nextOfKinEmailAddress;
    }

    public String getNextOfKinMobileNo() {
        return nextOfKinMobileNo;
    }

    public void setNextOfKinMobileNo(String nextOfKinMobileNo) {
        this.nextOfKinMobileNo = nextOfKinMobileNo;
    }

    public String getNextOfKinAddress() {
        return nextOfKinAddress;
    }

    public void setNextOfKinAddress(String nextOfKinAddress) {
        this.nextOfKinAddress = nextOfKinAddress;
    }

    public String getNextOfKinMiddle() {
        return nextOfKinMiddle;
    }

    public void setNextOfKinMiddle(String nextOfKinMiddle) {
        this.nextOfKinMiddle = nextOfKinMiddle;
    }

    public String getNextOfKinLastname() {
        return nextOfKinLastname;
    }

    public void setNextOfKinLastname(String nextOfKinLastname) {
        this.nextOfKinLastname = nextOfKinLastname;
    }

    public String getNextOfKinFirstname() {
        return nextOfKinFirstname;
    }

    public void setNextOfKinFirstname(String nextOfKinFirstname) {
        this.nextOfKinFirstname = nextOfKinFirstname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}