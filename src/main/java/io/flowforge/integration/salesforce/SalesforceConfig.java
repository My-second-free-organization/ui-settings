package io.flowforge.integration.salesforce;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "salesforce")
public class SalesforceConfig {
    private String clientId;
    private String clientSecret;
    private String username;
    private String instanceUrl;
    public String getClientId() { return clientId; }
    public void setClientId(String c) { this.clientId = c; }
    public String getClientSecret() { return clientSecret; }
    public void setClientSecret(String c) { this.clientSecret = c; }
    public String getUsername() { return username; }
    public void setUsername(String u) { this.username = u; }
    public String getInstanceUrl() { return instanceUrl; }
    public void setInstanceUrl(String u) { this.instanceUrl = u; }
}
