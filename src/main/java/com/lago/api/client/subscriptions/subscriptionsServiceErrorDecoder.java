package com.lago.api.client.subscriptions;

import com.lago.api.client.subscriptions.exceptions.CreateException;
import com.lago.api.client.subscriptions.exceptions.DeleteException;
import com.lago.api.client.subscriptions.exceptions.FindException;
import com.lago.api.client.subscriptions.exceptions.UpdateException;
import com.lago.api.core.ObjectMappers;
import feign.Response;
import feign.codec.ErrorDecoder;
import java.io.IOException;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;

final class subscriptionsServiceErrorDecoder implements ErrorDecoder {
  @Override
  public Exception decode(String methodKey, Response response) {
    try {
      if (methodKey.contains("create")) {
        return decodeException(response, CreateException.class);
      }
      if (methodKey.contains("update")) {
        return decodeException(response, UpdateException.class);
      }
      if (methodKey.contains("delete")) {
        return decodeException(response, DeleteException.class);
      }
      if (methodKey.contains("find")) {
        return decodeException(response, FindException.class);
      }
    }
    catch (IOException e) {
    }
    return new RuntimeException("Failed to read response body. Received status " + response.status() + " for method " + methodKey);
  }

  private static <T extends Exception> Exception decodeException(Response response, Class<T> clazz)
      throws IOException {
    return ObjectMappers.JSON_MAPPER.reader().withAttribute("statusCode", response.status()).readValue(response.body().asInputStream(), clazz);
  }
}
