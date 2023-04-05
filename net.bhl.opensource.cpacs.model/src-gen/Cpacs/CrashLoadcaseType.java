/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crash Loadcase Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CrashLoadcaseType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.CrashLoadcaseType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.CrashLoadcaseType#getCrashStartX <em>Crash Start X</em>}</li>
 *   <li>{@link Cpacs.CrashLoadcaseType#getCrashEndX <em>Crash End X</em>}</li>
 *   <li>{@link Cpacs.CrashLoadcaseType#getCrashInitialVelocity <em>Crash Initial Velocity</em>}</li>
 *   <li>{@link Cpacs.CrashLoadcaseType#getCrashInitialRotation <em>Crash Initial Rotation</em>}</li>
 *   <li>{@link Cpacs.CrashLoadcaseType#getCrashInitialRotationalVelocity <em>Crash Initial Rotational Velocity</em>}</li>
 *   <li>{@link Cpacs.CrashLoadcaseType#getReferencePointForRotation <em>Reference Point For Rotation</em>}</li>
 *   <li>{@link Cpacs.CrashLoadcaseType#getCrashAccelerationField <em>Crash Acceleration Field</em>}</li>
 *   <li>{@link Cpacs.CrashLoadcaseType#getImpactSurfaceDefinition <em>Impact Surface Definition</em>}</li>
 *   <li>{@link Cpacs.CrashLoadcaseType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCrashLoadcaseType()
 * @model extendedMetaData="name='crashLoadcaseType' kind='elementOnly'"
 * @generated
 */
public interface CrashLoadcaseType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getCrashLoadcaseType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.CrashLoadcaseType#getName <em>Name</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCrashLoadcaseType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CrashLoadcaseType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Crash Start X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional start of crash section: Default:
	 *                                 first frame of model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crash Start X</em>' containment reference.
	 * @see #setCrashStartX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCrashLoadcaseType_CrashStartX()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='crashStartX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCrashStartX();

	/**
	 * Sets the value of the '{@link Cpacs.CrashLoadcaseType#getCrashStartX <em>Crash Start X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crash Start X</em>' containment reference.
	 * @see #getCrashStartX()
	 * @generated
	 */
	void setCrashStartX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Crash End X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional end of crash section: Default: last
	 *                                 frame of model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crash End X</em>' containment reference.
	 * @see #setCrashEndX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCrashLoadcaseType_CrashEndX()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='crashEndX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCrashEndX();

	/**
	 * Sets the value of the '{@link Cpacs.CrashLoadcaseType#getCrashEndX <em>Crash End X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crash End X</em>' containment reference.
	 * @see #getCrashEndX()
	 * @generated
	 */
	void setCrashEndX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Crash Initial Velocity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initial velocities
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crash Initial Velocity</em>' containment reference.
	 * @see #setCrashInitialVelocity(PointXYZType)
	 * @see Cpacs.CpacsPackage#getCrashLoadcaseType_CrashInitialVelocity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='crashInitialVelocity' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getCrashInitialVelocity();

	/**
	 * Sets the value of the '{@link Cpacs.CrashLoadcaseType#getCrashInitialVelocity <em>Crash Initial Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crash Initial Velocity</em>' containment reference.
	 * @see #getCrashInitialVelocity()
	 * @generated
	 */
	void setCrashInitialVelocity(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>Crash Initial Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initial rotations around axes, roll, pitch,
	 *                                 yaw
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crash Initial Rotation</em>' containment reference.
	 * @see #setCrashInitialRotation(PointXYZType)
	 * @see Cpacs.CpacsPackage#getCrashLoadcaseType_CrashInitialRotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='crashInitialRotation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getCrashInitialRotation();

	/**
	 * Sets the value of the '{@link Cpacs.CrashLoadcaseType#getCrashInitialRotation <em>Crash Initial Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crash Initial Rotation</em>' containment reference.
	 * @see #getCrashInitialRotation()
	 * @generated
	 */
	void setCrashInitialRotation(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>Crash Initial Rotational Velocity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initial rotational velocities around axes
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crash Initial Rotational Velocity</em>' containment reference.
	 * @see #setCrashInitialRotationalVelocity(PointXYZType)
	 * @see Cpacs.CpacsPackage#getCrashLoadcaseType_CrashInitialRotationalVelocity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='crashInitialRotationalVelocity' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getCrashInitialRotationalVelocity();

	/**
	 * Sets the value of the '{@link Cpacs.CrashLoadcaseType#getCrashInitialRotationalVelocity <em>Crash Initial Rotational Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crash Initial Rotational Velocity</em>' containment reference.
	 * @see #getCrashInitialRotationalVelocity()
	 * @generated
	 */
	void setCrashInitialRotationalVelocity(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>Reference Point For Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of reference point to consider
	 *                                 rotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Point For Rotation</em>' containment reference.
	 * @see #setReferencePointForRotation(PointXYZType)
	 * @see Cpacs.CpacsPackage#getCrashLoadcaseType_ReferencePointForRotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referencePointForRotation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getReferencePointForRotation();

	/**
	 * Sets the value of the '{@link Cpacs.CrashLoadcaseType#getReferencePointForRotation <em>Reference Point For Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Point For Rotation</em>' containment reference.
	 * @see #getReferencePointForRotation()
	 * @generated
	 */
	void setReferencePointForRotation(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>Crash Acceleration Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AccelerationFields, usually gravity in z
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Crash Acceleration Field</em>' containment reference.
	 * @see #setCrashAccelerationField(PointXYZType)
	 * @see Cpacs.CpacsPackage#getCrashLoadcaseType_CrashAccelerationField()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='crashAccelerationField' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getCrashAccelerationField();

	/**
	 * Sets the value of the '{@link Cpacs.CrashLoadcaseType#getCrashAccelerationField <em>Crash Acceleration Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crash Acceleration Field</em>' containment reference.
	 * @see #getCrashAccelerationField()
	 * @generated
	 */
	void setCrashAccelerationField(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>Impact Surface Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of impact Surface for crash
	 *                                 simulation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Impact Surface Definition</em>' containment reference.
	 * @see #setImpactSurfaceDefinition(ImpactSurfaceDefinitionType)
	 * @see Cpacs.CpacsPackage#getCrashLoadcaseType_ImpactSurfaceDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImpactSurfaceDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ImpactSurfaceDefinitionType getImpactSurfaceDefinition();

	/**
	 * Sets the value of the '{@link Cpacs.CrashLoadcaseType#getImpactSurfaceDefinition <em>Impact Surface Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact Surface Definition</em>' containment reference.
	 * @see #getImpactSurfaceDefinition()
	 * @generated
	 */
	void setImpactSurfaceDefinition(ImpactSurfaceDefinitionType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getCrashLoadcaseType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.CrashLoadcaseType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // CrashLoadcaseType
