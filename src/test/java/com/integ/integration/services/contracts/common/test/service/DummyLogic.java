package com.integ.integration.services.contracts.common.test.service;


import com.integ.integration.services.contracts.common.test.dto.*;

import java.util.Calendar;

public class DummyLogic {

    public AbstractDummy copyFields(AbstractDummy request) {
        if (request instanceof AbstractDatesDummy) {
            return processDateRequest((DateDummyRequest) request);
        } else if (request instanceof AbstractNumericDummy) {
            return processNumericRequest((NumericDummyRequest)request);
        } else if (request instanceof AbstractListsDummy) {
            return processListsRequest((AbstractListsDummy)request);
        } else if (request instanceof AbstractComplexObject) {
            return processAbstractRequest((AbstractComplexObject)request);
        }

        throw new IllegalArgumentException("not implemented: " + request.toString());
    }

    private AbstractDummy processAbstractRequest(AbstractComplexObject request) {
        if (request instanceof ComplexObjectA) {
            ((ComplexObjectA) request).setStringA(((ComplexObjectA) request).getStringA() + " EDITED");
        } else if (request instanceof ComplexObjectB) {
            ((ComplexObjectB) request).setStringB(((ComplexObjectB) request).getStringB() + " EDITED");
        }

        for (AbstractComplexObject aco : request.getAbstracts()) {
            processAbstractRequest(aco);
        }

        return request;
    }

    private AbstractDummy processListsRequest(AbstractListsDummy request) {
        for (Calendar c : request.getDateTime()) {
            c.add(Calendar.YEAR, 1);
        }
        for (Calendar c : request.getDate()) {
            c.add(Calendar.YEAR, 1);
        }
        return new ListsDummyResponse(request.getString(), request.getDateTime(), request.getDate(), request.getDn(), request.getIn(), request.getLn());
    }

    private AbstractDummy processNumericRequest(NumericDummyRequest request) {
        return new NumericDummyResponse(request.getDn(), request.getIn(), request.getLn());
    }

    private AbstractDummy processDateRequest(DateDummyRequest request) {
        return new DateDummyResponse(request.getDate(), request.getDateTime());
    }
}
