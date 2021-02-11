/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runway Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RunwayType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.RunwayType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.RunwayType#getThresholdNorth <em>Threshold North</em>}</li>
 *   <li>{@link Cpacs.RunwayType#getThresholdEast <em>Threshold East</em>}</li>
 *   <li>{@link Cpacs.RunwayType#getThresholdElevation <em>Threshold Elevation</em>}</li>
 *   <li>{@link Cpacs.RunwayType#getHeading <em>Heading</em>}</li>
 *   <li>{@link Cpacs.RunwayType#getTORA <em>TORA</em>}</li>
 *   <li>{@link Cpacs.RunwayType#getLDA <em>LDA</em>}</li>
 *   <li>{@link Cpacs.RunwayType#getConditions <em>Conditions</em>}</li>
 *   <li>{@link Cpacs.RunwayType#getILS <em>ILS</em>}</li>
 *   <li>{@link Cpacs.RunwayType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRunwayType()
 * @model extendedMetaData="name='runwayType' kind='elementOnly'"
 * @generated
 */
public interface RunwayType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of runway
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getRunwayType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.RunwayType#getName <em>Name</em>}' containment reference.
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
	 * Description of runway
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getRunwayType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.RunwayType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Threshold North</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Position in degrees north
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Threshold North</em>' containment reference.
	 * @see #setThresholdNorth(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRunwayType_ThresholdNorth()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='thresholdNorth' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThresholdNorth();

	/**
	 * Sets the value of the '{@link Cpacs.RunwayType#getThresholdNorth <em>Threshold North</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold North</em>' containment reference.
	 * @see #getThresholdNorth()
	 * @generated
	 */
	void setThresholdNorth(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Threshold East</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Position in degrees east
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Threshold East</em>' containment reference.
	 * @see #setThresholdEast(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRunwayType_ThresholdEast()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='thresholdEast' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThresholdEast();

	/**
	 * Sets the value of the '{@link Cpacs.RunwayType#getThresholdEast <em>Threshold East</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold East</em>' containment reference.
	 * @see #getThresholdEast()
	 * @generated
	 */
	void setThresholdEast(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Threshold Elevation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Threshold elevation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Threshold Elevation</em>' containment reference.
	 * @see #setThresholdElevation(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRunwayType_ThresholdElevation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='thresholdElevation' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThresholdElevation();

	/**
	 * Sets the value of the '{@link Cpacs.RunwayType#getThresholdElevation <em>Threshold Elevation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold Elevation</em>' containment reference.
	 * @see #getThresholdElevation()
	 * @generated
	 */
	void setThresholdElevation(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Runway heading
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Heading</em>' containment reference.
	 * @see #setHeading(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRunwayType_Heading()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='heading' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getHeading();

	/**
	 * Sets the value of the '{@link Cpacs.RunwayType#getHeading <em>Heading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' containment reference.
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>TORA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Takeoff run available
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TORA</em>' containment reference.
	 * @see #setTORA(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRunwayType_TORA()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='tORA' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTORA();

	/**
	 * Sets the value of the '{@link Cpacs.RunwayType#getTORA <em>TORA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TORA</em>' containment reference.
	 * @see #getTORA()
	 * @generated
	 */
	void setTORA(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>LDA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Landing distance available
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LDA</em>' containment reference.
	 * @see #setLDA(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRunwayType_LDA()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='lDA' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getLDA();

	/**
	 * Sets the value of the '{@link Cpacs.RunwayType#getLDA <em>LDA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LDA</em>' containment reference.
	 * @see #getLDA()
	 * @generated
	 */
	void setLDA(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Conditions of the runway
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference.
	 * @see #setConditions(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRunwayType_Conditions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='conditions' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getConditions();

	/**
	 * Sets the value of the '{@link Cpacs.RunwayType#getConditions <em>Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditions</em>' containment reference.
	 * @see #getConditions()
	 * @generated
	 */
	void setConditions(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>ILS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ILS</em>' containment reference.
	 * @see #setILS(RunwayILSType)
	 * @see Cpacs.CpacsPackage#getRunwayType_ILS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='iLS' namespace='##targetNamespace'"
	 * @generated
	 */
	RunwayILSType getILS();

	/**
	 * Sets the value of the '{@link Cpacs.RunwayType#getILS <em>ILS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ILS</em>' containment reference.
	 * @see #getILS()
	 * @generated
	 */
	void setILS(RunwayILSType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getRunwayType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.RunwayType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // RunwayType
