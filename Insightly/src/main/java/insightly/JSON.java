package insightly;

import java.io.IOException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.joda.JodaModule;


public class JSON {
  private ObjectMapper mapper;

  public JSON() {
    mapper = new ObjectMapper();
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
    mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
    mapper.registerModule(new JodaModule());
	}

  /**
   * Serialize the given Java object into JSON string.
   */
  public String serialize(Object obj) throws ApiException {
    try {
      if (obj != null)
        return mapper.writeValueAsString(obj);
      else
        return null;
    } catch (Exception e) {
      throw new ApiException(400, e.getMessage());
    }
  }

  /**
   * Deserialize the given JSON string to Java object.
   *
   * @param body The JSON string
   * @param returnType The type to deserialize inot
   * @return The deserialized Java object
   */
  @SuppressWarnings("unchecked")
public <T> T deserialize(String body, @SuppressWarnings("rawtypes") TypeRef returnType) throws ApiException {
    JavaType javaType = mapper.constructType(returnType.getType());
    try {
      return mapper.readValue(body, javaType);
    } catch (IOException e) {
      if (returnType.getType().equals(String.class))
        return (T) body;
      else
        throw new ApiException(500, e.getMessage(), null, body);
    }
  }
}
