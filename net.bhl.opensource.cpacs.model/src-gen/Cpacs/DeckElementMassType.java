/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deck Element Mass Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DeckElementMassType#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.DeckElementMassType#getLocation <em>Location</em>}</li>
 *   <li>{@link Cpacs.DeckElementMassType#getMassInertia <em>Mass Inertia</em>}</li>
 *   <li>{@link Cpacs.DeckElementMassType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDeckElementMassType()
 * @model extendedMetaData="name='deckElementMassType' kind='elementOnly'"
 * @generated
 */
public interface DeckElementMassType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mass value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass</em>' containment reference.
	 * @see #setMass(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDeckElementMassType_Mass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mass' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMass();

	/**
	 * Sets the value of the '{@link Cpacs.DeckElementMassType#getMass <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' containment reference.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Center of gravity (x,y,z)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(PointType)
	 * @see Cpacs.CpacsPackage#getDeckElementMassType_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	PointType getLocation();

	/**
	 * Sets the value of the '{@link Cpacs.DeckElementMassType#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(PointType value);

	/**
	 * Returns the value of the '<em><b>Mass Inertia</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Inertia</em>' containment reference.
	 * @see #setMassInertia(MassInertiaType)
	 * @see Cpacs.CpacsPackage#getDeckElementMassType_MassInertia()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='massInertia' namespace='##targetNamespace'"
	 * @generated
	 */
	MassInertiaType getMassInertia();

	/**
	 * Sets the value of the '{@link Cpacs.DeckElementMassType#getMassInertia <em>Mass Inertia</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Inertia</em>' containment reference.
	 * @see #getMassInertia()
	 * @generated
	 */
	void setMassInertia(MassInertiaType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getDeckElementMassType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.DeckElementMassType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // DeckElementMassType
