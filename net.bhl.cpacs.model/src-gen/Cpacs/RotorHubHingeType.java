/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotor Hub Hinge Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RotorHubHingeType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.RotorHubHingeType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.RotorHubHingeType#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Cpacs.RotorHubHingeType#getType <em>Type</em>}</li>
 *   <li>{@link Cpacs.RotorHubHingeType#getNeutralPosition <em>Neutral Position</em>}</li>
 *   <li>{@link Cpacs.RotorHubHingeType#getStaticStiffness <em>Static Stiffness</em>}</li>
 *   <li>{@link Cpacs.RotorHubHingeType#getDynamicStiffness <em>Dynamic Stiffness</em>}</li>
 *   <li>{@link Cpacs.RotorHubHingeType#getDamping <em>Damping</em>}</li>
 *   <li>{@link Cpacs.RotorHubHingeType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRotorHubHingeType()
 * @model extendedMetaData="name='rotorHubHingeType' kind='elementOnly'"
 * @generated
 */
public interface RotorHubHingeType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the hinge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getRotorHubHingeType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.RotorHubHingeType#getName <em>Name</em>}' containment reference.
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
	 * Description of the hinge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getRotorHubHingeType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.RotorHubHingeType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference.
	 * @see #setTransformation(TransformationType)
	 * @see Cpacs.CpacsPackage#getRotorHubHingeType_Transformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='transformation' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformationType getTransformation();

	/**
	 * Sets the value of the '{@link Cpacs.RotorHubHingeType#getTransformation <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' containment reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(TransformationType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Cpacs.TypeType4}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hinge type. Possible values: "flap", "pitch"
	 *                                 "leadLag". This is used to define the rotation axis of the hinge
	 *                                 (flap = y-axis in blade cs, pitch = x-axis in blade cs, lead-lag
	 *                                 = z-axis in blade cs).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Cpacs.TypeType4
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType4)
	 * @see Cpacs.CpacsPackage#getRotorHubHingeType_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType4 getType();

	/**
	 * Sets the value of the '{@link Cpacs.RotorHubHingeType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Cpacs.TypeType4
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType4 value);

	/**
	 * Unsets the value of the '{@link Cpacs.RotorHubHingeType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType4)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link Cpacs.RotorHubHingeType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType4)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Neutral Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The angle (in deg) at which the hinge is in
	 *                                 neutral position. This element is normally used to define
	 *                                 precone or prelag angles of the attached blade. Defaults to 0.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Neutral Position</em>' containment reference.
	 * @see #setNeutralPosition(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRotorHubHingeType_NeutralPosition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='neutralPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getNeutralPosition();

	/**
	 * Sets the value of the '{@link Cpacs.RotorHubHingeType#getNeutralPosition <em>Neutral Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neutral Position</em>' containment reference.
	 * @see #getNeutralPosition()
	 * @generated
	 */
	void setNeutralPosition(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Static Stiffness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Static stiffness of the hinge in (N/m) for
	 *                                 linear hinges and (N.m/deg) for angular hinges. Default value:
	 *                                 +inf (statically rigid hinge)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Stiffness</em>' containment reference.
	 * @see #setStaticStiffness(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRotorHubHingeType_StaticStiffness()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='staticStiffness' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getStaticStiffness();

	/**
	 * Sets the value of the '{@link Cpacs.RotorHubHingeType#getStaticStiffness <em>Static Stiffness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Stiffness</em>' containment reference.
	 * @see #getStaticStiffness()
	 * @generated
	 */
	void setStaticStiffness(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Dynamic Stiffness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dynamic stiffness of the hinge in (N/m) for
	 *                                 linear hinges and (N.m/deg) for angular hinges. Default value:
	 *                                 +inf (statically rigid hinge)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Stiffness</em>' containment reference.
	 * @see #setDynamicStiffness(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRotorHubHingeType_DynamicStiffness()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dynamicStiffness' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDynamicStiffness();

	/**
	 * Sets the value of the '{@link Cpacs.RotorHubHingeType#getDynamicStiffness <em>Dynamic Stiffness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Stiffness</em>' containment reference.
	 * @see #getDynamicStiffness()
	 * @generated
	 */
	void setDynamicStiffness(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Damping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Damping of the hinge in (N/(m/s)) for linear
	 *                                 hinges and (N.m/(deg/s)) for angular hinges. Default value: +inf
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Damping</em>' containment reference.
	 * @see #setDamping(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRotorHubHingeType_Damping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='damping' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDamping();

	/**
	 * Sets the value of the '{@link Cpacs.RotorHubHingeType#getDamping <em>Damping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damping</em>' containment reference.
	 * @see #getDamping()
	 * @generated
	 */
	void setDamping(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getRotorHubHingeType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.RotorHubHingeType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // RotorHubHingeType
