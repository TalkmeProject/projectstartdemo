package com.idglebik.ilikeit.dto;

import com.idglebik.ilikeit.enumerated.Aligment;
import com.idglebik.ilikeit.enumerated.MainInLife;
import com.idglebik.ilikeit.enumerated.MainInPeople;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LifePositionDto {
    private Aligment aligment;
    private MainInLife mainInLife;
    private MainInPeople mainInPeople;
}
