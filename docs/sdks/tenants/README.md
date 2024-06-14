# Tenants
(*tenants()*)

## Overview

A tenant represents a group of users. As a developer, when your apps have organizations, they are referred to as tenants. Tenants in Novu provides the ability to tailor specific notification experiences to users of different groups or organizations.

<https://docs.novu.co/tenants>
### Available Operations

* [create](#create) - Create tenant
* [delete](#delete) - Delete tenant
* [list](#list) - Get tenants
* [retrieve](#retrieve) - Get tenant
* [update](#update) - Update tenant

## create

Create tenant under the current environment

### Example Usage

```java
package hello.world;

import co.novu.co.novu.sdk.Novu;
import co.novu.co.novu.sdk.models.components.*;
import co.novu.co.novu.sdk.models.components.Security;
import co.novu.co.novu.sdk.models.operations.*;
import co.novu.co.novu.sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Novu sdk = Novu.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            CreateTenantRequestDto req = CreateTenantRequestDto.builder()
                .identifier("<value>")
                .name("<value>")
                .build();

            TenantControllerCreateTenantResponse res = sdk.tenants().create()
                .request(req)
                .call();

            if (res.createTenantResponseDto().isPresent()) {
                // handle response
            }
        } catch (co.novu.co.novu.sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [co.novu.co.novu.sdk.models.components.CreateTenantRequestDto](../../models/shared/CreateTenantRequestDto.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.TenantControllerCreateTenantResponse>](../../models/operations/TenantControllerCreateTenantResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## delete

Deletes a tenant entity from the Novu platform

### Example Usage

```java
package hello.world;

import co.novu.co.novu.sdk.Novu;
import co.novu.co.novu.sdk.models.components.*;
import co.novu.co.novu.sdk.models.components.Security;
import co.novu.co.novu.sdk.models.operations.*;
import co.novu.co.novu.sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Novu sdk = Novu.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            TenantControllerRemoveTenantResponse res = sdk.tenants().delete()
                .identifier("<value>")
                .call();

            // handle response
        } catch (co.novu.co.novu.sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `identifier`       | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.TenantControllerRemoveTenantResponse>](../../models/operations/TenantControllerRemoveTenantResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## list

Returns a list of tenants, could paginated using the `page` and `limit` query parameter

### Example Usage

```java
package hello.world;

import co.novu.co.novu.sdk.Novu;
import co.novu.co.novu.sdk.models.components.*;
import co.novu.co.novu.sdk.models.components.Security;
import co.novu.co.novu.sdk.models.operations.*;
import co.novu.co.novu.sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Novu sdk = Novu.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            TenantControllerListTenantsResponse res = sdk.tenants().list()
                .page(7685.78d)
                .limit(10d)
                .call();

            while (true) {
                if (res.object().isPresent()) {
                    // handle response
                    Optional<TenantControllerListTenantsResponse> nextRes = res.next();
                    if (nextRes.isPresent()) {
                        res = nextRes.get();
                    } else {
                        break;
                    }
                }
            }
        } catch (co.novu.co.novu.sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                    | Type                         | Required                     | Description                  |
| ---------------------------- | ---------------------------- | ---------------------------- | ---------------------------- |
| `page`                       | *Optional<? extends Double>* | :heavy_minus_sign:           | N/A                          |
| `limit`                      | *Optional<? extends Double>* | :heavy_minus_sign:           | N/A                          |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.TenantControllerListTenantsResponse>](../../models/operations/TenantControllerListTenantsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## retrieve

Get tenant by your internal id used to identify the tenant

### Example Usage

```java
package hello.world;

import co.novu.co.novu.sdk.Novu;
import co.novu.co.novu.sdk.models.components.*;
import co.novu.co.novu.sdk.models.components.Security;
import co.novu.co.novu.sdk.models.operations.*;
import co.novu.co.novu.sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Novu sdk = Novu.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            TenantControllerGetTenantByIdResponse res = sdk.tenants().retrieve()
                .identifier("<value>")
                .call();

            if (res.getTenantResponseDto().isPresent()) {
                // handle response
            }
        } catch (co.novu.co.novu.sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `identifier`       | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.TenantControllerGetTenantByIdResponse>](../../models/operations/TenantControllerGetTenantByIdResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## update

Update tenant by your internal id used to identify the tenant

### Example Usage

```java
package hello.world;

import co.novu.co.novu.sdk.Novu;
import co.novu.co.novu.sdk.models.components.*;
import co.novu.co.novu.sdk.models.components.Security;
import co.novu.co.novu.sdk.models.operations.*;
import co.novu.co.novu.sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Novu sdk = Novu.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            TenantControllerUpdateTenantResponse res = sdk.tenants().update()
                .identifier("<value>")
                .updateTenantRequestDto(UpdateTenantRequestDto.builder()
                    .build())
                .call();

            if (res.updateTenantResponseDto().isPresent()) {
                // handle response
            }
        } catch (co.novu.co.novu.sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `identifier`                                                                                                      | *String*                                                                                                          | :heavy_check_mark:                                                                                                | N/A                                                                                                               |
| `updateTenantRequestDto`                                                                                          | [co.novu.co.novu.sdk.models.components.UpdateTenantRequestDto](../../models/components/UpdateTenantRequestDto.md) | :heavy_check_mark:                                                                                                | N/A                                                                                                               |


### Response

**[Optional<? extends co.novu.co.novu.sdk.models.operations.TenantControllerUpdateTenantResponse>](../../models/operations/TenantControllerUpdateTenantResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
