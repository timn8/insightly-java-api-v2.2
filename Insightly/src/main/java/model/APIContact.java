package model;

import insightly.StringUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;


/**
 * APIContact
 **/
@ApiModel(description = "APIContact")
public class APIContact   {
  
  private Long CONTACT_ID = null;
  private String SALUTATION = null;
  private String FIRST_NAME = null;
  private String LAST_NAME = null;
  private String BACKGROUND = null;
  private String IMAGE_URL = null;
  private Long DEFAULT_LINKED_ORGANISATION = null;
  private Long OWNER_USER_ID = null;
  private Date DATE_CREATED_UTC = null;
  private Date DATE_UPDATED_UTC = null;
  private String VISIBLE_TO = null;
  private Long VISIBLE_TEAM_ID = null;
  private String VISIBLE_USER_IDS = null;
  private List<APICustomField> CUSTOMFIELDS = new ArrayList<APICustomField>();
  private List<APIAddress> ADDRESSES = new ArrayList<APIAddress>();
  private List<APIContactInfo> CONTACTINFOS = new ArrayList<APIContactInfo>();
  private List<APIContactDate> DATES = new ArrayList<APIContactDate>();
  private List<APITag> TAGS = new ArrayList<APITag>();
  private List<APILink> LINKS = new ArrayList<APILink>();
  private List<APIContactLink> CONTACTLINKS = new ArrayList<APIContactLink>();

  
  /**
   * Unique ID for the Contact record
   **/
  @ApiModelProperty(value = "Unique ID for the Contact record")
  @JsonProperty("CONTACT_ID")
  public Long getCONTACTID() {
    return CONTACT_ID;
  }
  public void setCONTACTID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
  }

  
  /**
   * Salutation
   **/
  @ApiModelProperty(value = "Salutation")
  @JsonProperty("SALUTATION")
  public String getSALUTATION() {
    return SALUTATION;
  }
  public void setSALUTATION(String SALUTATION) {
    this.SALUTATION = SALUTATION;
  }

  
  /**
   * First/Given Name
   **/
  @ApiModelProperty(value = "First/Given Name")
  @JsonProperty("FIRST_NAME")
  public String getFIRSTNAME() {
    return FIRST_NAME;
  }
  public void setFIRSTNAME(String FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
  }

  
  /**
   * Last/Family/Surname of the Contact
   **/
  @ApiModelProperty(value = "Last/Family/Surname of the Contact")
  @JsonProperty("LAST_NAME")
  public String getLASTNAME() {
    return LAST_NAME;
  }
  public void setLASTNAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
  }

  
  /**
   * Additional background information
   **/
  @ApiModelProperty(value = "Additional background information")
  @JsonProperty("BACKGROUND")
  public String getBACKGROUND() {
    return BACKGROUND;
  }
  public void setBACKGROUND(String BACKGROUND) {
    this.BACKGROUND = BACKGROUND;
  }

  
  /**
   * URL of the Image for the Contact.
   **/
  @ApiModelProperty(value = "URL of the Image for the Contact.")
  @JsonProperty("IMAGE_URL")
  public String getIMAGEURL() {
    return IMAGE_URL;
  }
  public void setIMAGEURL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
  }

  
  /**
   * Unique key of the Organisation linked to the Contact, must be a valid ORGANISATION_ID
   **/
  @ApiModelProperty(value = "Unique key of the Organisation linked to the Contact, must be a valid ORGANISATION_ID")
  @JsonProperty("DEFAULT_LINKED_ORGANISATION")
  public Long getDEFAULTLINKEDORGANISATION() {
    return DEFAULT_LINKED_ORGANISATION;
  }
  public void setDEFAULTLINKEDORGANISATION(Long DEFAULT_LINKED_ORGANISATION) {
    this.DEFAULT_LINKED_ORGANISATION = DEFAULT_LINKED_ORGANISATION;
  }

  
  /**
   * User ID of the Contact owner
   **/
  @ApiModelProperty(value = "User ID of the Contact owner")
  @JsonProperty("OWNER_USER_ID")
  public Long getOWNERUSERID() {
    return OWNER_USER_ID;
  }
  public void setOWNERUSERID(Long OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  
  /**
   * Date and time Contact record created, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time Contact record created, as Coordinated Universal Time")
  @JsonProperty("DATE_CREATED_UTC")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }
  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  
  /**
   * Date and time Contact record updated, as Coordinated Universal Time
   **/
  @ApiModelProperty(value = "Date and time Contact record updated, as Coordinated Universal Time")
  @JsonProperty("DATE_UPDATED_UTC")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }
  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  
  /**
   * Visible To
   **/
  @ApiModelProperty(value = "Visible To")
  @JsonProperty("VISIBLE_TO")
  public String getVISIBLETO() {
    return VISIBLE_TO;
  }
  public void setVISIBLETO(String VISIBLE_TO) {
    this.VISIBLE_TO = VISIBLE_TO;
  }

  
  /**
   * If VISIBLE_TO is 'Team', then this should be a TEAM_ID
   **/
  @ApiModelProperty(value = "If VISIBLE_TO is 'Team', then this should be a TEAM_ID")
  @JsonProperty("VISIBLE_TEAM_ID")
  public Long getVISIBLETEAMID() {
    return VISIBLE_TEAM_ID;
  }
  public void setVISIBLETEAMID(Long VISIBLE_TEAM_ID) {
    this.VISIBLE_TEAM_ID = VISIBLE_TEAM_ID;
  }

  
  /**
   * If VISIBLE_TO is 'Individuals, this should be a comma separated list of user IDs
   **/
  @ApiModelProperty(value = "If VISIBLE_TO is 'Individuals, this should be a comma separated list of user IDs")
  @JsonProperty("VISIBLE_USER_IDS")
  public String getVISIBLEUSERIDS() {
    return VISIBLE_USER_IDS;
  }
  public void setVISIBLEUSERIDS(String VISIBLE_USER_IDS) {
    this.VISIBLE_USER_IDS = VISIBLE_USER_IDS;
  }

  
  /**
   * Set of custom fields attached to the Contact
   **/
  @ApiModelProperty(value = "Set of custom fields attached to the Contact")
  @JsonProperty("CUSTOMFIELDS")
  public List<APICustomField> getCUSTOMFIELDS() {
    return CUSTOMFIELDS;
  }
  public void setCUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
  }

  
  /**
   * Set of addresses attached to the Contact
   **/
  @ApiModelProperty(value = "Set of addresses attached to the Contact")
  @JsonProperty("ADDRESSES")
  public List<APIAddress> getADDRESSES() {
    return ADDRESSES;
  }
  public void setADDRESSES(List<APIAddress> ADDRESSES) {
    this.ADDRESSES = ADDRESSES;
  }

  
  /**
   * Set of contact infos attached to the Contact
   **/
  @ApiModelProperty(value = "Set of contact infos attached to the Contact")
  @JsonProperty("CONTACTINFOS")
  public List<APIContactInfo> getCONTACTINFOS() {
    return CONTACTINFOS;
  }
  public void setCONTACTINFOS(List<APIContactInfo> CONTACTINFOS) {
    this.CONTACTINFOS = CONTACTINFOS;
  }

  
  /**
   * Set of dates to remember attached to the Contact
   **/
  @ApiModelProperty(value = "Set of dates to remember attached to the Contact")
  @JsonProperty("DATES")
  public List<APIContactDate> getDATES() {
    return DATES;
  }
  public void setDATES(List<APIContactDate> DATES) {
    this.DATES = DATES;
  }

  
  /**
   * Set of tags attached to the Contact
   **/
  @ApiModelProperty(value = "Set of tags attached to the Contact")
  @JsonProperty("TAGS")
  public List<APITag> getTAGS() {
    return TAGS;
  }
  public void setTAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
  }

  
  /**
   * Set of links attached to the Contact
   **/
  @ApiModelProperty(value = "Set of links attached to the Contact")
  @JsonProperty("LINKS")
  public List<APILink> getLINKS() {
    return LINKS;
  }
  public void setLINKS(List<APILink> LINKS) {
    this.LINKS = LINKS;
  }

  
  /**
   * Set of links to other contacts attached to the Contact
   **/
  @ApiModelProperty(value = "Set of links to other contacts attached to the Contact")
  @JsonProperty("CONTACTLINKS")
  public List<APIContactLink> getCONTACTLINKS() {
    return CONTACTLINKS;
  }
  public void setCONTACTLINKS(List<APIContactLink> CONTACTLINKS) {
    this.CONTACTLINKS = CONTACTLINKS;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIContact {\n");
    
    sb.append("    CONTACT_ID: ").append(StringUtil.toIndentedString(CONTACT_ID)).append("\n");
    sb.append("    SALUTATION: ").append(StringUtil.toIndentedString(SALUTATION)).append("\n");
    sb.append("    FIRST_NAME: ").append(StringUtil.toIndentedString(FIRST_NAME)).append("\n");
    sb.append("    LAST_NAME: ").append(StringUtil.toIndentedString(LAST_NAME)).append("\n");
    sb.append("    BACKGROUND: ").append(StringUtil.toIndentedString(BACKGROUND)).append("\n");
    sb.append("    IMAGE_URL: ").append(StringUtil.toIndentedString(IMAGE_URL)).append("\n");
    sb.append("    DEFAULT_LINKED_ORGANISATION: ").append(StringUtil.toIndentedString(DEFAULT_LINKED_ORGANISATION)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(StringUtil.toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(StringUtil.toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(StringUtil.toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    VISIBLE_TO: ").append(StringUtil.toIndentedString(VISIBLE_TO)).append("\n");
    sb.append("    VISIBLE_TEAM_ID: ").append(StringUtil.toIndentedString(VISIBLE_TEAM_ID)).append("\n");
    sb.append("    VISIBLE_USER_IDS: ").append(StringUtil.toIndentedString(VISIBLE_USER_IDS)).append("\n");
    sb.append("    CUSTOMFIELDS: ").append(StringUtil.toIndentedString(CUSTOMFIELDS)).append("\n");
    sb.append("    ADDRESSES: ").append(StringUtil.toIndentedString(ADDRESSES)).append("\n");
    sb.append("    CONTACTINFOS: ").append(StringUtil.toIndentedString(CONTACTINFOS)).append("\n");
    sb.append("    DATES: ").append(StringUtil.toIndentedString(DATES)).append("\n");
    sb.append("    TAGS: ").append(StringUtil.toIndentedString(TAGS)).append("\n");
    sb.append("    LINKS: ").append(StringUtil.toIndentedString(LINKS)).append("\n");
    sb.append("    CONTACTLINKS: ").append(StringUtil.toIndentedString(CONTACTLINKS)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
