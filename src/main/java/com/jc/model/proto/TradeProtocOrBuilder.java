// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Trade.proto

package com.jc.model.proto;

public interface TradeProtocOrBuilder extends
    // @@protoc_insertion_point(interface_extends:encoding.TradeProtoc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 tradeId = 1;</code>
   * @return The tradeId.
   */
  long getTradeId();

  /**
   * <code>int64 customerId = 2;</code>
   * @return The customerId.
   */
  long getCustomerId();

  /**
   * <code>int64 qty = 3;</code>
   * @return The qty.
   */
  long getQty();

  /**
   * <code>.encoding.TradeProtoc.TradeType tradeType = 4;</code>
   * @return The enum numeric value on the wire for tradeType.
   */
  int getTradeTypeValue();
  /**
   * <code>.encoding.TradeProtoc.TradeType tradeType = 4;</code>
   * @return The tradeType.
   */
  com.jc.model.proto.TradeProtoc.TradeType getTradeType();

  /**
   * <code>string symbol = 5;</code>
   * @return The symbol.
   */
  java.lang.String getSymbol();
  /**
   * <code>string symbol = 5;</code>
   * @return The bytes for symbol.
   */
  com.google.protobuf.ByteString
      getSymbolBytes();

  /**
   * <code>string exchange = 6;</code>
   * @return The exchange.
   */
  java.lang.String getExchange();
  /**
   * <code>string exchange = 6;</code>
   * @return The bytes for exchange.
   */
  com.google.protobuf.ByteString
      getExchangeBytes();
}
