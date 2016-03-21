
package sde.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import introsde.document.soap.Food;


/**
 * <p>Classe Java per createFoodResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="createFoodResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="food" type="{http://soap.document.introsde/}food" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createFoodResponse", propOrder = {
    "food"
})
public class CreateFoodResponse {

    protected Food food;

    /**
     * Recupera il valore della proprietà food.
     * 
     * @return
     *     possible object is
     *     {@link Food }
     *     
     */
    public Food getFood() {
        return food;
    }

    /**
     * Imposta il valore della proprietà food.
     * 
     * @param value
     *     allowed object is
     *     {@link Food }
     *     
     */
    public void setFood(Food value) {
        this.food = value;
    }

}
