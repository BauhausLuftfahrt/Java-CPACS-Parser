/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spar Cell Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SparCellType#getFromEta <em>From Eta</em>}</li>
 *   <li>{@link Cpacs.SparCellType#getToEta <em>To Eta</em>}</li>
 *   <li>{@link Cpacs.SparCellType#getUpperCap <em>Upper Cap</em>}</li>
 *   <li>{@link Cpacs.SparCellType#getLowerCap <em>Lower Cap</em>}</li>
 *   <li>{@link Cpacs.SparCellType#getWeb1 <em>Web1</em>}</li>
 *   <li>{@link Cpacs.SparCellType#getWeb2 <em>Web2</em>}</li>
 *   <li>{@link Cpacs.SparCellType#getRotation <em>Rotation</em>}</li>
 *   <li>{@link Cpacs.SparCellType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSparCellType()
 * @model extendedMetaData="name='sparCellType' kind='elementOnly'"
 * @generated
 */
public interface SparCellType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>From Eta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beginning (= inner border) of the spar cell.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Eta</em>' containment reference.
	 * @see #setFromEta(EtaIsoLineType)
	 * @see Cpacs.CpacsPackage#getSparCellType_FromEta()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fromEta' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaIsoLineType getFromEta();

	/**
	 * Sets the value of the '{@link Cpacs.SparCellType#getFromEta <em>From Eta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Eta</em>' containment reference.
	 * @see #getFromEta()
	 * @generated
	 */
	void setFromEta(EtaIsoLineType value);

	/**
	 * Returns the value of the '<em><b>To Eta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ending (= outer border) of the spar cell.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Eta</em>' containment reference.
	 * @see #setToEta(EtaIsoLineType)
	 * @see Cpacs.CpacsPackage#getSparCellType_ToEta()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='toEta' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaIsoLineType getToEta();

	/**
	 * Sets the value of the '{@link Cpacs.SparCellType#getToEta <em>To Eta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Eta</em>' containment reference.
	 * @see #getToEta()
	 * @generated
	 */
	void setToEta(EtaIsoLineType value);

	/**
	 * Returns the value of the '<em><b>Upper Cap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Upper Cap
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Cap</em>' containment reference.
	 * @see #setUpperCap(CapType)
	 * @see Cpacs.CpacsPackage#getSparCellType_UpperCap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='upperCap' namespace='##targetNamespace'"
	 * @generated
	 */
	CapType getUpperCap();

	/**
	 * Sets the value of the '{@link Cpacs.SparCellType#getUpperCap <em>Upper Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Cap</em>' containment reference.
	 * @see #getUpperCap()
	 * @generated
	 */
	void setUpperCap(CapType value);

	/**
	 * Returns the value of the '<em><b>Lower Cap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lower Cap
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Cap</em>' containment reference.
	 * @see #setLowerCap(CapType)
	 * @see Cpacs.CpacsPackage#getSparCellType_LowerCap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lowerCap' namespace='##targetNamespace'"
	 * @generated
	 */
	CapType getLowerCap();

	/**
	 * Sets the value of the '{@link Cpacs.SparCellType#getLowerCap <em>Lower Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Cap</em>' containment reference.
	 * @see #getLowerCap()
	 * @generated
	 */
	void setLowerCap(CapType value);

	/**
	 * Returns the value of the '<em><b>Web1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Web 1
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Web1</em>' containment reference.
	 * @see #setWeb1(WebType)
	 * @see Cpacs.CpacsPackage#getSparCellType_Web1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='web1' namespace='##targetNamespace'"
	 * @generated
	 */
	WebType getWeb1();

	/**
	 * Sets the value of the '{@link Cpacs.SparCellType#getWeb1 <em>Web1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web1</em>' containment reference.
	 * @see #getWeb1()
	 * @generated
	 */
	void setWeb1(WebType value);

	/**
	 * Returns the value of the '<em><b>Web2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Web 2
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Web2</em>' containment reference.
	 * @see #setWeb2(WebType)
	 * @see Cpacs.CpacsPackage#getSparCellType_Web2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='web2' namespace='##targetNamespace'"
	 * @generated
	 */
	WebType getWeb2();

	/**
	 * Sets the value of the '{@link Cpacs.SparCellType#getWeb2 <em>Web2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web2</em>' containment reference.
	 * @see #getWeb2()
	 * @generated
	 */
	void setWeb2(WebType value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The angle between the wing middle plane and
	 *                                 web 1 [deg]. Default is 90 degrees. Positive rotation is around the
	 *                                 spar axis heading along with the positive eta-axis.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rotation</em>' containment reference.
	 * @see #setRotation(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getSparCellType_Rotation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rotation' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRotation();

	/**
	 * Sets the value of the '{@link Cpacs.SparCellType#getRotation <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' containment reference.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getSparCellType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.SparCellType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // SparCellType
