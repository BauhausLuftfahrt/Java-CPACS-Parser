/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aeroelastics Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroelasticsType#getDivergence <em>Divergence</em>}</li>
 *   <li>{@link Cpacs.AeroelasticsType#getStaticMaxDisplacement <em>Static Max Displacement</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroelasticsType()
 * @model extendedMetaData="name='aeroelasticsType' kind='elementOnly'"
 * @generated
 */
public interface AeroelasticsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Divergence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Divergence</em>' containment reference.
	 * @see #setDivergence(AeroelasticDivergenceType)
	 * @see Cpacs.CpacsPackage#getAeroelasticsType_Divergence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='divergence' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroelasticDivergenceType getDivergence();

	/**
	 * Sets the value of the '{@link Cpacs.AeroelasticsType#getDivergence <em>Divergence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Divergence</em>' containment reference.
	 * @see #getDivergence()
	 * @generated
	 */
	void setDivergence(AeroelasticDivergenceType value);

	/**
	 * Returns the value of the '<em><b>Static Max Displacement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Max Displacement</em>' containment reference.
	 * @see #setStaticMaxDisplacement(AeroelasticStaticMaxDisplacementType)
	 * @see Cpacs.CpacsPackage#getAeroelasticsType_StaticMaxDisplacement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='staticMaxDisplacement' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroelasticStaticMaxDisplacementType getStaticMaxDisplacement();

	/**
	 * Sets the value of the '{@link Cpacs.AeroelasticsType#getStaticMaxDisplacement <em>Static Max Displacement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Max Displacement</em>' containment reference.
	 * @see #getStaticMaxDisplacement()
	 * @generated
	 */
	void setStaticMaxDisplacement(AeroelasticStaticMaxDisplacementType value);

} // AeroelasticsType
