// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RetailService.proto

package lk.iit.retail.grpc.generated;

/**
 * Protobuf type {@code lk.iit.retail.grpc.generated.AddShoppingCartRequest}
 */
public final class AddShoppingCartRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lk.iit.retail.grpc.generated.AddShoppingCartRequest)
    AddShoppingCartRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddShoppingCartRequest.newBuilder() to construct.
  private AddShoppingCartRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddShoppingCartRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddShoppingCartRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddShoppingCartRequest(
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

            catalogueId_ = input.readInt32();
            break;
          }
          case 16: {

            quantity_ = input.readInt32();
            break;
          }
          case 24: {

            shopperId_ = input.readInt32();
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
    return lk.iit.retail.grpc.generated.RetailService.internal_static_lk_iit_retail_grpc_generated_AddShoppingCartRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lk.iit.retail.grpc.generated.RetailService.internal_static_lk_iit_retail_grpc_generated_AddShoppingCartRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lk.iit.retail.grpc.generated.AddShoppingCartRequest.class, lk.iit.retail.grpc.generated.AddShoppingCartRequest.Builder.class);
  }

  public static final int CATALOGUEID_FIELD_NUMBER = 1;
  private int catalogueId_;
  /**
   * <code>int32 catalogueId = 1;</code>
   * @return The catalogueId.
   */
  @java.lang.Override
  public int getCatalogueId() {
    return catalogueId_;
  }

  public static final int QUANTITY_FIELD_NUMBER = 2;
  private int quantity_;
  /**
   * <code>int32 quantity = 2;</code>
   * @return The quantity.
   */
  @java.lang.Override
  public int getQuantity() {
    return quantity_;
  }

  public static final int SHOPPERID_FIELD_NUMBER = 3;
  private int shopperId_;
  /**
   * <code>int32 shopperId = 3;</code>
   * @return The shopperId.
   */
  @java.lang.Override
  public int getShopperId() {
    return shopperId_;
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
    if (catalogueId_ != 0) {
      output.writeInt32(1, catalogueId_);
    }
    if (quantity_ != 0) {
      output.writeInt32(2, quantity_);
    }
    if (shopperId_ != 0) {
      output.writeInt32(3, shopperId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (catalogueId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, catalogueId_);
    }
    if (quantity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, quantity_);
    }
    if (shopperId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, shopperId_);
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
    if (!(obj instanceof lk.iit.retail.grpc.generated.AddShoppingCartRequest)) {
      return super.equals(obj);
    }
    lk.iit.retail.grpc.generated.AddShoppingCartRequest other = (lk.iit.retail.grpc.generated.AddShoppingCartRequest) obj;

    if (getCatalogueId()
        != other.getCatalogueId()) return false;
    if (getQuantity()
        != other.getQuantity()) return false;
    if (getShopperId()
        != other.getShopperId()) return false;
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
    hash = (37 * hash) + CATALOGUEID_FIELD_NUMBER;
    hash = (53 * hash) + getCatalogueId();
    hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getQuantity();
    hash = (37 * hash) + SHOPPERID_FIELD_NUMBER;
    hash = (53 * hash) + getShopperId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lk.iit.retail.grpc.generated.AddShoppingCartRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lk.iit.retail.grpc.generated.AddShoppingCartRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lk.iit.retail.grpc.generated.AddShoppingCartRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lk.iit.retail.grpc.generated.AddShoppingCartRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lk.iit.retail.grpc.generated.AddShoppingCartRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lk.iit.retail.grpc.generated.AddShoppingCartRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lk.iit.retail.grpc.generated.AddShoppingCartRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lk.iit.retail.grpc.generated.AddShoppingCartRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lk.iit.retail.grpc.generated.AddShoppingCartRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lk.iit.retail.grpc.generated.AddShoppingCartRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lk.iit.retail.grpc.generated.AddShoppingCartRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lk.iit.retail.grpc.generated.AddShoppingCartRequest parseFrom(
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
  public static Builder newBuilder(lk.iit.retail.grpc.generated.AddShoppingCartRequest prototype) {
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
   * Protobuf type {@code lk.iit.retail.grpc.generated.AddShoppingCartRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lk.iit.retail.grpc.generated.AddShoppingCartRequest)
      lk.iit.retail.grpc.generated.AddShoppingCartRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lk.iit.retail.grpc.generated.RetailService.internal_static_lk_iit_retail_grpc_generated_AddShoppingCartRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lk.iit.retail.grpc.generated.RetailService.internal_static_lk_iit_retail_grpc_generated_AddShoppingCartRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lk.iit.retail.grpc.generated.AddShoppingCartRequest.class, lk.iit.retail.grpc.generated.AddShoppingCartRequest.Builder.class);
    }

    // Construct using lk.iit.retail.grpc.generated.AddShoppingCartRequest.newBuilder()
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
      catalogueId_ = 0;

      quantity_ = 0;

      shopperId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lk.iit.retail.grpc.generated.RetailService.internal_static_lk_iit_retail_grpc_generated_AddShoppingCartRequest_descriptor;
    }

    @java.lang.Override
    public lk.iit.retail.grpc.generated.AddShoppingCartRequest getDefaultInstanceForType() {
      return lk.iit.retail.grpc.generated.AddShoppingCartRequest.getDefaultInstance();
    }

    @java.lang.Override
    public lk.iit.retail.grpc.generated.AddShoppingCartRequest build() {
      lk.iit.retail.grpc.generated.AddShoppingCartRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public lk.iit.retail.grpc.generated.AddShoppingCartRequest buildPartial() {
      lk.iit.retail.grpc.generated.AddShoppingCartRequest result = new lk.iit.retail.grpc.generated.AddShoppingCartRequest(this);
      result.catalogueId_ = catalogueId_;
      result.quantity_ = quantity_;
      result.shopperId_ = shopperId_;
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
      if (other instanceof lk.iit.retail.grpc.generated.AddShoppingCartRequest) {
        return mergeFrom((lk.iit.retail.grpc.generated.AddShoppingCartRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lk.iit.retail.grpc.generated.AddShoppingCartRequest other) {
      if (other == lk.iit.retail.grpc.generated.AddShoppingCartRequest.getDefaultInstance()) return this;
      if (other.getCatalogueId() != 0) {
        setCatalogueId(other.getCatalogueId());
      }
      if (other.getQuantity() != 0) {
        setQuantity(other.getQuantity());
      }
      if (other.getShopperId() != 0) {
        setShopperId(other.getShopperId());
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
      lk.iit.retail.grpc.generated.AddShoppingCartRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lk.iit.retail.grpc.generated.AddShoppingCartRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int catalogueId_ ;
    /**
     * <code>int32 catalogueId = 1;</code>
     * @return The catalogueId.
     */
    @java.lang.Override
    public int getCatalogueId() {
      return catalogueId_;
    }
    /**
     * <code>int32 catalogueId = 1;</code>
     * @param value The catalogueId to set.
     * @return This builder for chaining.
     */
    public Builder setCatalogueId(int value) {
      
      catalogueId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 catalogueId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCatalogueId() {
      
      catalogueId_ = 0;
      onChanged();
      return this;
    }

    private int quantity_ ;
    /**
     * <code>int32 quantity = 2;</code>
     * @return The quantity.
     */
    @java.lang.Override
    public int getQuantity() {
      return quantity_;
    }
    /**
     * <code>int32 quantity = 2;</code>
     * @param value The quantity to set.
     * @return This builder for chaining.
     */
    public Builder setQuantity(int value) {
      
      quantity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 quantity = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuantity() {
      
      quantity_ = 0;
      onChanged();
      return this;
    }

    private int shopperId_ ;
    /**
     * <code>int32 shopperId = 3;</code>
     * @return The shopperId.
     */
    @java.lang.Override
    public int getShopperId() {
      return shopperId_;
    }
    /**
     * <code>int32 shopperId = 3;</code>
     * @param value The shopperId to set.
     * @return This builder for chaining.
     */
    public Builder setShopperId(int value) {
      
      shopperId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 shopperId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearShopperId() {
      
      shopperId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:lk.iit.retail.grpc.generated.AddShoppingCartRequest)
  }

  // @@protoc_insertion_point(class_scope:lk.iit.retail.grpc.generated.AddShoppingCartRequest)
  private static final lk.iit.retail.grpc.generated.AddShoppingCartRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lk.iit.retail.grpc.generated.AddShoppingCartRequest();
  }

  public static lk.iit.retail.grpc.generated.AddShoppingCartRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddShoppingCartRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddShoppingCartRequest>() {
    @java.lang.Override
    public AddShoppingCartRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddShoppingCartRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddShoppingCartRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddShoppingCartRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public lk.iit.retail.grpc.generated.AddShoppingCartRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

