/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Updates Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.UpdatesType#getUpdate <em>Update</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getUpdatesType()
 * @model extendedMetaData="name='updatesType' kind='elementOnly'"
 * @generated
 */
public interface UpdatesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Update</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.UpdateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getUpdatesType_Update()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='update' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UpdateType> getUpdate();

} // UpdatesType
