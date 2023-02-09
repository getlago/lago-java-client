package com.lago.api.client.billable.metrics;

import com.lago.api.client.billable.metrics.exceptions.CreateException;
import com.lago.api.client.billable.metrics.exceptions.DestroyException;
import com.lago.api.client.billable.metrics.exceptions.FindMetricGroupsException;
import com.lago.api.client.billable.metrics.exceptions.GetAllException;
import com.lago.api.client.billable.metrics.exceptions.GetException;
import com.lago.api.client.billable.metrics.exceptions.UpdateException;
import com.lago.api.core.ObjectMappers;
import feign.Response;
import feign.codec.ErrorDecoder;
import java.io.IOException;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;

final class billableMetricsServiceErrorDecoder implements ErrorDecoder {
  @Override
  public Exception decode(String methodKey, Response response) {
    try {
      if (methodKey.contains("create")) {
        return decodeException(response, CreateException.class);
      }
      if (methodKey.contains("get")) {
        return decodeException(response, GetException.class);
      }
      if (methodKey.contains("update")) {
        return decodeException(response, UpdateException.class);
      }
      if (methodKey.contains("destroy")) {
        return decodeException(response, DestroyException.class);
      }
      if (methodKey.contains("getAll")) {
        return decodeException(response, GetAllException.class);
      }
      if (methodKey.contains("findMetricGroups")) {
        return decodeException(response, FindMetricGroupsException.class);
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
