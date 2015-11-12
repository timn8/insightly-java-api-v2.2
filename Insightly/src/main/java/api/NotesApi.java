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

import model.APIComment;
import model.APIFileAttachment;
import model.APIFollow;
import model.APINote;
import model.APINoteLink;


public class NotesApi {
  private ApiClient apiClient;

  public NotesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NotesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Gets a list of Notes.
   * Bodies, Attachments, and Links are included unless \&quot;Brief=True\&quot; is used in the query string..
   * @param brief Optional, true if response should only contain top level properties of the note.
   * @param skip Optional, number of notes to skip.
   * @param top Optional, maximum number of notes to return in the response.
   * @param countTotal Optional, true if total number of records should be returned in the response headers.
   * @return List<APINote>
   */
  public List<APINote> getNotes (Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/Notes".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<List<APINote>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Updates a Note
   * 
   * @param apiNote The Note to add (just include JSON object as request body)
   * @return APINote
   */
  public APINote updateNote (APINote apiNote) throws ApiException {
    Object postBody = apiNote;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apiNote' is set
     if (apiNote == null) {
        throw new ApiException(400, "Missing the required parameter 'apiNote' when calling updateNote");
     }
     
    // create path and map variables
    String path = "/Notes".replaceAll("\\{format\\}","json");

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
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Gets a filtered list of Notes.
   * Only one optional parameter (excluding top, skip and count_total) can be specified. Bodies, Attachments, and Links are included unless \&quot;Brief=True\&quot; is used in the query string..
   * @param title Optional, note title.
   * @param ownerUserId Optional, id of the owner user.
   * @param updatedAfterUtc Optional, earliest date when note was last updated.
   * @param brief Optional, true if response should only contain top level properties of the note.
   * @param skip Optional, number of notes to skip.
   * @param top Optional, maximum number of notes to return in the response.
   * @param countTotal Optional, true if total number of records should be returned in the response headers.
   * @return List<APINote>
   */
  public List<APINote> getNotesBySearch (String title, Long ownerUserId, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/Notes/Search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "title", title));
    
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

    

    
    
    TypeRef returnType = new TypeRef<List<APINote>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Gets a Note
   * 
   * @param id A Note&#39;s ID
   * @return APINote
   */
  public APINote getNote (Long id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getNote");
     }
     
    // create path and map variables
    String path = "/Notes/{id}".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<APINote>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Deletes a Note
   * 
   * @param id A Note&#39;s ID
   * @return void
   */
  public void deleteNote (Long id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteNote");
     }
     
    // create path and map variables
    String path = "/Notes/{id}".replaceAll("\\{format\\}","json")
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
   * Gets a Note&#39;s Comments
   * 
   * @param id A Note&#39;s ID (NOTE_ID)
   * @param updatedAfterUtc Optional, earliest date when comment was last updated.
   * @param skip Optional, number of comments to skip.
   * @param top Optional, maximum number of comments to return in the response.
   * @param countTotal true if total number of records should be returned in the response headers.
   * @return List<APIComment>
   */
  public List<APIComment> getComments (Long id, Date updatedAfterUtc, Integer skip, Integer top, Boolean countTotal) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getComments");
     }
     
    // create path and map variables
    String path = "/Notes/{id}/Comments".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<List<APIComment>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Adds a Comment to a Note
   * 
   * @param id A Note&#39;s ID (NOTE_ID)
   * @param apiComment The Comment to add (just include JSON object as request body)
   * @return APIComment
   */
  public APIComment addComment (Long id, APIComment apiComment) throws ApiException {
    Object postBody = apiComment;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling addComment");
     }
     
     // verify the required parameter 'apiComment' is set
     if (apiComment == null) {
        throw new ApiException(400, "Missing the required parameter 'apiComment' when calling addComment");
     }
     
    // create path and map variables
    String path = "/Notes/{id}/Comments".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<APIComment>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Gets a Note&#39;s File Attachments
   * 
   * @param id A Note&#39;s ID (NOTE_ID)
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
    String path = "/Notes/{id}/FileAttachments".replaceAll("\\{format\\}","json")
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
   * Adds a File Attachment to a Note
   * 
   * @param id Note ID
   * @param file File and metadata to be attached to Note (just include JSON object as request body)
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
    String path = "/Notes/{id}/FileAttachments".replaceAll("\\{format\\}","json")
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
   * Gets a Follow record for the Note
   * 
   * @param id A Note&#39;s ID (NOTE_ID)
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
    String path = "/Notes/{id}/Follow".replaceAll("\\{format\\}","json")
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
   * Start following a Note
   * 
   * @param id A Note&#39;s ID (NOTE_ID)
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
    String path = "/Notes/{id}/Follow".replaceAll("\\{format\\}","json")
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
   * Stop following a Note
   * 
   * @param id A Note&#39;s ID (NOTE_ID)
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
    String path = "/Notes/{id}/Follow".replaceAll("\\{format\\}","json")
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
   * Updates an Note Link
   * 
   * @param id A Note&#39;s ID (NOTE_ID)
   * @param apiLink The Note Link to add (just include JSON object as request body)
   * @return APINoteLink
   */
  public APINoteLink updateNoteLink (Long id, APINoteLink apiLink) throws ApiException {
    Object postBody = apiLink;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updateNoteLink");
     }
     
     // verify the required parameter 'apiLink' is set
     if (apiLink == null) {
        throw new ApiException(400, "Missing the required parameter 'apiLink' when calling updateNoteLink");
     }
     
    // create path and map variables
    String path = "/Notes/{id}/NoteLinks".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<APINoteLink>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Adds a Note Link
   * 
   * @param id A Note&#39;s ID (NOTE_ID)
   * @param apiLink The Note Link to add (just include JSON object as request body)
   * @return APINoteLink
   */
  public APINoteLink addNoteLink (Long id, APINoteLink apiLink) throws ApiException {
    Object postBody = apiLink;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling addNoteLink");
     }
     
     // verify the required parameter 'apiLink' is set
     if (apiLink == null) {
        throw new ApiException(400, "Missing the required parameter 'apiLink' when calling addNoteLink");
     }
     
    // create path and map variables
    String path = "/Notes/{id}/NoteLinks".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<APINoteLink>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Deletes a Note Link
   * 
   * @param id A Note&#39;s ID (NOTE_ID)
   * @param linkId A Note Link&#39;s ID (NOTE_LINK_ID)
   * @return void
   */
  public void deleteNoteLink (Long id, Long linkId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteNoteLink");
     }
     
     // verify the required parameter 'linkId' is set
     if (linkId == null) {
        throw new ApiException(400, "Missing the required parameter 'linkId' when calling deleteNoteLink");
     }
     
    // create path and map variables
    String path = "/Notes/{id}/NoteLinks/{linkId}".replaceAll("\\{format\\}","json")
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
  
}
