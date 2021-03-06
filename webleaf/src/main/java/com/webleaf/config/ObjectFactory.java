//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2021.03.15 at 10:17:38 AM IST 
//


package com.webleaf.config;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webleaf.config package. 
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

    private final static QName _WebleafConfig_QNAME = new QName("http://www.webleaf.com/config", "webleaf-config");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webleaf.config
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WebLeafConfig }
     * 
     */
    public WebLeafConfig createWebLeafConfig() {
        return new WebLeafConfig();
    }

    /**
     * Create an instance of {@link CommandConfig }
     * 
     */
    public CommandConfig createCommandConfig() {
        return new CommandConfig();
    }

    /**
     * Create an instance of {@link Command }
     * 
     */
    public Command createCommand() {
        return new Command();
    }

    /**
     * Create an instance of {@link Outcome }
     * 
     */
    public Outcome createOutcome() {
        return new Outcome();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebLeafConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WebLeafConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.webleaf.com/config", name = "webleaf-config")
    public JAXBElement<WebLeafConfig> createWebleafConfig(WebLeafConfig value) {
        return new JAXBElement<WebLeafConfig>(_WebleafConfig_QNAME, WebLeafConfig.class, null, value);
    }

}
