package com.commerce.sn_monitor.domain;

import lombok.Data;

import java.util.List;

@Data
public class BankResource
{
    private List<Bank> suggestions;

    public Bank getFirst()
    {
        if (suggestions.size() == 0)
            return new Bank();
        return suggestions.get(0);
    }
}
