package auth;



import insightly.Pair;

import java.util.List;
import java.util.Map;


public interface Authentication {
  /** Apply authentication settings to header and query params. */
  void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);

}
