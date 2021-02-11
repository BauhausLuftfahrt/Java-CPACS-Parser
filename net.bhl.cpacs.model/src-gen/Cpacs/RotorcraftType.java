/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotorcraft Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RotorcraftType#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRotorcraftType()
 * @model extendedMetaData="name='rotorcraftType' kind='elementOnly'"
 * @generated
 */
public interface RotorcraftType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.RotorcraftModelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getRotorcraftType_Model()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='model' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RotorcraftModelType> getModel();

} // RotorcraftType
