// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sirup_auth.proto

package sirup.service.auth.rpc.proto;

public interface TokenResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:auth.proto.TokenResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.auth.proto.ErrorRpc error = 1;</code>
   */
  boolean hasError();
  /**
   * <code>.auth.proto.ErrorRpc error = 1;</code>
   */
  sirup.service.auth.rpc.proto.ErrorRpc getError();
  /**
   * <code>.auth.proto.ErrorRpc error = 1;</code>
   */
  sirup.service.auth.rpc.proto.ErrorRpcOrBuilder getErrorOrBuilder();

  /**
   * <code>string token = 2;</code>
   */
  java.lang.String getToken();
  /**
   * <code>string token = 2;</code>
   */
  com.google.protobuf.ByteString
      getTokenBytes();
}