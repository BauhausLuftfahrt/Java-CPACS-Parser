/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Structural Mounts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingStructuralMountsType#getWingStructuralMount <em>Wing Structural Mount</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingStructuralMountsType()
 * @model extendedMetaData="name='wingStructuralMountsType' kind='elementOnly'"
 * @generated
 */
public interface WingStructuralMountsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Wing Structural Mount</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StructuralMountType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Structural Mount</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWingStructuralMountsType_WingStructuralMount()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wingStructuralMount' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StructuralMountType> getWingStructuralMount();

} // WingStructuralMountsType
