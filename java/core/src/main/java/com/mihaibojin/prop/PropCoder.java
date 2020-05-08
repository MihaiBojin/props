package com.mihaibojin.prop;

@FunctionalInterface
public interface PropCoder<T> {
  /** Decodes and decrypts the passed string value into its final type */
  T decode(String value);

  /** Encodes the value as a {@link String} */
  default String encode(T value) {
    return value.toString();
  }
}
