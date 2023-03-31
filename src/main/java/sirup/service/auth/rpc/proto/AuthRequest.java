// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sirup_auth.proto

package sirup.service.auth.rpc.proto;

/**
 * Protobuf type {@code auth.v2.AuthRequest}
 */
public  final class AuthRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:auth.v2.AuthRequest)
    AuthRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AuthRequest.newBuilder() to construct.
  private AuthRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthRequest() {
    token_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AuthRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            token_ = s;
            break;
          }
          case 18: {
            sirup.service.auth.rpc.proto.CredentialsRpc.Builder subBuilder = null;
            if (credentialsRpc_ != null) {
              subBuilder = credentialsRpc_.toBuilder();
            }
            credentialsRpc_ = input.readMessage(sirup.service.auth.rpc.proto.CredentialsRpc.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(credentialsRpc_);
              credentialsRpc_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sirup.service.auth.rpc.proto.Auth.internal_static_auth_v2_AuthRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sirup.service.auth.rpc.proto.Auth.internal_static_auth_v2_AuthRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sirup.service.auth.rpc.proto.AuthRequest.class, sirup.service.auth.rpc.proto.AuthRequest.Builder.class);
  }

  public static final int TOKEN_FIELD_NUMBER = 1;
  private volatile java.lang.Object token_;
  /**
   * <code>string token = 1;</code>
   */
  public java.lang.String getToken() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      token_ = s;
      return s;
    }
  }
  /**
   * <code>string token = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTokenBytes() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      token_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREDENTIALS_RPC_FIELD_NUMBER = 2;
  private sirup.service.auth.rpc.proto.CredentialsRpc credentialsRpc_;
  /**
   * <code>.auth.v2.CredentialsRpc credentials_rpc = 2;</code>
   */
  public boolean hasCredentialsRpc() {
    return credentialsRpc_ != null;
  }
  /**
   * <code>.auth.v2.CredentialsRpc credentials_rpc = 2;</code>
   */
  public sirup.service.auth.rpc.proto.CredentialsRpc getCredentialsRpc() {
    return credentialsRpc_ == null ? sirup.service.auth.rpc.proto.CredentialsRpc.getDefaultInstance() : credentialsRpc_;
  }
  /**
   * <code>.auth.v2.CredentialsRpc credentials_rpc = 2;</code>
   */
  public sirup.service.auth.rpc.proto.CredentialsRpcOrBuilder getCredentialsRpcOrBuilder() {
    return getCredentialsRpc();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, token_);
    }
    if (credentialsRpc_ != null) {
      output.writeMessage(2, getCredentialsRpc());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, token_);
    }
    if (credentialsRpc_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCredentialsRpc());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof sirup.service.auth.rpc.proto.AuthRequest)) {
      return super.equals(obj);
    }
    sirup.service.auth.rpc.proto.AuthRequest other = (sirup.service.auth.rpc.proto.AuthRequest) obj;

    boolean result = true;
    result = result && getToken()
        .equals(other.getToken());
    result = result && (hasCredentialsRpc() == other.hasCredentialsRpc());
    if (hasCredentialsRpc()) {
      result = result && getCredentialsRpc()
          .equals(other.getCredentialsRpc());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getToken().hashCode();
    if (hasCredentialsRpc()) {
      hash = (37 * hash) + CREDENTIALS_RPC_FIELD_NUMBER;
      hash = (53 * hash) + getCredentialsRpc().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sirup.service.auth.rpc.proto.AuthRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sirup.service.auth.rpc.proto.AuthRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sirup.service.auth.rpc.proto.AuthRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sirup.service.auth.rpc.proto.AuthRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sirup.service.auth.rpc.proto.AuthRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sirup.service.auth.rpc.proto.AuthRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sirup.service.auth.rpc.proto.AuthRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sirup.service.auth.rpc.proto.AuthRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sirup.service.auth.rpc.proto.AuthRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sirup.service.auth.rpc.proto.AuthRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sirup.service.auth.rpc.proto.AuthRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sirup.service.auth.rpc.proto.AuthRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(sirup.service.auth.rpc.proto.AuthRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code auth.v2.AuthRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:auth.v2.AuthRequest)
      sirup.service.auth.rpc.proto.AuthRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sirup.service.auth.rpc.proto.Auth.internal_static_auth_v2_AuthRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sirup.service.auth.rpc.proto.Auth.internal_static_auth_v2_AuthRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sirup.service.auth.rpc.proto.AuthRequest.class, sirup.service.auth.rpc.proto.AuthRequest.Builder.class);
    }

    // Construct using sirup.service.auth.rpc.proto.AuthRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      token_ = "";

      if (credentialsRpcBuilder_ == null) {
        credentialsRpc_ = null;
      } else {
        credentialsRpc_ = null;
        credentialsRpcBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sirup.service.auth.rpc.proto.Auth.internal_static_auth_v2_AuthRequest_descriptor;
    }

    @java.lang.Override
    public sirup.service.auth.rpc.proto.AuthRequest getDefaultInstanceForType() {
      return sirup.service.auth.rpc.proto.AuthRequest.getDefaultInstance();
    }

    @java.lang.Override
    public sirup.service.auth.rpc.proto.AuthRequest build() {
      sirup.service.auth.rpc.proto.AuthRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sirup.service.auth.rpc.proto.AuthRequest buildPartial() {
      sirup.service.auth.rpc.proto.AuthRequest result = new sirup.service.auth.rpc.proto.AuthRequest(this);
      result.token_ = token_;
      if (credentialsRpcBuilder_ == null) {
        result.credentialsRpc_ = credentialsRpc_;
      } else {
        result.credentialsRpc_ = credentialsRpcBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof sirup.service.auth.rpc.proto.AuthRequest) {
        return mergeFrom((sirup.service.auth.rpc.proto.AuthRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sirup.service.auth.rpc.proto.AuthRequest other) {
      if (other == sirup.service.auth.rpc.proto.AuthRequest.getDefaultInstance()) return this;
      if (!other.getToken().isEmpty()) {
        token_ = other.token_;
        onChanged();
      }
      if (other.hasCredentialsRpc()) {
        mergeCredentialsRpc(other.getCredentialsRpc());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      sirup.service.auth.rpc.proto.AuthRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sirup.service.auth.rpc.proto.AuthRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object token_ = "";
    /**
     * <code>string token = 1;</code>
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        token_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string token = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string token = 1;</code>
     */
    public Builder setToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      token_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string token = 1;</code>
     */
    public Builder clearToken() {
      
      token_ = getDefaultInstance().getToken();
      onChanged();
      return this;
    }
    /**
     * <code>string token = 1;</code>
     */
    public Builder setTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      token_ = value;
      onChanged();
      return this;
    }

    private sirup.service.auth.rpc.proto.CredentialsRpc credentialsRpc_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        sirup.service.auth.rpc.proto.CredentialsRpc, sirup.service.auth.rpc.proto.CredentialsRpc.Builder, sirup.service.auth.rpc.proto.CredentialsRpcOrBuilder> credentialsRpcBuilder_;
    /**
     * <code>.auth.v2.CredentialsRpc credentials_rpc = 2;</code>
     */
    public boolean hasCredentialsRpc() {
      return credentialsRpcBuilder_ != null || credentialsRpc_ != null;
    }
    /**
     * <code>.auth.v2.CredentialsRpc credentials_rpc = 2;</code>
     */
    public sirup.service.auth.rpc.proto.CredentialsRpc getCredentialsRpc() {
      if (credentialsRpcBuilder_ == null) {
        return credentialsRpc_ == null ? sirup.service.auth.rpc.proto.CredentialsRpc.getDefaultInstance() : credentialsRpc_;
      } else {
        return credentialsRpcBuilder_.getMessage();
      }
    }
    /**
     * <code>.auth.v2.CredentialsRpc credentials_rpc = 2;</code>
     */
    public Builder setCredentialsRpc(sirup.service.auth.rpc.proto.CredentialsRpc value) {
      if (credentialsRpcBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        credentialsRpc_ = value;
        onChanged();
      } else {
        credentialsRpcBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.auth.v2.CredentialsRpc credentials_rpc = 2;</code>
     */
    public Builder setCredentialsRpc(
        sirup.service.auth.rpc.proto.CredentialsRpc.Builder builderForValue) {
      if (credentialsRpcBuilder_ == null) {
        credentialsRpc_ = builderForValue.build();
        onChanged();
      } else {
        credentialsRpcBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.auth.v2.CredentialsRpc credentials_rpc = 2;</code>
     */
    public Builder mergeCredentialsRpc(sirup.service.auth.rpc.proto.CredentialsRpc value) {
      if (credentialsRpcBuilder_ == null) {
        if (credentialsRpc_ != null) {
          credentialsRpc_ =
            sirup.service.auth.rpc.proto.CredentialsRpc.newBuilder(credentialsRpc_).mergeFrom(value).buildPartial();
        } else {
          credentialsRpc_ = value;
        }
        onChanged();
      } else {
        credentialsRpcBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.auth.v2.CredentialsRpc credentials_rpc = 2;</code>
     */
    public Builder clearCredentialsRpc() {
      if (credentialsRpcBuilder_ == null) {
        credentialsRpc_ = null;
        onChanged();
      } else {
        credentialsRpc_ = null;
        credentialsRpcBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.auth.v2.CredentialsRpc credentials_rpc = 2;</code>
     */
    public sirup.service.auth.rpc.proto.CredentialsRpc.Builder getCredentialsRpcBuilder() {
      
      onChanged();
      return getCredentialsRpcFieldBuilder().getBuilder();
    }
    /**
     * <code>.auth.v2.CredentialsRpc credentials_rpc = 2;</code>
     */
    public sirup.service.auth.rpc.proto.CredentialsRpcOrBuilder getCredentialsRpcOrBuilder() {
      if (credentialsRpcBuilder_ != null) {
        return credentialsRpcBuilder_.getMessageOrBuilder();
      } else {
        return credentialsRpc_ == null ?
            sirup.service.auth.rpc.proto.CredentialsRpc.getDefaultInstance() : credentialsRpc_;
      }
    }
    /**
     * <code>.auth.v2.CredentialsRpc credentials_rpc = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        sirup.service.auth.rpc.proto.CredentialsRpc, sirup.service.auth.rpc.proto.CredentialsRpc.Builder, sirup.service.auth.rpc.proto.CredentialsRpcOrBuilder> 
        getCredentialsRpcFieldBuilder() {
      if (credentialsRpcBuilder_ == null) {
        credentialsRpcBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            sirup.service.auth.rpc.proto.CredentialsRpc, sirup.service.auth.rpc.proto.CredentialsRpc.Builder, sirup.service.auth.rpc.proto.CredentialsRpcOrBuilder>(
                getCredentialsRpc(),
                getParentForChildren(),
                isClean());
        credentialsRpc_ = null;
      }
      return credentialsRpcBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:auth.v2.AuthRequest)
  }

  // @@protoc_insertion_point(class_scope:auth.v2.AuthRequest)
  private static final sirup.service.auth.rpc.proto.AuthRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sirup.service.auth.rpc.proto.AuthRequest();
  }

  public static sirup.service.auth.rpc.proto.AuthRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthRequest>
      PARSER = new com.google.protobuf.AbstractParser<AuthRequest>() {
    @java.lang.Override
    public AuthRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AuthRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AuthRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuthRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sirup.service.auth.rpc.proto.AuthRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

