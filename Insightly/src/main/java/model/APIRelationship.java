package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIRelationship
 **/
@ApiModel(description = "APIRelationship")
public class APIRelationship   {
  
  private Long RELATIONSHIP_ID = null;
  private String FORWARD_TITLE = null;
  private String FORWARD = null;
  private String REVERSE_TITLE = null;
  private String REVERSE = null;
  private Boolean FOR_CONTACTS = null;
  private Boolean FOR_ORGANISATIONS = null;

  
  /**
   * Unique ID for the Relationship record.
   **/
  @ApiModelProperty(value = "Unique ID for the Relationship record.")
  @JsonProperty("RELATIONSHIP_ID")
  public Long getRELATIONSHIPID() {
    return RELATIONSHIP_ID;
  }
  public void setRELATIONSHIPID(Long RELATIONSHIP_ID) {
    this.RELATIONSHIP_ID = RELATIONSHIP_ID;
  }

  
  /**
   * Name of the direct Relationship.
   **/
  @ApiModelProperty(value = "Name of the direct Relationship.")
  @JsonProperty("FORWARD_TITLE")
  public String getFORWARDTITLE() {
    return FORWARD_TITLE;
  }
  public void setFORWARDTITLE(String FORWARD_TITLE) {
    this.FORWARD_TITLE = FORWARD_TITLE;
  }

  
  /**
   * Description of the direct Relationship.
   **/
  @ApiModelProperty(value = "Description of the direct Relationship.")
  @JsonProperty("FORWARD")
  public String getFORWARD() {
    return FORWARD;
  }
  public void setFORWARD(String FORWARD) {
    this.FORWARD = FORWARD;
  }

  
  /**
   * Name of the inverse Relationship.
   **/
  @ApiModelProperty(value = "Name of the inverse Relationship.")
  @JsonProperty("REVERSE_TITLE")
  public String getREVERSETITLE() {
    return REVERSE_TITLE;
  }
  public void setREVERSETITLE(String REVERSE_TITLE) {
    this.REVERSE_TITLE = REVERSE_TITLE;
  }

  
  /**
   * Description of the inverse Relationship.
   **/
  @ApiModelProperty(value = "Description of the inverse Relationship.")
  @JsonProperty("REVERSE")
  public String getREVERSE() {
    return REVERSE;
  }
  public void setREVERSE(String REVERSE) {
    this.REVERSE = REVERSE;
  }

  
  /**
   * Indicates whether the relationship is availble for linking Contacts.
   **/
  @ApiModelProperty(value = "Indicates whether the relationship is availble for linking Contacts.")
  @JsonProperty("FOR_CONTACTS")
  public Boolean getFORCONTACTS() {
    return FOR_CONTACTS;
  }
  public void setFORCONTACTS(Boolean FOR_CONTACTS) {
    this.FOR_CONTACTS = FOR_CONTACTS;
  }

  
  /**
   * Indicates whether the relationship is availble for linking Organisations.
   **/
  @ApiModelProperty(value = "Indicates whether the relationship is availble for linking Organisations.")
  @JsonProperty("FOR_ORGANISATIONS")
  public Boolean getFORORGANISATIONS() {
    return FOR_ORGANISATIONS;
  }
  public void setFORORGANISATIONS(Boolean FOR_ORGANISATIONS) {
    this.FOR_ORGANISATIONS = FOR_ORGANISATIONS;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIRelationship {\n");
    
    sb.append("    RELATIONSHIP_ID: ").append(StringUtil.toIndentedString(RELATIONSHIP_ID)).append("\n");
    sb.append("    FORWARD_TITLE: ").append(StringUtil.toIndentedString(FORWARD_TITLE)).append("\n");
    sb.append("    FORWARD: ").append(StringUtil.toIndentedString(FORWARD)).append("\n");
    sb.append("    REVERSE_TITLE: ").append(StringUtil.toIndentedString(REVERSE_TITLE)).append("\n");
    sb.append("    REVERSE: ").append(StringUtil.toIndentedString(REVERSE)).append("\n");
    sb.append("    FOR_CONTACTS: ").append(StringUtil.toIndentedString(FOR_CONTACTS)).append("\n");
    sb.append("    FOR_ORGANISATIONS: ").append(StringUtil.toIndentedString(FOR_ORGANISATIONS)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
