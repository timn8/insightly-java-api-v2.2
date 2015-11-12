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
import model.APILink;
import model.APILinkEmailAddress;
import model.APIMilestone;
import model.APINote;
import model.APIPipelineChange;
import model.APIPipelineStageChange;
import model.APIProject;
import model.APITag;
import model.APITask;


public class ProjectsApi {
  private ApiClient apiClient;

  public ProjectsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProjectsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Gets a list of Projects.
   * Simple object graphs (excluding Custom Fields, Tags, etc.) are returned if \&quot;Brief=True\&quot; is used in the query string.
   * @param brief Optional, true if response should only contain top level properties of the project.
   * @param skip Optional, number of projects to skip.
   * @param top Optional, maximum number of projects to return in the response.
   * @param countTotal Optional, true if total number of records should be returned in the response headers.
   * @return List<APIProject>
   */
  public List<APIProject> getProjects (Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/Projects".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<List<APIProject>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Updates a Project
   * A common source of problems when updating projects occurs when users omit required fields, or insert             invalid data into a field (for example by referencing an invalid CATEGORY_ID). A good troubleshooting technique             is to create a few projects via the web interface, with representative data, links, etc, and then access             these projects via the API, and inspect the returned object graph.
   * @param apiProject A Project (just include JSON object as request body)
   * @return APIProject
   */
  public APIProject updateProject (APIProject apiProject) throws ApiException {
    Object postBody = apiProject;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apiProject' is set
     if (apiProject == null) {
        throw new ApiException(400, "Missing the required parameter 'apiProject' when calling updateProject");
     }
     
    // create path and map variables
    String path = "/Projects".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<APIProject>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Adds a Project
   * A common source of problems when creating projects occurs when users omit required fields, or insert             invalid data into a field (for example by referencing an invalid CATEGORY_ID). A good troubleshooting technique             is to create a few projects via the web interface, with representative data, links, etc, and then access             these projects via the API, and inspect the returned object graph.
   * @param apiProject The Project to add (just include JSON object as request body)
   * @return APIProject
   */
  public APIProject addProject (APIProject apiProject) throws ApiException {
    Object postBody = apiProject;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apiProject' is set
     if (apiProject == null) {
        throw new ApiException(400, "Missing the required parameter 'apiProject' when calling addProject");
     }
     
    // create path and map variables
    String path = "/Projects".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<APIProject>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Gets a filtered list of Projects.
   * Only one optional parameter (excluding brief, top, skip and count_total) can be specified. Simple object graphs (excluding Custom Fields, Tags, etc.) are returned if \&quot;Brief=True\&quot; is used in the query string.
   * @param tag Optional, a single tag.
   * @param projectName Optional, project name.
   * @param status Optional, project status.
   * @param categoryId Optional, category id.
   * @param pipelineId Optional, pipeline id.
   * @param stageId Optional, stage id.
   * @param responsibleUserId Optional, responsible user id.
   * @param ownerUserId Optional, owner user id.
   * @param updatedAfterUtc Optional, earliest date when project was last updated.
   * @param brief Optional, true if response should only contain top level properties of the project.
   * @param skip Optional, number of projects to skip.
   * @param top Optional, maximum number of projects to return in the response.
   * @param countTotal Optional, true if total number of records should be returned in the response headers.
   * @return List<APIProject>
   */
  public List<APIProject> getProjectsBySearch (String tag, String projectName, String status, Long categoryId, Long pipelineId, Long stageId, Long responsibleUserId, Long ownerUserId, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/Projects/Search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "tag", tag));
    
    queryParams.addAll(apiClient.parameterToPairs("", "project_name", projectName));
    
    queryParams.addAll(apiClient.parameterToPairs("", "status", status));
    
    queryParams.addAll(apiClient.parameterToPairs("", "category_id", categoryId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "pipeline_id", pipelineId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "stage_id", stageId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "responsible_user_id", responsibleUserId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "owner_user_id", ownerUserId));
    
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

    

    
    
    TypeRef returnType = new TypeRef<List<APIProject>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Gets a Project
   * 
   * @param id A Project&#39;s ID
   * @return APIProject
   */
  public APIProject getProject (Long id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getProject");
     }
     
    // create path and map variables
    String path = "/Projects/{id}".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<APIProject>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Deletes a Project
   * 
   * @param id A Project&#39;s ID
   * @return void
   */
  public void deleteProject (Long id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteProject");
     }
     
    // create path and map variables
    String path = "/Projects/{id}".replaceAll("\\{format\\}","json")
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
   * Adds an Activity Set to a Project
   * 
   * @param id A Project&#39;s ID
   * @param apiActivitySetAssignment The Activity Set Assignment object which contains the configuration information for the Activity Set (just include JSON object as request body)
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
    String path = "/Projects/{id}/ActivitySetAssignment".replaceAll("\\{format\\}","json")
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
   * @param id A Project&#39;s ID (Project_ID)
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
    String path = "/Projects/{id}/CustomFields".replaceAll("\\{format\\}","json")
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
   * @param id A Project&#39;s ID (Project_ID)
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
    String path = "/Projects/{id}/CustomFields/{customFieldId}".replaceAll("\\{format\\}","json")
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
   * Gets a list of Project&#39;s Emails
   * 
   * @param id A Project&#39;s ID
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
    String path = "/Projects/{id}/Emails".replaceAll("\\{format\\}","json")
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
   * Gets a Project&#39;s Events
   * 
   * @param id A Project&#39;s ID (PROJECT_ID)
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
    String path = "/Projects/{id}/Events".replaceAll("\\{format\\}","json")
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
   * Gets a Project&#39;s File Attachments
   * 
   * @param id A Project&#39;s ID (PROJECT_ID)
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
    String path = "/Projects/{id}/FileAttachments".replaceAll("\\{format\\}","json")
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
   * Adds a File Attachment to a Project
   * 
   * @param id A Project&#39;s ID (PROJECT_ID)
   * @param file File and metadata to be attached to a Project (just include JSON object as request body)
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
    String path = "/Projects/{id}/FileAttachments".replaceAll("\\{format\\}","json")
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
   * Gets a Follow record for the Project
   * 
   * @param id A Project&#39;s ID (PROJECT_ID)
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
    String path = "/Projects/{id}/Follow".replaceAll("\\{format\\}","json")
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
   * Start following a Project
   * 
   * @param id A Project&#39;s ID (PROJECT_ID)
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
    String path = "/Projects/{id}/Follow".replaceAll("\\{format\\}","json")
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
   * Stop following a Project
   * 
   * @param id A Project&#39;s ID (PROJECT_ID)
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
    String path = "/Projects/{id}/Follow".replaceAll("\\{format\\}","json")
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
   * Gets a Project&#39;s Image
   * 
   * @param id A Project&#39;s ID (PROJECT_ID)
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
    String path = "/Projects/{id}/Image".replaceAll("\\{format\\}","json")
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
   * Deletes a Project&#39;s Image
   * 
   * @param id A Project&#39;s ID (PROJECT_ID)
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
    String path = "/Projects/{id}/Image".replaceAll("\\{format\\}","json")
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
   * Updates a Project&#39;s Image
   * This action will replace any existing Image attached to the Project.
   * @param id A Project&#39;s ID (PROJECT_ID)
   * @param filename Name of Image File to be attached to Project
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
    String path = "/Projects/{id}/Image/{filename}".replaceAll("\\{format\\}","json")
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
   * Gets the email address to use for linking with the Project
   * An email address to use as a maildrop for the Project.
   * @param id A Project&#39;s ID
   * @return APILinkEmailAddress
   */
  public APILinkEmailAddress getLinkEmailAddress (Long id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getLinkEmailAddress");
     }
     
    // create path and map variables
    String path = "/Projects/{id}/LinkEmailAddress".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<APILinkEmailAddress>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Updates a Link for a project
   * 
   * @param id A Project&#39;s ID (PROJECT_ID)
   * @param apiLink The Link to add (just include JSON object as request body)
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
    String path = "/Projects/{id}/Links".replaceAll("\\{format\\}","json")
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
   * Adds a Link to a project
   * 
   * @param id A Project&#39;s ID (PROJECT_ID)
   * @param apiLink The Link to add (just include JSON object as request body)
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
    String path = "/Projects/{id}/Links".replaceAll("\\{format\\}","json")
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
   * Deletes a Link from a project
   * 
   * @param id A Project&#39;s ID (PROJECT_ID)
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
    String path = "/Projects/{id}/Links/{linkId}".replaceAll("\\{format\\}","json")
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
   * Gets a list of Milestones for a Project
   * 
   * @param id A Project&#39;s ID (PROJECT_ID)
   * @return List<APIMilestone>
   */
  public List<APIMilestone> getMilestones (Long id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getMilestones");
     }
     
    // create path and map variables
    String path = "/Projects/{id}/Milestones".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<List<APIMilestone>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Updates a Milestone for a Project
   * 
   * @param id A Project&#39;s ID (PROJECT_ID)
   * @param apiMilestone The Milestone to update (just include JSON object as request body)
   * @return APIMilestone
   */
  public APIMilestone updateMilestone (Long id, APIMilestone apiMilestone) throws ApiException {
    Object postBody = apiMilestone;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updateMilestone");
     }
     
     // verify the required parameter 'apiMilestone' is set
     if (apiMilestone == null) {
        throw new ApiException(400, "Missing the required parameter 'apiMilestone' when calling updateMilestone");
     }
     
    // create path and map variables
    String path = "/Projects/{id}/Milestones".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<APIMilestone>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Adds a Milestone to a Project
   * 
   * @param id A Project&#39;s ID (PROJECT_ID)
   * @param apiMilestone The Milestone to add (just include JSON object as request body)
   * @return APIMilestone
   */
  public APIMilestone addMilestone (Long id, APIMilestone apiMilestone) throws ApiException {
    Object postBody = apiMilestone;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling addMilestone");
     }
     
     // verify the required parameter 'apiMilestone' is set
     if (apiMilestone == null) {
        throw new ApiException(400, "Missing the required parameter 'apiMilestone' when calling addMilestone");
     }
     
    // create path and map variables
    String path = "/Projects/{id}/Milestones".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<APIMilestone>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Deletes a Milestone from a Project
   * 
   * @param id A Project&#39;s ID (PROJECT_ID)
   * @param milestoneId A Milestone&#39;s ID (MILESTONE_ID)
   * @return void
   */
  public void deleteMilestone (Long id, Long milestoneId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteMilestone");
     }
     
     // verify the required parameter 'milestoneId' is set
     if (milestoneId == null) {
        throw new ApiException(400, "Missing the required parameter 'milestoneId' when calling deleteMilestone");
     }
     
    // create path and map variables
    String path = "/Projects/{id}/Milestones/{milestoneId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "milestoneId" + "\\}", apiClient.escapeString(milestoneId.toString()));

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
   * Gets a Project&#39;s Notes
   * 
   * @param id A Project&#39;s ID (PROJECT_ID)
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
    String path = "/Projects/{id}/Notes".replaceAll("\\{format\\}","json")
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
   * Adds a Note to a Project.
   * 
   * @param id A Project&#39;s ID (PROJECT_ID)
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
    String path = "/Projects/{id}/Notes".replaceAll("\\{format\\}","json")
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
   * Changes current pipeline for the project.
   * 
   * @param id A Project&#39;s ID
   * @param apiPipelineChange Pipeline change parameters (just include JSON object as request body)
   * @return APIProject
   */
  public APIProject updatePipeline (Long id, APIPipelineChange apiPipelineChange) throws ApiException {
    Object postBody = apiPipelineChange;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updatePipeline");
     }
     
     // verify the required parameter 'apiPipelineChange' is set
     if (apiPipelineChange == null) {
        throw new ApiException(400, "Missing the required parameter 'apiPipelineChange' when calling updatePipeline");
     }
     
    // create path and map variables
    String path = "/Projects/{id}/Pipeline".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<APIProject>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Clears pipeline for the Project.
   * 
   * @param id A Project&#39;s ID
   * @return APIProject
   */
  public APIProject deletePipeline (Long id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deletePipeline");
     }
     
    // create path and map variables
    String path = "/Projects/{id}/Pipeline".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<APIProject>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Changes current pipeline stage for the project.
   * 
   * @param id A Project&#39;s ID
   * @param apiStageChange Pipeline stage change parameters (just include JSON object as request body)
   * @return APIProject
   */
  public APIProject updatePipelineStage (Long id, APIPipelineStageChange apiStageChange) throws ApiException {
    Object postBody = apiStageChange;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updatePipelineStage");
     }
     
     // verify the required parameter 'apiStageChange' is set
     if (apiStageChange == null) {
        throw new ApiException(400, "Missing the required parameter 'apiStageChange' when calling updatePipelineStage");
     }
     
    // create path and map variables
    String path = "/Projects/{id}/PipelineStage".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<APIProject>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Adds a Tag for a Project
   * 
   * @param id A Project&#39;s ID (PROJECT_ID)
   * @param apiTag The Tag to add (just include JSON object as request body)
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
    String path = "/Projects/{id}/Tags".replaceAll("\\{format\\}","json")
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
   * Deletes a Tag from a Project
   * 
   * @param id A Project&#39;s ID (PROJECT_ID)
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
    String path = "/Projects/{id}/Tags/{tagName}".replaceAll("\\{format\\}","json")
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
   * Gets a list of Project&#39;s Tasks
   * 
   * @param id A Project&#39;s ID
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
    String path = "/Projects/{id}/Tasks".replaceAll("\\{format\\}","json")
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
