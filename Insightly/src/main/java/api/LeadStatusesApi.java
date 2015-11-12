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

import model.APILeadStatus;


public class LeadStatusesApi {
  private ApiClient apiClient;

  public LeadStatusesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LeadStatusesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Gets a list of Lead Statuses
   * This endpoint returns a list of the possible lead statuses that have been defined for the Insightly instance.
   * @param includeConverted Optional, by default converted status is not included, pass in \&quot;true\&quot; to include it in the response
   * @param skip Optional, number of lead statuses to skip.
   * @param top Optional, maximum number of lead statuses to return in the response.
   * @param countTotal Optional, true if total number of records should be returned in the response headers.
   * @return List<APILeadStatus>
   */
  public List<APILeadStatus> getLeadStatuses (Boolean includeConverted, Integer skip, Integer top, Boolean countTotal) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/LeadStatuses".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "include_converted", includeConverted));
    
    queryParams.addAll(apiClient.parameterToPairs("", "skip", skip));
    
    queryParams.addAll(apiClient.parameterToPairs("", "top", top));
    
    queryParams.addAll(apiClient.parameterToPairs("", "count_total", countTotal));
    

    

    

    final String[] accepts = {
      "application/octet-stream"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<APILeadStatus>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Updates a Lead Status
   * 
   * @param leadStatus A Lead Status
   * @return void
   */
  public void updateLeadStatus (APILeadStatus leadStatus) throws ApiException {
    Object postBody = leadStatus;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'leadStatus' is set
     if (leadStatus == null) {
        throw new ApiException(400, "Missing the required parameter 'leadStatus' when calling updateLeadStatus");
     }
     
    // create path and map variables
    String path = "/LeadStatuses".replaceAll("\\{format\\}","json");

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
   * Adds a Lead Status
   * 
   * @param leadStatus The Lead Status to add
   * @return void
   */
  public void addLeadStatus (APILeadStatus leadStatus) throws ApiException {
    Object postBody = leadStatus;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'leadStatus' is set
     if (leadStatus == null) {
        throw new ApiException(400, "Missing the required parameter 'leadStatus' when calling addLeadStatus");
     }
     
    // create path and map variables
    String path = "/LeadStatuses".replaceAll("\\{format\\}","json");

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
   * Deletes a Lead Status
   * 
   * @param id A Lead Status&#39;s ID
   * @return void
   */
  public void deleteLeadStatus (Long id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteLeadStatus");
     }
     
    // create path and map variables
    String path = "/LeadStatuses/{id}".replaceAll("\\{format\\}","json")
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
