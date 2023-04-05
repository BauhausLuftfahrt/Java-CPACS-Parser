/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landing Gear Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LandingGearBaseType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.LandingGearBaseType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.LandingGearBaseType#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.LandingGearBaseType#getControl <em>Control</em>}</li>
 *   <li>{@link Cpacs.LandingGearBaseType#getComponentAssembly <em>Component Assembly</em>}</li>
 *   <li>{@link Cpacs.LandingGearBaseType#getTotalLength <em>Total Length</em>}</li>
 *   <li>{@link Cpacs.LandingGearBaseType#getStaticSuspensionTravel <em>Static Suspension Travel</em>}</li>
 *   <li>{@link Cpacs.LandingGearBaseType#getCompressedSuspensionTravel <em>Compressed Suspension Travel</em>}</li>
 *   <li>{@link Cpacs.LandingGearBaseType#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Cpacs.LandingGearBaseType#getSymmetry <em>Symmetry</em>}</li>
 *   <li>{@link Cpacs.LandingGearBaseType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLandingGearBaseType()
 * @model extendedMetaData="name='landingGearBaseType' kind='elementOnly'"
 * @generated
 */
public interface LandingGearBaseType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearBaseType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearBaseType#getName <em>Name</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getLandingGearBaseType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearBaseType#getDescription <em>Description</em>}' containment reference.
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
	 * UID of the parent component. If set, the position of the main strut is defined relative to the parent coordinate system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent UID</em>' containment reference.
	 * @see #setParentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearBaseType_ParentUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getParentUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearBaseType#getParentUID <em>Parent UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent UID</em>' containment reference.
	 * @see #getParentUID()
	 * @generated
	 */
	void setParentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' containment reference.
	 * @see #setControl(LandingGearControlType)
	 * @see Cpacs.CpacsPackage#getLandingGearBaseType_Control()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='control' namespace='##targetNamespace'"
	 * @generated
	 */
	LandingGearControlType getControl();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearBaseType#getControl <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' containment reference.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(LandingGearControlType value);

	/**
	 * Returns the value of the '<em><b>Component Assembly</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Assembly</em>' containment reference.
	 * @see #setComponentAssembly(LandingGearComponentAssemblyType)
	 * @see Cpacs.CpacsPackage#getLandingGearBaseType_ComponentAssembly()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='componentAssembly' namespace='##targetNamespace'"
	 * @generated
	 */
	LandingGearComponentAssemblyType getComponentAssembly();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearBaseType#getComponentAssembly <em>Component Assembly</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Assembly</em>' containment reference.
	 * @see #getComponentAssembly()
	 * @generated
	 */
	void setComponentAssembly(LandingGearComponentAssemblyType value);

	/**
	 * Returns the value of the '<em><b>Total Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total length of landing gear, equals the distance from the middle of the bogie/axles to the axis of rotation of the pintle strut. Distance is measured while landing gear is fully extended and in airborne condition (i.e., if a spring is present, the totalLength includes the springDeflectionLength)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Length</em>' containment reference.
	 * @see #setTotalLength(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearBaseType_TotalLength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='totalLength' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTotalLength();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearBaseType#getTotalLength <em>Total Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Length</em>' containment reference.
	 * @see #getTotalLength()
	 * @generated
	 */
	void setTotalLength(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Static Suspension Travel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Static suspension travel means the positive distance between the total length in airborne condition and the reduced length due to compression on the ground.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Suspension Travel</em>' containment reference.
	 * @see #setStaticSuspensionTravel(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearBaseType_StaticSuspensionTravel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='staticSuspensionTravel' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getStaticSuspensionTravel();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearBaseType#getStaticSuspensionTravel <em>Static Suspension Travel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Suspension Travel</em>' containment reference.
	 * @see #getStaticSuspensionTravel()
	 * @generated
	 */
	void setStaticSuspensionTravel(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Compressed Suspension Travel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Compressed suspension travel means the positive distance between the total length in airborne condition and the maximum reduced length due to maximum compression on the ground (e.g., landing shock).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compressed Suspension Travel</em>' containment reference.
	 * @see #setCompressedSuspensionTravel(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearBaseType_CompressedSuspensionTravel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='compressedSuspensionTravel' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCompressedSuspensionTravel();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearBaseType#getCompressedSuspensionTravel <em>Compressed Suspension Travel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compressed Suspension Travel</em>' containment reference.
	 * @see #getCompressedSuspensionTravel()
	 * @generated
	 */
	void setCompressedSuspensionTravel(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transformation with respect to the uppermost point of the main strut. From this point the landing gear is oriented in negative z-direction by default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference.
	 * @see #setTransformation(TransformationType)
	 * @see Cpacs.CpacsPackage#getLandingGearBaseType_Transformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='transformation' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformationType getTransformation();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearBaseType#getTransformation <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' containment reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(TransformationType value);

	/**
	 * Returns the value of the '<em><b>Symmetry</b></em>' attribute.
	 * The literals are from the enumeration {@link Cpacs.SymmetryXyXzYzType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symmetry</em>' attribute.
	 * @see Cpacs.SymmetryXyXzYzType
	 * @see #isSetSymmetry()
	 * @see #unsetSymmetry()
	 * @see #setSymmetry(SymmetryXyXzYzType)
	 * @see Cpacs.CpacsPackage#getLandingGearBaseType_Symmetry()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='symmetry' namespace='##targetNamespace'"
	 * @generated
	 */
	SymmetryXyXzYzType getSymmetry();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearBaseType#getSymmetry <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symmetry</em>' attribute.
	 * @see Cpacs.SymmetryXyXzYzType
	 * @see #isSetSymmetry()
	 * @see #unsetSymmetry()
	 * @see #getSymmetry()
	 * @generated
	 */
	void setSymmetry(SymmetryXyXzYzType value);

	/**
	 * Unsets the value of the '{@link Cpacs.LandingGearBaseType#getSymmetry <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSymmetry()
	 * @see #getSymmetry()
	 * @see #setSymmetry(SymmetryXyXzYzType)
	 * @generated
	 */
	void unsetSymmetry();

	/**
	 * Returns whether the value of the '{@link Cpacs.LandingGearBaseType#getSymmetry <em>Symmetry</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Symmetry</em>' attribute is set.
	 * @see #unsetSymmetry()
	 * @see #getSymmetry()
	 * @see #setSymmetry(SymmetryXyXzYzType)
	 * @generated
	 */
	boolean isSetSymmetry();

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getLandingGearBaseType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearBaseType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // LandingGearBaseType
