package org.getlago.client.api;

import org.getlago.client.ApiClient;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Organization;
import org.openapitools.client.model.OrganizationUpdateInput;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T15:52:17.625211Z[Etc/UTC]")
public class OrganizationsApi {
    private ApiClient apiClient;

    public OrganizationsApi() {
        this(new ApiClient());
    }

    @Autowired
    public OrganizationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Update your organization
     * This endpoint is used to update your own organization&#39;s settings.
     * <p><b>200</b> - Successful response
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param organizationUpdateInput Update an existing organization
     * @return Organization
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateOrganizationRequestCreation(OrganizationUpdateInput organizationUpdateInput) throws WebClientResponseException {
        Object postBody = organizationUpdateInput;
        // verify the required parameter 'organizationUpdateInput' is set
        if (organizationUpdateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'organizationUpdateInput' when calling updateOrganization", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Organization> localVarReturnType = new ParameterizedTypeReference<Organization>() {};
        return apiClient.invokeAPI("/organizations", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update your organization
     * This endpoint is used to update your own organization&#39;s settings.
     * <p><b>200</b> - Successful response
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param organizationUpdateInput Update an existing organization
     * @return Organization
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Organization> updateOrganization(OrganizationUpdateInput organizationUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Organization> localVarReturnType = new ParameterizedTypeReference<Organization>() {};
        return updateOrganizationRequestCreation(organizationUpdateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Update your organization
     * This endpoint is used to update your own organization&#39;s settings.
     * <p><b>200</b> - Successful response
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param organizationUpdateInput Update an existing organization
     * @return ResponseEntity&lt;Organization&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Organization>> updateOrganizationWithHttpInfo(OrganizationUpdateInput organizationUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Organization> localVarReturnType = new ParameterizedTypeReference<Organization>() {};
        return updateOrganizationRequestCreation(organizationUpdateInput).toEntity(localVarReturnType);
    }

    /**
     * Update your organization
     * This endpoint is used to update your own organization&#39;s settings.
     * <p><b>200</b> - Successful response
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param organizationUpdateInput Update an existing organization
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateOrganizationWithResponseSpec(OrganizationUpdateInput organizationUpdateInput) throws WebClientResponseException {
        return updateOrganizationRequestCreation(organizationUpdateInput);
    }
}
