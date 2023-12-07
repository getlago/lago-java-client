package org.getlago.client.api;

import org.getlago.client.ApiClient;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Plan;
import org.openapitools.client.model.PlanCreateInput;
import org.openapitools.client.model.PlanUpdateInput;
import org.openapitools.client.model.PlansPaginated;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class PlansApi {
    private ApiClient apiClient;

    public PlansApi() {
        this(new ApiClient());
    }

    @Autowired
    public PlansApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a plan
     * This endpoint creates a plan with subscription and usage-based charges. It supports flexible billing cadence (in-advance or in-arrears) and allows for both recurring and metered charges.
     * <p><b>200</b> - Plan created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param planCreateInput Plan payload
     * @return Plan
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createPlanRequestCreation(PlanCreateInput planCreateInput) throws WebClientResponseException {
        Object postBody = planCreateInput;
        // verify the required parameter 'planCreateInput' is set
        if (planCreateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'planCreateInput' when calling createPlan", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Plan> localVarReturnType = new ParameterizedTypeReference<Plan>() {};
        return apiClient.invokeAPI("/plans", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a plan
     * This endpoint creates a plan with subscription and usage-based charges. It supports flexible billing cadence (in-advance or in-arrears) and allows for both recurring and metered charges.
     * <p><b>200</b> - Plan created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param planCreateInput Plan payload
     * @return Plan
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Plan> createPlan(PlanCreateInput planCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Plan> localVarReturnType = new ParameterizedTypeReference<Plan>() {};
        return createPlanRequestCreation(planCreateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Create a plan
     * This endpoint creates a plan with subscription and usage-based charges. It supports flexible billing cadence (in-advance or in-arrears) and allows for both recurring and metered charges.
     * <p><b>200</b> - Plan created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param planCreateInput Plan payload
     * @return ResponseEntity&lt;Plan&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Plan>> createPlanWithHttpInfo(PlanCreateInput planCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Plan> localVarReturnType = new ParameterizedTypeReference<Plan>() {};
        return createPlanRequestCreation(planCreateInput).toEntity(localVarReturnType);
    }

    /**
     * Create a plan
     * This endpoint creates a plan with subscription and usage-based charges. It supports flexible billing cadence (in-advance or in-arrears) and allows for both recurring and metered charges.
     * <p><b>200</b> - Plan created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param planCreateInput Plan payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createPlanWithResponseSpec(PlanCreateInput planCreateInput) throws WebClientResponseException {
        return createPlanRequestCreation(planCreateInput);
    }
    /**
     * Delete a plan
     * This endpoint deletes a specific plan. Note that this plan could be associated with active subscriptions.
     * <p><b>200</b> - Plan deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance.
     * @return Plan
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec destroyPlanRequestCreation(String code) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new WebClientResponseException("Missing the required parameter 'code' when calling destroyPlan", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("code", code);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Plan> localVarReturnType = new ParameterizedTypeReference<Plan>() {};
        return apiClient.invokeAPI("/plans/{code}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete a plan
     * This endpoint deletes a specific plan. Note that this plan could be associated with active subscriptions.
     * <p><b>200</b> - Plan deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance.
     * @return Plan
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Plan> destroyPlan(String code) throws WebClientResponseException {
        ParameterizedTypeReference<Plan> localVarReturnType = new ParameterizedTypeReference<Plan>() {};
        return destroyPlanRequestCreation(code).bodyToMono(localVarReturnType);
    }

    /**
     * Delete a plan
     * This endpoint deletes a specific plan. Note that this plan could be associated with active subscriptions.
     * <p><b>200</b> - Plan deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance.
     * @return ResponseEntity&lt;Plan&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Plan>> destroyPlanWithHttpInfo(String code) throws WebClientResponseException {
        ParameterizedTypeReference<Plan> localVarReturnType = new ParameterizedTypeReference<Plan>() {};
        return destroyPlanRequestCreation(code).toEntity(localVarReturnType);
    }

    /**
     * Delete a plan
     * This endpoint deletes a specific plan. Note that this plan could be associated with active subscriptions.
     * <p><b>200</b> - Plan deleted
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec destroyPlanWithResponseSpec(String code) throws WebClientResponseException {
        return destroyPlanRequestCreation(code);
    }
    /**
     * List all plans
     * This endpoint retrieves all existing plans.
     * <p><b>200</b> - Plans
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return PlansPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findAllPlansRequestCreation(Integer page, Integer perPage) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<PlansPaginated> localVarReturnType = new ParameterizedTypeReference<PlansPaginated>() {};
        return apiClient.invokeAPI("/plans", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List all plans
     * This endpoint retrieves all existing plans.
     * <p><b>200</b> - Plans
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return PlansPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PlansPaginated> findAllPlans(Integer page, Integer perPage) throws WebClientResponseException {
        ParameterizedTypeReference<PlansPaginated> localVarReturnType = new ParameterizedTypeReference<PlansPaginated>() {};
        return findAllPlansRequestCreation(page, perPage).bodyToMono(localVarReturnType);
    }

    /**
     * List all plans
     * This endpoint retrieves all existing plans.
     * <p><b>200</b> - Plans
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return ResponseEntity&lt;PlansPaginated&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PlansPaginated>> findAllPlansWithHttpInfo(Integer page, Integer perPage) throws WebClientResponseException {
        ParameterizedTypeReference<PlansPaginated> localVarReturnType = new ParameterizedTypeReference<PlansPaginated>() {};
        return findAllPlansRequestCreation(page, perPage).toEntity(localVarReturnType);
    }

    /**
     * List all plans
     * This endpoint retrieves all existing plans.
     * <p><b>200</b> - Plans
     * <p><b>401</b> - Unauthorized error
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findAllPlansWithResponseSpec(Integer page, Integer perPage) throws WebClientResponseException {
        return findAllPlansRequestCreation(page, perPage);
    }
    /**
     * Retrieve a plan
     * This endpoint retrieves a specific plan.
     * <p><b>200</b> - Plan
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance.
     * @return Plan
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findPlanRequestCreation(String code) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new WebClientResponseException("Missing the required parameter 'code' when calling findPlan", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("code", code);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Plan> localVarReturnType = new ParameterizedTypeReference<Plan>() {};
        return apiClient.invokeAPI("/plans/{code}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve a plan
     * This endpoint retrieves a specific plan.
     * <p><b>200</b> - Plan
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance.
     * @return Plan
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Plan> findPlan(String code) throws WebClientResponseException {
        ParameterizedTypeReference<Plan> localVarReturnType = new ParameterizedTypeReference<Plan>() {};
        return findPlanRequestCreation(code).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve a plan
     * This endpoint retrieves a specific plan.
     * <p><b>200</b> - Plan
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance.
     * @return ResponseEntity&lt;Plan&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Plan>> findPlanWithHttpInfo(String code) throws WebClientResponseException {
        ParameterizedTypeReference<Plan> localVarReturnType = new ParameterizedTypeReference<Plan>() {};
        return findPlanRequestCreation(code).toEntity(localVarReturnType);
    }

    /**
     * Retrieve a plan
     * This endpoint retrieves a specific plan.
     * <p><b>200</b> - Plan
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param code The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findPlanWithResponseSpec(String code) throws WebClientResponseException {
        return findPlanRequestCreation(code);
    }
    /**
     * Update a plan
     * This endpoint updates a specific plan with subscription and usage-based charges. It supports flexible billing cadence (in-advance or in-arrears) and allows for both recurring and metered charges.
     * <p><b>200</b> - Plan updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param code The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance.
     * @param planUpdateInput Plan payload
     * @return Plan
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updatePlanRequestCreation(String code, PlanUpdateInput planUpdateInput) throws WebClientResponseException {
        Object postBody = planUpdateInput;
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new WebClientResponseException("Missing the required parameter 'code' when calling updatePlan", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'planUpdateInput' is set
        if (planUpdateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'planUpdateInput' when calling updatePlan", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("code", code);

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

        ParameterizedTypeReference<Plan> localVarReturnType = new ParameterizedTypeReference<Plan>() {};
        return apiClient.invokeAPI("/plans/{code}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a plan
     * This endpoint updates a specific plan with subscription and usage-based charges. It supports flexible billing cadence (in-advance or in-arrears) and allows for both recurring and metered charges.
     * <p><b>200</b> - Plan updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param code The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance.
     * @param planUpdateInput Plan payload
     * @return Plan
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Plan> updatePlan(String code, PlanUpdateInput planUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Plan> localVarReturnType = new ParameterizedTypeReference<Plan>() {};
        return updatePlanRequestCreation(code, planUpdateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Update a plan
     * This endpoint updates a specific plan with subscription and usage-based charges. It supports flexible billing cadence (in-advance or in-arrears) and allows for both recurring and metered charges.
     * <p><b>200</b> - Plan updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param code The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance.
     * @param planUpdateInput Plan payload
     * @return ResponseEntity&lt;Plan&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Plan>> updatePlanWithHttpInfo(String code, PlanUpdateInput planUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Plan> localVarReturnType = new ParameterizedTypeReference<Plan>() {};
        return updatePlanRequestCreation(code, planUpdateInput).toEntity(localVarReturnType);
    }

    /**
     * Update a plan
     * This endpoint updates a specific plan with subscription and usage-based charges. It supports flexible billing cadence (in-advance or in-arrears) and allows for both recurring and metered charges.
     * <p><b>200</b> - Plan updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param code The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance.
     * @param planUpdateInput Plan payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updatePlanWithResponseSpec(String code, PlanUpdateInput planUpdateInput) throws WebClientResponseException {
        return updatePlanRequestCreation(code, planUpdateInput);
    }
}
