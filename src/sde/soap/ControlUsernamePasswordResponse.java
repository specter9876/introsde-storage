
package sde.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per controlUsernamePasswordResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="controlUsernamePasswordResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="control" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "controlUsernamePasswordResponse", propOrder = {
    "control"
})
public class ControlUsernamePasswordResponse {

    protected boolean control;

    /**
     * Recupera il valore della proprietà control.
     * 
     */
    public boolean isControl() {
        return control;
    }

    /**
     * Imposta il valore della proprietà control.
     * 
     */
    public void setControl(boolean value) {
        this.control = value;
    }

}
