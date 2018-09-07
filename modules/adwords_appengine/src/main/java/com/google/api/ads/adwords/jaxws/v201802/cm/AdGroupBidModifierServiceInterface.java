// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201802.cm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Service used to manage campaign criterion bid overrides at the ad group level.
 *       Currently this service supports Platform and PreferredContent bid multiplier overrides.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AdGroupBidModifierServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdGroupBidModifierServiceInterface {


    /**
     * 
     *         Gets ad group level criterion bid modifiers.
     *         
     *         @param selector The selector specifying the {@link AdGroupBidModifier}s to return.
     *         @return A list of ad group bid modifiers.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201802.cm.AdGroupBidModifierPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802", className = "com.google.api.ads.adwords.jaxws.v201802.cm.AdGroupBidModifierServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802", className = "com.google.api.ads.adwords.jaxws.v201802.cm.AdGroupBidModifierServiceInterfacegetResponse")
    public AdGroupBidModifierPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802")
        Selector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Adds, removes or updates ad group bid modifier overrides.
     *         
     *         @param operations The operations to apply.
     *         @return The added ad group bid modifier overrides.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201802.cm.AdGroupBidModifierReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802", className = "com.google.api.ads.adwords.jaxws.v201802.cm.AdGroupBidModifierServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802", className = "com.google.api.ads.adwords.jaxws.v201802.cm.AdGroupBidModifierServiceInterfacemutateResponse")
    public AdGroupBidModifierReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802")
        List<AdGroupBidModifierOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of {@link AdGroupBidModifier}s that match the query.
     *         
     *         @param query The SQL-like AWQL query string.
     *         @throws ApiException when there are one or more errors with the request.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201802.cm.AdGroupBidModifierPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802", className = "com.google.api.ads.adwords.jaxws.v201802.cm.AdGroupBidModifierServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802", className = "com.google.api.ads.adwords.jaxws.v201802.cm.AdGroupBidModifierServiceInterfacequeryResponse")
    public AdGroupBidModifierPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802")
        String query)
        throws ApiException_Exception
    ;

}
