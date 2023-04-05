/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strut Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.StrutPropertiesType#getRadius <em>Radius</em>}</li>
 *   <li>{@link Cpacs.StrutPropertiesType#getMaterialUID <em>Material UID</em>}</li>
 *   <li>{@link Cpacs.StrutPropertiesType#getInnerRadius <em>Inner Radius</em>}</li>
 *   <li>{@link Cpacs.StrutPropertiesType#getStructuralElementUID <em>Structural Element UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getStrutPropertiesType()
 * @model extendedMetaData="name='strutPropertiesType' kind='elementOnly'"
 * @generated
 */
public interface StrutPropertiesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (Outer) radius of the strut
	 *                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Radius</em>' containment reference.
	 * @see #setRadius(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getStrutPropertiesType_Radius()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='radius' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRadius();

	/**
	 * Sets the value of the '{@link Cpacs.StrutPropertiesType#getRadius <em>Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' containment reference.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Material UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Material of the strut
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material UID</em>' containment reference.
	 * @see #setMaterialUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getStrutPropertiesType_MaterialUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='materialUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getMaterialUID();

	/**
	 * Sets the value of the '{@link Cpacs.StrutPropertiesType#getMaterialUID <em>Material UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material UID</em>' containment reference.
	 * @see #getMaterialUID()
	 * @generated
	 */
	void setMaterialUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Inner Radius</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inner radius of the strut
	 *                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inner Radius</em>' containment reference.
	 * @see #setInnerRadius(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getStrutPropertiesType_InnerRadius()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='innerRadius' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getInnerRadius();

	/**
	 * Sets the value of the '{@link Cpacs.StrutPropertiesType#getInnerRadius <em>Inner Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Radius</em>' containment reference.
	 * @see #getInnerRadius()
	 * @generated
	 */
	void setInnerRadius(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Structural Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to structural element for a more
	 *                                         detailed cross section definition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structural Element UID</em>' containment reference.
	 * @see #setStructuralElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getStrutPropertiesType_StructuralElementUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structuralElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStructuralElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.StrutPropertiesType#getStructuralElementUID <em>Structural Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Element UID</em>' containment reference.
	 * @see #getStructuralElementUID()
	 * @generated
	 */
	void setStructuralElementUID(StringUIDBaseType value);

} // StrutPropertiesType
