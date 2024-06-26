/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package co.novu.co.novu.sdk.models.components;

import co.novu.co.novu.sdk.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class MemberResponseDto {

    @JsonProperty("_id")
    private String id;

    @JsonProperty("_organizationId")
    private String organizationId;

    @JsonProperty("_userId")
    private String userId;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("invite")
    private Optional<? extends MemberInviteDTO> invite;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("memberStatus")
    private Optional<? extends MemberStatus> memberStatus;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("roles")
    private Optional<? extends Roles> roles;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user")
    private Optional<? extends MemberUserDto> user;

    @JsonCreator
    public MemberResponseDto(
            @JsonProperty("_id") String id,
            @JsonProperty("_organizationId") String organizationId,
            @JsonProperty("_userId") String userId,
            @JsonProperty("invite") Optional<? extends MemberInviteDTO> invite,
            @JsonProperty("memberStatus") Optional<? extends MemberStatus> memberStatus,
            @JsonProperty("roles") Optional<? extends Roles> roles,
            @JsonProperty("user") Optional<? extends MemberUserDto> user) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(organizationId, "organizationId");
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(invite, "invite");
        Utils.checkNotNull(memberStatus, "memberStatus");
        Utils.checkNotNull(roles, "roles");
        Utils.checkNotNull(user, "user");
        this.id = id;
        this.organizationId = organizationId;
        this.userId = userId;
        this.invite = invite;
        this.memberStatus = memberStatus;
        this.roles = roles;
        this.user = user;
    }
    
    public MemberResponseDto(
            String id,
            String organizationId,
            String userId) {
        this(id, organizationId, userId, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public String organizationId() {
        return organizationId;
    }

    @JsonIgnore
    public String userId() {
        return userId;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<MemberInviteDTO> invite() {
        return (Optional<MemberInviteDTO>) invite;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<MemberStatus> memberStatus() {
        return (Optional<MemberStatus>) memberStatus;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Roles> roles() {
        return (Optional<Roles>) roles;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<MemberUserDto> user() {
        return (Optional<MemberUserDto>) user;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public MemberResponseDto withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public MemberResponseDto withOrganizationId(String organizationId) {
        Utils.checkNotNull(organizationId, "organizationId");
        this.organizationId = organizationId;
        return this;
    }

    public MemberResponseDto withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    public MemberResponseDto withInvite(MemberInviteDTO invite) {
        Utils.checkNotNull(invite, "invite");
        this.invite = Optional.ofNullable(invite);
        return this;
    }

    public MemberResponseDto withInvite(Optional<? extends MemberInviteDTO> invite) {
        Utils.checkNotNull(invite, "invite");
        this.invite = invite;
        return this;
    }

    public MemberResponseDto withMemberStatus(MemberStatus memberStatus) {
        Utils.checkNotNull(memberStatus, "memberStatus");
        this.memberStatus = Optional.ofNullable(memberStatus);
        return this;
    }

    public MemberResponseDto withMemberStatus(Optional<? extends MemberStatus> memberStatus) {
        Utils.checkNotNull(memberStatus, "memberStatus");
        this.memberStatus = memberStatus;
        return this;
    }

    public MemberResponseDto withRoles(Roles roles) {
        Utils.checkNotNull(roles, "roles");
        this.roles = Optional.ofNullable(roles);
        return this;
    }

    public MemberResponseDto withRoles(Optional<? extends Roles> roles) {
        Utils.checkNotNull(roles, "roles");
        this.roles = roles;
        return this;
    }

    public MemberResponseDto withUser(MemberUserDto user) {
        Utils.checkNotNull(user, "user");
        this.user = Optional.ofNullable(user);
        return this;
    }

    public MemberResponseDto withUser(Optional<? extends MemberUserDto> user) {
        Utils.checkNotNull(user, "user");
        this.user = user;
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
        MemberResponseDto other = (MemberResponseDto) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.organizationId, other.organizationId) &&
            java.util.Objects.deepEquals(this.userId, other.userId) &&
            java.util.Objects.deepEquals(this.invite, other.invite) &&
            java.util.Objects.deepEquals(this.memberStatus, other.memberStatus) &&
            java.util.Objects.deepEquals(this.roles, other.roles) &&
            java.util.Objects.deepEquals(this.user, other.user);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            organizationId,
            userId,
            invite,
            memberStatus,
            roles,
            user);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MemberResponseDto.class,
                "id", id,
                "organizationId", organizationId,
                "userId", userId,
                "invite", invite,
                "memberStatus", memberStatus,
                "roles", roles,
                "user", user);
    }
    
    public final static class Builder {
 
        private String id;
 
        private String organizationId;
 
        private String userId;
 
        private Optional<? extends MemberInviteDTO> invite = Optional.empty();
 
        private Optional<? extends MemberStatus> memberStatus = Optional.empty();
 
        private Optional<? extends Roles> roles = Optional.empty();
 
        private Optional<? extends MemberUserDto> user = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder organizationId(String organizationId) {
            Utils.checkNotNull(organizationId, "organizationId");
            this.organizationId = organizationId;
            return this;
        }

        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        public Builder invite(MemberInviteDTO invite) {
            Utils.checkNotNull(invite, "invite");
            this.invite = Optional.ofNullable(invite);
            return this;
        }

        public Builder invite(Optional<? extends MemberInviteDTO> invite) {
            Utils.checkNotNull(invite, "invite");
            this.invite = invite;
            return this;
        }

        public Builder memberStatus(MemberStatus memberStatus) {
            Utils.checkNotNull(memberStatus, "memberStatus");
            this.memberStatus = Optional.ofNullable(memberStatus);
            return this;
        }

        public Builder memberStatus(Optional<? extends MemberStatus> memberStatus) {
            Utils.checkNotNull(memberStatus, "memberStatus");
            this.memberStatus = memberStatus;
            return this;
        }

        public Builder roles(Roles roles) {
            Utils.checkNotNull(roles, "roles");
            this.roles = Optional.ofNullable(roles);
            return this;
        }

        public Builder roles(Optional<? extends Roles> roles) {
            Utils.checkNotNull(roles, "roles");
            this.roles = roles;
            return this;
        }

        public Builder user(MemberUserDto user) {
            Utils.checkNotNull(user, "user");
            this.user = Optional.ofNullable(user);
            return this;
        }

        public Builder user(Optional<? extends MemberUserDto> user) {
            Utils.checkNotNull(user, "user");
            this.user = user;
            return this;
        }
        
        public MemberResponseDto build() {
            return new MemberResponseDto(
                id,
                organizationId,
                userId,
                invite,
                memberStatus,
                roles,
                user);
        }
    }
}

