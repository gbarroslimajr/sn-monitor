package com.commerce.sn_monitor.domain;

import lombok.Data;

import java.util.List;

@Data
public class CompanyResource
{
    private List<Company> suggestions;

    public Company getFirst()
    {
        if (suggestions.size() == 0)
            return new Company();
        return suggestions.get(0);
    }
}
