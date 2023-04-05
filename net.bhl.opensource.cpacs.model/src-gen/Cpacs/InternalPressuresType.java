/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Pressures Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.InternalPressuresType#getInternalPressure <em>Internal Pressure</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getInternalPressuresType()
 * @model extendedMetaData="name='internalPressuresType' kind='elementOnly'"
 * @generated
 */
public interface InternalPressuresType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Internal Pressure</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.InternalPressureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Internal pressure of a fuselage, deck or compartment
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internal Pressure</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getInternalPressuresType_InternalPressure()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='internalPressure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternalPressureType> getInternalPressure();

} // InternalPressuresType
