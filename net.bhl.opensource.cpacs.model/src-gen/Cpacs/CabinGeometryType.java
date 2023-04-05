/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cabin Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CabinGeometryType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.CabinGeometryType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.CabinGeometryType#getContours <em>Contours</em>}</li>
 *   <li>{@link Cpacs.CabinGeometryType#getX <em>X</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCabinGeometryType()
 * @model extendedMetaData="name='cabinGeometryType' kind='elementOnly'"
 * @generated
 */
public interface CabinGeometryType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getCabinGeometryType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.CabinGeometryType#getName <em>Name</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCabinGeometryType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CabinGeometryType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Contours</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contours</em>' containment reference.
	 * @see #setContours(CabinGeometryContoursType)
	 * @see Cpacs.CpacsPackage#getCabinGeometryType_Contours()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contours' namespace='##targetNamespace'"
	 * @generated
	 */
	CabinGeometryContoursType getContours();

	/**
	 * Sets the value of the '{@link Cpacs.CabinGeometryType#getContours <em>Contours</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contours</em>' containment reference.
	 * @see #getContours()
	 * @generated
	 */
	void setContours(CabinGeometryContoursType value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vector of x coordinates
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCabinGeometryType_X()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getX();

	/**
	 * Sets the value of the '{@link Cpacs.CabinGeometryType#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(DoubleVectorBaseType value);

} // CabinGeometryType
