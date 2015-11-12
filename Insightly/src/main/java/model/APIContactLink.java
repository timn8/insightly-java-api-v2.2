package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIContactLink
 **/
@ApiModel(description = "APIContactLink")
public class APIContactLink   {
  
  private Long CONTACT_LINK_ID = null;
  private Long FIRST_CONTACT_ID = null;
  private Long SECOND_CONTACT_ID = null;
  private Long RELATIONSHIP_ID = null;
  private String DETAILS = null;

  
  /**
   * Unique ID for the Contact Link record
   **/
  @ApiModelProperty(value = "Unique ID for the Contact Link record")
  @JsonProperty("CONTACT_LINK_ID")
  public Long getCONTACTLINKID() {
    return CONTACT_LINK_ID;
  }
  public void setCONTACTLINKID(Long CONTACT_LINK_ID) {
    this.CONTACT_LINK_ID = CONTACT_LINK_ID;
  }

  
  /**
   * Unique ID for a Contact on one side of the relationship
   **/
  @ApiModelProperty(value = "Unique ID for a Contact on one side of the relationship")
  @JsonProperty("FIRST_CONTACT_ID")
  public Long getFIRSTCONTACTID() {
    return FIRST_CONTACT_ID;
  }
  public void setFIRSTCONTACTID(Long FIRST_CONTACT_ID) {
    this.FIRST_CONTACT_ID = FIRST_CONTACT_ID;
  }

  
  /**
   * Unique ID for a Contact on the other side of the relationship
   **/
  @ApiModelProperty(value = "Unique ID for a Contact on the other side of the relationship")
  @JsonProperty("SECOND_CONTACT_ID")
  public Long getSECONDCONTACTID() {
    return SECOND_CONTACT_ID;
  }
  public void setSECONDCONTACTID(Long SECOND_CONTACT_ID) {
    this.SECOND_CONTACT_ID = SECOND_CONTACT_ID;
  }

  
  /**
   * Unique ID for the Relationship from First Contact to Second Contact
   **/
  @ApiModelProperty(value = "Unique ID for the Relationship from First Contact to Second Contact")
  @JsonProperty("RELATIONSHIP_ID")
  public Long getRELATIONSHIPID() {
    return RELATIONSHIP_ID;
  }
  public void setRELATIONSHIPID(Long RELATIONSHIP_ID) {
    this.RELATIONSHIP_ID = RELATIONSHIP_ID;
  }

  
  /**
   * Description of the Relationship
   **/
  @ApiModelProperty(value = "Description of the Relationship")
  @JsonProperty("DETAILS")
  public String getDETAILS() {
    return DETAILS;
  }
  public void setDETAILS(String DETAILS) {
    this.DETAILS = DETAILS;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIContactLink {\n");
    
    sb.append("    CONTACT_LINK_ID: ").append(StringUtil.toIndentedString(CONTACT_LINK_ID)).append("\n");
    sb.append("    FIRST_CONTACT_ID: ").append(StringUtil.toIndentedString(FIRST_CONTACT_ID)).append("\n");
    sb.append("    SECOND_CONTACT_ID: ").append(StringUtil.toIndentedString(SECOND_CONTACT_ID)).append("\n");
    sb.append("    RELATIONSHIP_ID: ").append(StringUtil.toIndentedString(RELATIONSHIP_ID)).append("\n");
    sb.append("    DETAILS: ").append(StringUtil.toIndentedString(DETAILS)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
