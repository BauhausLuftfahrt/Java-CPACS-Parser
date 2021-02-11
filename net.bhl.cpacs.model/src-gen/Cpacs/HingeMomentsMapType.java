/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hinge Moments Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.HingeMomentsMapType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.HingeMomentsMapType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.HingeMomentsMapType#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.HingeMomentsMapType#getReynoldsNumber <em>Reynolds Number</em>}</li>
 *   <li>{@link Cpacs.HingeMomentsMapType#getAngleOfSideslip <em>Angle Of Sideslip</em>}</li>
 *   <li>{@link Cpacs.HingeMomentsMapType#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.HingeMomentsMapType#getControlSurfaces <em>Control Surfaces</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getHingeMomentsMapType()
 * @model extendedMetaData="name='hingeMomentsMapType' kind='elementOnly'"
 * @generated
 */
public interface HingeMomentsMapType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the AeroPerformanceMap.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getHingeMomentsMapType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.HingeMomentsMapType#getName <em>Name</em>}' containment reference.
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
	 * Description of the AeroPerformanceMap.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getHingeMomentsMapType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.HingeMomentsMapType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Mach Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mach number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mach Number</em>' containment reference.
	 * @see #setMachNumber(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getHingeMomentsMapType_MachNumber()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='machNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getMachNumber();

	/**
	 * Sets the value of the '{@link Cpacs.HingeMomentsMapType#getMachNumber <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mach Number</em>' containment reference.
	 * @see #getMachNumber()
	 * @generated
	 */
	void setMachNumber(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Reynolds Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reynolds Number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reynolds Number</em>' containment reference.
	 * @see #setReynoldsNumber(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getHingeMomentsMapType_ReynoldsNumber()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reynoldsNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getReynoldsNumber();

	/**
	 * Sets the value of the '{@link Cpacs.HingeMomentsMapType#getReynoldsNumber <em>Reynolds Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reynolds Number</em>' containment reference.
	 * @see #getReynoldsNumber()
	 * @generated
	 */
	void setReynoldsNumber(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Of Sideslip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sideslip angle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #setAngleOfSideslip(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getHingeMomentsMapType_AngleOfSideslip()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angleOfSideslip' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getAngleOfSideslip();

	/**
	 * Sets the value of the '{@link Cpacs.HingeMomentsMapType#getAngleOfSideslip <em>Angle Of Sideslip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #getAngleOfSideslip()
	 * @generated
	 */
	void setAngleOfSideslip(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Of Attack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angle of attack
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #setAngleOfAttack(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getHingeMomentsMapType_AngleOfAttack()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angleOfAttack' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getAngleOfAttack();

	/**
	 * Sets the value of the '{@link Cpacs.HingeMomentsMapType#getAngleOfAttack <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #getAngleOfAttack()
	 * @generated
	 */
	void setAngleOfAttack(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Control Surfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Surfaces</em>' containment reference.
	 * @see #setControlSurfaces(ControlSurfaceHingeMomentMapsType)
	 * @see Cpacs.CpacsPackage#getHingeMomentsMapType_ControlSurfaces()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlSurfaces' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceHingeMomentMapsType getControlSurfaces();

	/**
	 * Sets the value of the '{@link Cpacs.HingeMomentsMapType#getControlSurfaces <em>Control Surfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Surfaces</em>' containment reference.
	 * @see #getControlSurfaces()
	 * @generated
	 */
	void setControlSurfaces(ControlSurfaceHingeMomentMapsType value);

} // HingeMomentsMapType
