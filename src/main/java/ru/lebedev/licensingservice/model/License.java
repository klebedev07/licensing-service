package ru.lebedev.licensingservice.model;

import java.util.Objects;

public final class License {
    private int id;
    private String licenseId;
    private String description;
    private String organizationId;
    private String productName;
    private String licenseType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        var that = (License) obj;
        return this.id == that.id &&
                Objects.equals(this.licenseId, that.licenseId) &&
                Objects.equals(this.description, that.description) &&
                Objects.equals(this.organizationId, that.organizationId) &&
                Objects.equals(this.productName, that.productName) &&
                Objects.equals(this.licenseType, that.licenseType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, licenseId, description, organizationId, productName, licenseType);
    }

    @Override
    public String toString() {
        return "License[" +
                "id=" + id + ", " +
                "licenseId=" + licenseId + ", " +
                "description=" + description + ", " +
                "organizationId=" + organizationId + ", " +
                "productName=" + productName + ", " +
                "licenseType=" + licenseType + ']';
    }
}
