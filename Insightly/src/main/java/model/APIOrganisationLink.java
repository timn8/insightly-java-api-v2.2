package model;

import insightly.StringUtil;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIOrganisationLink
 **/
@ApiModel(description = "APIOrganisationLink")
public class APIOrganisationLink   {
  
  private Long ORG_LINK_ID = null;
  private Long FIRST_ORGANISATION_ID = null;
  private Long SECOND_ORGANISATION_ID = null;
  private Long RELATIONSHIP_ID = null;
  private String DETAILS = null;

  
  /**
   * Unique ID for the Organisation Link record
   **/
  @ApiModelProperty(value = "Unique ID for the Organisation Link record")
  @JsonProperty("ORG_LINK_ID")
  public Long getORGLINKID() {
    return ORG_LINK_ID;
  }
  public void setORGLINKID(Long ORG_LINK_ID) {
    this.ORG_LINK_ID = ORG_LINK_ID;
  }

  
  /**
   * Unique key of an Organisation on one side of the relationship
   **/
  @ApiModelProperty(value = "Unique key of an Organisation on one side of the relationship")
  @JsonProperty("FIRST_ORGANISATION_ID")
  public Long getFIRSTORGANISATIONID() {
    return FIRST_ORGANISATION_ID;
  }
  public void setFIRSTORGANISATIONID(Long FIRST_ORGANISATION_ID) {
    this.FIRST_ORGANISATION_ID = FIRST_ORGANISATION_ID;
  }

  
  /**
   * Unique key of an Organisation on the other side of the relationship
   **/
  @ApiModelProperty(value = "Unique key of an Organisation on the other side of the relationship")
  @JsonProperty("SECOND_ORGANISATION_ID")
  public Long getSECONDORGANISATIONID() {
    return SECOND_ORGANISATION_ID;
  }
  public void setSECONDORGANISATIONID(Long SECOND_ORGANISATION_ID) {
    this.SECOND_ORGANISATION_ID = SECOND_ORGANISATION_ID;
  }

  
  /**
   * Unique key of the Relationship from first Organisation to second Organisation
   **/
  @ApiModelProperty(value = "Unique key of the Relationship from first Organisation to second Organisation")
  @JsonProperty("RELATIONSHIP_ID")
  public Long getRELATIONSHIPID() {
    return RELATIONSHIP_ID;
  }
  public void setRELATIONSHIPID(Long RELATIONSHIP_ID) {
    this.RELATIONSHIP_ID = RELATIONSHIP_ID;
  }

  
  /**
   * Details about the Relationship
   **/
  @ApiModelProperty(value = "Details about the Relationship")
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
    sb.append("class APIOrganisationLink {\n");
    
    sb.append("    ORG_LINK_ID: ").append(StringUtil.toIndentedString(ORG_LINK_ID)).append("\n");
    sb.append("    FIRST_ORGANISATION_ID: ").append(StringUtil.toIndentedString(FIRST_ORGANISATION_ID)).append("\n");
    sb.append("    SECOND_ORGANISATION_ID: ").append(StringUtil.toIndentedString(SECOND_ORGANISATION_ID)).append("\n");
    sb.append("    RELATIONSHIP_ID: ").append(StringUtil.toIndentedString(RELATIONSHIP_ID)).append("\n");
    sb.append("    DETAILS: ").append(StringUtil.toIndentedString(DETAILS)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
