/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drag Contributions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DragContributionsType#getCdPressure <em>Cd Pressure</em>}</li>
 *   <li>{@link Cpacs.DragContributionsType#getCdViscous <em>Cd Viscous</em>}</li>
 *   <li>{@link Cpacs.DragContributionsType#getCdFriction <em>Cd Friction</em>}</li>
 *   <li>{@link Cpacs.DragContributionsType#getCdInduced <em>Cd Induced</em>}</li>
 *   <li>{@link Cpacs.DragContributionsType#getCdInterference <em>Cd Interference</em>}</li>
 *   <li>{@link Cpacs.DragContributionsType#getCdWave <em>Cd Wave</em>}</li>
 *   <li>{@link Cpacs.DragContributionsType#getCdTrim <em>Cd Trim</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDragContributionsType()
 * @model extendedMetaData="name='dragContributionsType' kind='elementOnly'"
 * @generated
 */
public interface DragContributionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cd Pressure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Drag contributions due to the displacement of the flow around a component. Zero for irrotational two-dimensional flows.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cd Pressure</em>' containment reference.
	 * @see #setCdPressure(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDragContributionsType_CdPressure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cdPressure' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCdPressure();

	/**
	 * Sets the value of the '{@link Cpacs.DragContributionsType#getCdPressure <em>Cd Pressure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cd Pressure</em>' containment reference.
	 * @see #getCdPressure()
	 * @generated
	 */
	void setCdPressure(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Cd Viscous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Drag contributions due to shear forces on surfaces
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cd Viscous</em>' containment reference.
	 * @see #setCdViscous(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDragContributionsType_CdViscous()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cdViscous' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCdViscous();

	/**
	 * Sets the value of the '{@link Cpacs.DragContributionsType#getCdViscous <em>Cd Viscous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cd Viscous</em>' containment reference.
	 * @see #getCdViscous()
	 * @generated
	 */
	void setCdViscous(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Cd Friction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Drag contributions due to friction
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cd Friction</em>' containment reference.
	 * @see #setCdFriction(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDragContributionsType_CdFriction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cdFriction' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCdFriction();

	/**
	 * Sets the value of the '{@link Cpacs.DragContributionsType#getCdFriction <em>Cd Friction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cd Friction</em>' containment reference.
	 * @see #getCdFriction()
	 * @generated
	 */
	void setCdFriction(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Cd Induced</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Drag contributions due to energy loss through vortex structures caused by the pressure difference between the upper and lower sides of three-dimensional lifting surfaces.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cd Induced</em>' containment reference.
	 * @see #setCdInduced(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDragContributionsType_CdInduced()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cdInduced' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCdInduced();

	/**
	 * Sets the value of the '{@link Cpacs.DragContributionsType#getCdInduced <em>Cd Induced</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cd Induced</em>' containment reference.
	 * @see #getCdInduced()
	 * @generated
	 */
	void setCdInduced(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Cd Interference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Drag contributions due to mixing of streamlines between airframe components (e.g., interaction between wing and fuselage or pylon and wing).
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cd Interference</em>' containment reference.
	 * @see #setCdInterference(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDragContributionsType_CdInterference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cdInterference' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCdInterference();

	/**
	 * Sets the value of the '{@link Cpacs.DragContributionsType#getCdInterference <em>Cd Interference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cd Interference</em>' containment reference.
	 * @see #getCdInterference()
	 * @generated
	 */
	void setCdInterference(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Cd Wave</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Drag contributions due to energy dissipation in shock waves
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cd Wave</em>' containment reference.
	 * @see #setCdWave(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDragContributionsType_CdWave()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cdWave' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCdWave();

	/**
	 * Sets the value of the '{@link Cpacs.DragContributionsType#getCdWave <em>Cd Wave</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cd Wave</em>' containment reference.
	 * @see #getCdWave()
	 * @generated
	 */
	void setCdWave(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Cd Trim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Drag contributions due to trimmed aircraft configuration
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cd Trim</em>' containment reference.
	 * @see #setCdTrim(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDragContributionsType_CdTrim()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cdTrim' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCdTrim();

	/**
	 * Sets the value of the '{@link Cpacs.DragContributionsType#getCdTrim <em>Cd Trim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cd Trim</em>' containment reference.
	 * @see #getCdTrim()
	 * @generated
	 */
	void setCdTrim(DoubleBaseType value);

} // DragContributionsType
