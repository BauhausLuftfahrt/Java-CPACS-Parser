/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine Nacelle Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.EngineNacelleType#getFanCowl <em>Fan Cowl</em>}</li>
 *   <li>{@link Cpacs.EngineNacelleType#getCoreCowl <em>Core Cowl</em>}</li>
 *   <li>{@link Cpacs.EngineNacelleType#getCenterCowl <em>Center Cowl</em>}</li>
 *   <li>{@link Cpacs.EngineNacelleType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getEngineNacelleType()
 * @model extendedMetaData="name='engineNacelleType' kind='elementOnly'"
 * @generated
 */
public interface EngineNacelleType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Fan Cowl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fan Cowl</em>' containment reference.
	 * @see #setFanCowl(NacelleCowlType)
	 * @see Cpacs.CpacsPackage#getEngineNacelleType_FanCowl()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fanCowl' namespace='##targetNamespace'"
	 * @generated
	 */
	NacelleCowlType getFanCowl();

	/**
	 * Sets the value of the '{@link Cpacs.EngineNacelleType#getFanCowl <em>Fan Cowl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fan Cowl</em>' containment reference.
	 * @see #getFanCowl()
	 * @generated
	 */
	void setFanCowl(NacelleCowlType value);

	/**
	 * Returns the value of the '<em><b>Core Cowl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Cowl</em>' containment reference.
	 * @see #setCoreCowl(NacelleCowlType)
	 * @see Cpacs.CpacsPackage#getEngineNacelleType_CoreCowl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='coreCowl' namespace='##targetNamespace'"
	 * @generated
	 */
	NacelleCowlType getCoreCowl();

	/**
	 * Sets the value of the '{@link Cpacs.EngineNacelleType#getCoreCowl <em>Core Cowl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Cowl</em>' containment reference.
	 * @see #getCoreCowl()
	 * @generated
	 */
	void setCoreCowl(NacelleCowlType value);

	/**
	 * Returns the value of the '<em><b>Center Cowl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center Cowl</em>' containment reference.
	 * @see #setCenterCowl(NacelleCenterCowlType)
	 * @see Cpacs.CpacsPackage#getEngineNacelleType_CenterCowl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='centerCowl' namespace='##targetNamespace'"
	 * @generated
	 */
	NacelleCenterCowlType getCenterCowl();

	/**
	 * Sets the value of the '{@link Cpacs.EngineNacelleType#getCenterCowl <em>Center Cowl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center Cowl</em>' containment reference.
	 * @see #getCenterCowl()
	 * @generated
	 */
	void setCenterCowl(NacelleCenterCowlType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getEngineNacelleType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.EngineNacelleType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // EngineNacelleType
