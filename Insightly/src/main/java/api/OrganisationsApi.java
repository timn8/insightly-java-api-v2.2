package api;

import insightly.ApiClient;
import insightly.ApiException;
import insightly.Configuration;
import insightly.Pair;
import insightly.TypeRef;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.APIActivitySetAssignment;
import model.APIAddress;
import model.APICalendarEvent;
import model.APIContactInfo;
import model.APICustomField;
import model.APIEmail;
import model.APIFileAttachment;
import model.APIFollow;
import model.APILink;
import model.APINote;
import model.APIOrganisation;
import model.APIOrganisationDate;
import model.APIOrganisationLink;
import model.APITag;
import model.APITask;


public class OrganisationsApi {
  private ApiClient apiClient;

  public OrganisationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrganisationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Gets a list of Organisations.
   * Simple object graphs (excluding Addresses, Phone Numbers, etc.) are returned if \&quot;Brief=True\&quot; is used in the query string.
   * @param brief Optional, true if response should only contain top level properties of the organisation.
   * @param skip Optional, number of organisations to skip.
   * @param top Optional, maximum number of organisations to return in the response.
   * @param countTotal Optional, true if total number of records should be returned in the response headers.
   * @return List<APIOrganisation>
   */
  public List<APIOrganisation> getOrganisations (Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/Organisations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "brief", brief));
    
    queryParams.addAll(apiClient.parameterToPairs("", "skip", skip));
    
    queryParams.addAll(apiClient.parameterToPairs("", "top", top));
    
    queryParams.addAll(apiClient.parameterToPairs("", "count_total", countTotal));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<APIOrganisation>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Updates an Organisation
   * If you have trouble updating an organisation, try accessing the organisation via the GET request to inspect its fields and sub-elements. A common source of            problems with write/update requests occurs when users either omit required fields, or insert invalid data into a field (for example, by referring a            CATEGORY_ID or LINK_ID which does not exist.
   * @param apiOrganisation An Organisation (just include JSON object as request body)
   * @return APIOrganisation
   */
  public APIOrganisation updateOrganisation (APIOrganisation apiOrganisation) throws ApiException {
    Object postBody = apiOrganisation;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apiOrganisation' is set
     if (apiOrganisation == null) {
        throw new ApiException(400, "Missing the required parameter 'apiOrganisation' when calling updateOrganisation");
     }
     
    // create path and map variables
    String path = "/Organisations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<APIOrganisation>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Adds an Organisation
   * If you have trouble with creating an organisation, try creating organisations via the web interface, and then access those organisations via the API. This way you            can see examples of the fields and sub-elements attached to the object. A common source of problems during write/update request is caused when users omit            required fields, or insert invalid data in a field (e.g. reference a CATEGORY_ID that does not exist in the user&#39;s Insightly instance.
   * @param apiOrganisation The Organisation to add (just include JSON object as request body)
   * @return APIOrganisation
   */
  public APIOrganisation addOrganisation (APIOrganisation apiOrganisation) throws ApiException {
    Object postBody = apiOrganisation;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apiOrganisation' is set
     if (apiOrganisation == null) {
        throw new ApiException(400, "Missing the required parameter 'apiOrganisation' when calling addOrganisation");
     }
     
    // create path and map variables
    String path = "/Organisations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<APIOrganisation>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Gets a filtered list of Organisations.
   * Only one optional parameter (excluding brief, top, skip and count_total) can be specified. Simple object graphs (excluding Addresses, Phone Numbers, etc.) are returned if \&quot;Brief=True\&quot; is used in the query string, page through large recordsets using the top and skip parameters in the querystring.
   * @param email Optional, email address.
   * @param emailDomain Optional, email domain.
   * @param tag Optional, a single tag.
   * @param phoneNumber Optional, phone number.
   * @param organisationName Optional, name of the organisation.
   * @param city Optional, name of the city from organisation address.
   * @param state Optional, state from the organisation address.
   * @param postcode Optional, postal code from the organisation address.
   * @param country Optional, name of the country from organisation address.
   * @param updatedAfterUtc Optional, earliest date when organisation was last updated.
   * @param brief Optional, true if response should only contain top level properties of the organisation.
   * @param skip Optional, number of organisations to skip.
   * @param top Optional, maximum number of organisations to return in the response.
   * @param countTotal Optional, true if total number of records should be returned in the response headers.
   * @return List<APIOrganisation>
   */
  public List<APIOrganisation> getOrganisationsBySearch (String email, String emailDomain, String tag, String phoneNumber, String organisationName, String city, String state, String postcode, String country, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/Organisations/Search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "email", email));
    
    queryParams.addAll(apiClient.parameterToPairs("", "email_domain", emailDomain));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tag", tag));
    
    queryParams.addAll(apiClient.parameterToPairs("", "phone_number", phoneNumber));
    
    queryParams.addAll(apiClient.parameterToPairs("", "organisation_name", organisationName));
    
    queryParams.addAll(apiClient.parameterToPairs("", "city", city));
    
    queryParams.addAll(apiClient.parameterToPairs("", "state", state));
    
    queryParams.addAll(apiClient.parameterToPairs("", "postcode", postcode));
    
    queryParams.addAll(apiClient.parameterToPairs("", "country", country));
    
    queryParams.addAll(apiClient.parameterToPairs("", "updated_after_utc", updatedAfterUtc));
    
    queryParams.addAll(apiClient.parameterToPairs("", "brief", brief));
    
    queryParams.addAll(apiClient.parameterToPairs("", "skip", skip));
    
    queryParams.addAll(apiClient.parameterToPairs("", "top", top));
    
    queryParams.addAll(apiClient.parameterToPairs("", "count_total", countTotal));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<APIOrganisation>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Gets an Organisation
   * 
   * @param id An Organisation&#39;s ID
   * @return APIOrganisation
   */
  public APIOrganisation getOrganisation (Long id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getOrganisation");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<APIOrganisation>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Deletes an Organisation
   * 
   * @param id An Organisation&#39;s ID
   * @return void
   */
  public void deleteOrganisation (Long id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteOrganisation");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    


  }
  
  /**
   * Adds an Activity Set to an Organisation
   * 
   * @param id A Organisaton&#39;s ID
   * @param apiActivitySetAssignment The Activity Set Assignment object which contains the configuration information for the Activity Set
   * @return void
   */
  public void addActivitySetAssignment (Long id, APIActivitySetAssignment apiActivitySetAssignment) throws ApiException {
    Object postBody = apiActivitySetAssignment;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling addActivitySetAssignment");
     }
     
     // verify the required parameter 'apiActivitySetAssignment' is set
     if (apiActivitySetAssignment == null) {
        throw new ApiException(400, "Missing the required parameter 'apiActivitySetAssignment' when calling addActivitySetAssignment");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/ActivitySetAssignment".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    


  }
  
  /**
   * Updates an Address
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param apiAddress The Address to update (just include the JSON object in the request body)
   * @return APIAddress
   */
  public APIAddress updateAddress (Long id, APIAddress apiAddress) throws ApiException {
    Object postBody = apiAddress;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updateAddress");
     }
     
     // verify the required parameter 'apiAddress' is set
     if (apiAddress == null) {
        throw new ApiException(400, "Missing the required parameter 'apiAddress' when calling updateAddress");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/Addresses".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<APIAddress>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Adds an Address
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param apiAddress The Address to add (just include the JSON object in the request body)
   * @return APIAddress
   */
  public APIAddress addAddress (Long id, APIAddress apiAddress) throws ApiException {
    Object postBody = apiAddress;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling addAddress");
     }
     
     // verify the required parameter 'apiAddress' is set
     if (apiAddress == null) {
        throw new ApiException(400, "Missing the required parameter 'apiAddress' when calling addAddress");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/Addresses".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<APIAddress>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Deletes an Address
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param addressId An Address&#39; ID (ADDRESS_ID)
   * @return void
   */
  public void deleteAddress (Long id, Long addressId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAddress");
     }
     
     // verify the required parameter 'addressId' is set
     if (addressId == null) {
        throw new ApiException(400, "Missing the required parameter 'addressId' when calling deleteAddress");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/Addresses/{addressId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "addressId" + "\\}", apiClient.escapeString(addressId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    


  }
  
  /**
   * Updates a Contact Info
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param apiContactInfo The Contact Info to add (just include the JSON object in the request body)
   * @return APIContactInfo
   */
  public APIContactInfo updateContactInfo (Long id, APIContactInfo apiContactInfo) throws ApiException {
    Object postBody = apiContactInfo;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updateContactInfo");
     }
     
     // verify the required parameter 'apiContactInfo' is set
     if (apiContactInfo == null) {
        throw new ApiException(400, "Missing the required parameter 'apiContactInfo' when calling updateContactInfo");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/ContactInfos".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<APIContactInfo>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Adds a Contact Info
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param apiContactInfo The Contact Info to add (just include the JSON object in the request body)
   * @return APIContactInfo
   */
  public APIContactInfo addContactInfo (Long id, APIContactInfo apiContactInfo) throws ApiException {
    Object postBody = apiContactInfo;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling addContactInfo");
     }
     
     // verify the required parameter 'apiContactInfo' is set
     if (apiContactInfo == null) {
        throw new ApiException(400, "Missing the required parameter 'apiContactInfo' when calling addContactInfo");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/ContactInfos".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<APIContactInfo>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Deletes a Contact Info
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param contactInfoId A Contact Info&#39;s ID (CONTACT_INFO_ID)
   * @return void
   */
  public void deleteContactInfo (Long id, Long contactInfoId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteContactInfo");
     }
     
     // verify the required parameter 'contactInfoId' is set
     if (contactInfoId == null) {
        throw new ApiException(400, "Missing the required parameter 'contactInfoId' when calling deleteContactInfo");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/ContactInfos/{contactInfoId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "contactInfoId" + "\\}", apiClient.escapeString(contactInfoId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    


  }
  
  /**
   * Updates a Custom Field
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param apiCustomField The Custom Field to edit (just include the JSON object in the request body)
   * @return APICustomField
   */
  public APICustomField updateCustomField (Long id, APICustomField apiCustomField) throws ApiException {
    Object postBody = apiCustomField;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updateCustomField");
     }
     
     // verify the required parameter 'apiCustomField' is set
     if (apiCustomField == null) {
        throw new ApiException(400, "Missing the required parameter 'apiCustomField' when calling updateCustomField");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/CustomFields".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<APICustomField>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Deletes a Custom Field
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param customFieldId A Custom Field&#39;s ID (CUSTOM_FIELD_ID)
   * @return void
   */
  public void deleteCustomField (Long id, String customFieldId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteCustomField");
     }
     
     // verify the required parameter 'customFieldId' is set
     if (customFieldId == null) {
        throw new ApiException(400, "Missing the required parameter 'customFieldId' when calling deleteCustomField");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/CustomFields/{customFieldId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "customFieldId" + "\\}", apiClient.escapeString(customFieldId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    


  }
  
  /**
   * Updates an Organisation Date
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param apiDate The Organisation Date to add (just include the JSON object in the request body)
   * @return APIOrganisationDate
   */
  public APIOrganisationDate updateDate (Long id, APIOrganisationDate apiDate) throws ApiException {
    Object postBody = apiDate;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updateDate");
     }
     
     // verify the required parameter 'apiDate' is set
     if (apiDate == null) {
        throw new ApiException(400, "Missing the required parameter 'apiDate' when calling updateDate");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/Dates".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<APIOrganisationDate>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Adds an Organisation Date
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param apiDate The Organisation Date to add (just include the JSON object in the request body)
   * @return APIOrganisationDate
   */
  public APIOrganisationDate addDate (Long id, APIOrganisationDate apiDate) throws ApiException {
    Object postBody = apiDate;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling addDate");
     }
     
     // verify the required parameter 'apiDate' is set
     if (apiDate == null) {
        throw new ApiException(400, "Missing the required parameter 'apiDate' when calling addDate");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/Dates".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<APIOrganisationDate>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Deletes an Organisation Date
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param dateId An Organisation Date&#39;s ID (DATE_ID)
   * @return void
   */
  public void deleteDate (Long id, Long dateId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteDate");
     }
     
     // verify the required parameter 'dateId' is set
     if (dateId == null) {
        throw new ApiException(400, "Missing the required parameter 'dateId' when calling deleteDate");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/Dates/{dateId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "dateId" + "\\}", apiClient.escapeString(dateId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    


  }
  
  /**
   * Gets a list of Organisation&#39;s Emails
   * 
   * @param id An Organisation&#39;s ID
   * @param updatedAfterUtc Optional, earliest date when email was last updated.
   * @param top Optional, maximum number of emails to return.
   * @param skip Optional, number of emails to skip.
   * @param brief true if only top level properties needs to be returned.
   * @param countTotal true if total number of records should be returned in the response headers.
   * @return List<APIEmail>
   */
  public List<APIEmail> getEmails (Long id, Date updatedAfterUtc, Integer top, Integer skip, Boolean brief, Boolean countTotal) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getEmails");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/Emails".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "updated_after_utc", updatedAfterUtc));
    
    queryParams.addAll(apiClient.parameterToPairs("", "top", top));
    
    queryParams.addAll(apiClient.parameterToPairs("", "skip", skip));
    
    queryParams.addAll(apiClient.parameterToPairs("", "brief", brief));
    
    queryParams.addAll(apiClient.parameterToPairs("", "count_total", countTotal));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<APIEmail>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Gets an Organisation&#39;s Events
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param updatedAfterUtc Optional, earliest date when event was last updated.
   * @param top Optional, maximum number of events to return.
   * @param skip Optional, number of events to skip.
   * @param brief true if only top level properties needs to be returned.
   * @param countTotal true if total number of records should be returned in the response headers.
   * @return List<APICalendarEvent>
   */
  public List<APICalendarEvent> getEvents (Long id, Date updatedAfterUtc, Integer top, Integer skip, Boolean brief, Boolean countTotal) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getEvents");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/Events".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "updated_after_utc", updatedAfterUtc));
    
    queryParams.addAll(apiClient.parameterToPairs("", "top", top));
    
    queryParams.addAll(apiClient.parameterToPairs("", "skip", skip));
    
    queryParams.addAll(apiClient.parameterToPairs("", "brief", brief));
    
    queryParams.addAll(apiClient.parameterToPairs("", "count_total", countTotal));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<APICalendarEvent>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Gets an Organisation&#39;s File Attachments
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param updatedAfterUtc Optional, earliest date when file attachment was last updated.
   * @param skip Optional, number of file attachments to skip.
   * @param top Optional, maximum number of file attachments to return in the response.
   * @param countTotal true if total number of records should be returned in the response headers.
   * @return List<APIFileAttachment>
   */
  public List<APIFileAttachment> getFileAttachments (Long id, Date updatedAfterUtc, Integer skip, Integer top, Boolean countTotal) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getFileAttachments");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/FileAttachments".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "updated_after_utc", updatedAfterUtc));
    
    queryParams.addAll(apiClient.parameterToPairs("", "skip", skip));
    
    queryParams.addAll(apiClient.parameterToPairs("", "top", top));
    
    queryParams.addAll(apiClient.parameterToPairs("", "count_total", countTotal));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<APIFileAttachment>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Adds a File Attachment to an Organisation
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param file File and metadata to be attached to Organisation
   * @param fileName The name and extension of the File Attachment
   * @param contentType The MIME type of the File Attachment
   * @param fileCategoryId The category of the File Attachment, if it has been assigned to one
   * @return APIFileAttachment
   */
  public APIFileAttachment addFileAttachment (Long id, File file, String fileName, String contentType, Integer fileCategoryId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling addFileAttachment");
     }
     
     // verify the required parameter 'file' is set
     if (file == null) {
        throw new ApiException(400, "Missing the required parameter 'file' when calling addFileAttachment");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/FileAttachments".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    if (file != null)
      formParams.put("file", file);
    if (fileName != null)
      formParams.put("file_name", fileName);
    if (contentType != null)
      formParams.put("content_type", contentType);
    if (fileCategoryId != null)
      formParams.put("file_category_id", fileCategoryId);
    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "multipart/form-data"
    };
    final String contentType1 = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<APIFileAttachment>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType1, authNames, returnType);
    
    


  }
  
  /**
   * Gets a Follow record for the Organisation
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @return APIFollow
   */
  public APIFollow getFollow (Long id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getFollow");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/Follow".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<APIFollow>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Start following an Organisation
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @return APIFollow
   */
  public APIFollow addFollow (Long id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling addFollow");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/Follow".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<APIFollow>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Stop following an Organisation
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @return void
   */
  public void deleteFollow (Long id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteFollow");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/Follow".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    


  }
  
  /**
   * Gets an Organisations&#39;s Image
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @return void
   */
  public void getImage (Long id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getImage");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/Image".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/octet-stream"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    


  }
  
  /**
   * Deletes an Organisation&#39;s Image
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @return void
   */
  public void deleteImage (Long id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteImage");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/Image".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    


  }
  
  /**
   * Updates an Organisation&#39;s Image
   * This action will replace any existing Image attached to the Organisation.
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param filename Name of Image File to be attached to Organisation
   * @param file File to upload
   * @return void
   */
  public void updateImage (Long id, String filename, byte[] file) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = file;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updateImage");
     }
     
     // verify the required parameter 'filename' is set
     if (filename == null) {
        throw new ApiException(400, "Missing the required parameter 'filename' when calling updateImage");
     }
     
     // verify the required parameter 'file' is set
     if (file == null) {
        throw new ApiException(400, "Missing the required parameter 'file' when calling updateImage");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/Image/{filename}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "filename" + "\\}", apiClient.escapeString(filename.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/octet-stream"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    


  }
  
  /**
   * Updates a Link
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param apiLink The Link to add (just include the JSON object in the request body)
   * @return APILink
   */
  public APILink updateLink (Long id, APILink apiLink) throws ApiException {
    Object postBody = apiLink;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updateLink");
     }
     
     // verify the required parameter 'apiLink' is set
     if (apiLink == null) {
        throw new ApiException(400, "Missing the required parameter 'apiLink' when calling updateLink");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/Links".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<APILink>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Adds a Link
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param apiLink The Link to add (just include the JSON object in the request body)
   * @return APILink
   */
  public APILink addLink (Long id, APILink apiLink) throws ApiException {
    Object postBody = apiLink;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling addLink");
     }
     
     // verify the required parameter 'apiLink' is set
     if (apiLink == null) {
        throw new ApiException(400, "Missing the required parameter 'apiLink' when calling addLink");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/Links".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<APILink>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Deletes a Link
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param linkId A Link&#39;s ID (LINK_ID)
   * @return void
   */
  public void deleteLink (Long id, Long linkId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteLink");
     }
     
     // verify the required parameter 'linkId' is set
     if (linkId == null) {
        throw new ApiException(400, "Missing the required parameter 'linkId' when calling deleteLink");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/Links/{linkId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "linkId" + "\\}", apiClient.escapeString(linkId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    


  }
  
  /**
   * Gets an Organisation&#39;s Notes
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param updatedAfterUtc Optional, earliest date when note was last updated.
   * @param top Optional, maximum number of notes to return.
   * @param skip Optional, number of notes to skip.
   * @param brief true if only top level properties needs to be returned.
   * @param countTotal true if total number of records should be returned in the response headers.
   * @return List<APINote>
   */
  public List<APINote> getNotes (Long id, Date updatedAfterUtc, Integer top, Integer skip, Boolean brief, Boolean countTotal) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getNotes");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/Notes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "updated_after_utc", updatedAfterUtc));
    
    queryParams.addAll(apiClient.parameterToPairs("", "top", top));
    
    queryParams.addAll(apiClient.parameterToPairs("", "skip", skip));
    
    queryParams.addAll(apiClient.parameterToPairs("", "brief", brief));
    
    queryParams.addAll(apiClient.parameterToPairs("", "count_total", countTotal));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<APINote>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Adds a Note to an Organisation
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param apiNote The Note to add (just include the JSON object in the request body)
   * @return APINote
   */
  public APINote addNote (Long id, APINote apiNote) throws ApiException {
    Object postBody = apiNote;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling addNote");
     }
     
     // verify the required parameter 'apiNote' is set
     if (apiNote == null) {
        throw new ApiException(400, "Missing the required parameter 'apiNote' when calling addNote");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/Notes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<APINote>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Updates an Organisation Link
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param apiLink The Organisation Link to add (just include the JSON object in the request body)
   * @return APIOrganisationLink
   */
  public APIOrganisationLink updateOrganisationLink (Long id, APIOrganisationLink apiLink) throws ApiException {
    Object postBody = apiLink;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updateOrganisationLink");
     }
     
     // verify the required parameter 'apiLink' is set
     if (apiLink == null) {
        throw new ApiException(400, "Missing the required parameter 'apiLink' when calling updateOrganisationLink");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/OrganisationLinks".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<APIOrganisationLink>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Adds an Organisation Link
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param apiLink The Organisation Link to add (just include the JSON object in the request body)
   * @return APIOrganisationLink
   */
  public APIOrganisationLink addOrganisationLink (Long id, APIOrganisationLink apiLink) throws ApiException {
    Object postBody = apiLink;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling addOrganisationLink");
     }
     
     // verify the required parameter 'apiLink' is set
     if (apiLink == null) {
        throw new ApiException(400, "Missing the required parameter 'apiLink' when calling addOrganisationLink");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/OrganisationLinks".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<APIOrganisationLink>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Deletes an Organisation Link
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param linkId An Organisation Link&#39;s ID (ORG_LINK_ID)
   * @return void
   */
  public void deleteOrganisationLink (Long id, Long linkId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteOrganisationLink");
     }
     
     // verify the required parameter 'linkId' is set
     if (linkId == null) {
        throw new ApiException(400, "Missing the required parameter 'linkId' when calling deleteOrganisationLink");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/OrganisationLinks/{linkId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "linkId" + "\\}", apiClient.escapeString(linkId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    


  }
  
  /**
   * Adds a Tag
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param apiTag The Tag to add (just include the JSON object in the request body)
   * @return APITag
   */
  public APITag addTag (Long id, APITag apiTag) throws ApiException {
    Object postBody = apiTag;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling addTag");
     }
     
     // verify the required parameter 'apiTag' is set
     if (apiTag == null) {
        throw new ApiException(400, "Missing the required parameter 'apiTag' when calling addTag");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/Tags".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<APITag>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Deletes a Tag
   * 
   * @param id An Organisation&#39;s ID (ORGANISATION_ID)
   * @param tagName A Tag&#39;s name
   * @return void
   */
  public void deleteTag (Long id, String tagName) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteTag");
     }
     
     // verify the required parameter 'tagName' is set
     if (tagName == null) {
        throw new ApiException(400, "Missing the required parameter 'tagName' when calling deleteTag");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/Tags/{tagName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "tagName" + "\\}", apiClient.escapeString(tagName.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "text/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    


  }
  
  /**
   * Gets a list of Organisation&#39;s Tasks
   * 
   * @param id An Organisation&#39;s ID
   * @param updatedAfterUtc Optional, earliest date when task was last updated.
   * @param top Optional, maximum number of tasks to return.
   * @param skip Optional, number of tasks to skip.
   * @param brief true if only top level properties needs to be returned.
   * @param countTotal true if total number of records should be returned in the response headers.
   * @return List<APITask>
   */
  public List<APITask> getTasks (Long id, Date updatedAfterUtc, Integer top, Integer skip, Boolean brief, Boolean countTotal) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getTasks");
     }
     
    // create path and map variables
    String path = "/Organisations/{id}/Tasks".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "updated_after_utc", updatedAfterUtc));
    
    queryParams.addAll(apiClient.parameterToPairs("", "top", top));
    
    queryParams.addAll(apiClient.parameterToPairs("", "skip", skip));
    
    queryParams.addAll(apiClient.parameterToPairs("", "brief", brief));
    
    queryParams.addAll(apiClient.parameterToPairs("", "count_total", countTotal));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<APITask>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
