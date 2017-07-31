import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class SFMoviesConfiguration extends Configuration {
  @NotEmpty
  private String appToken;

  @NotEmpty
  private String apiURL;

  @JsonProperty
  public String getAppToken(){
    return appToken;
  }

  @JsonProperty
  public void setAppToken(String token){
    this.appToken = token;
  }

  @JsonProperty
  public String getApiURL() {
    return apiURL;
  }

  @JsonProperty
  public void setApiURL(String apiURL) {
    this.apiURL = apiURL;
  }
}
