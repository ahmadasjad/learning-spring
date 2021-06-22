package com.example.restservice.entities;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class AsapOrderTypeConverter implements AttributeConverter<AsapOrderType, String> {

        @Override
        public String convertToDatabaseColumn(AsapOrderType vehicle) {
            return vehicle.getShortName();
        }

        @Override
        public AsapOrderType convertToEntityAttribute(String dbData) {
            return AsapOrderType.fromShortName(dbData);
        }

}
