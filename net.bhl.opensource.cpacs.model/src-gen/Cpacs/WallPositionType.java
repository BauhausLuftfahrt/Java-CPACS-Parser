/**
 */
package Cpacs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wall Position Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of a wall position to place walls inside fuselage.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WallPositionType#getBulkheadUID <em>Bulkhead UID</em>}</li>
 *   <li>{@link Cpacs.WallPositionType#getWallSegmentUID <em>Wall Segment UID</em>}</li>
 *   <li>{@link Cpacs.WallPositionType#getFuselageSectionUID <em>Fuselage Section UID</em>}</li>
 *   <li>{@link Cpacs.WallPositionType#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.WallPositionType#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.WallPositionType#getZ <em>Z</em>}</li>
 *   <li>{@link Cpacs.WallPositionType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWallPositionType()
 * @model extendedMetaData="name='wallPositionType' kind='elementOnly'"
 * @generated
 */
public interface WallPositionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Bulkhead UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             UID of a bulkhead determining the
	 *                             x-coordinate of the position with the given
	 *                             y- and z-coordinates.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bulkhead UID</em>' containment reference.
	 * @see #setBulkheadUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWallPositionType_BulkheadUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bulkheadUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getBulkheadUID();

	/**
	 * Sets the value of the '{@link Cpacs.WallPositionType#getBulkheadUID <em>Bulkhead UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bulkhead UID</em>' containment reference.
	 * @see #getBulkheadUID()
	 * @generated
	 */
	void setBulkheadUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Wall Segment UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             UID of a wall segment determining the
	 *                             x-coordinate of the position with the given
	 *                             y- and z-coordinates.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wall Segment UID</em>' containment reference.
	 * @see #setWallSegmentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWallPositionType_WallSegmentUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wallSegmentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getWallSegmentUID();

	/**
	 * Sets the value of the '{@link Cpacs.WallPositionType#getWallSegmentUID <em>Wall Segment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wall Segment UID</em>' containment reference.
	 * @see #getWallSegmentUID()
	 * @generated
	 */
	void setWallSegmentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Fuselage Section UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             UID of fuselage section determining the
	 *                             x-coordinate of the position with the given
	 *                             y- and z-coordinates.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fuselage Section UID</em>' containment reference.
	 * @see #setFuselageSectionUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWallPositionType_FuselageSectionUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuselageSectionUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFuselageSectionUID();

	/**
	 * Sets the value of the '{@link Cpacs.WallPositionType#getFuselageSectionUID <em>Fuselage Section UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuselage Section UID</em>' containment reference.
	 * @see #getFuselageSectionUID()
	 * @generated
	 */
	void setFuselageSectionUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Absolute x-coordinate of wall position in fuselage coordinate system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getWallPositionType_X()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getX();

	/**
	 * Sets the value of the '{@link Cpacs.WallPositionType#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Absolute y-coordinate of wall position in fuselage coordinate system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' containment reference.
	 * @see #setY(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getWallPositionType_Y()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='y' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getY();

	/**
	 * Sets the value of the '{@link Cpacs.WallPositionType#getY <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' containment reference.
	 * @see #getY()
	 * @generated
	 */
	void setY(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Absolute z-coordinate of wall position in fuselage coordinate system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Z</em>' containment reference.
	 * @see #setZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getWallPositionType_Z()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getZ();

	/**
	 * Sets the value of the '{@link Cpacs.WallPositionType#getZ <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' containment reference.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getWallPositionType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.WallPositionType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // WallPositionType
