package com.wgdetective.projectstartdemo.converter;

import com.wgdetective.projectstartdemo.dbo.PositionDbo;
import com.wgdetective.projectstartdemo.dto.PositionDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class PositionConverter implements DtoConverter<PositionDto, PositionDbo>{
    @Override
    public PositionDto convertToDto(final PositionDbo dbo) {
        final PositionDto positionDto = new PositionDto();
        BeanUtils.copyProperties(dbo,positionDto);
        return positionDto;
    }

    @Override
    public PositionDbo convertToDbo(final PositionDto dto) {
        final PositionDbo positionDbo = new PositionDbo();
        BeanUtils.copyProperties(dto, positionDbo);
        return positionDbo;
    }
}
