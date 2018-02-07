package com.integ.integration.services.contracts.common.rest;

import java.io.IOException;

public interface ContentUsingCapableDeserializer<T> {
    T deserializeContent(String string) throws IOException;
}
