/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package co.novu.co.novu.sdk.models.operations;

import co.novu.co.novu.sdk.utils.LazySingletonValue;
import co.novu.co.novu.sdk.utils.SpeakeasyMetadata;
import co.novu.co.novu.sdk.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class WorkflowControllerListWorkflowsRequest {

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    private Optional<? extends Double> page;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<? extends Double> limit;

    /**
     * A query string to filter the results. It allows filtering based on either the name or trigger identifier of the workflow items.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=query")
    private Optional<? extends String> query;

    @JsonCreator
    public WorkflowControllerListWorkflowsRequest(
            Optional<? extends Double> page,
            Optional<? extends Double> limit,
            Optional<? extends String> query) {
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(query, "query");
        this.page = page;
        this.limit = limit;
        this.query = query;
    }
    
    public WorkflowControllerListWorkflowsRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> page() {
        return (Optional<Double>) page;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> limit() {
        return (Optional<Double>) limit;
    }

    /**
     * A query string to filter the results. It allows filtering based on either the name or trigger identifier of the workflow items.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> query() {
        return (Optional<String>) query;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public WorkflowControllerListWorkflowsRequest withPage(double page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    public WorkflowControllerListWorkflowsRequest withPage(Optional<? extends Double> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    public WorkflowControllerListWorkflowsRequest withLimit(double limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    public WorkflowControllerListWorkflowsRequest withLimit(Optional<? extends Double> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    /**
     * A query string to filter the results. It allows filtering based on either the name or trigger identifier of the workflow items.
     */
    public WorkflowControllerListWorkflowsRequest withQuery(String query) {
        Utils.checkNotNull(query, "query");
        this.query = Optional.ofNullable(query);
        return this;
    }

    /**
     * A query string to filter the results. It allows filtering based on either the name or trigger identifier of the workflow items.
     */
    public WorkflowControllerListWorkflowsRequest withQuery(Optional<? extends String> query) {
        Utils.checkNotNull(query, "query");
        this.query = query;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkflowControllerListWorkflowsRequest other = (WorkflowControllerListWorkflowsRequest) o;
        return 
            java.util.Objects.deepEquals(this.page, other.page) &&
            java.util.Objects.deepEquals(this.limit, other.limit) &&
            java.util.Objects.deepEquals(this.query, other.query);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            page,
            limit,
            query);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WorkflowControllerListWorkflowsRequest.class,
                "page", page,
                "limit", limit,
                "query", query);
    }
    
    public final static class Builder {
 
        private Optional<? extends Double> page = Optional.empty();
 
        private Optional<? extends Double> limit;
 
        private Optional<? extends String> query = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder page(double page) {
            Utils.checkNotNull(page, "page");
            this.page = Optional.ofNullable(page);
            return this;
        }

        public Builder page(Optional<? extends Double> page) {
            Utils.checkNotNull(page, "page");
            this.page = page;
            return this;
        }

        public Builder limit(double limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        public Builder limit(Optional<? extends Double> limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        /**
         * A query string to filter the results. It allows filtering based on either the name or trigger identifier of the workflow items.
         */
        public Builder query(String query) {
            Utils.checkNotNull(query, "query");
            this.query = Optional.ofNullable(query);
            return this;
        }

        /**
         * A query string to filter the results. It allows filtering based on either the name or trigger identifier of the workflow items.
         */
        public Builder query(Optional<? extends String> query) {
            Utils.checkNotNull(query, "query");
            this.query = query;
            return this;
        }
        
        public WorkflowControllerListWorkflowsRequest build() {
            if (limit == null) {
                limit = _SINGLETON_VALUE_Limit.value();
            }
            return new WorkflowControllerListWorkflowsRequest(
                page,
                limit,
                query);
        }

        private static final LazySingletonValue<Optional<? extends Double>> _SINGLETON_VALUE_Limit =
                new LazySingletonValue<>(
                        "limit",
                        "10",
                        new TypeReference<Optional<? extends Double>>() {});
    }
}

