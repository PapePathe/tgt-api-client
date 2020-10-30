# MtiersApi

All URIs are relative to *http://51.158.117.181:3000/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiElevesV1MetiersIdGet**](MtiersApi.md#apiElevesV1MetiersIdGet) | **GET** /api/eleves/v1/metiers/{id} | Détails Métier
[**apiElevesV1SecteursGet**](MtiersApi.md#apiElevesV1SecteursGet) | **GET** /api/eleves/v1/secteurs | Liste  des secteurs d&#x27;activité avec 3 métiers
[**apiElevesV1SecteursIdGet**](MtiersApi.md#apiElevesV1SecteursIdGet) | **GET** /api/eleves/v1/secteurs/{id} | Détails d&#x27;un secteur d&#x27;activité

<a name="apiElevesV1MetiersIdGet"></a>
# **apiElevesV1MetiersIdGet**
> DetailsMetier apiElevesV1MetiersIdGet(id)

Détails Métier

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MtiersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MtiersApi apiInstance = new MtiersApi();
String id = "id_example"; // String | L'identifiant du métier
try {
    DetailsMetier result = apiInstance.apiElevesV1MetiersIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MtiersApi#apiElevesV1MetiersIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| L&#x27;identifiant du métier |

### Return type

[**DetailsMetier**](DetailsMetier.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiElevesV1SecteursGet"></a>
# **apiElevesV1SecteursGet**
> ListeSecteurs apiElevesV1SecteursGet()

Liste  des secteurs d&#x27;activité avec 3 métiers

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MtiersApi;


MtiersApi apiInstance = new MtiersApi();
try {
    ListeSecteurs result = apiInstance.apiElevesV1SecteursGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MtiersApi#apiElevesV1SecteursGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListeSecteurs**](ListeSecteurs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiElevesV1SecteursIdGet"></a>
# **apiElevesV1SecteursIdGet**
> DetailsSecteur apiElevesV1SecteursIdGet(id)

Détails d&#x27;un secteur d&#x27;activité

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MtiersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MtiersApi apiInstance = new MtiersApi();
Integer id = 56; // Integer | Identifiant de la section
try {
    DetailsSecteur result = apiInstance.apiElevesV1SecteursIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MtiersApi#apiElevesV1SecteursIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Identifiant de la section |

### Return type

[**DetailsSecteur**](DetailsSecteur.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

