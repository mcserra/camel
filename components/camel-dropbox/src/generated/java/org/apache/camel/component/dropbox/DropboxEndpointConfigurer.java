/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.dropbox;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DropboxEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("operation", org.apache.camel.component.dropbox.util.DropboxOperation.class);
        map.put("accessToken", java.lang.String.class);
        map.put("client", com.dropbox.core.v2.DbxClientV2.class);
        map.put("clientIdentifier", java.lang.String.class);
        map.put("localPath", java.lang.String.class);
        map.put("newRemotePath", java.lang.String.class);
        map.put("query", java.lang.String.class);
        map.put("remotePath", java.lang.String.class);
        map.put("uploadMode", org.apache.camel.component.dropbox.util.DropboxUploadMode.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(DropboxEndpointConfigurer::clearConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DropboxEndpoint target = (DropboxEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": target.getConfiguration().setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "client": target.getConfiguration().setClient(property(camelContext, com.dropbox.core.v2.DbxClientV2.class, value)); return true;
        case "clientidentifier":
        case "clientIdentifier": target.getConfiguration().setClientIdentifier(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "localpath":
        case "localPath": target.getConfiguration().setLocalPath(property(camelContext, java.lang.String.class, value)); return true;
        case "newremotepath":
        case "newRemotePath": target.getConfiguration().setNewRemotePath(property(camelContext, java.lang.String.class, value)); return true;
        case "query": target.getConfiguration().setQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "remotepath":
        case "remotePath": target.getConfiguration().setRemotePath(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "uploadmode":
        case "uploadMode": target.getConfiguration().setUploadMode(property(camelContext, org.apache.camel.component.dropbox.util.DropboxUploadMode.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    public static void clearBootstrapConfigurers() {
    }

    public static void clearConfigurers() {
        ALL_OPTIONS.clear();
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DropboxEndpoint target = (DropboxEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return target.getConfiguration().getAccessToken();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "client": return target.getConfiguration().getClient();
        case "clientidentifier":
        case "clientIdentifier": return target.getConfiguration().getClientIdentifier();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "localpath":
        case "localPath": return target.getConfiguration().getLocalPath();
        case "newremotepath":
        case "newRemotePath": return target.getConfiguration().getNewRemotePath();
        case "query": return target.getConfiguration().getQuery();
        case "remotepath":
        case "remotePath": return target.getConfiguration().getRemotePath();
        case "synchronous": return target.isSynchronous();
        case "uploadmode":
        case "uploadMode": return target.getConfiguration().getUploadMode();
        default: return null;
        }
    }
}

