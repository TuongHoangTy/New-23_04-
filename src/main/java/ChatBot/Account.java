package ChatBot;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)

public class Account {
	 @JsonProperty("account_id")
	    public String accountId;

	    @JsonProperty("name")
	    public String name;
	

}
