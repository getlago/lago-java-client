

# WalletCreateInputWalletRecurringTransactionRulesInner

Object that represents rule for wallet recurring transactions.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ruleType** | [**RuleTypeEnum**](#RuleTypeEnum) | The rule type. Possible values are &#x60;interval&#x60; or &#x60;threshold&#x60;. |  |
|**interval** | [**IntervalEnum**](#IntervalEnum) | The interval used for recurring top-up. It represents the frequency at which automatic top-up occurs. The interval can be one of the following values: &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60; or &#x60;yearly&#x60;. Required only when rule type is &#x60;interval&#x60;. |  [optional] |
|**thresholdCredits** | **String** | The threshold for recurring top-ups is the value at which an automatic top-up is triggered. For example, if this threshold is set at 10 credits, an automatic top-up will occur whenever the wallet balance falls to or below 10 credits. Required only when rule type is set to &#x60;threshold&#x60;. |  [optional] |



## Enum: RuleTypeEnum

| Name | Value |
|---- | -----|
| INTERVAL | &quot;interval&quot; |
| THRESHOLD | &quot;threshold&quot; |



## Enum: IntervalEnum

| Name | Value |
|---- | -----|
| WEEKLY | &quot;weekly&quot; |
| MONTHLY | &quot;monthly&quot; |
| QUARTERLY | &quot;quarterly&quot; |
| YEARLY | &quot;yearly&quot; |



