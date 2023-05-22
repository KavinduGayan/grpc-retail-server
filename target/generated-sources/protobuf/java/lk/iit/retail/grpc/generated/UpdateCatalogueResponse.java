// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RetailService.proto

package lk.iit.retail.grpc.generated;

/**
 * Protobuf type {@code lk.iit.retail.grpc.generated.UpdateCatalogueResponse}
 */
public final class UpdateCatalogueResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lk.iit.retail.grpc.generated.UpdateCatalogueResponse)
    UpdateCatalogueResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateCatalogueResponse.newBuilder() to construct.
  private UpdateCatalogueResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateCatalogueResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateCatalogueResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateCatalogueResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            isUpdate_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
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
    return lk.iit.retail.grpc.generated.RetailService.internal_static_lk_iit_retail_grpc_generated_UpdateCatalogueResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lk.iit.retail.grpc.generated.RetailService.internal_static_lk_iit_retail_grpc_generated_UpdateCatalogueResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lk.iit.retail.grpc.generated.UpdateCatalogueResponse.class, lk.iit.retail.grpc.generated.UpdateCatalogueResponse.Builder.class);
  }

  public static final int ISUPDATE_FIELD_NUMBER = 1;
  private boolean isUpdate_;
  /**
   * <code>bool isUpdate = 1;</code>
   * @return The isUpdate.
   */
  @java.lang.Override
  public boolean getIsUpdate() {
    return isUpdate_;
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
    if (isUpdate_ != false) {
      output.writeBool(1, isUpdate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isUpdate_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isUpdate_);
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
    if (!(obj instanceof lk.iit.retail.grpc.generated.UpdateCatalogueResponse)) {
      return super.equals(obj);
    }
    lk.iit.retail.grpc.generated.UpdateCatalogueResponse other = (lk.iit.retail.grpc.generated.UpdateCatalogueResponse) obj;

    if (getIsUpdate()
        != other.getIsUpdate()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ISUPDATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsUpdate());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lk.iit.retail.grpc.generated.UpdateCatalogueResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lk.iit.retail.grpc.generated.UpdateCatalogueResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lk.iit.retail.grpc.generated.UpdateCatalogueResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lk.iit.retail.grpc.generated.UpdateCatalogueResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lk.iit.retail.grpc.generated.UpdateCatalogueResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lk.iit.retail.grpc.generated.UpdateCatalogueResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lk.iit.retail.grpc.generated.UpdateCatalogueResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lk.iit.retail.grpc.generated.UpdateCatalogueResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lk.iit.retail.grpc.generated.UpdateCatalogueResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lk.iit.retail.grpc.generated.UpdateCatalogueResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lk.iit.retail.grpc.generated.UpdateCatalogueResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lk.iit.retail.grpc.generated.UpdateCatalogueResponse parseFrom(
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
  public static Builder newBuilder(lk.iit.retail.grpc.generated.UpdateCatalogueResponse prototype) {
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
   * Protobuf type {@code lk.iit.retail.grpc.generated.UpdateCatalogueResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lk.iit.retail.grpc.generated.UpdateCatalogueResponse)
      lk.iit.retail.grpc.generated.UpdateCatalogueResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lk.iit.retail.grpc.generated.RetailService.internal_static_lk_iit_retail_grpc_generated_UpdateCatalogueResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lk.iit.retail.grpc.generated.RetailService.internal_static_lk_iit_retail_grpc_generated_UpdateCatalogueResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lk.iit.retail.grpc.generated.UpdateCatalogueResponse.class, lk.iit.retail.grpc.generated.UpdateCatalogueResponse.Builder.class);
    }

    // Construct using lk.iit.retail.grpc.generated.UpdateCatalogueResponse.newBuilder()
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
      isUpdate_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lk.iit.retail.grpc.generated.RetailService.internal_static_lk_iit_retail_grpc_generated_UpdateCatalogueResponse_descriptor;
    }

    @java.lang.Override
    public lk.iit.retail.grpc.generated.UpdateCatalogueResponse getDefaultInstanceForType() {
      return lk.iit.retail.grpc.generated.UpdateCatalogueResponse.getDefaultInstance();
    }

    @java.lang.Override
    public lk.iit.retail.grpc.generated.UpdateCatalogueResponse build() {
      lk.iit.retail.grpc.generated.UpdateCatalogueResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public lk.iit.retail.grpc.generated.UpdateCatalogueResponse buildPartial() {
      lk.iit.retail.grpc.generated.UpdateCatalogueResponse result = new lk.iit.retail.grpc.generated.UpdateCatalogueResponse(this);
      result.isUpdate_ = isUpdate_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof lk.iit.retail.grpc.generated.UpdateCatalogueResponse) {
        return mergeFrom((lk.iit.retail.grpc.generated.UpdateCatalogueResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lk.iit.retail.grpc.generated.UpdateCatalogueResponse other) {
      if (other == lk.iit.retail.grpc.generated.UpdateCatalogueResponse.getDefaultInstance()) return this;
      if (other.getIsUpdate() != false) {
        setIsUpdate(other.getIsUpdate());
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
      lk.iit.retail.grpc.generated.UpdateCatalogueResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lk.iit.retail.grpc.generated.UpdateCatalogueResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean isUpdate_ ;
    /**
     * <code>bool isUpdate = 1;</code>
     * @return The isUpdate.
     */
    @java.lang.Override
    public boolean getIsUpdate() {
      return isUpdate_;
    }
    /**
     * <code>bool isUpdate = 1;</code>
     * @param value The isUpdate to set.
     * @return This builder for chaining.
     */
    public Builder setIsUpdate(boolean value) {
      
      isUpdate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isUpdate = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsUpdate() {
      
      isUpdate_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:lk.iit.retail.grpc.generated.UpdateCatalogueResponse)
  }

  // @@protoc_insertion_point(class_scope:lk.iit.retail.grpc.generated.UpdateCatalogueResponse)
  private static final lk.iit.retail.grpc.generated.UpdateCatalogueResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lk.iit.retail.grpc.generated.UpdateCatalogueResponse();
  }

  public static lk.iit.retail.grpc.generated.UpdateCatalogueResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCatalogueResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpdateCatalogueResponse>() {
    @java.lang.Override
    public UpdateCatalogueResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateCatalogueResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateCatalogueResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCatalogueResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public lk.iit.retail.grpc.generated.UpdateCatalogueResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
