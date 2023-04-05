/**
 */
package Cpacs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Strut Position Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RelativeStrutPositionType#getStrutUID <em>Strut UID</em>}</li>
 *   <li>{@link Cpacs.RelativeStrutPositionType#getRelativePosition <em>Relative Position</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRelativeStrutPositionType()
 * @model extendedMetaData="name='relativeStrutPositionType' kind='elementOnly'"
 * @generated
 */
public interface RelativeStrutPositionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Strut UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strut UID</em>' containment reference.
	 * @see #setStrutUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getRelativeStrutPositionType_StrutUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='strutUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStrutUID();

	/**
	 * Sets the value of the '{@link Cpacs.RelativeStrutPositionType#getStrutUID <em>Strut UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strut UID</em>' containment reference.
	 * @see #getStrutUID()
	 * @generated
	 */
	void setStrutUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Relative Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Position</em>' attribute.
	 * @see #isSetRelativePosition()
	 * @see #unsetRelativePosition()
	 * @see #setRelativePosition(double)
	 * @see Cpacs.CpacsPackage#getRelativeStrutPositionType_RelativePosition()
	 * @model unsettable="true" dataType="Cpacs.RelativePositionType" required="true"
	 *        extendedMetaData="kind='element' name='relativePosition' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRelativePosition();

	/**
	 * Sets the value of the '{@link Cpacs.RelativeStrutPositionType#getRelativePosition <em>Relative Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Position</em>' attribute.
	 * @see #isSetRelativePosition()
	 * @see #unsetRelativePosition()
	 * @see #getRelativePosition()
	 * @generated
	 */
	void setRelativePosition(double value);

	/**
	 * Unsets the value of the '{@link Cpacs.RelativeStrutPositionType#getRelativePosition <em>Relative Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelativePosition()
	 * @see #getRelativePosition()
	 * @see #setRelativePosition(double)
	 * @generated
	 */
	void unsetRelativePosition();

	/**
	 * Returns whether the value of the '{@link Cpacs.RelativeStrutPositionType#getRelativePosition <em>Relative Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relative Position</em>' attribute is set.
	 * @see #unsetRelativePosition()
	 * @see #getRelativePosition()
	 * @see #setRelativePosition(double)
	 * @generated
	 */
	boolean isSetRelativePosition();

} // RelativeStrutPositionType
