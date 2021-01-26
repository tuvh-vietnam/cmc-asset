package com.cmc.global.asset.gateway.dto;

public class AssetDetails {

    private Integer id;
    private AssetTypeVO type;
    private String assetCode;
    private String assetName;
    private String description;
    private UsersVO user;
    private DepartmentVO department;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AssetTypeVO getType() {
        return type;
    }

    public void setType(AssetTypeVO type) {
        this.type = type;
    }

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UsersVO getUser() {
        return user;
    }

    public void setUser(UsersVO user) {
        this.user = user;
    }

    public DepartmentVO getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentVO department) {
        this.department = department;
    }

}
