package com.commerce.sn_monitor.domain;

import lombok.Data;

import java.util.List;

@Data
public class AddressResource
{
    private List<Location> suggestions;

    public Location getFirst()
    {
        if (suggestions.size() == 0)
            return new Location();
        return suggestions.get(0);
    }
}
