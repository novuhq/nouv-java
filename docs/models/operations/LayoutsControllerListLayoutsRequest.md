# LayoutsControllerListLayoutsRequest


## Fields

| Field                                                                                                   | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `page`                                                                                                  | *Optional<? extends Double>*                                                                            | :heavy_minus_sign:                                                                                      | Number of page for pagination                                                                           |
| `pageSize`                                                                                              | *Optional<? extends Double>*                                                                            | :heavy_minus_sign:                                                                                      | Size of page for pagination                                                                             |
| `sortBy`                                                                                                | *Optional<? extends String>*                                                                            | :heavy_minus_sign:                                                                                      | Sort field. Currently only supported `createdAt`                                                        |
| `orderBy`                                                                                               | [Optional<? extends co.novu.co.novu.sdk.models.operations.OrderBy>](../../models/operations/OrderBy.md) | :heavy_minus_sign:                                                                                      | Direction of the sorting query param                                                                    |