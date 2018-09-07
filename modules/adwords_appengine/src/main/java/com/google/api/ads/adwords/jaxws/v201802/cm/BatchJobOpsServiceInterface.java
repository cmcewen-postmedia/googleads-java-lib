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
 *       IMPORTANT: THIS IS NOT A REAL SERVICE INTERFACE. It exists solely for the
 *       purpose of generating client library code. Do not attempt to send SOAP
 *       requests to this endpoint.
 *       
 *       <p>Service for BatchJob XML i/o. When submitting an XML file to BatchJobService,
 *       the input should be a single Mutate with any number of Operations. The output
 *       will be a single MutateResponse with the same number of MutateResults.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "BatchJobOpsServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BatchJobOpsServiceInterface {


    /**
     * 
     * @param operations
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201802.cm.MutateResult>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802", className = "com.google.api.ads.adwords.jaxws.v201802.cm.BatchJobOpsServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802", className = "com.google.api.ads.adwords.jaxws.v201802.cm.BatchJobOpsServiceInterfacemutateResponse")
    public List<MutateResult> mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201802")
        List<Operation> operations)
        throws ApiException_Exception
    ;

}
