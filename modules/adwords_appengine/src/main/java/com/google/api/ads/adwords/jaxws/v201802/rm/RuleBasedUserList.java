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


package com.google.api.ads.adwords.jaxws.v201802.rm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Representation of a userlist that is generated by a rule.
 *           
 * 
 * <p>Java class for RuleBasedUserList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleBasedUserList">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/rm/v201802}UserList">
 *       &lt;sequence>
 *         &lt;element name="prepopulationStatus" type="{https://adwords.google.com/api/adwords/rm/v201802}RuleBasedUserList.PrepopulationStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleBasedUserList", propOrder = {
    "prepopulationStatus"
})
@XmlSeeAlso({
    DateSpecificRuleUserList.class,
    ExpressionRuleUserList.class,
    CombinedRuleUserList.class
})
public class RuleBasedUserList
    extends UserList
{

    @XmlSchemaType(name = "string")
    protected RuleBasedUserListPrepopulationStatus prepopulationStatus;

    /**
     * Gets the value of the prepopulationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RuleBasedUserListPrepopulationStatus }
     *     
     */
    public RuleBasedUserListPrepopulationStatus getPrepopulationStatus() {
        return prepopulationStatus;
    }

    /**
     * Sets the value of the prepopulationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleBasedUserListPrepopulationStatus }
     *     
     */
    public void setPrepopulationStatus(RuleBasedUserListPrepopulationStatus value) {
        this.prepopulationStatus = value;
    }

}
