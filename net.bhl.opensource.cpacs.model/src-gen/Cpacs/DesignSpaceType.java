/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Space Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DesignSpaceType#getDesignParameters <em>Design Parameters</em>}</li>
 *   <li>{@link Cpacs.DesignSpaceType#getStateParameters <em>State Parameters</em>}</li>
 *   <li>{@link Cpacs.DesignSpaceType#getStatus <em>Status</em>}</li>
 *   <li>{@link Cpacs.DesignSpaceType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDesignSpaceType()
 * @model extendedMetaData="name='designSpaceType' kind='elementOnly'"
 * @generated
 */
public interface DesignSpaceType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Design Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Parameters</em>' containment reference.
	 * @see #setDesignParameters(DesignParametersType)
	 * @see Cpacs.CpacsPackage#getDesignSpaceType_DesignParameters()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='designParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	DesignParametersType getDesignParameters();

	/**
	 * Sets the value of the '{@link Cpacs.DesignSpaceType#getDesignParameters <em>Design Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Parameters</em>' containment reference.
	 * @see #getDesignParameters()
	 * @generated
	 */
	void setDesignParameters(DesignParametersType value);

	/**
	 * Returns the value of the '<em><b>State Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Parameters</em>' containment reference.
	 * @see #setStateParameters(StateParametersType)
	 * @see Cpacs.CpacsPackage#getDesignSpaceType_StateParameters()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='stateParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	StateParametersType getStateParameters();

	/**
	 * Sets the value of the '{@link Cpacs.DesignSpaceType#getStateParameters <em>State Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Parameters</em>' containment reference.
	 * @see #getStateParameters()
	 * @generated
	 */
	void setStateParameters(StateParametersType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDesignSpaceType_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getStatus();

	/**
	 * Sets the value of the '{@link Cpacs.DesignSpaceType#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getDesignSpaceType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.DesignSpaceType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // DesignSpaceType
