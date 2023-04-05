/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Mass Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GenericMassType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.GenericMassType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.GenericMassType#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.GenericMassType#getComponentUID <em>Component UID</em>}</li>
 *   <li>{@link Cpacs.GenericMassType#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.GenericMassType#getLocation <em>Location</em>}</li>
 *   <li>{@link Cpacs.GenericMassType#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link Cpacs.GenericMassType#getMassInertia <em>Mass Inertia</em>}</li>
 *   <li>{@link Cpacs.GenericMassType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGenericMassType()
 * @model extendedMetaData="name='genericMassType' kind='elementOnly'"
 * @generated
 */
public interface GenericMassType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getGenericMassType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.GenericMassType#getName <em>Name</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getGenericMassType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.GenericMassType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Parent UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the component which serves as parent element, i.e. whose coordinate system is to be used as a reference for the mass properties (CoG location, orientation and massInertia). Thus, two cases can occur: (1)
	 *                                 it is set: local coordinate system of the parent; (2) it is not set: global CPACS coordinate system.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent UID</em>' containment reference.
	 * @see #setParentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getGenericMassType_ParentUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getParentUID();

	/**
	 * Sets the value of the '{@link Cpacs.GenericMassType#getParentUID <em>Parent UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent UID</em>' containment reference.
	 * @see #getParentUID()
	 * @generated
	 */
	void setParentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Component UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the geometric description of the component.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component UID</em>' containment reference.
	 * @see #setComponentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getGenericMassType_ComponentUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='componentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getComponentUID();

	/**
	 * Sets the value of the '{@link Cpacs.GenericMassType#getComponentUID <em>Component UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component UID</em>' containment reference.
	 * @see #getComponentUID()
	 * @generated
	 */
	void setComponentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mass [kg]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass</em>' containment reference.
	 * @see #setMass(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getGenericMassType_Mass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mass' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMass();

	/**
	 * Sets the value of the '{@link Cpacs.GenericMassType#getMass <em>Mass</em>}' containment reference.
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
	 * Mass location.
	 *                                 If the optional refType attribute is set, it explicitly specifies whether the location of the mass refers to the global CPACS coordinate system (absGobal) or the local coordinate system of the parent element (absLocal, given by the CPACS hierarchy OR by parentUID).
	 *                                 If it is not set, the global CPACS coordinate system is considered as default.
	 *                                 To ensure consistency, the same settings apply as well to orientation and massInertia.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(PointAbsRelType)
	 * @see Cpacs.CpacsPackage#getGenericMassType_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	PointAbsRelType getLocation();

	/**
	 * Sets the value of the '{@link Cpacs.GenericMassType#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(PointAbsRelType value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Orientation. The reference coordinate system (absGlobal or absLocal) is identical to location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference.
	 * @see #setOrientation(PointType)
	 * @see Cpacs.CpacsPackage#getGenericMassType_Orientation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointType getOrientation();

	/**
	 * Sets the value of the '{@link Cpacs.GenericMassType#getOrientation <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' containment reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(PointType value);

	/**
	 * Returns the value of the '<em><b>Mass Inertia</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mass inertia. The reference coordinate system (absGlobal or absLocal) is identical to location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Inertia</em>' containment reference.
	 * @see #setMassInertia(MassInertiaType)
	 * @see Cpacs.CpacsPackage#getGenericMassType_MassInertia()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='massInertia' namespace='##targetNamespace'"
	 * @generated
	 */
	MassInertiaType getMassInertia();

	/**
	 * Sets the value of the '{@link Cpacs.GenericMassType#getMassInertia <em>Mass Inertia</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getGenericMassType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.GenericMassType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // GenericMassType
