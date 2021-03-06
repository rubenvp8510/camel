/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.main.RestConfigurationProperties;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class RestConfigurationPropertiesConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.RestConfigurationProperties target = (org.apache.camel.main.RestConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apicomponent":
        case "ApiComponent": target.setApiComponent(property(camelContext, java.lang.String.class, value)); return true;
        case "apicontextidpattern":
        case "ApiContextIdPattern": target.setApiContextIdPattern(property(camelContext, java.lang.String.class, value)); return true;
        case "apicontextlisting":
        case "ApiContextListing": target.setApiContextListing(property(camelContext, boolean.class, value)); return true;
        case "apicontextpath":
        case "ApiContextPath": target.setApiContextPath(property(camelContext, java.lang.String.class, value)); return true;
        case "apicontextrouteid":
        case "ApiContextRouteId": target.setApiContextRouteId(property(camelContext, java.lang.String.class, value)); return true;
        case "apihost":
        case "ApiHost": target.setApiHost(property(camelContext, java.lang.String.class, value)); return true;
        case "apiproperties":
        case "ApiProperties": target.setApiProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "apivendorextension":
        case "ApiVendorExtension": target.setApiVendorExtension(property(camelContext, boolean.class, value)); return true;
        case "bindingmode":
        case "BindingMode": target.setBindingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "clientrequestvalidation":
        case "ClientRequestValidation": target.setClientRequestValidation(property(camelContext, boolean.class, value)); return true;
        case "component":
        case "Component": target.setComponent(property(camelContext, java.lang.String.class, value)); return true;
        case "componentproperties":
        case "ComponentProperties": target.setComponentProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "consumerproperties":
        case "ConsumerProperties": target.setConsumerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "contextpath":
        case "ContextPath": target.setContextPath(property(camelContext, java.lang.String.class, value)); return true;
        case "corsheaders":
        case "CorsHeaders": target.setCorsHeaders(property(camelContext, java.util.Map.class, value)); return true;
        case "dataformatproperties":
        case "DataFormatProperties": target.setDataFormatProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "enablecors":
        case "EnableCORS": target.setEnableCORS(property(camelContext, boolean.class, value)); return true;
        case "endpointproperties":
        case "EndpointProperties": target.setEndpointProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "host":
        case "Host": target.setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "hostnameresolver":
        case "HostNameResolver": target.setHostNameResolver(property(camelContext, java.lang.String.class, value)); return true;
        case "jsondataformat":
        case "JsonDataFormat": target.setJsonDataFormat(property(camelContext, java.lang.String.class, value)); return true;
        case "port":
        case "Port": target.setPort(property(camelContext, int.class, value)); return true;
        case "producerapidoc":
        case "ProducerApiDoc": target.setProducerApiDoc(property(camelContext, java.lang.String.class, value)); return true;
        case "producercomponent":
        case "ProducerComponent": target.setProducerComponent(property(camelContext, java.lang.String.class, value)); return true;
        case "scheme":
        case "Scheme": target.setScheme(property(camelContext, java.lang.String.class, value)); return true;
        case "skipbindingonerrorcode":
        case "SkipBindingOnErrorCode": target.setSkipBindingOnErrorCode(property(camelContext, boolean.class, value)); return true;
        case "usexforwardheaders":
        case "UseXForwardHeaders": target.setUseXForwardHeaders(property(camelContext, boolean.class, value)); return true;
        case "xmldataformat":
        case "XmlDataFormat": target.setXmlDataFormat(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("ApiComponent", java.lang.String.class);
        answer.put("ApiContextIdPattern", java.lang.String.class);
        answer.put("ApiContextListing", boolean.class);
        answer.put("ApiContextPath", java.lang.String.class);
        answer.put("ApiContextRouteId", java.lang.String.class);
        answer.put("ApiHost", java.lang.String.class);
        answer.put("ApiProperties", java.util.Map.class);
        answer.put("ApiVendorExtension", boolean.class);
        answer.put("BindingMode", java.lang.String.class);
        answer.put("ClientRequestValidation", boolean.class);
        answer.put("Component", java.lang.String.class);
        answer.put("ComponentProperties", java.util.Map.class);
        answer.put("ConsumerProperties", java.util.Map.class);
        answer.put("ContextPath", java.lang.String.class);
        answer.put("CorsHeaders", java.util.Map.class);
        answer.put("DataFormatProperties", java.util.Map.class);
        answer.put("EnableCORS", boolean.class);
        answer.put("EndpointProperties", java.util.Map.class);
        answer.put("Host", java.lang.String.class);
        answer.put("HostNameResolver", java.lang.String.class);
        answer.put("JsonDataFormat", java.lang.String.class);
        answer.put("Port", int.class);
        answer.put("ProducerApiDoc", java.lang.String.class);
        answer.put("ProducerComponent", java.lang.String.class);
        answer.put("Scheme", java.lang.String.class);
        answer.put("SkipBindingOnErrorCode", boolean.class);
        answer.put("UseXForwardHeaders", boolean.class);
        answer.put("XmlDataFormat", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.main.RestConfigurationProperties target = (org.apache.camel.main.RestConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apicomponent":
        case "ApiComponent": return target.getApiComponent();
        case "apicontextidpattern":
        case "ApiContextIdPattern": return target.getApiContextIdPattern();
        case "apicontextlisting":
        case "ApiContextListing": return target.isApiContextListing();
        case "apicontextpath":
        case "ApiContextPath": return target.getApiContextPath();
        case "apicontextrouteid":
        case "ApiContextRouteId": return target.getApiContextRouteId();
        case "apihost":
        case "ApiHost": return target.getApiHost();
        case "apiproperties":
        case "ApiProperties": return target.getApiProperties();
        case "apivendorextension":
        case "ApiVendorExtension": return target.isApiVendorExtension();
        case "bindingmode":
        case "BindingMode": return target.getBindingMode();
        case "clientrequestvalidation":
        case "ClientRequestValidation": return target.isClientRequestValidation();
        case "component":
        case "Component": return target.getComponent();
        case "componentproperties":
        case "ComponentProperties": return target.getComponentProperties();
        case "consumerproperties":
        case "ConsumerProperties": return target.getConsumerProperties();
        case "contextpath":
        case "ContextPath": return target.getContextPath();
        case "corsheaders":
        case "CorsHeaders": return target.getCorsHeaders();
        case "dataformatproperties":
        case "DataFormatProperties": return target.getDataFormatProperties();
        case "enablecors":
        case "EnableCORS": return target.isEnableCORS();
        case "endpointproperties":
        case "EndpointProperties": return target.getEndpointProperties();
        case "host":
        case "Host": return target.getHost();
        case "hostnameresolver":
        case "HostNameResolver": return target.getHostNameResolver();
        case "jsondataformat":
        case "JsonDataFormat": return target.getJsonDataFormat();
        case "port":
        case "Port": return target.getPort();
        case "producerapidoc":
        case "ProducerApiDoc": return target.getProducerApiDoc();
        case "producercomponent":
        case "ProducerComponent": return target.getProducerComponent();
        case "scheme":
        case "Scheme": return target.getScheme();
        case "skipbindingonerrorcode":
        case "SkipBindingOnErrorCode": return target.isSkipBindingOnErrorCode();
        case "usexforwardheaders":
        case "UseXForwardHeaders": return target.isUseXForwardHeaders();
        case "xmldataformat":
        case "XmlDataFormat": return target.getXmlDataFormat();
        default: return null;
        }
    }
}

