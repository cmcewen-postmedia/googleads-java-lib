// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

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
 *       Provides methods for creating, updating and retrieving {@link Contact} objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ContactServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201711")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ContactServiceInterface {


    /**
     * 
     *         Creates new {@link Contact} objects.
     *         
     *         @param contacts the contacts to create
     *         @return the created contacts with their IDs filled in
     *       
     * 
     * @param contacts
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201711.Contact>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201711")
    @RequestWrapper(localName = "createContacts", targetNamespace = "https://www.google.com/apis/ads/publisher/v201711", className = "com.google.api.ads.dfp.jaxws.v201711.ContactServiceInterfacecreateContacts")
    @ResponseWrapper(localName = "createContactsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201711", className = "com.google.api.ads.dfp.jaxws.v201711.ContactServiceInterfacecreateContactsResponse")
    public List<Contact> createContacts(
        @WebParam(name = "contacts", targetNamespace = "https://www.google.com/apis/ads/publisher/v201711")
        List<Contact> contacts)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link ContactPage} of {@link Contact} objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Contact#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code email}</td>
     *         <td>{@link Contact#email}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Contact#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code comment}</td>
     *         <td>{@link Contact#comment}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code companyId}</td>
     *         <td>{@link Contact#companyId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code title}</td>
     *         <td>{@link Contact#title}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code cellPhone}</td>
     *         <td>{@link Contact#cellPhone}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code workPhone}</td>
     *         <td>{@link Contact#workPhone}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code faxPhone}</td>
     *         <td>{@link Contact#faxPhone}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Contact#status}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of contacts
     *         @return the contacts that match the given filter
     *       
     * 
     * @param statement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201711.ContactPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201711")
    @RequestWrapper(localName = "getContactsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201711", className = "com.google.api.ads.dfp.jaxws.v201711.ContactServiceInterfacegetContactsByStatement")
    @ResponseWrapper(localName = "getContactsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201711", className = "com.google.api.ads.dfp.jaxws.v201711.ContactServiceInterfacegetContactsByStatementResponse")
    public ContactPage getContactsByStatement(
        @WebParam(name = "statement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201711")
        Statement statement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Contact} objects.
     *         
     *         @param contacts the contacts to update
     *         @return the updated contacts
     *       
     * 
     * @param contacts
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201711.Contact>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201711")
    @RequestWrapper(localName = "updateContacts", targetNamespace = "https://www.google.com/apis/ads/publisher/v201711", className = "com.google.api.ads.dfp.jaxws.v201711.ContactServiceInterfaceupdateContacts")
    @ResponseWrapper(localName = "updateContactsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201711", className = "com.google.api.ads.dfp.jaxws.v201711.ContactServiceInterfaceupdateContactsResponse")
    public List<Contact> updateContacts(
        @WebParam(name = "contacts", targetNamespace = "https://www.google.com/apis/ads/publisher/v201711")
        List<Contact> contacts)
        throws ApiException_Exception
    ;

}
