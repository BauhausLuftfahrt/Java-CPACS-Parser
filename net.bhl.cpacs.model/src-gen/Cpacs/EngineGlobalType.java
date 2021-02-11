/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine Global Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.EngineGlobalType#getEngineConcept <em>Engine Concept</em>}</li>
 *   <li>{@link Cpacs.EngineGlobalType#getCertificationYear <em>Certification Year</em>}</li>
 *   <li>{@link Cpacs.EngineGlobalType#getRotDirection <em>Rot Direction</em>}</li>
 *   <li>{@link Cpacs.EngineGlobalType#getH2tR <em>H2t R</em>}</li>
 *   <li>{@link Cpacs.EngineGlobalType#getNoBla <em>No Bla</em>}</li>
 *   <li>{@link Cpacs.EngineGlobalType#getNoOGV <em>No OGV</em>}</li>
 *   <li>{@link Cpacs.EngineGlobalType#getRSS <em>RSS</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getEngineGlobalType()
 * @model extendedMetaData="name='engineGlobalType' kind='elementOnly'"
 * @generated
 */
public interface EngineGlobalType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Engine Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Concept of engine
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engine Concept</em>' containment reference.
	 * @see #setEngineConcept(EngineConceptType)
	 * @see Cpacs.CpacsPackage#getEngineGlobalType_EngineConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='engineConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	EngineConceptType getEngineConcept();

	/**
	 * Sets the value of the '{@link Cpacs.EngineGlobalType#getEngineConcept <em>Engine Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine Concept</em>' containment reference.
	 * @see #getEngineConcept()
	 * @generated
	 */
	void setEngineConcept(EngineConceptType value);

	/**
	 * Returns the value of the '<em><b>Certification Year</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Year of first certification
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certification Year</em>' containment reference.
	 * @see #setCertificationYear(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getEngineGlobalType_CertificationYear()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='certificationYear' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getCertificationYear();

	/**
	 * Sets the value of the '{@link Cpacs.EngineGlobalType#getCertificationYear <em>Certification Year</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certification Year</em>' containment reference.
	 * @see #getCertificationYear()
	 * @generated
	 */
	void setCertificationYear(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Rot Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rotation direction of the engine if looking at
	 *                                 it from the front, i.e. from propeller/fan to exhaust
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rot Direction</em>' containment reference.
	 * @see #setRotDirection(RotDirectionType)
	 * @see Cpacs.CpacsPackage#getEngineGlobalType_RotDirection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rotDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	RotDirectionType getRotDirection();

	/**
	 * Sets the value of the '{@link Cpacs.EngineGlobalType#getRotDirection <em>Rot Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rot Direction</em>' containment reference.
	 * @see #getRotDirection()
	 * @generated
	 */
	void setRotDirection(RotDirectionType value);

	/**
	 * Returns the value of the '<em><b>H2t R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hub to tip ratio
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>H2t R</em>' containment reference.
	 * @see #setH2tR(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEngineGlobalType_H2tR()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='h2tR' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getH2tR();

	/**
	 * Sets the value of the '{@link Cpacs.EngineGlobalType#getH2tR <em>H2t R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>H2t R</em>' containment reference.
	 * @see #getH2tR()
	 * @generated
	 */
	void setH2tR(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>No Bla</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of rotor blades of fan
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Bla</em>' containment reference.
	 * @see #setNoBla(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEngineGlobalType_NoBla()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noBla' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getNoBla();

	/**
	 * Sets the value of the '{@link Cpacs.EngineGlobalType#getNoBla <em>No Bla</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Bla</em>' containment reference.
	 * @see #getNoBla()
	 * @generated
	 */
	void setNoBla(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>No OGV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of outlet guiding vanes
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No OGV</em>' containment reference.
	 * @see #setNoOGV(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEngineGlobalType_NoOGV()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noOGV' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getNoOGV();

	/**
	 * Sets the value of the '{@link Cpacs.EngineGlobalType#getNoOGV <em>No OGV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No OGV</em>' containment reference.
	 * @see #getNoOGV()
	 * @generated
	 */
	void setNoOGV(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>RSS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rotor stator spacing (relative to chordlength)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RSS</em>' containment reference.
	 * @see #setRSS(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEngineGlobalType_RSS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rSS' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRSS();

	/**
	 * Sets the value of the '{@link Cpacs.EngineGlobalType#getRSS <em>RSS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RSS</em>' containment reference.
	 * @see #getRSS()
	 * @generated
	 */
	void setRSS(DoubleBaseType value);

} // EngineGlobalType
