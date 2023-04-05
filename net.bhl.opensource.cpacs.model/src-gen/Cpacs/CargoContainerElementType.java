/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cargo Container Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CargoContainerElementType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.CargoContainerElementType#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.CargoContainerElementType#getContour <em>Contour</em>}</li>
 *   <li>{@link Cpacs.CargoContainerElementType#getDeltaX <em>Delta X</em>}</li>
 *   <li>{@link Cpacs.CargoContainerElementType#getDeltaY <em>Delta Y</em>}</li>
 *   <li>{@link Cpacs.CargoContainerElementType#getDeltaYBase <em>Delta YBase</em>}</li>
 *   <li>{@link Cpacs.CargoContainerElementType#getDeltaZ <em>Delta Z</em>}</li>
 *   <li>{@link Cpacs.CargoContainerElementType#getDeltaZKink <em>Delta ZKink</em>}</li>
 *   <li>{@link Cpacs.CargoContainerElementType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCargoContainerElementType()
 * @model extendedMetaData="name='cargoContainerElementType' kind='elementOnly'"
 * @generated
 */
public interface CargoContainerElementType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getCargoContainerElementType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CargoContainerElementType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass</em>' containment reference.
	 * @see #setMass(DeckElementMassType)
	 * @see Cpacs.CpacsPackage#getCargoContainerElementType_Mass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mass' namespace='##targetNamespace'"
	 * @generated
	 */
	DeckElementMassType getMass();

	/**
	 * Sets the value of the '{@link Cpacs.CargoContainerElementType#getMass <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' containment reference.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(DeckElementMassType value);

	/**
	 * Returns the value of the '<em><b>Contour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contour: single or double
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contour</em>' containment reference.
	 * @see #setContour(ContourType)
	 * @see Cpacs.CpacsPackage#getCargoContainerElementType_Contour()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contour' namespace='##targetNamespace'"
	 * @generated
	 */
	ContourType getContour();

	/**
	 * Sets the value of the '{@link Cpacs.CargoContainerElementType#getContour <em>Contour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contour</em>' containment reference.
	 * @see #getContour()
	 * @generated
	 */
	void setContour(ContourType value);

	/**
	 * Returns the value of the '<em><b>Delta X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delta x
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta X</em>' containment reference.
	 * @see #setDeltaX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCargoContainerElementType_DeltaX()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deltaX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDeltaX();

	/**
	 * Sets the value of the '{@link Cpacs.CargoContainerElementType#getDeltaX <em>Delta X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta X</em>' containment reference.
	 * @see #getDeltaX()
	 * @generated
	 */
	void setDeltaX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Delta Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delta y
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Y</em>' containment reference.
	 * @see #setDeltaY(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCargoContainerElementType_DeltaY()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deltaY' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDeltaY();

	/**
	 * Sets the value of the '{@link Cpacs.CargoContainerElementType#getDeltaY <em>Delta Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Y</em>' containment reference.
	 * @see #getDeltaY()
	 * @generated
	 */
	void setDeltaY(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Delta YBase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delta y of the base
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta YBase</em>' containment reference.
	 * @see #setDeltaYBase(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCargoContainerElementType_DeltaYBase()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deltaYBase' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDeltaYBase();

	/**
	 * Sets the value of the '{@link Cpacs.CargoContainerElementType#getDeltaYBase <em>Delta YBase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta YBase</em>' containment reference.
	 * @see #getDeltaYBase()
	 * @generated
	 */
	void setDeltaYBase(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Delta Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delta z
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Z</em>' containment reference.
	 * @see #setDeltaZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCargoContainerElementType_DeltaZ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deltaZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDeltaZ();

	/**
	 * Sets the value of the '{@link Cpacs.CargoContainerElementType#getDeltaZ <em>Delta Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Z</em>' containment reference.
	 * @see #getDeltaZ()
	 * @generated
	 */
	void setDeltaZ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Delta ZKink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delta z kink
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta ZKink</em>' containment reference.
	 * @see #setDeltaZKink(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCargoContainerElementType_DeltaZKink()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deltaZKink' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDeltaZKink();

	/**
	 * Sets the value of the '{@link Cpacs.CargoContainerElementType#getDeltaZKink <em>Delta ZKink</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta ZKink</em>' containment reference.
	 * @see #getDeltaZKink()
	 * @generated
	 */
	void setDeltaZKink(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getCargoContainerElementType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.CargoContainerElementType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // CargoContainerElementType
