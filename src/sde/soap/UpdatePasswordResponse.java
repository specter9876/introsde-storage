
package sde.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per updatePasswordResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="updatePasswordResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updatef" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePasswordResponse", propOrder = {
    "updatef"
})
public class UpdatePasswordResponse {

    protected boolean updatef;

    /**
     * Recupera il valore della proprietà updatef.
     * 
     */
    public boolean isUpdatef() {
        return updatef;
    }

    /**
     * Imposta il valore della proprietà updatef.
     * 
     */
    public void setUpdatef(boolean value) {
        this.updatef = value;
    }

}
