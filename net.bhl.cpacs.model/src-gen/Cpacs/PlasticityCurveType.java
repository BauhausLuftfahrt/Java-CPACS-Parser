/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plasticity Curve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PlasticityCurveType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.PlasticityCurveType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.PlasticityCurveType#getStrainRate <em>Strain Rate</em>}</li>
 *   <li>{@link Cpacs.PlasticityCurveType#getPlasticityCurvePoints <em>Plasticity Curve Points</em>}</li>
 *   <li>{@link Cpacs.PlasticityCurveType#getPlasticEliminationStrain <em>Plastic Elimination Strain</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPlasticityCurveType()
 * @model extendedMetaData="name='plasticityCurveType' kind='elementOnly'"
 * @generated
 */
public interface PlasticityCurveType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Name of the post failure definition
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getPlasticityCurveType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.PlasticityCurveType#getName <em>Name</em>}' containment reference.
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
	 * 
	 *                                 Description of the post failure
	 *                                 definition
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getPlasticityCurveType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.PlasticityCurveType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Strain Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Strain rate for following plastcity
	 *                                 curve [1/s]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strain Rate</em>' containment reference.
	 * @see #setStrainRate(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPlasticityCurveType_StrainRate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strainRate' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getStrainRate();

	/**
	 * Sets the value of the '{@link Cpacs.PlasticityCurveType#getStrainRate <em>Strain Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strain Rate</em>' containment reference.
	 * @see #getStrainRate()
	 * @generated
	 */
	void setStrainRate(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Plasticity Curve Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plasticity Curve Points</em>' containment reference.
	 * @see #setPlasticityCurvePoints(PlasticityCurvePointsType)
	 * @see Cpacs.CpacsPackage#getPlasticityCurveType_PlasticityCurvePoints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='plasticityCurvePoints' namespace='##targetNamespace'"
	 * @generated
	 */
	PlasticityCurvePointsType getPlasticityCurvePoints();

	/**
	 * Sets the value of the '{@link Cpacs.PlasticityCurveType#getPlasticityCurvePoints <em>Plasticity Curve Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plasticity Curve Points</em>' containment reference.
	 * @see #getPlasticityCurvePoints()
	 * @generated
	 */
	void setPlasticityCurvePoints(PlasticityCurvePointsType value);

	/**
	 * Returns the value of the '<em><b>Plastic Elimination Strain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 plasticEliminationStrain [-]; Plastic
	 *                                 strain for element elimination during
	 *                                 the non-linear analysis
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plastic Elimination Strain</em>' containment reference.
	 * @see #setPlasticEliminationStrain(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPlasticityCurveType_PlasticEliminationStrain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='plasticEliminationStrain' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPlasticEliminationStrain();

	/**
	 * Sets the value of the '{@link Cpacs.PlasticityCurveType#getPlasticEliminationStrain <em>Plastic Elimination Strain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plastic Elimination Strain</em>' containment reference.
	 * @see #getPlasticEliminationStrain()
	 * @generated
	 */
	void setPlasticEliminationStrain(DoubleBaseType value);

} // PlasticityCurveType
