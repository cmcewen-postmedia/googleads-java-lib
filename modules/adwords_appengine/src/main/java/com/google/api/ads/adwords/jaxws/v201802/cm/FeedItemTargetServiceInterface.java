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
 *       Service for getting and mutating FeedItemTargets.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "FeedItemTargetServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FeedItemTargetServiceInterface {


    /**
     * 
     *         Returns a list of FeedItemTargets that meet the selector criteria.
     *         
     *         @param selector Determines which FeedItemTargets to return. If empty all FeedItemTargets are
     *         returned.
     *         @return The list of FeedItemTargets.
     *         @throws ApiException Indicates a problem with the request.
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201802.cm.FeedItemTargetPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802", className = "com.google.api.ads.adwords.jaxws.v201802.cm.FeedItemTargetServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802", className = "com.google.api.ads.adwords.jaxws.v201802.cm.FeedItemTargetServiceInterfacegetResponse")
    public FeedItemTargetPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802")
        Selector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Add and remove FeedItemTargets.
     *         
     *         @param operations The operations to apply.
     *         @return The resulting FeedItemTargets.
     *         @throws ApiException Indicates a problem with the request.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201802.cm.FeedItemTargetReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802", className = "com.google.api.ads.adwords.jaxws.v201802.cm.FeedItemTargetServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802", className = "com.google.api.ads.adwords.jaxws.v201802.cm.FeedItemTargetServiceInterfacemutateResponse")
    public FeedItemTargetReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802")
        List<FeedItemTargetOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the list of FeedItemTargets that match the query.
     *         
     *         @param query The SQL-like AWQL query string
     *         @return A list of FeedItemTargets
     *         @throws ApiException when the query is invalid or there are errors processing the request.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201802.cm.FeedItemTargetPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802", className = "com.google.api.ads.adwords.jaxws.v201802.cm.FeedItemTargetServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802", className = "com.google.api.ads.adwords.jaxws.v201802.cm.FeedItemTargetServiceInterfacequeryResponse")
    public FeedItemTargetPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802")
        String query)
        throws ApiException_Exception
    ;

}
