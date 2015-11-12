package api;

import insightly.ApiClient;
import insightly.ApiException;
import insightly.Configuration;
import insightly.Pair;
import insightly.TypeRef;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.APICalendarEvent;
import model.APIEventLink;


public class EventsApi {
  private ApiClient apiClient;

  public EventsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EventsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Gets a list of Calendar Events.
   * EVENTLINKS are included unless \&quot;Brief=True\&quot; is used in the query string..
   * @param brief Optional, true if response should only contain top level properties of the event.
   * @param skip Optional, number of events to skip.
   * @param top Optional, maximum number of events to return in the response.
   * @param countTotal Optional, true if total number of records should be returned in the response headers.
   * @return List<APICalendarEvent>
   */
  public List<APICalendarEvent> getEvents (Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/Events".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<List<APICalendarEvent>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Updates a Calendar Event
   * 
   * @param apiEvent The Event to update (just include JSON object as request body)
   * @return APICalendarEvent
   */
  public APICalendarEvent updateEvent (APICalendarEvent apiEvent) throws ApiException {
    Object postBody = apiEvent;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apiEvent' is set
     if (apiEvent == null) {
        throw new ApiException(400, "Missing the required parameter 'apiEvent' when calling updateEvent");
     }
     
    // create path and map variables
    String path = "/Events".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<APICalendarEvent>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Adds a Calendar Event
   * 
   * @param apiEvent The Event to add (just include JSON object as request body)
   * @return APICalendarEvent
   */
  public APICalendarEvent addEvent (APICalendarEvent apiEvent) throws ApiException {
    Object postBody = apiEvent;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'apiEvent' is set
     if (apiEvent == null) {
        throw new ApiException(400, "Missing the required parameter 'apiEvent' when calling addEvent");
     }
     
    // create path and map variables
    String path = "/Events".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<APICalendarEvent>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Gets a filtered list of Calendar Events.
   * Only one optional parameter (excluding top, skip and count_total) can be specified. EVENTLINKS are included unless \&quot;Brief=True\&quot; is used in the query string. You can page through larger recordsets using the top and skip parameters in the querystring.
   * @param title Optional, event title.
   * @param ownerUserId Optional, id of the owner user.
   * @param startDateUtc Optional, start date and time of the event
   * @param endDateUtc Optional, end date and time of the event
   * @param updatedAfterUtc Optional, earliest date when event was last updated.
   * @param brief Optional, true if response should only contain top level properties of the event.
   * @param skip Optional, number of events to skip.
   * @param top Optional, maximum number of events to return in the response.
   * @param countTotal Optional, true if total number of records should be returned in the response headers.
   * @return List<APICalendarEvent>
   */
  public List<APICalendarEvent> getEventsBySearch (String title, Long ownerUserId, Date startDateUtc, Date endDateUtc, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/Events/Search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "title", title));
    
    queryParams.addAll(apiClient.parameterToPairs("", "owner_user_id", ownerUserId));
    
    queryParams.addAll(apiClient.parameterToPairs("", "start_date_utc", startDateUtc));
    
    queryParams.addAll(apiClient.parameterToPairs("", "end_date_utc", endDateUtc));
    
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

    

    
    
    TypeRef returnType = new TypeRef<List<APICalendarEvent>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Gets a Calendar Event
   * 
   * @param id An Event&#39;s ID
   * @return APICalendarEvent
   */
  public APICalendarEvent getEvent (Long id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getEvent");
     }
     
    // create path and map variables
    String path = "/Events/{id}".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<APICalendarEvent>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Deletes a Calendar Event
   * 
   * @param id An Event&#39;s ID
   * @return void
   */
  public void deleteEvent (Long id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteEvent");
     }
     
    // create path and map variables
    String path = "/Events/{id}".replaceAll("\\{format\\}","json")
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
   * Updates an Event Link
   * 
   * @param id An Event&#39;s ID (EVENT_ID)
   * @param apiLink The Event Link to add (just include JSON object as request body)
   * @return APIEventLink
   */
  public APIEventLink updateEventLink (Long id, APIEventLink apiLink) throws ApiException {
    Object postBody = apiLink;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updateEventLink");
     }
     
     // verify the required parameter 'apiLink' is set
     if (apiLink == null) {
        throw new ApiException(400, "Missing the required parameter 'apiLink' when calling updateEventLink");
     }
     
    // create path and map variables
    String path = "/Events/{id}/EventLinks".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<APIEventLink>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Adds an Event Link
   * 
   * @param id An Event&#39;s ID (EVENT_ID)
   * @param apiLink The Event Link to add (just include JSON object as request body)
   * @return APIEventLink
   */
  public APIEventLink addEventLink (Long id, APIEventLink apiLink) throws ApiException {
    Object postBody = apiLink;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling addEventLink");
     }
     
     // verify the required parameter 'apiLink' is set
     if (apiLink == null) {
        throw new ApiException(400, "Missing the required parameter 'apiLink' when calling addEventLink");
     }
     
    // create path and map variables
    String path = "/Events/{id}/EventLinks".replaceAll("\\{format\\}","json")
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

    

    
    
    TypeRef returnType = new TypeRef<APIEventLink>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Deletes an Event Link
   * 
   * @param id An Event&#39;s ID (EVENT_ID)
   * @param linkId A EVENT Link&#39;s ID (EVENT_LINK_ID)
   * @return void
   */
  public void deleteEventLink (Long id, Long linkId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteEventLink");
     }
     
     // verify the required parameter 'linkId' is set
     if (linkId == null) {
        throw new ApiException(400, "Missing the required parameter 'linkId' when calling deleteEventLink");
     }
     
    // create path and map variables
    String path = "/Events/{id}/EventLinks/{linkId}".replaceAll("\\{format\\}","json")
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
