package api;

import insightly.ApiClient;
import insightly.ApiException;
import insightly.Configuration;
import insightly.Pair;
import insightly.TypeRef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.APICategory;


public class FileCategoriesApi {
  private ApiClient apiClient;

  public FileCategoriesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FileCategoriesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Gets a list of File Categories
   * This read only endpoint returns a list of file categories that have been set up for the Insightly instance.
   * @param skip Optional, number of file categories to skip.
   * @param top Optional, maximum number of file categories to return in the response.
   * @param countTotal Optional, true if total number of records should be returned in the response headers.
   * @return List<APICategory>
   */
  public List<APICategory> getFileCategories (Integer skip, Integer top, Boolean countTotal) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/FileCategories".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
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

    

    
    
    TypeRef returnType = new TypeRef<List<APICategory>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Updates a File Category, NOTE: you must be a system administrator to use this endpoint.
   * 
   * @param category A File Category (just include JSON object as request body)
   * @return void
   */
  public void updateFileCategory (APICategory category) throws ApiException {
    Object postBody = category;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'category' is set
     if (category == null) {
        throw new ApiException(400, "Missing the required parameter 'category' when calling updateFileCategory");
     }
     
    // create path and map variables
    String path = "/FileCategories".replaceAll("\\{format\\}","json");

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

    

    
    
    apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, null);
    
    


  }
  
  /**
   * Adds a File Category, NOTE: you must be a system administrator to use this endpoint.
   * 
   * @param category The File Category to add (just include JSON object as request body)
   * @return void
   */
  public void addFileCategory (APICategory category) throws ApiException {
    Object postBody = category;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'category' is set
     if (category == null) {
        throw new ApiException(400, "Missing the required parameter 'category' when calling addFileCategory");
     }
     
    // create path and map variables
    String path = "/FileCategories".replaceAll("\\{format\\}","json");

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
   * Gets a File Category
   * 
   * @param id A File Category&#39;s ID
   * @return APICategory
   */
  public APICategory getFileCategory (Long id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getFileCategory");
     }
     
    // create path and map variables
    String path = "/FileCategories/{id}".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<APICategory>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Deletes a File Category, NOTE: you must be a system administrator to use this endpoint.
   * 
   * @param id A File Category&#39;s ID
   * @return void
   */
  public void deleteFileCategory (Long id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteFileCategory");
     }
     
    // create path and map variables
    String path = "/FileCategories/{id}".replaceAll("\\{format\\}","json")
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
  
}
