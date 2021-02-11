/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Abs Rel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PointAbsRelType#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.PointAbsRelType#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.PointAbsRelType#getZ <em>Z</em>}</li>
 *   <li>{@link Cpacs.PointAbsRelType#getRefType <em>Ref Type</em>}</li>
 *   <li>{@link Cpacs.PointAbsRelType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPointAbsRelType()
 * @model extendedMetaData="name='pointAbsRelType' kind='elementOnly'"
 * @generated
 */
public interface PointAbsRelType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X-Component
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPointAbsRelType_X()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getX();

	/**
	 * Sets the value of the '{@link Cpacs.PointAbsRelType#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Y-Component
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' containment reference.
	 * @see #setY(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPointAbsRelType_Y()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='y' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getY();

	/**
	 * Sets the value of the '{@link Cpacs.PointAbsRelType#getY <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' containment reference.
	 * @see #getY()
	 * @generated
	 */
	void setY(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Z-Component
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Z</em>' containment reference.
	 * @see #setZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPointAbsRelType_Z()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getZ();

	/**
	 * Sets the value of the '{@link Cpacs.PointAbsRelType#getZ <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' containment reference.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Ref Type</b></em>' attribute.
	 * The default value is <code>"absLocal"</code>.
	 * The literals are from the enumeration {@link Cpacs.RefTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Type</em>' attribute.
	 * @see Cpacs.RefTypeType
	 * @see #isSetRefType()
	 * @see #unsetRefType()
	 * @see #setRefType(RefTypeType)
	 * @see Cpacs.CpacsPackage#getPointAbsRelType_RefType()
	 * @model default="absLocal" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='refType' namespace='##targetNamespace'"
	 * @generated
	 */
	RefTypeType getRefType();

	/**
	 * Sets the value of the '{@link Cpacs.PointAbsRelType#getRefType <em>Ref Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Type</em>' attribute.
	 * @see Cpacs.RefTypeType
	 * @see #isSetRefType()
	 * @see #unsetRefType()
	 * @see #getRefType()
	 * @generated
	 */
	void setRefType(RefTypeType value);

	/**
	 * Unsets the value of the '{@link Cpacs.PointAbsRelType#getRefType <em>Ref Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRefType()
	 * @see #getRefType()
	 * @see #setRefType(RefTypeType)
	 * @generated
	 */
	void unsetRefType();

	/**
	 * Returns whether the value of the '{@link Cpacs.PointAbsRelType#getRefType <em>Ref Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ref Type</em>' attribute is set.
	 * @see #unsetRefType()
	 * @see #getRefType()
	 * @see #setRefType(RefTypeType)
	 * @generated
	 */
	boolean isSetRefType();

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getPointAbsRelType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.PointAbsRelType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // PointAbsRelType
