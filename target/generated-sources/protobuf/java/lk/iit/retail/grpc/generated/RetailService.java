// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RetailService.proto

package lk.iit.retail.grpc.generated;

public final class RetailService {
  private RetailService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lk_iit_retail_grpc_generated_UpdateCatalogueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lk_iit_retail_grpc_generated_UpdateCatalogueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lk_iit_retail_grpc_generated_UpdateCatalogueResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lk_iit_retail_grpc_generated_UpdateCatalogueResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lk_iit_retail_grpc_generated_GetCatalogueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lk_iit_retail_grpc_generated_GetCatalogueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lk_iit_retail_grpc_generated_Catalogue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lk_iit_retail_grpc_generated_Catalogue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lk_iit_retail_grpc_generated_GetCatalogueResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lk_iit_retail_grpc_generated_GetCatalogueResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lk_iit_retail_grpc_generated_AddShoppingCartRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lk_iit_retail_grpc_generated_AddShoppingCartRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lk_iit_retail_grpc_generated_AddShoppingCartResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lk_iit_retail_grpc_generated_AddShoppingCartResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lk_iit_retail_grpc_generated_CheckoutRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lk_iit_retail_grpc_generated_CheckoutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lk_iit_retail_grpc_generated_CheckoutResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lk_iit_retail_grpc_generated_CheckoutResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lk_iit_retail_grpc_generated_NotifyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lk_iit_retail_grpc_generated_NotifyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_lk_iit_retail_grpc_generated_NotifyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_lk_iit_retail_grpc_generated_NotifyResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023RetailService.proto\022\034lk.iit.retail.grp" +
      "c.generated\"E\n\026UpdateCatalogueRequest\022\023\n" +
      "\013catalogueId\030\001 \001(\t\022\026\n\016updateQuantity\030\002 \001" +
      "(\005\"+\n\027UpdateCatalogueResponse\022\020\n\010isUpdat" +
      "e\030\001 \001(\010\"\025\n\023GetCatalogueRequest\"7\n\tCatalo" +
      "gue\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\020\n\010quantit" +
      "y\030\003 \001(\005\"S\n\024GetCatalogueResponse\022;\n\ncatal" +
      "ogues\030\001 \003(\0132\'.lk.iit.retail.grpc.generat" +
      "ed.Catalogue\"R\n\026AddShoppingCartRequest\022\023" +
      "\n\013catalogueId\030\001 \001(\005\022\020\n\010quantity\030\002 \001(\005\022\021\n" +
      "\tshopperId\030\003 \001(\005\",\n\027AddShoppingCartRespo" +
      "nse\022\021\n\tisUpdated\030\001 \001(\010\"$\n\017CheckoutReques" +
      "t\022\021\n\tshopperId\030\001 \001(\005\"&\n\020CheckoutResponse" +
      "\022\022\n\nisCheckout\030\001 \001(\010\":\n\rNotifyRequest\022\022\n" +
      "\nnotifyType\030\001 \001(\005\022\025\n\rnotifyPayload\030\002 \001(\t" +
      "\"\"\n\016NotifyResponse\022\020\n\010isUpdate\030\001 \001(\0102\230\001\n" +
      "\026UpdateCatalogueService\022~\n\017updateCatalog" +
      "ue\0224.lk.iit.retail.grpc.generated.Update" +
      "CatalogueRequest\0325.lk.iit.retail.grpc.ge" +
      "nerated.UpdateCatalogueResponse2\214\001\n\023GetC" +
      "atalogueService\022u\n\014getCatalogue\0221.lk.iit" +
      ".retail.grpc.generated.GetCatalogueReque" +
      "st\0322.lk.iit.retail.grpc.generated.GetCat" +
      "alogueResponse2\230\001\n\026AddShoppingCartServic" +
      "e\022~\n\017addShoppingCart\0224.lk.iit.retail.grp" +
      "c.generated.AddShoppingCartRequest\0325.lk." +
      "iit.retail.grpc.generated.AddShoppingCar" +
      "tResponse2\204\001\n\023CheckoutCartService\022m\n\014che" +
      "ckoutCart\022-.lk.iit.retail.grpc.generated" +
      ".CheckoutRequest\032..lk.iit.retail.grpc.ge" +
      "nerated.CheckoutResponse2\207\001\n\023UpdateNotif" +
      "yService\022p\n\023updateNotifyService\022+.lk.iit" +
      ".retail.grpc.generated.NotifyRequest\032,.l" +
      "k.iit.retail.grpc.generated.NotifyRespon" +
      "seB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_lk_iit_retail_grpc_generated_UpdateCatalogueRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_lk_iit_retail_grpc_generated_UpdateCatalogueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lk_iit_retail_grpc_generated_UpdateCatalogueRequest_descriptor,
        new java.lang.String[] { "CatalogueId", "UpdateQuantity", });
    internal_static_lk_iit_retail_grpc_generated_UpdateCatalogueResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_lk_iit_retail_grpc_generated_UpdateCatalogueResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lk_iit_retail_grpc_generated_UpdateCatalogueResponse_descriptor,
        new java.lang.String[] { "IsUpdate", });
    internal_static_lk_iit_retail_grpc_generated_GetCatalogueRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_lk_iit_retail_grpc_generated_GetCatalogueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lk_iit_retail_grpc_generated_GetCatalogueRequest_descriptor,
        new java.lang.String[] { });
    internal_static_lk_iit_retail_grpc_generated_Catalogue_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_lk_iit_retail_grpc_generated_Catalogue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lk_iit_retail_grpc_generated_Catalogue_descriptor,
        new java.lang.String[] { "Id", "Name", "Quantity", });
    internal_static_lk_iit_retail_grpc_generated_GetCatalogueResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_lk_iit_retail_grpc_generated_GetCatalogueResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lk_iit_retail_grpc_generated_GetCatalogueResponse_descriptor,
        new java.lang.String[] { "Catalogues", });
    internal_static_lk_iit_retail_grpc_generated_AddShoppingCartRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_lk_iit_retail_grpc_generated_AddShoppingCartRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lk_iit_retail_grpc_generated_AddShoppingCartRequest_descriptor,
        new java.lang.String[] { "CatalogueId", "Quantity", "ShopperId", });
    internal_static_lk_iit_retail_grpc_generated_AddShoppingCartResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_lk_iit_retail_grpc_generated_AddShoppingCartResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lk_iit_retail_grpc_generated_AddShoppingCartResponse_descriptor,
        new java.lang.String[] { "IsUpdated", });
    internal_static_lk_iit_retail_grpc_generated_CheckoutRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_lk_iit_retail_grpc_generated_CheckoutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lk_iit_retail_grpc_generated_CheckoutRequest_descriptor,
        new java.lang.String[] { "ShopperId", });
    internal_static_lk_iit_retail_grpc_generated_CheckoutResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_lk_iit_retail_grpc_generated_CheckoutResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lk_iit_retail_grpc_generated_CheckoutResponse_descriptor,
        new java.lang.String[] { "IsCheckout", });
    internal_static_lk_iit_retail_grpc_generated_NotifyRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_lk_iit_retail_grpc_generated_NotifyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lk_iit_retail_grpc_generated_NotifyRequest_descriptor,
        new java.lang.String[] { "NotifyType", "NotifyPayload", });
    internal_static_lk_iit_retail_grpc_generated_NotifyResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_lk_iit_retail_grpc_generated_NotifyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_lk_iit_retail_grpc_generated_NotifyResponse_descriptor,
        new java.lang.String[] { "IsUpdate", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
