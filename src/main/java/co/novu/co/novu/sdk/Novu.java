/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package co.novu.co.novu.sdk;

import co.novu.co.novu.sdk.models.operations.SDKMethodInterfaces.*;
import co.novu.co.novu.sdk.utils.HTTPClient;
import co.novu.co.novu.sdk.utils.Hook.AfterErrorContextImpl;
import co.novu.co.novu.sdk.utils.Hook.AfterSuccessContextImpl;
import co.novu.co.novu.sdk.utils.Hook.BeforeRequestContextImpl;
import co.novu.co.novu.sdk.utils.Retries.NonRetryableException;
import co.novu.co.novu.sdk.utils.RetryConfig;
import co.novu.co.novu.sdk.utils.SpeakeasyHTTPClient;
import co.novu.co.novu.sdk.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpRequest;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Novu API: Novu REST API. Please see https://docs.novu.co/api-reference for more details.
 * https://docs.novu.co - Novu Documentation
 */
public class Novu {


    /**
     * SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] SERVERS = {
        "https://api.novu.co",
        "https://eu.api.novu.co",
    };

    /**
     * Changes represent a change in state of an environment. They are analagous to a pending pull request in git, enabling you to test changes before they are applied to your environment and atomically apply them when you are ready.
     * https://docs.novu.co/platform/environments#promoting-pending-changes-to-production
     */
    private final Changes changes;

    /**
     * Novu uses the concept of environments to ensure logical separation of your data and configuration. This means that subscribers, and preferences created in one environment are never accessible to another.
     * https://docs.novu.co/platform/environments
     */
    private final Environments environments;

    /**
     * Events represent a change in state of a subscriber. They are used to trigger workflows, and enable you to send notifications to subscribers based on their actions.
     * https://docs.novu.co/workflows
     */
    private final Events events;

    /**
     * Execution details are used to track the execution of a workflow. They provided detailed information on the execution of a workflow, including the status of each step, the input and output of each step, and the overall status of the execution.
     * https://docs.novu.co/activity-feed
     */
    private final ExecutionDetails executionDetails;

    /**
     * Novu provides a notification activity feed that monitors every outgoing message associated with its relevant metadata. This can be used to monitor activity and discover potential issues with a specific provider or a channel type.
     * https://docs.novu.co/activity-feed
     */
    private final Feeds feeds;

    /**
     * With the help of the Integration Store, you can easily integrate your favorite delivery provider. During the runtime of the API, the Integrations Store is responsible for storing the configurations of all the providers.
     * https://docs.novu.co/channels-and-providers/integration-store
     */
    private final Integrations integrations;

    /**
     * Novu allows the creation of layouts - a specific HTML design or structure to wrap content of email notifications. Layouts can be manipulated and assigned to new or existing workflows within the Novu platform, allowing users to create, manage, and assign these layouts to workflows, so they can be reused to structure the appearance of notifications sent through the platform.
     * https://docs.novu.co/content-creation-design/layouts
     */
    private final Layouts layouts;

    /**
     * A message in Novu represents a notification delivered to a recipient on a particular channel. Messages contain information about the request that triggered its delivery, a view of the data sent to the recipient, and a timeline of its lifecycle events. Learn more about messages.
     * https://docs.novu.co/workflows/messages
     */
    private final Messages messages;

    /**
     * Workflow groups are used to organize workflows into logical groups.
     */
    private final WorkflowGroups workflowGroups;

    private final Notifications notifications;

    /**
     * An organization serves as a separate entity within your Novu account. Each organization you create has its own separate integration store, workflows, subscribers, and API keys. This separation of resources allows you to manage multi-tenant environments and separate domains within a single account.
     * https://docs.novu.co/platform/organizations
     */
    private final Organizations organizations;

    /**
     * A subscriber in Novu represents someone who should receive a message. A subscriber’s profile information contains important attributes about the subscriber that will be used in messages (name, email). The subscriber object can contain other key-value pairs that can be used to further personalize your messages.
     * https://docs.novu.co/subscribers/subscribers
     */
    private final Subscribers subscribers;

    /**
     * A tenant represents a group of users. As a developer, when your apps have organizations, they are referred to as tenants. Tenants in Novu provides the ability to tailor specific notification experiences to users of different groups or organizations.
     * https://docs.novu.co/tenants
     */
    private final Tenants tenants;

    /**
     * Topics are a way to group subscribers together so that they can be notified of events at once. A topic is identified by a custom key. This can be helpful for things like sending out marketing emails or notifying users of new features. Topics can also be used to send notifications to the subscribers who have been grouped together based on their interests, location, activities and much more.
     * https://docs.novu.co/subscribers/topics
     */
    private final Topics topics;

    /**
     * All notifications are sent via a workflow. Each workflow acts as a container for the logic and blueprint that are associated with a type of notification in your system.
     * https://docs.novu.co/workflows
     */
    private final Workflows workflows;

    /**
     * Changes represent a change in state of an environment. They are analagous to a pending pull request in git, enabling you to test changes before they are applied to your environment and atomically apply them when you are ready.
     * https://docs.novu.co/platform/environments#promoting-pending-changes-to-production
     */
    public Changes changes() {
        return changes;
    }

    /**
     * Novu uses the concept of environments to ensure logical separation of your data and configuration. This means that subscribers, and preferences created in one environment are never accessible to another.
     * https://docs.novu.co/platform/environments
     */
    public Environments environments() {
        return environments;
    }

    /**
     * Events represent a change in state of a subscriber. They are used to trigger workflows, and enable you to send notifications to subscribers based on their actions.
     * https://docs.novu.co/workflows
     */
    public Events events() {
        return events;
    }

    /**
     * Execution details are used to track the execution of a workflow. They provided detailed information on the execution of a workflow, including the status of each step, the input and output of each step, and the overall status of the execution.
     * https://docs.novu.co/activity-feed
     */
    public ExecutionDetails executionDetails() {
        return executionDetails;
    }

    /**
     * Novu provides a notification activity feed that monitors every outgoing message associated with its relevant metadata. This can be used to monitor activity and discover potential issues with a specific provider or a channel type.
     * https://docs.novu.co/activity-feed
     */
    public Feeds feeds() {
        return feeds;
    }

    /**
     * With the help of the Integration Store, you can easily integrate your favorite delivery provider. During the runtime of the API, the Integrations Store is responsible for storing the configurations of all the providers.
     * https://docs.novu.co/channels-and-providers/integration-store
     */
    public Integrations integrations() {
        return integrations;
    }

    /**
     * Novu allows the creation of layouts - a specific HTML design or structure to wrap content of email notifications. Layouts can be manipulated and assigned to new or existing workflows within the Novu platform, allowing users to create, manage, and assign these layouts to workflows, so they can be reused to structure the appearance of notifications sent through the platform.
     * https://docs.novu.co/content-creation-design/layouts
     */
    public Layouts layouts() {
        return layouts;
    }

    /**
     * A message in Novu represents a notification delivered to a recipient on a particular channel. Messages contain information about the request that triggered its delivery, a view of the data sent to the recipient, and a timeline of its lifecycle events. Learn more about messages.
     * https://docs.novu.co/workflows/messages
     */
    public Messages messages() {
        return messages;
    }

    /**
     * Workflow groups are used to organize workflows into logical groups.
     */
    public WorkflowGroups workflowGroups() {
        return workflowGroups;
    }

    public Notifications notifications() {
        return notifications;
    }

    /**
     * An organization serves as a separate entity within your Novu account. Each organization you create has its own separate integration store, workflows, subscribers, and API keys. This separation of resources allows you to manage multi-tenant environments and separate domains within a single account.
     * https://docs.novu.co/platform/organizations
     */
    public Organizations organizations() {
        return organizations;
    }

    /**
     * A subscriber in Novu represents someone who should receive a message. A subscriber’s profile information contains important attributes about the subscriber that will be used in messages (name, email). The subscriber object can contain other key-value pairs that can be used to further personalize your messages.
     * https://docs.novu.co/subscribers/subscribers
     */
    public Subscribers subscribers() {
        return subscribers;
    }

    /**
     * A tenant represents a group of users. As a developer, when your apps have organizations, they are referred to as tenants. Tenants in Novu provides the ability to tailor specific notification experiences to users of different groups or organizations.
     * https://docs.novu.co/tenants
     */
    public Tenants tenants() {
        return tenants;
    }

    /**
     * Topics are a way to group subscribers together so that they can be notified of events at once. A topic is identified by a custom key. This can be helpful for things like sending out marketing emails or notifying users of new features. Topics can also be used to send notifications to the subscribers who have been grouped together based on their interests, location, activities and much more.
     * https://docs.novu.co/subscribers/topics
     */
    public Topics topics() {
        return topics;
    }

    /**
     * All notifications are sent via a workflow. Each workflow acts as a container for the logic and blueprint that are associated with a type of notification in your system.
     * https://docs.novu.co/workflows
     */
    public Workflows workflows() {
        return workflows;
    }

    private final SDKConfiguration sdkConfiguration;

    /**
     * The Builder class allows the configuration of a new instance of the SDK.
     */
    public static class Builder {

        private final SDKConfiguration sdkConfiguration = new SDKConfiguration();

        private Builder() {
        }

        /**
         * Allows the default HTTP client to be overridden with a custom implementation.
         *
         * @param client The HTTP client to use for all requests.
         * @return The builder instance.
         */
        public Builder client(HTTPClient client) {
            this.sdkConfiguration.defaultClient = client;
            return this;
        }
        /**
         * Configures the SDK security to use the provided secret.
         *
         * @param apiKey The secret to use for all requests.
         * @return The builder instance.
         */
        public Builder apiKey(String apiKey) {
            this.sdkConfiguration.securitySource = SecuritySource.of(co.novu.co.novu.sdk.models.components.Security.builder()
              .apiKey(apiKey)
              .build());
            return this;
        }

        /**
         * Configures the SDK to use a custom security source.
         * @param securitySource The security source to use for all requests.
         * @return The builder instance.
         */
        public Builder securitySource(SecuritySource securitySource) {
            this.sdkConfiguration.securitySource = securitySource;
            return this;
        }
        
        /**
         * Overrides the default server URL.
         *
         * @param serverUrl The server URL to use for all requests.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl) {
            this.sdkConfiguration.serverUrl = serverUrl;
            return this;
        }

        /**
         * Overrides the default server URL  with a templated URL populated with the provided parameters.
         *
         * @param serverUrl The server URL to use for all requests.
         * @param params The parameters to use when templating the URL.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl, java.util.Map<String, String> params) {
            this.sdkConfiguration.serverUrl = co.novu.co.novu.sdk.utils.Utils.templateUrl(serverUrl, params);
            return this;
        }
        
        /**
         * Overrides the default server by index.
         *
         * @param serverIdx The server to use for all requests.
         * @return The builder instance.
         */
        public Builder serverIndex(int serverIdx) {
            this.sdkConfiguration.serverIdx = serverIdx;
            this.sdkConfiguration.serverUrl = SERVERS[serverIdx];
            return this;
        }
        
        /**
         * Overrides the default configuration for retries
         *
         * @param retryConfig The retry configuration to use for all requests.
         * @return The builder instance.
         */
        public Builder retryConfig(RetryConfig retryConfig) {
            this.sdkConfiguration.retryConfig = Optional.of(retryConfig);
            return this;
        }
        // Visible for testing, will be accessed via reflection
        void _hooks(co.novu.co.novu.sdk.utils.Hooks hooks) {
            sdkConfiguration.setHooks(hooks);    
        }
        
        /**
         * Builds a new instance of the SDK.
         * @return The SDK instance.
         */
        public Novu build() {
            if (sdkConfiguration.defaultClient == null) {
                sdkConfiguration.defaultClient = new SpeakeasyHTTPClient();
            }
	        if (sdkConfiguration.securitySource == null) {
	    	    sdkConfiguration.securitySource = SecuritySource.of(null);
	        }
            if (sdkConfiguration.serverUrl == null || sdkConfiguration.serverUrl.isBlank()) {
                sdkConfiguration.serverUrl = SERVERS[0];
                sdkConfiguration.serverIdx = 0;
            }
            if (sdkConfiguration.serverUrl.endsWith("/")) {
                sdkConfiguration.serverUrl = sdkConfiguration.serverUrl.substring(0, sdkConfiguration.serverUrl.length() - 1);
            }
            return new Novu(sdkConfiguration);
        }
    }
    
    /**
     * Get a new instance of the SDK builder to configure a new instance of the SDK.
     * @return The SDK builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    private Novu(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.changes = new Changes(sdkConfiguration);
        this.environments = new Environments(sdkConfiguration);
        this.events = new Events(sdkConfiguration);
        this.executionDetails = new ExecutionDetails(sdkConfiguration);
        this.feeds = new Feeds(sdkConfiguration);
        this.integrations = new Integrations(sdkConfiguration);
        this.layouts = new Layouts(sdkConfiguration);
        this.messages = new Messages(sdkConfiguration);
        this.workflowGroups = new WorkflowGroups(sdkConfiguration);
        this.notifications = new Notifications(sdkConfiguration);
        this.organizations = new Organizations(sdkConfiguration);
        this.subscribers = new Subscribers(sdkConfiguration);
        this.tenants = new Tenants(sdkConfiguration);
        this.topics = new Topics(sdkConfiguration);
        this.workflows = new Workflows(sdkConfiguration);
        this.sdkConfiguration.initialize();
    }}
