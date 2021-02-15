/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Shell Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingShellType#getSkin <em>Skin</em>}</li>
 *   <li>{@link Cpacs.WingShellType#getStringer <em>Stringer</em>}</li>
 *   <li>{@link Cpacs.WingShellType#getCells <em>Cells</em>}</li>
 *   <li>{@link Cpacs.WingShellType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingShellType()
 * @model extendedMetaData="name='wingShellType' kind='elementOnly'"
 * @generated
 */
public interface WingShellType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Skin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skin</em>' containment reference.
	 * @see #setSkin(WingSkinType)
	 * @see Cpacs.CpacsPackage#getWingShellType_Skin()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='skin' namespace='##targetNamespace'"
	 * @generated
	 */
	WingSkinType getSkin();

	/**
	 * Sets the value of the '{@link Cpacs.WingShellType#getSkin <em>Skin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skin</em>' containment reference.
	 * @see #getSkin()
	 * @generated
	 */
	void setSkin(WingSkinType value);

	/**
	 * Returns the value of the '<em><b>Stringer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stringer</em>' containment reference.
	 * @see #setStringer(WingStringerType)
	 * @see Cpacs.CpacsPackage#getWingShellType_Stringer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stringer' namespace='##targetNamespace'"
	 * @generated
	 */
	WingStringerType getStringer();

	/**
	 * Sets the value of the '{@link Cpacs.WingShellType#getStringer <em>Stringer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stringer</em>' containment reference.
	 * @see #getStringer()
	 * @generated
	 */
	void setStringer(WingStringerType value);

	/**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference.
	 * @see #setCells(WingCellsType)
	 * @see Cpacs.CpacsPackage#getWingShellType_Cells()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cells' namespace='##targetNamespace'"
	 * @generated
	 */
	WingCellsType getCells();

	/**
	 * Sets the value of the '{@link Cpacs.WingShellType#getCells <em>Cells</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cells</em>' containment reference.
	 * @see #getCells()
	 * @generated
	 */
	void setCells(WingCellsType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getWingShellType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingShellType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // WingShellType
