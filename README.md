# openapi

<div align="left">
    <a href="https://speakeasyapi.dev/"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://opensource.org/licenses/MIT">
        <img src="https://img.shields.io/badge/License-MIT-blue.svg" style="width: 100px; height: 28px;" />
    </a>
</div>



<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'co.novu:co.novu.sdk:0.2.1'
```

Maven:
```xml
<dependency>
    <groupId>co.novu</groupId>
    <artifactId>co.novu.sdk</artifactId>
    <version>0.2.1</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Trigger Notification Event

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

            TriggerEventRequestDto req = TriggerEventRequestDto.builder()
                .name("workflow_identifier")
                .to(java.util.List.of(
                        To.of(TopicPayloadDto.builder()
                                .topicKey("topic_key")
                                .type(TopicPayloadDtoType.TOPIC)
                                .build())))
                .overrides(TriggerEventRequestDtoOverrides.builder()
                    .build())
                .payload(TriggerEventRequestDtoPayload.builder()
                    .build())
                .build();

            EventsControllerTriggerResponse res = sdk.events().trigger()
                .request(req)
                .call();

            if (res.triggerEventResponseDto().isPresent()) {
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
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [changes()](docs/sdks/changes/README.md)

* [apply](docs/sdks/changes/README.md#apply) - Apply change
* [applyBulk](docs/sdks/changes/README.md#applybulk) - Apply changes
* [count](docs/sdks/changes/README.md#count) - Get changes count
* [retrieve](docs/sdks/changes/README.md#retrieve) - Get changes

### [environments()](docs/sdks/environments/README.md)

* [list](docs/sdks/environments/README.md#list) - Get environments
* [retrieve](docs/sdks/environments/README.md#retrieve) - Get current environment

### [environments().apiKeys()](docs/sdks/apikeys/README.md)

* [list](docs/sdks/apikeys/README.md#list) - Get api keys
* [regenerate](docs/sdks/apikeys/README.md#regenerate) - Regenerate api keys

### [events()](docs/sdks/events/README.md)

* [cancel](docs/sdks/events/README.md#cancel) - Cancel triggered event
* [trigger](docs/sdks/events/README.md#trigger) - Trigger event
* [triggerBroadcast](docs/sdks/events/README.md#triggerbroadcast) - Broadcast event to all
* [triggerBulk](docs/sdks/events/README.md#triggerbulk) - Bulk trigger event

### [executionDetails()](docs/sdks/executiondetails/README.md)

* [retrieve](docs/sdks/executiondetails/README.md#retrieve) - Get execution details

### [feeds()](docs/sdks/feeds/README.md)

* [create](docs/sdks/feeds/README.md#create) - Create feed
* [delete](docs/sdks/feeds/README.md#delete) - Delete feed
* [retrieve](docs/sdks/feeds/README.md#retrieve) - Get feeds

### [integrations()](docs/sdks/integrations/README.md)

* [create](docs/sdks/integrations/README.md#create) - Create integration
* [delete](docs/sdks/integrations/README.md#delete) - Delete integration
* [list](docs/sdks/integrations/README.md#list) - Get integrations
* [listActive](docs/sdks/integrations/README.md#listactive) - Get active integrations
* [setAsPrimary](docs/sdks/integrations/README.md#setasprimary) - Set integration as primary
* [update](docs/sdks/integrations/README.md#update) - Update integration

### [integrations().webhooks()](docs/sdks/webhooks/README.md)

* [retrieve](docs/sdks/webhooks/README.md#retrieve) - Get webhook support status for provider

### [layouts()](docs/sdks/layouts/README.md)

* [create](docs/sdks/layouts/README.md#create) - Layout creation
* [delete](docs/sdks/layouts/README.md#delete) - Delete layout
* [list](docs/sdks/layouts/README.md#list) - Filter layouts
* [retrieve](docs/sdks/layouts/README.md#retrieve) - Get layout
* [setAsDefault](docs/sdks/layouts/README.md#setasdefault) - Set default layout
* [update](docs/sdks/layouts/README.md#update) - Update a layout

### [messages()](docs/sdks/messages/README.md)

* [delete](docs/sdks/messages/README.md#delete) - Delete message
* [deleteByTransactionId](docs/sdks/messages/README.md#deletebytransactionid) - Delete messages by transactionId
* [retrieve](docs/sdks/messages/README.md#retrieve) - Get messages

### [workflowGroups()](docs/sdks/workflowgroups/README.md)

* [create](docs/sdks/workflowgroups/README.md#create) - Create workflow group
* [delete](docs/sdks/workflowgroups/README.md#delete) - Delete workflow group
* [list](docs/sdks/workflowgroups/README.md#list) - Get workflow groups
* [retrieve](docs/sdks/workflowgroups/README.md#retrieve) - Get workflow group
* [update](docs/sdks/workflowgroups/README.md#update) - Update workflow group

### [notifications()](docs/sdks/notifications/README.md)

* [list](docs/sdks/notifications/README.md#list) - Get notifications
* [retrieve](docs/sdks/notifications/README.md#retrieve) - Get notification

### [notifications().stats()](docs/sdks/stats/README.md)

* [graph](docs/sdks/stats/README.md#graph) - Get notification graph statistics
* [retrieve](docs/sdks/stats/README.md#retrieve) - Get notification statistics

### [organizations()](docs/sdks/organizations/README.md)

* [create](docs/sdks/organizations/README.md#create) - Create an organization
* [list](docs/sdks/organizations/README.md#list) - Fetch all organizations
* [rename](docs/sdks/organizations/README.md#rename) - Rename organization name
* [retrieve](docs/sdks/organizations/README.md#retrieve) - Fetch current organization details

### [organizations().branding()](docs/sdks/branding/README.md)

* [update](docs/sdks/branding/README.md#update) - Update organization branding details

### [organizations().members()](docs/sdks/members/README.md)

* [delete](docs/sdks/members/README.md#delete) - Remove a member from organization using memberId
* [list](docs/sdks/members/README.md#list) - Fetch all members of current organizations

### [subscribers()](docs/sdks/subscribers/README.md)

* [create](docs/sdks/subscribers/README.md#create) - Create subscriber
* [createBulk](docs/sdks/subscribers/README.md#createbulk) - Bulk create subscribers
* [delete](docs/sdks/subscribers/README.md#delete) - Delete subscriber
* [list](docs/sdks/subscribers/README.md#list) - Get subscribers
* [retrieve](docs/sdks/subscribers/README.md#retrieve) - Get subscriber
* [update](docs/sdks/subscribers/README.md#update) - Update subscriber

### [subscribers().credentials()](docs/sdks/credentials/README.md)

* [append](docs/sdks/credentials/README.md#append) - Modify subscriber credentials
* [delete](docs/sdks/credentials/README.md#delete) - Delete subscriber credentials by providerId
* [update](docs/sdks/credentials/README.md#update) - Update subscriber credentials

### [subscribers().authentication()](docs/sdks/authentication/README.md)

* [chatAccessOauth](docs/sdks/authentication/README.md#chataccessoauth) - Handle chat oauth
* [chatAccessOauthCallBack](docs/sdks/authentication/README.md#chataccessoauthcallback) - Handle providers oauth redirect

### [subscribers().messages()](docs/sdks/novumessages/README.md)

* [markAll](docs/sdks/novumessages/README.md#markall) - Marks all the subscriber messages as read, unread, seen or unseen. Optionally you can pass feed id (or array) to mark messages of a particular feed.
* [markAllAs](docs/sdks/novumessages/README.md#markallas) - Mark a subscriber messages as seen, read, unseen or unread
* [updateAsSeen](docs/sdks/novumessages/README.md#updateasseen) - Mark message action as seen

### [subscribers().notifications()](docs/sdks/novunotifications/README.md)

* [retrieve](docs/sdks/novunotifications/README.md#retrieve) - Get in-app notification feed for a particular subscriber
* [unseenCount](docs/sdks/novunotifications/README.md#unseencount) - Get the unseen in-app notifications count for subscribers feed

### [subscribers().properties()](docs/sdks/properties/README.md)

* [updateOnlineFlag](docs/sdks/properties/README.md#updateonlineflag) - Update subscriber online status

### [subscribers().preferences()](docs/sdks/preferences/README.md)

* [list](docs/sdks/preferences/README.md#list) - Get subscriber preferences
* [retrieveByLevel](docs/sdks/preferences/README.md#retrievebylevel) - Get subscriber preferences by level
* [update](docs/sdks/preferences/README.md#update) - Update subscriber preference
* [updateGlobal](docs/sdks/preferences/README.md#updateglobal) - Update subscriber global preferences

### [tenants()](docs/sdks/tenants/README.md)

* [create](docs/sdks/tenants/README.md#create) - Create tenant
* [delete](docs/sdks/tenants/README.md#delete) - Delete tenant
* [list](docs/sdks/tenants/README.md#list) - Get tenants
* [retrieve](docs/sdks/tenants/README.md#retrieve) - Get tenant
* [update](docs/sdks/tenants/README.md#update) - Update tenant

### [topics()](docs/sdks/topics/README.md)

* [create](docs/sdks/topics/README.md#create) - Topic creation
* [delete](docs/sdks/topics/README.md#delete) - Delete topic
* [list](docs/sdks/topics/README.md#list) - Filter topics
* [rename](docs/sdks/topics/README.md#rename) - Rename a topic
* [retrieve](docs/sdks/topics/README.md#retrieve) - Get topic

### [topics().subscribers()](docs/sdks/novusubscribers/README.md)

* [assign](docs/sdks/novusubscribers/README.md#assign) - Subscribers addition
* [delete](docs/sdks/novusubscribers/README.md#delete) - Subscribers removal
* [retrieve](docs/sdks/novusubscribers/README.md#retrieve) - Check topic subscriber

### [workflows()](docs/sdks/workflows/README.md)

* [create](docs/sdks/workflows/README.md#create) - Create workflow
* [delete](docs/sdks/workflows/README.md#delete) - Delete workflow
* [list](docs/sdks/workflows/README.md#list) - Get workflows
* [retrieve](docs/sdks/workflows/README.md#retrieve) - Get workflow
* [update](docs/sdks/workflows/README.md#update) - Update workflow

### [workflows().variables()](docs/sdks/variables/README.md)

* [retrieve](docs/sdks/variables/README.md#retrieve) - Get available variables

### [workflows().status()](docs/sdks/status/README.md)

* [update](docs/sdks/status/README.md#update) - Update workflow status
<!-- End Available Resources and Operations [operations] -->

<!-- Start Pagination [pagination] -->
## Pagination

Some of the endpoints in this SDK support pagination. To use pagination, you make your SDK calls as usual, but the
returned response object will have a `next` method that can be called to pull down the next group of results. The `next`
function returns an `Optional` value, which `isPresent` until there are no more pages to be fetched.

Here's an example of one such pagination call:
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

            SubscribersControllerListSubscribersResponse res = sdk.subscribers().list()
                .page(7685.78d)
                .limit(10d)
                .call();

            while (true) {
                if (res.object().isPresent()) {
                    // handle response
                    Optional<SubscribersControllerListSubscribersResponse> nextRes = res.next();
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
<!-- End Pagination [pagination] -->

<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries. If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API. However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, you can provide a `RetryConfig` object through the `retryConfig` builder method:
```java
package hello.world;

import co.novu.co.novu.sdk.Novu;
import co.novu.co.novu.sdk.models.components.*;
import co.novu.co.novu.sdk.models.components.Security;
import co.novu.co.novu.sdk.models.operations.*;
import co.novu.co.novu.sdk.utils.BackoffStrategy;
import co.novu.co.novu.sdk.utils.EventStream;
import co.novu.co.novu.sdk.utils.RetryConfig;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Novu sdk = Novu.builder()
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            ChangesControllerApplyDiffResponse res = sdk.changes().apply()
                .retryConfig(RetryConfig.builder()
                                .backoff(BackoffStrategy.builder()
                                            .initialInterval(1L, TimeUnit.MILLISECONDS)
                                            .maxInterval(50L, TimeUnit.MILLISECONDS)
                                            .maxElapsedTime(1000L, TimeUnit.MILLISECONDS)
                                            .baseFactor(1.1)
                                            .jitterFactor(0.15)
                                            .retryConnectError(false)
                                            .build())
                                .build())
                .changeId("<value>")
                .call();

            if (res.changeResponseDtos().isPresent()) {
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

If you'd like to override the default retry strategy for all operations that support retries, you can provide a configuration at SDK initialization:
```java
package hello.world;

import co.novu.co.novu.sdk.Novu;
import co.novu.co.novu.sdk.models.components.*;
import co.novu.co.novu.sdk.models.components.Security;
import co.novu.co.novu.sdk.models.operations.*;
import co.novu.co.novu.sdk.utils.BackoffStrategy;
import co.novu.co.novu.sdk.utils.EventStream;
import co.novu.co.novu.sdk.utils.RetryConfig;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            Novu sdk = Novu.builder()
                .retryConfig(RetryConfig.builder()
                                .backoff(BackoffStrategy.builder()
                                            .initialInterval(1L, TimeUnit.MILLISECONDS)
                                            .maxInterval(50L, TimeUnit.MILLISECONDS)
                                            .maxElapsedTime(1000L, TimeUnit.MILLISECONDS)
                                            .baseFactor(1.1)
                                            .jitterFactor(0.15)
                                            .retryConnectError(false)
                                            .build())
                                .build())
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            ChangesControllerApplyDiffResponse res = sdk.changes().apply()
                .changeId("<value>")
                .call();

            if (res.changeResponseDtos().isPresent()) {
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
<!-- End Retries [retries] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations.  All operations return a response object or raise an error.  If Error objects are specified in your OpenAPI Spec, the SDK will throw the appropriate Exception type.

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

### Example

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

            ChangesControllerApplyDiffResponse res = sdk.changes().apply()
                .changeId("<value>")
                .call();

            if (res.changeResponseDtos().isPresent()) {
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
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIndex` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `https://api.novu.co` | None |
| 1 | `https://eu.api.novu.co` | None |

#### Example

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
                .serverIndex(1)
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            ChangesControllerApplyDiffResponse res = sdk.changes().apply()
                .changeId("<value>")
                .call();

            if (res.changeResponseDtos().isPresent()) {
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


### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverURL` builder method when initializing the SDK client instance. For example:
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
                .serverURL("https://api.novu.co")
                .apiKey("<YOUR_API_KEY_HERE>")
                .build();

            ChangesControllerApplyDiffResponse res = sdk.changes().apply()
                .changeId("<value>")
                .call();

            if (res.changeResponseDtos().isPresent()) {
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
<!-- End Server Selection [server] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name     | Type     | Scheme   |
| -------- | -------- | -------- |
| `apiKey` | apiKey   | API key  |

To authenticate with the API the `apiKey` parameter must be set when initializing the SDK client instance. For example:
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

            ChangesControllerApplyDiffResponse res = sdk.changes().apply()
                .changeId("<value>")
                .call();

            if (res.changeResponseDtos().isPresent()) {
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
<!-- End Authentication [security] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
