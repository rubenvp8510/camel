/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.sheets.stream;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GoogleSheetsStreamEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "accessToken": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationName": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeErrorHandler": ((GoogleSheetsStreamEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "clientId": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientSecret": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "includeGridData": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setIncludeGridData(property(camelContext, boolean.class, value)); return true;
        case "majorDimension": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setMajorDimension(property(camelContext, java.lang.String.class, value)); return true;
        case "maxResults": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setMaxResults(property(camelContext, int.class, value)); return true;
        case "range": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setRange(property(camelContext, java.lang.String.class, value)); return true;
        case "refreshToken": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
        case "scopes": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setScopes(property(camelContext, java.util.List.class, value)); return true;
        case "sendEmptyMessageWhenIdle": ((GoogleSheetsStreamEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "splitResults": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setSplitResults(property(camelContext, boolean.class, value)); return true;
        case "spreadsheetId": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setSpreadsheetId(property(camelContext, java.lang.String.class, value)); return true;
        case "valueRenderOption": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setValueRenderOption(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionHandler": ((GoogleSheetsStreamEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((GoogleSheetsStreamEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollStrategy": ((GoogleSheetsStreamEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "basicPropertyBinding": ((GoogleSheetsStreamEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((GoogleSheetsStreamEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backoffErrorThreshold": ((GoogleSheetsStreamEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffIdleThreshold": ((GoogleSheetsStreamEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffMultiplier": ((GoogleSheetsStreamEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((GoogleSheetsStreamEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((GoogleSheetsStreamEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialDelay": ((GoogleSheetsStreamEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatCount": ((GoogleSheetsStreamEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runLoggingLevel": ((GoogleSheetsStreamEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledExecutorService": ((GoogleSheetsStreamEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((GoogleSheetsStreamEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerProperties": ((GoogleSheetsStreamEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startScheduler": ((GoogleSheetsStreamEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeUnit": ((GoogleSheetsStreamEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "useFixedDelay": ((GoogleSheetsStreamEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "accesstoken": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationname": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler": ((GoogleSheetsStreamEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "clientid": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "includegriddata": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setIncludeGridData(property(camelContext, boolean.class, value)); return true;
        case "majordimension": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setMajorDimension(property(camelContext, java.lang.String.class, value)); return true;
        case "maxresults": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setMaxResults(property(camelContext, int.class, value)); return true;
        case "range": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setRange(property(camelContext, java.lang.String.class, value)); return true;
        case "refreshtoken": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
        case "scopes": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setScopes(property(camelContext, java.util.List.class, value)); return true;
        case "sendemptymessagewhenidle": ((GoogleSheetsStreamEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "splitresults": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setSplitResults(property(camelContext, boolean.class, value)); return true;
        case "spreadsheetid": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setSpreadsheetId(property(camelContext, java.lang.String.class, value)); return true;
        case "valuerenderoption": ((GoogleSheetsStreamEndpoint) target).getConfiguration().setValueRenderOption(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler": ((GoogleSheetsStreamEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((GoogleSheetsStreamEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollstrategy": ((GoogleSheetsStreamEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "basicpropertybinding": ((GoogleSheetsStreamEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((GoogleSheetsStreamEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold": ((GoogleSheetsStreamEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold": ((GoogleSheetsStreamEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier": ((GoogleSheetsStreamEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((GoogleSheetsStreamEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((GoogleSheetsStreamEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay": ((GoogleSheetsStreamEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount": ((GoogleSheetsStreamEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel": ((GoogleSheetsStreamEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice": ((GoogleSheetsStreamEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((GoogleSheetsStreamEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties": ((GoogleSheetsStreamEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler": ((GoogleSheetsStreamEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit": ((GoogleSheetsStreamEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay": ((GoogleSheetsStreamEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
