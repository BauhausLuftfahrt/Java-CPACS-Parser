/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weight And Balancem Cargos Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WeightAndBalancemCargosType#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.WeightAndBalancemCargosType#getCoG <em>Co G</em>}</li>
 *   <li>{@link Cpacs.WeightAndBalancemCargosType#getMassInertia <em>Mass Inertia</em>}</li>
 *   <li>{@link Cpacs.WeightAndBalancemCargosType#getMCargo <em>MCargo</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWeightAndBalancemCargosType()
 * @model extendedMetaData="name='weightAndBalancemCargosType' kind='elementOnly'"
 * @generated
 */
public interface WeightAndBalancemCargosType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass</em>' containment reference.
	 * @see #setMass(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getWeightAndBalancemCargosType_Mass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mass' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getMass();

	/**
	 * Sets the value of the '{@link Cpacs.WeightAndBalancemCargosType#getMass <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' containment reference.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Co G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Co G</em>' containment reference.
	 * @see #setCoG(PointListXYZVectorType)
	 * @see Cpacs.CpacsPackage#getWeightAndBalancemCargosType_CoG()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coG' namespace='##targetNamespace'"
	 * @generated
	 */
	PointListXYZVectorType getCoG();

	/**
	 * Sets the value of the '{@link Cpacs.WeightAndBalancemCargosType#getCoG <em>Co G</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Co G</em>' containment reference.
	 * @see #getCoG()
	 * @generated
	 */
	void setCoG(PointListXYZVectorType value);

	/**
	 * Returns the value of the '<em><b>Mass Inertia</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Inertia</em>' containment reference.
	 * @see #setMassInertia(MassInertiaVectorType)
	 * @see Cpacs.CpacsPackage#getWeightAndBalancemCargosType_MassInertia()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massInertia' namespace='##targetNamespace'"
	 * @generated
	 */
	MassInertiaVectorType getMassInertia();

	/**
	 * Sets the value of the '{@link Cpacs.WeightAndBalancemCargosType#getMassInertia <em>Mass Inertia</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Inertia</em>' containment reference.
	 * @see #getMassInertia()
	 * @generated
	 */
	void setMassInertia(MassInertiaVectorType value);

	/**
	 * Returns the value of the '<em><b>MCargo</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringUIDBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCargo</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWeightAndBalancemCargosType_MCargo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCargo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StringUIDBaseType> getMCargo();

} // WeightAndBalancemCargosType
