/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spar Position Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SparPositionType#getSparPositionRib <em>Spar Position Rib</em>}</li>
 *   <li>{@link Cpacs.SparPositionType#getSparPositionEtaXsi <em>Spar Position Eta Xsi</em>}</li>
 *   <li>{@link Cpacs.SparPositionType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSparPositionType()
 * @model extendedMetaData="name='sparPositionType' kind='elementOnly'"
 * @generated
 */
public interface SparPositionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Spar Position Rib</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a spar position on an existing rib using a relative xsi coordinate
	 *                             to determine the chord wise position on that rib
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spar Position Rib</em>' containment reference.
	 * @see #setSparPositionRib(WingRibPointType)
	 * @see Cpacs.CpacsPackage#getSparPositionType_SparPositionRib()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sparPositionRib' namespace='##targetNamespace'"
	 * @generated
	 */
	WingRibPointType getSparPositionRib();

	/**
	 * Sets the value of the '{@link Cpacs.SparPositionType#getSparPositionRib <em>Spar Position Rib</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spar Position Rib</em>' containment reference.
	 * @see #getSparPositionRib()
	 * @generated
	 */
	void setSparPositionRib(WingRibPointType value);

	/**
	 * Returns the value of the '<em><b>Spar Position Eta Xsi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a spar position using relative eta/xsi coordinates
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spar Position Eta Xsi</em>' containment reference.
	 * @see #setSparPositionEtaXsi(EtaXsiPointType)
	 * @see Cpacs.CpacsPackage#getSparPositionType_SparPositionEtaXsi()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sparPositionEtaXsi' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaXsiPointType getSparPositionEtaXsi();

	/**
	 * Sets the value of the '{@link Cpacs.SparPositionType#getSparPositionEtaXsi <em>Spar Position Eta Xsi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spar Position Eta Xsi</em>' containment reference.
	 * @see #getSparPositionEtaXsi()
	 * @generated
	 */
	void setSparPositionEtaXsi(EtaXsiPointType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getSparPositionType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.SparPositionType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // SparPositionType
