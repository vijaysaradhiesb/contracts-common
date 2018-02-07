package com.integ.integration.services.contracts.common;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class CalendarDateSerializer extends JsonSerializer<Calendar> {
    @Override
    public void serialize(Calendar value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
        String dateAsString = new SimpleDateFormat("yyyy-MM-dd").format(value.getTime());
        gen.writeString(dateAsString);
    }

    @Override
    public void serializeWithType(Calendar value, JsonGenerator gen, SerializerProvider serializers, TypeSerializer typeSer) throws IOException {
        serialize(value, gen, serializers);
    }
}
