/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Materials Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MaterialsType#getMaterial <em>Material</em>}</li>
 *   <li>{@link Cpacs.MaterialsType#getComposites <em>Composites</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMaterialsType()
 * @model extendedMetaData="name='materialsType' kind='elementOnly'"
 * @generated
 */
public interface MaterialsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.MaterialType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMaterialsType_Material()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MaterialType> getMaterial();

	/**
	 * Returns the value of the '<em><b>Composites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composites</em>' containment reference.
	 * @see #setComposites(CompositesType)
	 * @see Cpacs.CpacsPackage#getMaterialsType_Composites()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='composites' namespace='##targetNamespace'"
	 * @generated
	 */
	CompositesType getComposites();

	/**
	 * Sets the value of the '{@link Cpacs.MaterialsType#getComposites <em>Composites</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composites</em>' containment reference.
	 * @see #getComposites()
	 * @generated
	 */
	void setComposites(CompositesType value);

} // MaterialsType
