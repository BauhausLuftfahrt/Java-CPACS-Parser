/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cabin Aisle Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CabinAisleType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.CabinAisleType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.CabinAisleType#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.CabinAisleType#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.CabinAisleType#getWidthY <em>Width Y</em>}</li>
 *   <li>{@link Cpacs.CabinAisleType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCabinAisleType()
 * @model extendedMetaData="name='cabinAisleType' kind='elementOnly'"
 * @generated
 */
public interface CabinAisleType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getCabinAisleType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.CabinAisleType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getCabinAisleType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CabinAisleType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Longitudinal coordinates. The
	 *                                 number of coordinates can be chosen as appropriate, the minimum
	 *                                 number is two. The coordinates are relative to the cabin origin.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCabinAisleType_X()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getX();

	/**
	 * Sets the value of the '{@link Cpacs.CabinAisleType#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Center points of the aisle. The
	 *                                 y-vector has to have same length as the x-vector. The aisle
	 *                                 stretches equally left and right of the provided y-coordinate.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' containment reference.
	 * @see #setY(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCabinAisleType_Y()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='y' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getY();

	/**
	 * Sets the value of the '{@link Cpacs.CabinAisleType#getY <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' containment reference.
	 * @see #getY()
	 * @generated
	 */
	void setY(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Width Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Width of the aisle at floor level at each
	 *                                 y-coordinate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width Y</em>' containment reference.
	 * @see #setWidthY(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCabinAisleType_WidthY()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='widthY' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getWidthY();

	/**
	 * Sets the value of the '{@link Cpacs.CabinAisleType#getWidthY <em>Width Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width Y</em>' containment reference.
	 * @see #getWidthY()
	 * @generated
	 */
	void setWidthY(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getCabinAisleType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.CabinAisleType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // CabinAisleType
