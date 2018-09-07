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

/**
 * UploadMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.rm;


/**
 * Interface for metadata associated with an offline data upload.
 */
public class UploadMetadata  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201802.rm.StoreSalesUploadCommonMetadata storeSalesUploadCommonMetadata;

    public UploadMetadata() {
    }

    public UploadMetadata(
           com.google.api.ads.adwords.axis.v201802.rm.StoreSalesUploadCommonMetadata storeSalesUploadCommonMetadata) {
           this.storeSalesUploadCommonMetadata = storeSalesUploadCommonMetadata;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("storeSalesUploadCommonMetadata", getStoreSalesUploadCommonMetadata())
            .toString();
    }

    /**
     * Gets the storeSalesUploadCommonMetadata value for this UploadMetadata.
     * 
     * @return storeSalesUploadCommonMetadata
     */
    public com.google.api.ads.adwords.axis.v201802.rm.StoreSalesUploadCommonMetadata getStoreSalesUploadCommonMetadata() {
        return storeSalesUploadCommonMetadata;
    }


    /**
     * Sets the storeSalesUploadCommonMetadata value for this UploadMetadata.
     * 
     * @param storeSalesUploadCommonMetadata
     */
    public void setStoreSalesUploadCommonMetadata(com.google.api.ads.adwords.axis.v201802.rm.StoreSalesUploadCommonMetadata storeSalesUploadCommonMetadata) {
        this.storeSalesUploadCommonMetadata = storeSalesUploadCommonMetadata;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadMetadata)) return false;
        UploadMetadata other = (UploadMetadata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.storeSalesUploadCommonMetadata==null && other.getStoreSalesUploadCommonMetadata()==null) || 
             (this.storeSalesUploadCommonMetadata!=null &&
              this.storeSalesUploadCommonMetadata.equals(other.getStoreSalesUploadCommonMetadata())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getStoreSalesUploadCommonMetadata() != null) {
            _hashCode += getStoreSalesUploadCommonMetadata().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadMetadata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "UploadMetadata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeSalesUploadCommonMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "StoreSalesUploadCommonMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "StoreSalesUploadCommonMetadata"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
