/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pintle Struts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Pintle strut(s) (Assumption: one end of the strut will connect to the main strut and the other end will be given as endPoint)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PintleStrutsType#getPintleStrut <em>Pintle Strut</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPintleStrutsType()
 * @model extendedMetaData="name='pintleStrutsType' kind='elementOnly'"
 * @generated
 */
public interface PintleStrutsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Pintle Strut</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StrutAssemblyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pintle strut (one or two pintle struts are supported)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pintle Strut</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getPintleStrutsType_PintleStrut()
	 * @model containment="true" required="true" upper="2"
	 *        extendedMetaData="kind='element' name='pintleStrut' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StrutAssemblyType> getPintleStrut();

} // PintleStrutsType
