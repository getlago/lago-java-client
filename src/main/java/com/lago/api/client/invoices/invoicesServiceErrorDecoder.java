package com.lago.api.client.invoices;

import com.lago.api.client.invoices.exceptions.DownloadException;
import com.lago.api.client.invoices.exceptions.FinalizeException;
import com.lago.api.client.invoices.exceptions.FindException;
import com.lago.api.client.invoices.exceptions.GetException;
import com.lago.api.client.invoices.exceptions.RefreshInvoiceException;
import com.lago.api.client.invoices.exceptions.RetryPaymentException;
import com.lago.api.client.invoices.exceptions.UpdateException;
import com.lago.api.core.ObjectMappers;
import feign.Response;
import feign.codec.ErrorDecoder;
import java.io.IOException;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;

final class invoicesServiceErrorDecoder implements ErrorDecoder {
  @Override
  public Exception decode(String methodKey, Response response) {
    try {
      if (methodKey.contains("get")) {
        return decodeException(response, GetException.class);
      }
      if (methodKey.contains("update")) {
        return decodeException(response, UpdateException.class);
      }
      if (methodKey.contains("download")) {
        return decodeException(response, DownloadException.class);
      }
      if (methodKey.contains("retryPayment")) {
        return decodeException(response, RetryPaymentException.class);
      }
      if (methodKey.contains("refreshInvoice")) {
        return decodeException(response, RefreshInvoiceException.class);
      }
      if (methodKey.contains("finalize")) {
        return decodeException(response, FinalizeException.class);
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
