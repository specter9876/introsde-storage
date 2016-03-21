
package sde.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per removeUserResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="removeUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="removed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeUserResponse", propOrder = {
    "removed"
})
public class RemoveUserResponse {

    protected boolean removed;

    /**
     * Recupera il valore della proprietà removed.
     * 
     */
    public boolean isRemoved() {
        return removed;
    }

    /**
     * Imposta il valore della proprietà removed.
     * 
     */
    public void setRemoved(boolean value) {
        this.removed = value;
    }

}
