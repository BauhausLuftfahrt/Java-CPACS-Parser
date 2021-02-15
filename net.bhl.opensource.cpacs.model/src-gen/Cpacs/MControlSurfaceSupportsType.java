/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MControl Surface Supports Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MControlSurfaceSupportsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MControlSurfaceSupportsType#getMControlSurfaceSupport <em>MControl Surface Support</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMControlSurfaceSupportsType()
 * @model extendedMetaData="name='mControlSurfaceSupportsType' kind='elementOnly'"
 * @generated
 */
public interface MControlSurfaceSupportsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMControlSurfaceSupportsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MControlSurfaceSupportsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MControl Surface Support</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.MControlSurfaceSupportType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MControl Surface Support</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMControlSurfaceSupportsType_MControlSurfaceSupport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mControlSurfaceSupport' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MControlSurfaceSupportType> getMControlSurfaceSupport();

} // MControlSurfaceSupportsType
