# YaLD Binding

This binding can handle YaLD simple LED dimmer boards.

## Supported Things

This binding supports YaLD boards from https://github.com/michz/yald .

## Binding Configuration

There are no overall binding configuration settings that need to be set. All settings are through thing configuration parameters.

Perhaps later there will be choosable options regarding how the boards are connected/reachable.

## Thing Configuration

| Parameter Label              | Parameter ID             | Description                                        | Required |
|------------------------------|--------------------------|----------------------------------------------------|----------|
| IP Address                   | ipAddress                | The IP address of the YaLD board                   | true     |

## Channels

| Channel Type ID | Item Type    | Description                               |
|-----------------|--------------|-------------------------------------------|
| channel1        | Dimmer       | Dimmer value of Channel  1                |
| channel2        | Dimmer       | Dimmer value of Channel  2                |
| channel3        | Dimmer       | Dimmer value of Channel  3                |
| channel4        | Dimmer       | Dimmer value of Channel  4                |
| channel5        | Dimmer       | Dimmer value of Channel  5                |
| channel6        | Dimmer       | Dimmer value of Channel  6                |
| channel7        | Dimmer       | Dimmer value of Channel  7                |
| channel8        | Dimmer       | Dimmer value of Channel  8                |
| channel9        | Dimmer       | Dimmer value of Channel  9                |
| channel10       | Dimmer       | Dimmer value of Channel 10                |
| channel11       | Dimmer       | Dimmer value of Channel 11                |
| channel12       | Dimmer       | Dimmer value of Channel 12                |
| channel13       | Dimmer       | Dimmer value of Channel 13                |
| channel14       | Dimmer       | Dimmer value of Channel 14                |
| channel15       | Dimmer       | Dimmer value of Channel 15                |
| channel16       | Dimmer       | Dimmer value of Channel 16                |

## Full Example

**demo.things**

```
yald:yald:office_controller "Desk lighting" [ ipAddress="192.168.188.26" ]
```

**demo.items**

```
Dimmer Light_Desk1 { channel="yald:yald:office_controller:channel1"}
Dimmer Light_Desk2 { channel="yald:yald:office_controller:channel4"}
Dimmer Light_Desk3 { channel="yald:yald:office_controller:channel10"}
Dimmer Ambience    { channel="yald:yald:office_controller:channel16"}
```
