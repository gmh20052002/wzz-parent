package com.gmh.wzz.api.model;

import java.io.Serializable;

public class TbWzzInfoType implements Serializable{

	private static final long serialVersionUID = 1L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_wzz_info_type.ID
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_wzz_info_type.TYPE_CODE
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    private String typeCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_wzz_info_type.TYPE_NAME
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    private String typeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_wzz_info_type.PARENT_ID
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    private String parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_wzz_info_type.TYPE_REMARK
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    private String typeRemark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_wzz_info_type.TYPE_ICON
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    private String typeIcon;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_wzz_info_type.ID
     *
     * @return the value of tb_wzz_info_type.ID
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_wzz_info_type.ID
     *
     * @param id the value for tb_wzz_info_type.ID
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_wzz_info_type.TYPE_CODE
     *
     * @return the value of tb_wzz_info_type.TYPE_CODE
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_wzz_info_type.TYPE_CODE
     *
     * @param typeCode the value for tb_wzz_info_type.TYPE_CODE
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_wzz_info_type.TYPE_NAME
     *
     * @return the value of tb_wzz_info_type.TYPE_NAME
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_wzz_info_type.TYPE_NAME
     *
     * @param typeName the value for tb_wzz_info_type.TYPE_NAME
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_wzz_info_type.PARENT_ID
     *
     * @return the value of tb_wzz_info_type.PARENT_ID
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_wzz_info_type.PARENT_ID
     *
     * @param parentId the value for tb_wzz_info_type.PARENT_ID
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_wzz_info_type.TYPE_REMARK
     *
     * @return the value of tb_wzz_info_type.TYPE_REMARK
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public String getTypeRemark() {
        return typeRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_wzz_info_type.TYPE_REMARK
     *
     * @param typeRemark the value for tb_wzz_info_type.TYPE_REMARK
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public void setTypeRemark(String typeRemark) {
        this.typeRemark = typeRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_wzz_info_type.TYPE_ICON
     *
     * @return the value of tb_wzz_info_type.TYPE_ICON
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public String getTypeIcon() {
        return typeIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_wzz_info_type.TYPE_ICON
     *
     * @param typeIcon the value for tb_wzz_info_type.TYPE_ICON
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public void setTypeIcon(String typeIcon) {
        this.typeIcon = typeIcon;
    }
}