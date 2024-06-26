package org.springframework.ai.sensetime.sensenova.autoconfigure;

import org.springframework.ai.sensetime.sensenova.util.ApiUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(SensetimeAiSensenovaConnectionProperties.CONFIG_PREFIX)
public class SensetimeAiSensenovaConnectionProperties {

    public static final String CONFIG_PREFIX = "spring.ai.sensetimeai.sensenova";

    /**
     * Base URL where Sensetime AI Sensenova API server is running.
     */
    private String baseUrl = ApiUtils.DEFAULT_BASE_URL;

    private String apiKey;

    public String getApiKey() {
        return this.apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

}
