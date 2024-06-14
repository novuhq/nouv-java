# UpdateSubscriberPreferenceRequestDto


## Fields

| Field                                                                                                                       | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `channel`                                                                                                                   | [Optional<? extends co.novu.co.novu.sdk.models.components.ChannelPreference>](../../models/components/ChannelPreference.md) | :heavy_minus_sign:                                                                                                          | The subscriber preferences for every ChannelTypeEnum for the workflow assigned.                                             |
| `enabled`                                                                                                                   | *Optional<? extends Boolean>*                                                                                               | :heavy_minus_sign:                                                                                                          | Sets if the workflow is fully enabled for all channels or not for the subscriber.                                           |