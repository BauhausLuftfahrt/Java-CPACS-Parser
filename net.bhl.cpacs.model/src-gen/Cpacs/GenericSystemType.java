/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic System Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GenericSystemType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.GenericSystemType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.GenericSystemType#getGeometricBaseType <em>Geometric Base Type</em>}</li>
 *   <li>{@link Cpacs.GenericSystemType#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Cpacs.GenericSystemType#getSymmetry <em>Symmetry</em>}</li>
 *   <li>{@link Cpacs.GenericSystemType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGenericSystemType()
 * @model extendedMetaData="name='genericSystemType' kind='elementOnly'"
 * @generated
 */
public interface GenericSystemType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the system component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getGenericSystemType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.GenericSystemType#getName <em>Name</em>}' containment reference.
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
	 * Description of the system component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getGenericSystemType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.GenericSystemType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Geometric Base Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Cpacs.GeometricBaseTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enum for selecting the basic shape of the
	 *                                 component
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geometric Base Type</em>' attribute.
	 * @see Cpacs.GeometricBaseTypeType
	 * @see #isSetGeometricBaseType()
	 * @see #unsetGeometricBaseType()
	 * @see #setGeometricBaseType(GeometricBaseTypeType)
	 * @see Cpacs.CpacsPackage#getGenericSystemType_GeometricBaseType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='geometricBaseType' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometricBaseTypeType getGeometricBaseType();

	/**
	 * Sets the value of the '{@link Cpacs.GenericSystemType#getGeometricBaseType <em>Geometric Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometric Base Type</em>' attribute.
	 * @see Cpacs.GeometricBaseTypeType
	 * @see #isSetGeometricBaseType()
	 * @see #unsetGeometricBaseType()
	 * @see #getGeometricBaseType()
	 * @generated
	 */
	void setGeometricBaseType(GeometricBaseTypeType value);

	/**
	 * Unsets the value of the '{@link Cpacs.GenericSystemType#getGeometricBaseType <em>Geometric Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGeometricBaseType()
	 * @see #getGeometricBaseType()
	 * @see #setGeometricBaseType(GeometricBaseTypeType)
	 * @generated
	 */
	void unsetGeometricBaseType();

	/**
	 * Returns whether the value of the '{@link Cpacs.GenericSystemType#getGeometricBaseType <em>Geometric Base Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Geometric Base Type</em>' attribute is set.
	 * @see #unsetGeometricBaseType()
	 * @see #getGeometricBaseType()
	 * @see #setGeometricBaseType(GeometricBaseTypeType)
	 * @generated
	 */
	boolean isSetGeometricBaseType();

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference.
	 * @see #setTransformation(TransformationType)
	 * @see Cpacs.CpacsPackage#getGenericSystemType_Transformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='transformation' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformationType getTransformation();

	/**
	 * Sets the value of the '{@link Cpacs.GenericSystemType#getTransformation <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' containment reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(TransformationType value);

	/**
	 * Returns the value of the '<em><b>Symmetry</b></em>' attribute.
	 * The literals are from the enumeration {@link Cpacs.SymmetryType10}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symmetry</em>' attribute.
	 * @see Cpacs.SymmetryType10
	 * @see #isSetSymmetry()
	 * @see #unsetSymmetry()
	 * @see #setSymmetry(SymmetryType10)
	 * @see Cpacs.CpacsPackage#getGenericSystemType_Symmetry()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='symmetry' namespace='##targetNamespace'"
	 * @generated
	 */
	SymmetryType10 getSymmetry();

	/**
	 * Sets the value of the '{@link Cpacs.GenericSystemType#getSymmetry <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symmetry</em>' attribute.
	 * @see Cpacs.SymmetryType10
	 * @see #isSetSymmetry()
	 * @see #unsetSymmetry()
	 * @see #getSymmetry()
	 * @generated
	 */
	void setSymmetry(SymmetryType10 value);

	/**
	 * Unsets the value of the '{@link Cpacs.GenericSystemType#getSymmetry <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSymmetry()
	 * @see #getSymmetry()
	 * @see #setSymmetry(SymmetryType10)
	 * @generated
	 */
	void unsetSymmetry();

	/**
	 * Returns whether the value of the '{@link Cpacs.GenericSystemType#getSymmetry <em>Symmetry</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Symmetry</em>' attribute is set.
	 * @see #unsetSymmetry()
	 * @see #getSymmetry()
	 * @see #setSymmetry(SymmetryType10)
	 * @generated
	 */
	boolean isSetSymmetry();

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getGenericSystemType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.GenericSystemType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // GenericSystemType
