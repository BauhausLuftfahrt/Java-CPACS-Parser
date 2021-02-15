/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Beam Cross Section Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.BeamCrossSectionType#getArea <em>Area</em>}</li>
 *   <li>{@link Cpacs.BeamCrossSectionType#getXMin <em>XMin</em>}</li>
 *   <li>{@link Cpacs.BeamCrossSectionType#getXMax <em>XMax</em>}</li>
 *   <li>{@link Cpacs.BeamCrossSectionType#getYMin <em>YMin</em>}</li>
 *   <li>{@link Cpacs.BeamCrossSectionType#getYMax <em>YMax</em>}</li>
 *   <li>{@link Cpacs.BeamCrossSectionType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getBeamCrossSectionType()
 * @model extendedMetaData="name='beamCrossSectionType' kind='elementOnly'"
 * @generated
 */
public interface BeamCrossSectionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' containment reference.
	 * @see #setArea(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getBeamCrossSectionType_Area()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='area' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getArea();

	/**
	 * Sets the value of the '{@link Cpacs.BeamCrossSectionType#getArea <em>Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' containment reference.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>XMin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMin</em>' containment reference.
	 * @see #setXMin(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getBeamCrossSectionType_XMin()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='xMin' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getXMin();

	/**
	 * Sets the value of the '{@link Cpacs.BeamCrossSectionType#getXMin <em>XMin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XMin</em>' containment reference.
	 * @see #getXMin()
	 * @generated
	 */
	void setXMin(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>XMax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMax</em>' containment reference.
	 * @see #setXMax(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getBeamCrossSectionType_XMax()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='xMax' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getXMax();

	/**
	 * Sets the value of the '{@link Cpacs.BeamCrossSectionType#getXMax <em>XMax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XMax</em>' containment reference.
	 * @see #getXMax()
	 * @generated
	 */
	void setXMax(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>YMin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YMin</em>' containment reference.
	 * @see #setYMin(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getBeamCrossSectionType_YMin()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='yMin' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getYMin();

	/**
	 * Sets the value of the '{@link Cpacs.BeamCrossSectionType#getYMin <em>YMin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YMin</em>' containment reference.
	 * @see #getYMin()
	 * @generated
	 */
	void setYMin(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>YMax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YMax</em>' containment reference.
	 * @see #setYMax(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getBeamCrossSectionType_YMax()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='yMax' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getYMax();

	/**
	 * Sets the value of the '{@link Cpacs.BeamCrossSectionType#getYMax <em>YMax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YMax</em>' containment reference.
	 * @see #getYMax()
	 * @generated
	 */
	void setYMax(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getBeamCrossSectionType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.BeamCrossSectionType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // BeamCrossSectionType
