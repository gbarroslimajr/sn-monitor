package com.commerce.sn_monitor.domain;

import com.commerce.sn_monitor.domain.iml.ImlOrderDeliveryStatusRequest;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ImlOrderDeliveryStatusRequest.class, name = "ImlOrderDeliveryStatusRequest")
})
public interface OrderDeliveryStatusRequest
{
}
