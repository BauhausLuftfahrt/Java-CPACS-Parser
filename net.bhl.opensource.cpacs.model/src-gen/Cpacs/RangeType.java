/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                                     Flown distance ending the segment
 *                                 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RangeType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRangeType()
 * @model extendedMetaData="name='range_._type' kind='simple'"
 * @generated
 */
public interface RangeType extends DoubleConstraintBaseType {
	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getRangeType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.RangeType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // RangeType
