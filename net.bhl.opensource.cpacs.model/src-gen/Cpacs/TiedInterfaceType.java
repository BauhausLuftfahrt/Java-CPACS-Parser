/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tied Interface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TiedInterfaceType#getStructuralMember1UID <em>Structural Member1 UID</em>}</li>
 *   <li>{@link Cpacs.TiedInterfaceType#getStructuralMember2UID <em>Structural Member2 UID</em>}</li>
 *   <li>{@link Cpacs.TiedInterfaceType#getConnectionSearchRadius <em>Connection Search Radius</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTiedInterfaceType()
 * @model extendedMetaData="name='tiedInterfaceType' kind='elementOnly'"
 * @generated
 */
public interface TiedInterfaceType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Structural Member1 UID</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringUIDBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Can be each structural member (skinSegment,
	 *                                 stringer, frame, paxCrossBeam, cargoCrossBeam,
	 *                                 paxCrossBeamStrut, cargoCrossBeamStrut, long. floor beams,
	 *                                 floorPanel, seatModule)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structural Member1 UID</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getTiedInterfaceType_StructuralMember1UID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='structuralMember1UID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StringUIDBaseType> getStructuralMember1UID();

	/**
	 * Returns the value of the '<em><b>Structural Member2 UID</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringUIDBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Can be each structural member (skinSegment,
	 *                                 stringer, frame, paxCrossBeam, cargoCrossBeam,
	 *                                 paxCrossBeamStrut, cargoCrossBeamStrut, long. floor beams,
	 *                                 floorPanel, seatModule)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structural Member2 UID</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getTiedInterfaceType_StructuralMember2UID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='structuralMember2UID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StringUIDBaseType> getStructuralMember2UID();

	/**
	 * Returns the value of the '<em><b>Connection Search Radius</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Search Radius</em>' containment reference.
	 * @see #setConnectionSearchRadius(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTiedInterfaceType_ConnectionSearchRadius()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connectionSearchRadius' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getConnectionSearchRadius();

	/**
	 * Sets the value of the '{@link Cpacs.TiedInterfaceType#getConnectionSearchRadius <em>Connection Search Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Search Radius</em>' containment reference.
	 * @see #getConnectionSearchRadius()
	 * @generated
	 */
	void setConnectionSearchRadius(DoubleBaseType value);

} // TiedInterfaceType
