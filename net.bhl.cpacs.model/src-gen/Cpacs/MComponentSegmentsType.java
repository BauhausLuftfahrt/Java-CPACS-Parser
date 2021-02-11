/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MComponent Segments Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MComponentSegmentsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MComponentSegmentsType#getMComponentSegment <em>MComponent Segment</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMComponentSegmentsType()
 * @model extendedMetaData="name='mComponentSegmentsType' kind='elementOnly'"
 * @generated
 */
public interface MComponentSegmentsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMComponentSegmentsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MComponentSegmentsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MComponent Segment</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.MComponentSegmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MComponent Segment</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMComponentSegmentsType_MComponentSegment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mComponentSegment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MComponentSegmentType> getMComponentSegment();

} // MComponentSegmentsType
