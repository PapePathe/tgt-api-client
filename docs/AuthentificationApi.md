# AuthentificationApi

All URIs are relative to *http://51.158.117.181:3000/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiElevesV1EnregistrementsPost**](AuthentificationApi.md#apiElevesV1EnregistrementsPost) | **POST** /api/eleves/v1/enregistrements | Eenregistrement d&#x27;un étudiant
[**apiElevesV1SessionsPost**](AuthentificationApi.md#apiElevesV1SessionsPost) | **POST** /api/eleves/v1/sessions | Connecte un étudiant à l&#x27;api taag

<a name="apiElevesV1EnregistrementsPost"></a>
# **apiElevesV1EnregistrementsPost**
> apiElevesV1EnregistrementsPost(body)

Eenregistrement d&#x27;un étudiant

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthentificationApi;


AuthentificationApi apiInstance = new AuthentificationApi();
ReqInscription body = new ReqInscription(); // ReqInscription | Optional description in *Markdown*
try {
    apiInstance.apiElevesV1EnregistrementsPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthentificationApi#apiElevesV1EnregistrementsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReqInscription**](ReqInscription.md)| Optional description in *Markdown* |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="apiElevesV1SessionsPost"></a>
# **apiElevesV1SessionsPost**
> apiElevesV1SessionsPost(body)

Connecte un étudiant à l&#x27;api taag

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthentificationApi;


AuthentificationApi apiInstance = new AuthentificationApi();
ReqConnexion body = new ReqConnexion(); // ReqConnexion | Corps de la requête pour l'authentification
try {
    apiInstance.apiElevesV1SessionsPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthentificationApi#apiElevesV1SessionsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReqConnexion**](ReqConnexion.md)| Corps de la requête pour l&#x27;authentification |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

