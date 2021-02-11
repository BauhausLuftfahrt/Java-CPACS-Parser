/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cut Loads Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CutLoadsType#getFuselageCutLoad <em>Fuselage Cut Load</em>}</li>
 *   <li>{@link Cpacs.CutLoadsType#getWingCutLoad <em>Wing Cut Load</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCutLoadsType()
 * @model extendedMetaData="name='cutLoadsType' kind='elementOnly'"
 * @generated
 */
public interface CutLoadsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Fuselage Cut Load</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CutLoadType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuselage Cut Load</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCutLoadsType_FuselageCutLoad()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fuselageCutLoad' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CutLoadType> getFuselageCutLoad();

	/**
	 * Returns the value of the '<em><b>Wing Cut Load</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CutLoadType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Cut Load</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCutLoadsType_WingCutLoad()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wingCutLoad' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CutLoadType> getWingCutLoad();

} // CutLoadsType
