/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.mongodb.gridfs;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GridFsEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "bucket": ((GridFsEndpoint) target).setBucket(property(camelContext, java.lang.String.class, value)); return true;
        case "database": ((GridFsEndpoint) target).setDatabase(property(camelContext, java.lang.String.class, value)); return true;
        case "readPreference": ((GridFsEndpoint) target).setReadPreference(property(camelContext, com.mongodb.ReadPreference.class, value)); return true;
        case "writeConcern": ((GridFsEndpoint) target).setWriteConcern(property(camelContext, com.mongodb.WriteConcern.class, value)); return true;
        case "bridgeErrorHandler": ((GridFsEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "delay": ((GridFsEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "fileAttributeName": ((GridFsEndpoint) target).setFileAttributeName(property(camelContext, java.lang.String.class, value)); return true;
        case "initialDelay": ((GridFsEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "persistentTSCollection": ((GridFsEndpoint) target).setPersistentTSCollection(property(camelContext, java.lang.String.class, value)); return true;
        case "persistentTSObject": ((GridFsEndpoint) target).setPersistentTSObject(property(camelContext, java.lang.String.class, value)); return true;
        case "query": ((GridFsEndpoint) target).setQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "queryStrategy": ((GridFsEndpoint) target).setQueryStrategy(property(camelContext, org.apache.camel.component.mongodb.gridfs.QueryStrategy.class, value)); return true;
        case "exceptionHandler": ((GridFsEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((GridFsEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazyStartProducer": ((GridFsEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((GridFsEndpoint) target).setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((GridFsEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((GridFsEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "bucket": ((GridFsEndpoint) target).setBucket(property(camelContext, java.lang.String.class, value)); return true;
        case "database": ((GridFsEndpoint) target).setDatabase(property(camelContext, java.lang.String.class, value)); return true;
        case "readpreference": ((GridFsEndpoint) target).setReadPreference(property(camelContext, com.mongodb.ReadPreference.class, value)); return true;
        case "writeconcern": ((GridFsEndpoint) target).setWriteConcern(property(camelContext, com.mongodb.WriteConcern.class, value)); return true;
        case "bridgeerrorhandler": ((GridFsEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "delay": ((GridFsEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "fileattributename": ((GridFsEndpoint) target).setFileAttributeName(property(camelContext, java.lang.String.class, value)); return true;
        case "initialdelay": ((GridFsEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "persistenttscollection": ((GridFsEndpoint) target).setPersistentTSCollection(property(camelContext, java.lang.String.class, value)); return true;
        case "persistenttsobject": ((GridFsEndpoint) target).setPersistentTSObject(property(camelContext, java.lang.String.class, value)); return true;
        case "query": ((GridFsEndpoint) target).setQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "querystrategy": ((GridFsEndpoint) target).setQueryStrategy(property(camelContext, org.apache.camel.component.mongodb.gridfs.QueryStrategy.class, value)); return true;
        case "exceptionhandler": ((GridFsEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((GridFsEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer": ((GridFsEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((GridFsEndpoint) target).setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((GridFsEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((GridFsEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
