// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sirup_auth.proto

package sirup.service.auth.rpc.proto;

public interface AuthRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:auth.proto.AuthRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string token = 1;</code>
   */
  java.lang.String getToken();
  /**
   * <code>string token = 1;</code>
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <code>.auth.proto.CredentialsRpc CredentialsRpc = 2;</code>
   */
  boolean hasCredentialsRpc();
  /**
   * <code>.auth.proto.CredentialsRpc CredentialsRpc = 2;</code>
   */
  sirup.service.auth.rpc.proto.CredentialsRpc getCredentialsRpc();
  /**
   * <code>.auth.proto.CredentialsRpc CredentialsRpc = 2;</code>
   */
  sirup.service.auth.rpc.proto.CredentialsRpcOrBuilder getCredentialsRpcOrBuilder();
}
