
package sde.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getQuoteResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getQuoteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="finalquote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getQuoteResponse", propOrder = {
    "finalquote"
})
public class GetQuoteResponse {

    protected String finalquote;

    /**
     * Recupera il valore della proprietà finalquote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalquote() {
        return finalquote;
    }

    /**
     * Imposta il valore della proprietà finalquote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalquote(String value) {
        this.finalquote = value;
    }

}
