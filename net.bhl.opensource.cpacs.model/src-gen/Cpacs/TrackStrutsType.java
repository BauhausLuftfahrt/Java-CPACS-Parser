/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track Struts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TrackStrutsType#getStrut <em>Strut</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTrackStrutsType()
 * @model extendedMetaData="name='trackStrutsType' kind='elementOnly'"
 * @generated
 */
public interface TrackStrutsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Strut</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.TrackStrutType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strut</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getTrackStrutsType_Strut()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='strut' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TrackStrutType> getStrut();

} // TrackStrutsType
