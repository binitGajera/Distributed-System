//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.14 at 04:35:08 PM EST 
//


package com.aos.servers;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.aos.servers package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.aos.servers
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link Sub }
     * 
     */
    public Sub createSub() {
        return new Sub();
    }

    /**
     * Create an instance of {@link LoadRequest }
     * 
     */
    public LoadRequest createLoadRequest() {
        return new LoadRequest();
    }

    /**
     * Create an instance of {@link ServerIdentity }
     * 
     */
    public ServerIdentity createServerIdentity() {
        return new ServerIdentity();
    }

    /**
     * Create an instance of {@link Multi }
     * 
     */
    public Multi createMulti() {
        return new Multi();
    }

    /**
     * Create an instance of {@link GetServerIdentityRequest }
     * 
     */
    public GetServerIdentityRequest createGetServerIdentityRequest() {
        return new GetServerIdentityRequest();
    }

    /**
     * Create an instance of {@link GetServerIdentityResponse }
     * 
     */
    public GetServerIdentityResponse createGetServerIdentityResponse() {
        return new GetServerIdentityResponse();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

}
