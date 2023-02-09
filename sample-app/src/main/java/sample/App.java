package sample;

import com.lago.api.client.billable.metrics.endpoints.FindMetricGroups;
import com.lago.api.client.billable.metrics.types.Groups;
import com.lago.api.core.BearerAuth;
import java.lang.String;
import com.lago.api.LagoApiClient;
import java.util.List;

public final class App {
  public static void main(String[] args) {
    LagoApiClient lago =
            new LagoApiClient(BearerAuth.of(System.getenv("LAGO_TOKEN")));
    try {
      Groups groups = lago.billableMetrics().findMetricGroups(FindMetricGroups.Request.builder()
              .code("code")
              .build());
      System.out.println("Received " + groups.getGroups().map(List::size).orElse(0) + " groups");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
