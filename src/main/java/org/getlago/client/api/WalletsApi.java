package org.getlago.client.api;

import org.getlago.client.ApiClient;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotAllowed;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import java.util.UUID;
import org.openapitools.client.model.Wallet;
import org.openapitools.client.model.WalletCreateInput;
import org.openapitools.client.model.WalletTransactionCreateInput;
import org.openapitools.client.model.WalletTransactions;
import org.openapitools.client.model.WalletTransactionsPaginated;
import org.openapitools.client.model.WalletUpdateInput;
import org.openapitools.client.model.WalletsPaginated;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T15:04:44.084574Z[Etc/UTC]")
public class WalletsApi {
    private ApiClient apiClient;

    public WalletsApi() {
        this(new ApiClient());
    }

    @Autowired
    public WalletsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a wallet
     * This endpoint is used to create a wallet with prepaid credits.
     * <p><b>200</b> - Wallet created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param walletCreateInput Wallet payload
     * @return Wallet
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createWalletRequestCreation(WalletCreateInput walletCreateInput) throws WebClientResponseException {
        Object postBody = walletCreateInput;
        // verify the required parameter 'walletCreateInput' is set
        if (walletCreateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'walletCreateInput' when calling createWallet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Wallet> localVarReturnType = new ParameterizedTypeReference<Wallet>() {};
        return apiClient.invokeAPI("/wallets", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a wallet
     * This endpoint is used to create a wallet with prepaid credits.
     * <p><b>200</b> - Wallet created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param walletCreateInput Wallet payload
     * @return Wallet
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Wallet> createWallet(WalletCreateInput walletCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Wallet> localVarReturnType = new ParameterizedTypeReference<Wallet>() {};
        return createWalletRequestCreation(walletCreateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Create a wallet
     * This endpoint is used to create a wallet with prepaid credits.
     * <p><b>200</b> - Wallet created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param walletCreateInput Wallet payload
     * @return ResponseEntity&lt;Wallet&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Wallet>> createWalletWithHttpInfo(WalletCreateInput walletCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Wallet> localVarReturnType = new ParameterizedTypeReference<Wallet>() {};
        return createWalletRequestCreation(walletCreateInput).toEntity(localVarReturnType);
    }

    /**
     * Create a wallet
     * This endpoint is used to create a wallet with prepaid credits.
     * <p><b>200</b> - Wallet created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param walletCreateInput Wallet payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createWalletWithResponseSpec(WalletCreateInput walletCreateInput) throws WebClientResponseException {
        return createWalletRequestCreation(walletCreateInput);
    }
    /**
     * Top up a wallet
     * This endpoint is used to top-up an active wallet.
     * <p><b>200</b> - Wallet transaction created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param walletTransactionCreateInput Wallet transaction payload
     * @return WalletTransactions
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createWalletTransactionRequestCreation(WalletTransactionCreateInput walletTransactionCreateInput) throws WebClientResponseException {
        Object postBody = walletTransactionCreateInput;
        // verify the required parameter 'walletTransactionCreateInput' is set
        if (walletTransactionCreateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'walletTransactionCreateInput' when calling createWalletTransaction", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<WalletTransactions> localVarReturnType = new ParameterizedTypeReference<WalletTransactions>() {};
        return apiClient.invokeAPI("/wallet_transactions", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Top up a wallet
     * This endpoint is used to top-up an active wallet.
     * <p><b>200</b> - Wallet transaction created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param walletTransactionCreateInput Wallet transaction payload
     * @return WalletTransactions
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<WalletTransactions> createWalletTransaction(WalletTransactionCreateInput walletTransactionCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<WalletTransactions> localVarReturnType = new ParameterizedTypeReference<WalletTransactions>() {};
        return createWalletTransactionRequestCreation(walletTransactionCreateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Top up a wallet
     * This endpoint is used to top-up an active wallet.
     * <p><b>200</b> - Wallet transaction created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param walletTransactionCreateInput Wallet transaction payload
     * @return ResponseEntity&lt;WalletTransactions&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<WalletTransactions>> createWalletTransactionWithHttpInfo(WalletTransactionCreateInput walletTransactionCreateInput) throws WebClientResponseException {
        ParameterizedTypeReference<WalletTransactions> localVarReturnType = new ParameterizedTypeReference<WalletTransactions>() {};
        return createWalletTransactionRequestCreation(walletTransactionCreateInput).toEntity(localVarReturnType);
    }

    /**
     * Top up a wallet
     * This endpoint is used to top-up an active wallet.
     * <p><b>200</b> - Wallet transaction created
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>422</b> - Unprocessable entity error
     * @param walletTransactionCreateInput Wallet transaction payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createWalletTransactionWithResponseSpec(WalletTransactionCreateInput walletTransactionCreateInput) throws WebClientResponseException {
        return createWalletTransactionRequestCreation(walletTransactionCreateInput);
    }
    /**
     * Terminate a wallet
     * This endpoint is used to terminate an existing wallet with prepaid credits.
     * <p><b>200</b> - Wallet terminated
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>405</b> - Not Allowed error
     * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet’s record within the Lago system.
     * @return Wallet
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec destroyWalletRequestCreation(UUID lagoId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lagoId' is set
        if (lagoId == null) {
            throw new WebClientResponseException("Missing the required parameter 'lagoId' when calling destroyWallet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lago_id", lagoId);

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

        ParameterizedTypeReference<Wallet> localVarReturnType = new ParameterizedTypeReference<Wallet>() {};
        return apiClient.invokeAPI("/wallets/{lago_id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Terminate a wallet
     * This endpoint is used to terminate an existing wallet with prepaid credits.
     * <p><b>200</b> - Wallet terminated
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>405</b> - Not Allowed error
     * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet’s record within the Lago system.
     * @return Wallet
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Wallet> destroyWallet(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<Wallet> localVarReturnType = new ParameterizedTypeReference<Wallet>() {};
        return destroyWalletRequestCreation(lagoId).bodyToMono(localVarReturnType);
    }

    /**
     * Terminate a wallet
     * This endpoint is used to terminate an existing wallet with prepaid credits.
     * <p><b>200</b> - Wallet terminated
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>405</b> - Not Allowed error
     * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet’s record within the Lago system.
     * @return ResponseEntity&lt;Wallet&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Wallet>> destroyWalletWithHttpInfo(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<Wallet> localVarReturnType = new ParameterizedTypeReference<Wallet>() {};
        return destroyWalletRequestCreation(lagoId).toEntity(localVarReturnType);
    }

    /**
     * Terminate a wallet
     * This endpoint is used to terminate an existing wallet with prepaid credits.
     * <p><b>200</b> - Wallet terminated
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>405</b> - Not Allowed error
     * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet’s record within the Lago system.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec destroyWalletWithResponseSpec(UUID lagoId) throws WebClientResponseException {
        return destroyWalletRequestCreation(lagoId);
    }
    /**
     * List all wallet transactions
     * This endpoint is used to list all wallet transactions.
     * <p><b>200</b> - Wallet transactions
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet’s record within the Lago system.
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param status The status of the wallet transaction. Possible values are &#x60;pending&#x60; or &#x60;settled&#x60;.
     * @param transactionType The transaction type of the wallet transaction. Possible values are &#x60;inbound&#x60; (increasing the wallet balance) or &#x60;outbound&#x60; (decreasing the wallet balance).
     * @return WalletTransactionsPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findAllWalletTransactionsRequestCreation(UUID lagoId, Integer page, Integer perPage, String status, String transactionType) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lagoId' is set
        if (lagoId == null) {
            throw new WebClientResponseException("Missing the required parameter 'lagoId' when calling findAllWalletTransactions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lago_id", lagoId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "transaction_type", transactionType));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<WalletTransactionsPaginated> localVarReturnType = new ParameterizedTypeReference<WalletTransactionsPaginated>() {};
        return apiClient.invokeAPI("/wallets/{lago_id}/wallet_transactions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List all wallet transactions
     * This endpoint is used to list all wallet transactions.
     * <p><b>200</b> - Wallet transactions
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet’s record within the Lago system.
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param status The status of the wallet transaction. Possible values are &#x60;pending&#x60; or &#x60;settled&#x60;.
     * @param transactionType The transaction type of the wallet transaction. Possible values are &#x60;inbound&#x60; (increasing the wallet balance) or &#x60;outbound&#x60; (decreasing the wallet balance).
     * @return WalletTransactionsPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<WalletTransactionsPaginated> findAllWalletTransactions(UUID lagoId, Integer page, Integer perPage, String status, String transactionType) throws WebClientResponseException {
        ParameterizedTypeReference<WalletTransactionsPaginated> localVarReturnType = new ParameterizedTypeReference<WalletTransactionsPaginated>() {};
        return findAllWalletTransactionsRequestCreation(lagoId, page, perPage, status, transactionType).bodyToMono(localVarReturnType);
    }

    /**
     * List all wallet transactions
     * This endpoint is used to list all wallet transactions.
     * <p><b>200</b> - Wallet transactions
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet’s record within the Lago system.
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param status The status of the wallet transaction. Possible values are &#x60;pending&#x60; or &#x60;settled&#x60;.
     * @param transactionType The transaction type of the wallet transaction. Possible values are &#x60;inbound&#x60; (increasing the wallet balance) or &#x60;outbound&#x60; (decreasing the wallet balance).
     * @return ResponseEntity&lt;WalletTransactionsPaginated&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<WalletTransactionsPaginated>> findAllWalletTransactionsWithHttpInfo(UUID lagoId, Integer page, Integer perPage, String status, String transactionType) throws WebClientResponseException {
        ParameterizedTypeReference<WalletTransactionsPaginated> localVarReturnType = new ParameterizedTypeReference<WalletTransactionsPaginated>() {};
        return findAllWalletTransactionsRequestCreation(lagoId, page, perPage, status, transactionType).toEntity(localVarReturnType);
    }

    /**
     * List all wallet transactions
     * This endpoint is used to list all wallet transactions.
     * <p><b>200</b> - Wallet transactions
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet’s record within the Lago system.
     * @param page Page number.
     * @param perPage Number of records per page.
     * @param status The status of the wallet transaction. Possible values are &#x60;pending&#x60; or &#x60;settled&#x60;.
     * @param transactionType The transaction type of the wallet transaction. Possible values are &#x60;inbound&#x60; (increasing the wallet balance) or &#x60;outbound&#x60; (decreasing the wallet balance).
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findAllWalletTransactionsWithResponseSpec(UUID lagoId, Integer page, Integer perPage, String status, String transactionType) throws WebClientResponseException {
        return findAllWalletTransactionsRequestCreation(lagoId, page, perPage, status, transactionType);
    }
    /**
     * List all wallets
     * This endpoint is used to list all wallets with prepaid credits.
     * <p><b>200</b> - Wallets
     * <p><b>401</b> - Unauthorized error
     * @param externalCustomerId The customer external unique identifier (provided by your own application).
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return WalletsPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findAllWalletsRequestCreation(String externalCustomerId, Integer page, Integer perPage) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'externalCustomerId' is set
        if (externalCustomerId == null) {
            throw new WebClientResponseException("Missing the required parameter 'externalCustomerId' when calling findAllWallets", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "external_customer_id", externalCustomerId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<WalletsPaginated> localVarReturnType = new ParameterizedTypeReference<WalletsPaginated>() {};
        return apiClient.invokeAPI("/wallets", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List all wallets
     * This endpoint is used to list all wallets with prepaid credits.
     * <p><b>200</b> - Wallets
     * <p><b>401</b> - Unauthorized error
     * @param externalCustomerId The customer external unique identifier (provided by your own application).
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return WalletsPaginated
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<WalletsPaginated> findAllWallets(String externalCustomerId, Integer page, Integer perPage) throws WebClientResponseException {
        ParameterizedTypeReference<WalletsPaginated> localVarReturnType = new ParameterizedTypeReference<WalletsPaginated>() {};
        return findAllWalletsRequestCreation(externalCustomerId, page, perPage).bodyToMono(localVarReturnType);
    }

    /**
     * List all wallets
     * This endpoint is used to list all wallets with prepaid credits.
     * <p><b>200</b> - Wallets
     * <p><b>401</b> - Unauthorized error
     * @param externalCustomerId The customer external unique identifier (provided by your own application).
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return ResponseEntity&lt;WalletsPaginated&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<WalletsPaginated>> findAllWalletsWithHttpInfo(String externalCustomerId, Integer page, Integer perPage) throws WebClientResponseException {
        ParameterizedTypeReference<WalletsPaginated> localVarReturnType = new ParameterizedTypeReference<WalletsPaginated>() {};
        return findAllWalletsRequestCreation(externalCustomerId, page, perPage).toEntity(localVarReturnType);
    }

    /**
     * List all wallets
     * This endpoint is used to list all wallets with prepaid credits.
     * <p><b>200</b> - Wallets
     * <p><b>401</b> - Unauthorized error
     * @param externalCustomerId The customer external unique identifier (provided by your own application).
     * @param page Page number.
     * @param perPage Number of records per page.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findAllWalletsWithResponseSpec(String externalCustomerId, Integer page, Integer perPage) throws WebClientResponseException {
        return findAllWalletsRequestCreation(externalCustomerId, page, perPage);
    }
    /**
     * Retrieve a wallet
     * This endpoint is used to retrieve an existing wallet with prepaid credits.
     * <p><b>200</b> - Wallet
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet’s record within the Lago system.
     * @return Wallet
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findWalletRequestCreation(UUID lagoId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lagoId' is set
        if (lagoId == null) {
            throw new WebClientResponseException("Missing the required parameter 'lagoId' when calling findWallet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lago_id", lagoId);

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

        ParameterizedTypeReference<Wallet> localVarReturnType = new ParameterizedTypeReference<Wallet>() {};
        return apiClient.invokeAPI("/wallets/{lago_id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve a wallet
     * This endpoint is used to retrieve an existing wallet with prepaid credits.
     * <p><b>200</b> - Wallet
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet’s record within the Lago system.
     * @return Wallet
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Wallet> findWallet(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<Wallet> localVarReturnType = new ParameterizedTypeReference<Wallet>() {};
        return findWalletRequestCreation(lagoId).bodyToMono(localVarReturnType);
    }

    /**
     * Retrieve a wallet
     * This endpoint is used to retrieve an existing wallet with prepaid credits.
     * <p><b>200</b> - Wallet
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet’s record within the Lago system.
     * @return ResponseEntity&lt;Wallet&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Wallet>> findWalletWithHttpInfo(UUID lagoId) throws WebClientResponseException {
        ParameterizedTypeReference<Wallet> localVarReturnType = new ParameterizedTypeReference<Wallet>() {};
        return findWalletRequestCreation(lagoId).toEntity(localVarReturnType);
    }

    /**
     * Retrieve a wallet
     * This endpoint is used to retrieve an existing wallet with prepaid credits.
     * <p><b>200</b> - Wallet
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet’s record within the Lago system.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findWalletWithResponseSpec(UUID lagoId) throws WebClientResponseException {
        return findWalletRequestCreation(lagoId);
    }
    /**
     * Update a wallet
     * This endpoint is used to update an existing wallet with prepaid credits.
     * <p><b>200</b> - Wallet updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet’s record within the Lago system.
     * @param walletUpdateInput Wallet update payload
     * @return Wallet
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateWalletRequestCreation(UUID lagoId, WalletUpdateInput walletUpdateInput) throws WebClientResponseException {
        Object postBody = walletUpdateInput;
        // verify the required parameter 'lagoId' is set
        if (lagoId == null) {
            throw new WebClientResponseException("Missing the required parameter 'lagoId' when calling updateWallet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'walletUpdateInput' is set
        if (walletUpdateInput == null) {
            throw new WebClientResponseException("Missing the required parameter 'walletUpdateInput' when calling updateWallet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lago_id", lagoId);

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

        ParameterizedTypeReference<Wallet> localVarReturnType = new ParameterizedTypeReference<Wallet>() {};
        return apiClient.invokeAPI("/wallets/{lago_id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a wallet
     * This endpoint is used to update an existing wallet with prepaid credits.
     * <p><b>200</b> - Wallet updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet’s record within the Lago system.
     * @param walletUpdateInput Wallet update payload
     * @return Wallet
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Wallet> updateWallet(UUID lagoId, WalletUpdateInput walletUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Wallet> localVarReturnType = new ParameterizedTypeReference<Wallet>() {};
        return updateWalletRequestCreation(lagoId, walletUpdateInput).bodyToMono(localVarReturnType);
    }

    /**
     * Update a wallet
     * This endpoint is used to update an existing wallet with prepaid credits.
     * <p><b>200</b> - Wallet updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet’s record within the Lago system.
     * @param walletUpdateInput Wallet update payload
     * @return ResponseEntity&lt;Wallet&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Wallet>> updateWalletWithHttpInfo(UUID lagoId, WalletUpdateInput walletUpdateInput) throws WebClientResponseException {
        ParameterizedTypeReference<Wallet> localVarReturnType = new ParameterizedTypeReference<Wallet>() {};
        return updateWalletRequestCreation(lagoId, walletUpdateInput).toEntity(localVarReturnType);
    }

    /**
     * Update a wallet
     * This endpoint is used to update an existing wallet with prepaid credits.
     * <p><b>200</b> - Wallet updated
     * <p><b>400</b> - Bad Request error
     * <p><b>401</b> - Unauthorized error
     * <p><b>404</b> - Not Found error
     * <p><b>422</b> - Unprocessable entity error
     * @param lagoId Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet’s record within the Lago system.
     * @param walletUpdateInput Wallet update payload
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateWalletWithResponseSpec(UUID lagoId, WalletUpdateInput walletUpdateInput) throws WebClientResponseException {
        return updateWalletRequestCreation(lagoId, walletUpdateInput);
    }
}
