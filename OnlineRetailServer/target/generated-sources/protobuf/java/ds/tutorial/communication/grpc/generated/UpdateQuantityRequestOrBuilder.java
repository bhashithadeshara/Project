// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BankService.proto

package ds.tutorial.communication.grpc.generated;

public interface UpdateQuantityRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ds.tutorial.communication.grpc.generated.UpdateQuantityRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string itemId = 1;</code>
   * @return The itemId.
   */
  java.lang.String getItemId();
  /**
   * <code>string itemId = 1;</code>
   * @return The bytes for itemId.
   */
  com.google.protobuf.ByteString
      getItemIdBytes();

  /**
   * <code>double value = 2;</code>
   * @return The value.
   */
  double getValue();

  /**
   * <code>bool isSentByPrimary = 3;</code>
   * @return The isSentByPrimary.
   */
  boolean getIsSentByPrimary();
}
