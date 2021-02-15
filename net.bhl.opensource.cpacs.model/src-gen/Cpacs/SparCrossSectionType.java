/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spar Cross Section Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SparCrossSectionType#getUpperCap <em>Upper Cap</em>}</li>
 *   <li>{@link Cpacs.SparCrossSectionType#getLowerCap <em>Lower Cap</em>}</li>
 *   <li>{@link Cpacs.SparCrossSectionType#getWeb1 <em>Web1</em>}</li>
 *   <li>{@link Cpacs.SparCrossSectionType#getWeb2 <em>Web2</em>}</li>
 *   <li>{@link Cpacs.SparCrossSectionType#getSparCells <em>Spar Cells</em>}</li>
 *   <li>{@link Cpacs.SparCrossSectionType#getRotation <em>Rotation</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSparCrossSectionType()
 * @model extendedMetaData="name='sparCrossSectionType' kind='elementOnly'"
 * @generated
 */
public interface SparCrossSectionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Upper Cap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Cap</em>' containment reference.
	 * @see #setUpperCap(CapType)
	 * @see Cpacs.CpacsPackage#getSparCrossSectionType_UpperCap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='upperCap' namespace='##targetNamespace'"
	 * @generated
	 */
	CapType getUpperCap();

	/**
	 * Sets the value of the '{@link Cpacs.SparCrossSectionType#getUpperCap <em>Upper Cap</em>}' containment reference.
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
	 * @return the value of the '<em>Lower Cap</em>' containment reference.
	 * @see #setLowerCap(CapType)
	 * @see Cpacs.CpacsPackage#getSparCrossSectionType_LowerCap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lowerCap' namespace='##targetNamespace'"
	 * @generated
	 */
	CapType getLowerCap();

	/**
	 * Sets the value of the '{@link Cpacs.SparCrossSectionType#getLowerCap <em>Lower Cap</em>}' containment reference.
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
	 * @return the value of the '<em>Web1</em>' containment reference.
	 * @see #setWeb1(WebType)
	 * @see Cpacs.CpacsPackage#getSparCrossSectionType_Web1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='web1' namespace='##targetNamespace'"
	 * @generated
	 */
	WebType getWeb1();

	/**
	 * Sets the value of the '{@link Cpacs.SparCrossSectionType#getWeb1 <em>Web1</em>}' containment reference.
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
	 * @return the value of the '<em>Web2</em>' containment reference.
	 * @see #setWeb2(WebType)
	 * @see Cpacs.CpacsPackage#getSparCrossSectionType_Web2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='web2' namespace='##targetNamespace'"
	 * @generated
	 */
	WebType getWeb2();

	/**
	 * Sets the value of the '{@link Cpacs.SparCrossSectionType#getWeb2 <em>Web2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web2</em>' containment reference.
	 * @see #getWeb2()
	 * @generated
	 */
	void setWeb2(WebType value);

	/**
	 * Returns the value of the '<em><b>Spar Cells</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spar Cells</em>' containment reference.
	 * @see #setSparCells(SparCellsType)
	 * @see Cpacs.CpacsPackage#getSparCrossSectionType_SparCells()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sparCells' namespace='##targetNamespace'"
	 * @generated
	 */
	SparCellsType getSparCells();

	/**
	 * Sets the value of the '{@link Cpacs.SparCrossSectionType#getSparCells <em>Spar Cells</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spar Cells</em>' containment reference.
	 * @see #getSparCells()
	 * @generated
	 */
	void setSparCells(SparCellsType value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The angle between the wing middle plane and
	 *                                 web1. Default is 90 degrees. Positive rotation is around the
	 *                                 intersection axis of the spar and the wing middle plane. The
	 *                                 positive heading of this axis is inline with the positive
	 *                                 heading of the componentSegment eta-axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rotation</em>' containment reference.
	 * @see #setRotation(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getSparCrossSectionType_Rotation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rotation' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRotation();

	/**
	 * Sets the value of the '{@link Cpacs.SparCrossSectionType#getRotation <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' containment reference.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(DoubleBaseType value);

} // SparCrossSectionType
