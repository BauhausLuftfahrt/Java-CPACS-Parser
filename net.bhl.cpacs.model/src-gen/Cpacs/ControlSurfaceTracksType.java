/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Tracks Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfaceTracksType#getTrack <em>Track</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfaceTracksType()
 * @model extendedMetaData="name='controlSurfaceTracksType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfaceTracksType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Track</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ControlSurfaceTrackTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getControlSurfaceTracksType_Track()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='track' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ControlSurfaceTrackTypeType> getTrack();

} // ControlSurfaceTracksType
