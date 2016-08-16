
package recipe.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import recipestorage.service.Ingredient;
import recipestorage.service.Recipe;


/**
 * <p>Java-Klasse für updateRecipeIngredient complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="updateRecipeIngredient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://service.recipestorage/}recipe" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://service.recipestorage/}ingredient" minOccurs="0"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateRecipeIngredient", propOrder = {
    "arg0",
    "arg1",
    "arg2"
})
public class UpdateRecipeIngredient {

    protected Recipe arg0;
    protected Ingredient arg1;
    protected int arg2;

    /**
     * Ruft den Wert der arg0-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Recipe }
     *     
     */
    public Recipe getArg0() {
        return arg0;
    }

    /**
     * Legt den Wert der arg0-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Recipe }
     *     
     */
    public void setArg0(Recipe value) {
        this.arg0 = value;
    }

    /**
     * Ruft den Wert der arg1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Ingredient }
     *     
     */
    public Ingredient getArg1() {
        return arg1;
    }

    /**
     * Legt den Wert der arg1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Ingredient }
     *     
     */
    public void setArg1(Ingredient value) {
        this.arg1 = value;
    }

    /**
     * Ruft den Wert der arg2-Eigenschaft ab.
     * 
     */
    public int getArg2() {
        return arg2;
    }

    /**
     * Legt den Wert der arg2-Eigenschaft fest.
     * 
     */
    public void setArg2(int value) {
        this.arg2 = value;
    }

}
