/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.EngineType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.EngineType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.EngineType#getThrust00Scaling <em>Thrust00 Scaling</em>}</li>
 *   <li>{@link Cpacs.EngineType#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link Cpacs.EngineType#getNacelle <em>Nacelle</em>}</li>
 *   <li>{@link Cpacs.EngineType#getGlobal <em>Global</em>}</li>
 *   <li>{@link Cpacs.EngineType#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link Cpacs.EngineType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getEngineType()
 * @model extendedMetaData="name='engineType' kind='elementOnly'"
 * @generated
 */
public interface EngineType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of engine
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getEngineType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.EngineType#getName <em>Name</em>}' containment reference.
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
	 * Description of engine
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getEngineType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.EngineType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Thrust00 Scaling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Scaling of engine take-off thrust
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thrust00 Scaling</em>' containment reference.
	 * @see #setThrust00Scaling(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEngineType_Thrust00Scaling()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thrust00Scaling' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThrust00Scaling();

	/**
	 * Sets the value of the '{@link Cpacs.EngineType#getThrust00Scaling <em>Thrust00 Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thrust00 Scaling</em>' containment reference.
	 * @see #getThrust00Scaling()
	 * @generated
	 */
	void setThrust00Scaling(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' containment reference.
	 * @see #setGeometry(EngineGeometryType)
	 * @see Cpacs.CpacsPackage#getEngineType_Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	EngineGeometryType getGeometry();

	/**
	 * Sets the value of the '{@link Cpacs.EngineType#getGeometry <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' containment reference.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(EngineGeometryType value);

	/**
	 * Returns the value of the '<em><b>Nacelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nacelle</em>' containment reference.
	 * @see #setNacelle(EngineNacelleType)
	 * @see Cpacs.CpacsPackage#getEngineType_Nacelle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nacelle' namespace='##targetNamespace'"
	 * @generated
	 */
	EngineNacelleType getNacelle();

	/**
	 * Sets the value of the '{@link Cpacs.EngineType#getNacelle <em>Nacelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nacelle</em>' containment reference.
	 * @see #getNacelle()
	 * @generated
	 */
	void setNacelle(EngineNacelleType value);

	/**
	 * Returns the value of the '<em><b>Global</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global</em>' containment reference.
	 * @see #setGlobal(EngineGlobalType)
	 * @see Cpacs.CpacsPackage#getEngineType_Global()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='global' namespace='##targetNamespace'"
	 * @generated
	 */
	EngineGlobalType getGlobal();

	/**
	 * Sets the value of the '{@link Cpacs.EngineType#getGlobal <em>Global</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global</em>' containment reference.
	 * @see #getGlobal()
	 * @generated
	 */
	void setGlobal(EngineGlobalType value);

	/**
	 * Returns the value of the '<em><b>Analysis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis</em>' containment reference.
	 * @see #setAnalysis(EngineAnalysisType)
	 * @see Cpacs.CpacsPackage#getEngineType_Analysis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='analysis' namespace='##targetNamespace'"
	 * @generated
	 */
	EngineAnalysisType getAnalysis();

	/**
	 * Sets the value of the '{@link Cpacs.EngineType#getAnalysis <em>Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis</em>' containment reference.
	 * @see #getAnalysis()
	 * @generated
	 */
	void setAnalysis(EngineAnalysisType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getEngineType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.EngineType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // EngineType
