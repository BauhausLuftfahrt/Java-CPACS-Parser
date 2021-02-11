/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cockpit Controls Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CockpitControlsType#getStickPitch <em>Stick Pitch</em>}</li>
 *   <li>{@link Cpacs.CockpitControlsType#getStickRoll <em>Stick Roll</em>}</li>
 *   <li>{@link Cpacs.CockpitControlsType#getPedals <em>Pedals</em>}</li>
 *   <li>{@link Cpacs.CockpitControlsType#getCockpitControl <em>Cockpit Control</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCockpitControlsType()
 * @model extendedMetaData="name='cockpitControlsType' kind='elementOnly'"
 * @generated
 */
public interface CockpitControlsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Stick Pitch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stick Pitch</em>' containment reference.
	 * @see #setStickPitch(CockpitControlType)
	 * @see Cpacs.CpacsPackage#getCockpitControlsType_StickPitch()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='stickPitch' namespace='##targetNamespace'"
	 * @generated
	 */
	CockpitControlType getStickPitch();

	/**
	 * Sets the value of the '{@link Cpacs.CockpitControlsType#getStickPitch <em>Stick Pitch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stick Pitch</em>' containment reference.
	 * @see #getStickPitch()
	 * @generated
	 */
	void setStickPitch(CockpitControlType value);

	/**
	 * Returns the value of the '<em><b>Stick Roll</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stick Roll</em>' containment reference.
	 * @see #setStickRoll(CockpitControlType)
	 * @see Cpacs.CpacsPackage#getCockpitControlsType_StickRoll()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='stickRoll' namespace='##targetNamespace'"
	 * @generated
	 */
	CockpitControlType getStickRoll();

	/**
	 * Sets the value of the '{@link Cpacs.CockpitControlsType#getStickRoll <em>Stick Roll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stick Roll</em>' containment reference.
	 * @see #getStickRoll()
	 * @generated
	 */
	void setStickRoll(CockpitControlType value);

	/**
	 * Returns the value of the '<em><b>Pedals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pedals</em>' containment reference.
	 * @see #setPedals(CockpitControlType)
	 * @see Cpacs.CpacsPackage#getCockpitControlsType_Pedals()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pedals' namespace='##targetNamespace'"
	 * @generated
	 */
	CockpitControlType getPedals();

	/**
	 * Sets the value of the '{@link Cpacs.CockpitControlsType#getPedals <em>Pedals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pedals</em>' containment reference.
	 * @see #getPedals()
	 * @generated
	 */
	void setPedals(CockpitControlType value);

	/**
	 * Returns the value of the '<em><b>Cockpit Control</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CockpitControlType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cockpit Control</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCockpitControlsType_CockpitControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cockpitControl' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CockpitControlType> getCockpitControl();

} // CockpitControlsType
