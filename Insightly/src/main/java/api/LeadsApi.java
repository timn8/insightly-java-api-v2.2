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
import model.APICalendarEvent;
import model.APICustomField;
import model.APIEmail;
import model.APIFileAttachment;
import model.APIFollow;
import model.APILead;
import model.APINote;
import model.APITag;
import model.APITask;


public class LeadsApi {
  private ApiClient apiClient;

  public LeadsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LeadsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Gets a list of Leads.
   * Simple object graphs (excluding Custom Fields, Tags, etc.) are returned if \&quot;Brief=True\&quot; is used in the query string.
   * @param includeConverted Optional, by default converted leads are not included, pass in \&quot;true\&quot; to include them in the response
   * @param brief Optional, true if response should only contain top level properties of the lead.
   * @param skip Optional, number of lead to skip.
   * @param top Optional, maximum number of lead to return in the response.
   * @param countTotal Optional, true if total number of records should be returned in the response headers.
   * @return List<APILead>
   */
  public List<APILead> getLeads (Boolean includeConverted, Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/Leads".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "include_converted", includeConverted));
    
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

    

    
    
    TypeRef returnType = new TypeRef<List<APILead>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Updates a Lead
   * A common source of problems when updating leads occurs when users omit required fields, or insert             invalid data into a field. A good troubleshooting technique             is to create a few leads via the web interface, with representative data, links, etc, and then access             these leads via the API, and inspect the returned object graph.
   * @param apiLead A Lead (just include JSON object as request body)
   * @return APILead
   */
  public APILead updateLead (APILead apiLead) throws ApiException {
    Object postBody = apiLead;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apiLead' is set
     if (apiLead == null) {
        throw new ApiException(400, "Missing the required parameter 'apiLead' when calling updateLead");
     }
     
    // create path and map variables
    String path = "/Leads".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<APILead>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Adds a Lead
   * A common source of problems when creating leads occurs when users omit required fields, or insert             invalid data into a field. A good troubleshooting technique             is to create a few leads via the web interface, with representative data, links, etc, and then access             these leads via the API, and inspect the returned object graph.
   * @param apiLead The Lead to add (just include JSON object as request body)
   * @return APILead
   */
  public APILead addLead (APILead apiLead) throws ApiException {
    Object postBody = apiLead;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apiLead' is set
     if (apiLead == null) {
        throw new ApiException(400, "Missing the required parameter 'apiLead' when calling addLead");
     }
     
    // create path and map variables
    String path = "/Leads".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<APILead>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Gets a filtered list of Leads.
   * Only one optional parameter (excluding include_converted, top, skip and count_total) can be specified. Simple object graphs (excluding Custom Fields, Tags, etc.) are returned if \&quot;Brief=True\&quot; is used in the query string.
   * @param email Optional, email address.
   * @param tag Optional, a single tag.
   * @param phoneNumber Optional, phone number.
   * @param firstName Optional, first name of the contact.
   * @param lastName Optional, last name of the contact.
   * @param city Optional, name of the city from lead address.
   * @param state Optional, state from the lead address.
   * @param postcode Optional, postal code from the lead address.
   * @param country Optional, name of the country from lead address.
   * @param organisation Optional, name of the default organisation.
   * @param updatedAfterUtc Optional, earliest date when lead was last updated.
   * @param includeConverted Optional, by default converted leads are not included, pass in \&quot;true\&quot; to include them in the response
   * @param brief Optional, true if response should only contain top level properties of the lead.
   * @param skip Optional, number of lead to skip.
   * @param top Optional, maximum number of lead to return in the response.
   * @param countTotal Optional, true if total number of records should be returned in the response headers.
   * @return List<APILead>
   */
  public List<APILead> getLeadsBySearch (String email, String tag, String phoneNumber, String firstName, String lastName, String city, String state, String postcode, String country, String organisation, Date updatedAfterUtc, Boolean includeConverted, Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/Leads/Search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "email", email));
    
    queryParams.addAll(apiClient.parameterToPairs("", "tag", tag));
    
    queryParams.addAll(apiClient.parameterToPairs("", "phone_number", phoneNumber));
    
    queryParams.addAll(apiClient.parameterToPairs("", "first_name", firstName));
    
    queryParams.addAll(apiClient.parameterToPairs("", "last_name", lastName));
    
    queryParams.addAll(apiClient.parameterToPairs("", "city", city));
    
    queryParams.addAll(apiClient.parameterToPairs("", "state", state));
    
    queryParams.addAll(apiClient.parameterToPairs("", "postcode", postcode));
    
    queryParams.addAll(apiClient.parameterToPairs("", "country", country));
    
    queryParams.addAll(apiClient.parameterToPairs("", "organisation", organisation));
    
    queryParams.addAll(apiClient.parameterToPairs("", "updated_after_utc", updatedAfterUtc));
    
    queryParams.addAll(apiClient.parameterToPairs("", "include_converted", includeConverted));
    
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

    

    
    
    TypeRef returnType = new TypeRef<List<APILead>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Gets a Lead
   * 
   * @param id A Lead&#39;s ID
   * @return APILead
   */
  public APILead getLead (Long id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getLead");
     }
     
    // create path and map variables
    String path = "/Leads/{id}".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<APILead>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Deletes a Lead
   * 
   * @param id A Lead&#39;s ID
   * @return void
   */
  public void deleteLead (Long id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteLead");
     }
     
    // create path and map variables
    String path = "/Leads/{id}".replaceAll("\\{format\\}","json")
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
   * Adds an Activity Set to a Lead
   * 
   * @param id A Lead&#39;s ID
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
    String path = "/Leads/{id}/ActivitySetAssignment".replaceAll("\\{format\\}","json")
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
   * Updates a Custom Field
   * 
   * @param id A Lead&#39;s ID (LEAD_ID)
   * @param apiCustomField The Custom Field to edit (just include JSON object as request body)
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
    String path = "/Leads/{id}/CustomFields".replaceAll("\\{format\\}","json")
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
   * @param id A Lead&#39;s ID (LEAD_ID)
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
    String path = "/Leads/{id}/CustomFields/{customFieldId}".replaceAll("\\{format\\}","json")
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
   * Gets a list of Lead&#39;s Emails
   * 
   * @param id A Lead&#39;s ID
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
    String path = "/Leads/{id}/Emails".replaceAll("\\{format\\}","json")
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
   * Gets a Lead&#39;s Events
   * 
   * @param id A Lead&#39;s ID (LEAD_ID)
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
    String path = "/Leads/{id}/Events".replaceAll("\\{format\\}","json")
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
   * Gets a Lead&#39;s File Attachments
   * 
   * @param id A Lead&#39;s ID (LEAD_ID)
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
    String path = "/Leads/{id}/FileAttachments".replaceAll("\\{format\\}","json")
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
   * Adds a File Attachment to a Lead
   * 
   * @param id A Lead&#39;s ID (LEAD_ID)
   * @param file File and metadata to be attached to a Lead (just include JSON object as request body)
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
    String path = "/Leads/{id}/FileAttachments".replaceAll("\\{format\\}","json")
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
   * Gets a Follow record for the Lead
   * 
   * @param id A Lead&#39;s ID (LEAD_ID)
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
    String path = "/Leads/{id}/Follow".replaceAll("\\{format\\}","json")
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
   * Start following a Lead
   * 
   * @param id A Lead&#39;s ID (LEAD_ID)
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
    String path = "/Leads/{id}/Follow".replaceAll("\\{format\\}","json")
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
   * Stop following a Lead
   * 
   * @param id A Lead&#39;s ID (LEAD_ID)
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
    String path = "/Leads/{id}/Follow".replaceAll("\\{format\\}","json")
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
   * Gets a Lead&#39;s Image
   * 
   * @param id A Lead&#39;s ID (LEAD_ID)
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
    String path = "/Leads/{id}/Image".replaceAll("\\{format\\}","json")
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
   * Deletes a Lead&#39;s Image
   * 
   * @param id A Lead&#39;s ID (LEAD_ID)
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
    String path = "/Leads/{id}/Image".replaceAll("\\{format\\}","json")
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
   * Updates a Lead&#39;s Image
   * This action will replace any existing Image attached to the Lead.
   * @param id A Lead&#39;s ID (LEAD_ID)
   * @param filename Name of Image File to be attached to Lead
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
    String path = "/Leads/{id}/Image/{filename}".replaceAll("\\{format\\}","json")
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
   * Gets a Lead&#39;s Notes
   * 
   * @param id A Lead&#39;s ID (LEAD_ID)
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
    String path = "/Leads/{id}/Notes".replaceAll("\\{format\\}","json")
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
   * Adds a Note to a Lead.
   * 
   * @param id A Lead&#39;s ID (LEAD_ID)
   * @param apiNote The Note to add (just include JSON object as request body)
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
    String path = "/Leads/{id}/Notes".replaceAll("\\{format\\}","json")
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
   * Adds a Tag for a Lead
   * 
   * @param id A Lead&#39;s ID (LEAD_ID)
   * @param apiTag The Tag to add (just include the JSON object in request body.
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
    String path = "/Leads/{id}/Tags".replaceAll("\\{format\\}","json")
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
   * Deletes a Tag from a Lead
   * 
   * @param id A Lead&#39;s ID (LEAD_ID)
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
    String path = "/Leads/{id}/Tags/{tagName}".replaceAll("\\{format\\}","json")
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
   * Gets a list of Lead&#39;s Tasks
   * 
   * @param id A Lead&#39;s ID
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
    String path = "/Leads/{id}/Tasks".replaceAll("\\{format\\}","json")
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
