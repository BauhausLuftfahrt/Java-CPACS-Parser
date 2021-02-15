/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Data Sets For Loads Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroDataSetsForLoadsType#getAeroDataSetForLoads <em>Aero Data Set For Loads</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroDataSetsForLoadsType()
 * @model extendedMetaData="name='aeroDataSetsForLoadsType' kind='elementOnly'"
 * @generated
 */
public interface AeroDataSetsForLoadsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Aero Data Set For Loads</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.AeroDataSetForLoadsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aero Data Set For Loads</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getAeroDataSetsForLoadsType_AeroDataSetForLoads()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='aeroDataSetForLoads' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AeroDataSetForLoadsType> getAeroDataSetForLoads();

} // AeroDataSetsForLoadsType
