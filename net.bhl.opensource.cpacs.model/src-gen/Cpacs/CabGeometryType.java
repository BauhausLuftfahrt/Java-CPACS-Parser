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
 *   <li>{@link Cpacs.CabGeometryType#getYZ1 <em>YZ1</em>}</li>
 *   <li>{@link Cpacs.CabGeometryType#getYZ2 <em>YZ2</em>}</li>
 *   <li>{@link Cpacs.CabGeometryType#getYZ3 <em>YZ3</em>}</li>
 *   <li>{@link Cpacs.CabGeometryType#getYZ4 <em>YZ4</em>}</li>
 *   <li>{@link Cpacs.CabGeometryType#getYZ5 <em>YZ5</em>}</li>
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
	 * Returns the value of the '<em><b>YZ1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * z-coordinate of contour lines. Contour lines
	 *                                 are constant z, so each entry in this vector belongs to a single
	 *                                 contour line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YZ1</em>' containment reference.
	 * @see #setYZ1(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCabGeometryType_YZ1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getYZ1();

	/**
	 * Sets the value of the '{@link Cpacs.CabGeometryType#getYZ1 <em>YZ1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YZ1</em>' containment reference.
	 * @see #getYZ1()
	 * @generated
	 */
	void setYZ1(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>YZ2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * z-coordinate of contour lines. Contour lines
	 *                                 are constant z, so each entry in this vector belongs to a single
	 *                                 contour line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YZ2</em>' containment reference.
	 * @see #setYZ2(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCabGeometryType_YZ2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getYZ2();

	/**
	 * Sets the value of the '{@link Cpacs.CabGeometryType#getYZ2 <em>YZ2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YZ2</em>' containment reference.
	 * @see #getYZ2()
	 * @generated
	 */
	void setYZ2(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>YZ3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * z-coordinate of contour lines. Contour lines
	 *                                 are constant z, so each entry in this vector belongs to a single
	 *                                 contour line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YZ3</em>' containment reference.
	 * @see #setYZ3(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCabGeometryType_YZ3()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getYZ3();

	/**
	 * Sets the value of the '{@link Cpacs.CabGeometryType#getYZ3 <em>YZ3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YZ3</em>' containment reference.
	 * @see #getYZ3()
	 * @generated
	 */
	void setYZ3(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>YZ4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * z-coordinate of contour lines. Contour lines
	 *                                 are constant z, so each entry in this vector belongs to a single
	 *                                 contour line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YZ4</em>' containment reference.
	 * @see #setYZ4(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCabGeometryType_YZ4()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getYZ4();

	/**
	 * Sets the value of the '{@link Cpacs.CabGeometryType#getYZ4 <em>YZ4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YZ4</em>' containment reference.
	 * @see #getYZ4()
	 * @generated
	 */
	void setYZ4(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>YZ5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * z-coordinate of contour lines. Contour lines
	 *                                 are constant z, so each entry in this vector belongs to a single
	 *                                 contour line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YZ5</em>' containment reference.
	 * @see #setYZ5(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCabGeometryType_YZ5()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getYZ5();

	/**
	 * Sets the value of the '{@link Cpacs.CabGeometryType#getYZ5 <em>YZ5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YZ5</em>' containment reference.
	 * @see #getYZ5()
	 * @generated
	 */
	void setYZ5(StringVectorBaseType value);

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
