/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runways Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RunwaysType#getRunway <em>Runway</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRunwaysType()
 * @model extendedMetaData="name='runwaysType' kind='elementOnly'"
 * @generated
 */
public interface RunwaysType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Runway</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.RunwayType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runway</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getRunwaysType_Runway()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='runway' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RunwayType> getRunway();

} // RunwaysType
