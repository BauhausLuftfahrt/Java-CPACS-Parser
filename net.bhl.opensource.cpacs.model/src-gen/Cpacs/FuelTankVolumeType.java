/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuel Tank Volume Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FuelTankVolumeType#getOptimalVolume <em>Optimal Volume</em>}</li>
 *   <li>{@link Cpacs.FuelTankVolumeType#getUsableVolume <em>Usable Volume</em>}</li>
 *   <li>{@link Cpacs.FuelTankVolumeType#getRealVolume <em>Real Volume</em>}</li>
 *   <li>{@link Cpacs.FuelTankVolumeType#getUseableVolumeFactor <em>Useable Volume Factor</em>}</li>
 *   <li>{@link Cpacs.FuelTankVolumeType#getRealVolumeFactor <em>Real Volume Factor</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFuelTankVolumeType()
 * @model extendedMetaData="name='fuelTankVolumeType' kind='elementOnly'"
 * @generated
 */
public interface FuelTankVolumeType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Optimal Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Theoretical volume if material thicknesses
	 *                                 (ribs, spars, skins, stringers) and systems (fuel pumps,
	 *                                 pipes...) are neglected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optimal Volume</em>' containment reference.
	 * @see #setOptimalVolume(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFuelTankVolumeType_OptimalVolume()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='optimalVolume' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getOptimalVolume();

	/**
	 * Sets the value of the '{@link Cpacs.FuelTankVolumeType#getOptimalVolume <em>Optimal Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimal Volume</em>' containment reference.
	 * @see #getOptimalVolume()
	 * @generated
	 */
	void setOptimalVolume(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Usable Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Usable fuel volume aircraft operations.
	 *                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usable Volume</em>' containment reference.
	 * @see #setUsableVolume(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFuelTankVolumeType_UsableVolume()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usableVolume' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getUsableVolume();

	/**
	 * Sets the value of the '{@link Cpacs.FuelTankVolumeType#getUsableVolume <em>Usable Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usable Volume</em>' containment reference.
	 * @see #getUsableVolume()
	 * @generated
	 */
	void setUsableVolume(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Real Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total real fuel tank volume.
	 *                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Real Volume</em>' containment reference.
	 * @see #setRealVolume(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFuelTankVolumeType_RealVolume()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='realVolume' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRealVolume();

	/**
	 * Sets the value of the '{@link Cpacs.FuelTankVolumeType#getRealVolume <em>Real Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Volume</em>' containment reference.
	 * @see #getRealVolume()
	 * @generated
	 */
	void setRealVolume(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Useable Volume Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Factor between the usalbe fuel volume and
	 *                                         the real fuel volume.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Useable Volume Factor</em>' containment reference.
	 * @see #setUseableVolumeFactor(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFuelTankVolumeType_UseableVolumeFactor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='useableVolumeFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getUseableVolumeFactor();

	/**
	 * Sets the value of the '{@link Cpacs.FuelTankVolumeType#getUseableVolumeFactor <em>Useable Volume Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Useable Volume Factor</em>' containment reference.
	 * @see #getUseableVolumeFactor()
	 * @generated
	 */
	void setUseableVolumeFactor(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Real Volume Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Factor between the real fuel volume and the
	 *                                         theoretical optimum fuel volume.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Real Volume Factor</em>' containment reference.
	 * @see #setRealVolumeFactor(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFuelTankVolumeType_RealVolumeFactor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='realVolumeFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRealVolumeFactor();

	/**
	 * Sets the value of the '{@link Cpacs.FuelTankVolumeType#getRealVolumeFactor <em>Real Volume Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Volume Factor</em>' containment reference.
	 * @see #getRealVolumeFactor()
	 * @generated
	 */
	void setRealVolumeFactor(DoubleBaseType value);

} // FuelTankVolumeType
