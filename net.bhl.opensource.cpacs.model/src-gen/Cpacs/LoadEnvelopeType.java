/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Envelope Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadEnvelopeType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.LoadEnvelopeType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.LoadEnvelopeType#getPointSetUID <em>Point Set UID</em>}</li>
 *   <li>{@link Cpacs.LoadEnvelopeType#getLoadCaseUIDs <em>Load Case UI Ds</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadEnvelopeType()
 * @model extendedMetaData="name='loadEnvelopeType' kind='elementOnly'"
 * @generated
 */
public interface LoadEnvelopeType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getLoadEnvelopeType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.LoadEnvelopeType#getName <em>Name</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getLoadEnvelopeType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.LoadEnvelopeType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Point Set UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the corresponding point set
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Set UID</em>' containment reference.
	 * @see #setPointSetUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLoadEnvelopeType_PointSetUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pointSetUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getPointSetUID();

	/**
	 * Sets the value of the '{@link Cpacs.LoadEnvelopeType#getPointSetUID <em>Point Set UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Set UID</em>' containment reference.
	 * @see #getPointSetUID()
	 * @generated
	 */
	void setPointSetUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Load Case UI Ds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of uIDs defining the loads envelope
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Case UI Ds</em>' containment reference.
	 * @see #setLoadCaseUIDs(UIDSequenceType)
	 * @see Cpacs.CpacsPackage#getLoadEnvelopeType_LoadCaseUIDs()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='loadCaseUIDs' namespace='##targetNamespace'"
	 * @generated
	 */
	UIDSequenceType getLoadCaseUIDs();

	/**
	 * Sets the value of the '{@link Cpacs.LoadEnvelopeType#getLoadCaseUIDs <em>Load Case UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Case UI Ds</em>' containment reference.
	 * @see #getLoadCaseUIDs()
	 * @generated
	 */
	void setLoadCaseUIDs(UIDSequenceType value);

} // LoadEnvelopeType
