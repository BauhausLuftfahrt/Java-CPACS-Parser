/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cab Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CabGeometryType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.CabGeometryType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.CabGeometryType#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.CabGeometryType#getZ <em>Z</em>}</li>
 *   <li>{@link Cpacs.CabGeometryType#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.CabGeometryType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCabGeometryType()
 * @model extendedMetaData="name='cabGeometryType' kind='elementOnly'"
 * @generated
 */
public interface CabGeometryType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getCabGeometryType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.CabGeometryType#getName <em>Name</em>}' containment reference.
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
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getCabGeometryType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CabGeometryType#getDescription <em>Description</em>}' containment reference.
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
	 * x-coordinates for all contour lines, relative
	 *                                 to cabin origin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCabGeometryType_X()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getX();

	/**
	 * Sets the value of the '{@link Cpacs.CabGeometryType#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * z-coordinate of contour lines. Contour lines
	 *                                 are constant z, so each entry in this vector belongs to a single
	 *                                 contour line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Z</em>' containment reference.
	 * @see #setZ(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCabGeometryType_Z()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getZ();

	/**
	 * Sets the value of the '{@link Cpacs.CabGeometryType#getZ <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' containment reference.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * z-coordinate of contour lines. Contour lines
	 *                                 are constant z, so each entry in this vector belongs to a single
	 *                                 contour line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' containment reference.
	 * @see #setY(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCabGeometryType_Y()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getY();

	/**
	 * Sets the value of the '{@link Cpacs.CabGeometryType#getY <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' containment reference.
	 * @see #getY()
	 * @generated
	 */
	void setY(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getCabGeometryType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.CabGeometryType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // CabGeometryType
