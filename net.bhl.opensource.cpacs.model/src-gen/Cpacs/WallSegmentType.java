/**
 */
package Cpacs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wall Segment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WallSegmentType#getPhi <em>Phi</em>}</li>
 *   <li>{@link Cpacs.WallSegmentType#getDoubleSidedExtrusion <em>Double Sided Extrusion</em>}</li>
 *   <li>{@link Cpacs.WallSegmentType#getFlushConnectionStart <em>Flush Connection Start</em>}</li>
 *   <li>{@link Cpacs.WallSegmentType#getFlushConnectionEnd <em>Flush Connection End</em>}</li>
 *   <li>{@link Cpacs.WallSegmentType#getBoundingElementUIDs <em>Bounding Element UI Ds</em>}</li>
 *   <li>{@link Cpacs.WallSegmentType#getStructuralWallElementUID <em>Structural Wall Element UID</em>}</li>
 *   <li>{@link Cpacs.WallSegmentType#getWallPositionUIDs <em>Wall Position UI Ds</em>}</li>
 *   <li>{@link Cpacs.WallSegmentType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWallSegmentType()
 * @model extendedMetaData="name='wallSegmentType' kind='elementOnly'"
 * @generated
 */
public interface WallSegmentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Phi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Defines extrusion direction. Rotation angle
	 *                         around fuselage x-axis of extrusion direction. A
	 *                         value of 0deg means fuselage z-axis as extrusion
	 *                         direction. Default: 0.0deg.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phi</em>' containment reference.
	 * @see #setPhi(PhiType)
	 * @see Cpacs.CpacsPackage#getWallSegmentType_Phi()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='phi' namespace='##targetNamespace'"
	 * @generated
	 */
	PhiType getPhi();

	/**
	 * Sets the value of the '{@link Cpacs.WallSegmentType#getPhi <em>Phi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phi</em>' containment reference.
	 * @see #getPhi()
	 * @generated
	 */
	void setPhi(PhiType value);

	/**
	 * Returns the value of the '<em><b>Double Sided Extrusion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * By default, the wall is only extruded in positive direction. If doubleSidedExtrusion is true, the wall is additionally extruded in negative direction as well. Default: false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Double Sided Extrusion</em>' containment reference.
	 * @see #setDoubleSidedExtrusion(BooleanBaseType)
	 * @see Cpacs.CpacsPackage#getWallSegmentType_DoubleSidedExtrusion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doubleSidedExtrusion' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanBaseType getDoubleSidedExtrusion();

	/**
	 * Sets the value of the '{@link Cpacs.WallSegmentType#getDoubleSidedExtrusion <em>Double Sided Extrusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double Sided Extrusion</em>' containment reference.
	 * @see #getDoubleSidedExtrusion()
	 * @generated
	 */
	void setDoubleSidedExtrusion(BooleanBaseType value);

	/**
	 * Returns the value of the '<em><b>Flush Connection Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rotates the first edge of the wall segment so that it is adjacent with the structural element defined in the first wall position (bulkhead, fuselage section or another plane wall). Default: false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flush Connection Start</em>' containment reference.
	 * @see #setFlushConnectionStart(BooleanBaseType)
	 * @see Cpacs.CpacsPackage#getWallSegmentType_FlushConnectionStart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flushConnectionStart' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanBaseType getFlushConnectionStart();

	/**
	 * Sets the value of the '{@link Cpacs.WallSegmentType#getFlushConnectionStart <em>Flush Connection Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flush Connection Start</em>' containment reference.
	 * @see #getFlushConnectionStart()
	 * @generated
	 */
	void setFlushConnectionStart(BooleanBaseType value);

	/**
	 * Returns the value of the '<em><b>Flush Connection End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rotates the last edge of the wall segment so that it is adjacent with the structural element defined in the last wall position (bulkhead, fuselage section or another plane wall). Default: false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flush Connection End</em>' containment reference.
	 * @see #setFlushConnectionEnd(BooleanBaseType)
	 * @see Cpacs.CpacsPackage#getWallSegmentType_FlushConnectionEnd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flushConnectionEnd' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanBaseType getFlushConnectionEnd();

	/**
	 * Sets the value of the '{@link Cpacs.WallSegmentType#getFlushConnectionEnd <em>Flush Connection End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flush Connection End</em>' containment reference.
	 * @see #getFlushConnectionEnd()
	 * @generated
	 */
	void setFlushConnectionEnd(BooleanBaseType value);

	/**
	 * Returns the value of the '<em><b>Bounding Element UI Ds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         A list of uIDs referencing other
	 *                         structural/geometric elements that shall serve
	 *                         as a boundary of the wall element. Possible
	 *                         references are floor, wall or
	 *                         genericGeometryComponent. A major requirement is
	 *                         that the referenced element has an intersection
	 *                         with the wall for at least the distance between
	 *                         two wall positions. So that a full geometric
	 *                         face of the wall is bounded by it. Neighbouring
	 *                         wall faces that are not completely bounded by
	 *                         the reference element are not affected.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bounding Element UI Ds</em>' containment reference.
	 * @see #setBoundingElementUIDs(BoundingElementUIDsType)
	 * @see Cpacs.CpacsPackage#getWallSegmentType_BoundingElementUIDs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='boundingElementUIDs' namespace='##targetNamespace'"
	 * @generated
	 */
	BoundingElementUIDsType getBoundingElementUIDs();

	/**
	 * Sets the value of the '{@link Cpacs.WallSegmentType#getBoundingElementUIDs <em>Bounding Element UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounding Element UI Ds</em>' containment reference.
	 * @see #getBoundingElementUIDs()
	 * @generated
	 */
	void setBoundingElementUIDs(BoundingElementUIDsType value);

	/**
	 * Returns the value of the '<em><b>Structural Wall Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Reference to the structural property definition
	 *                         of this wall segment.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structural Wall Element UID</em>' containment reference.
	 * @see #setStructuralWallElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWallSegmentType_StructuralWallElementUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structuralWallElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStructuralWallElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.WallSegmentType#getStructuralWallElementUID <em>Structural Wall Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Wall Element UID</em>' containment reference.
	 * @see #getStructuralWallElementUID()
	 * @generated
	 */
	void setStructuralWallElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Wall Position UI Ds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         List of wall position uIDs that are used for
	 *                         this wall segment. At least two positions must
	 *                         be defined (for start and end position of wall).
	 *                         If more than two positions are referenced here,
	 *                         the wall is constructed out of several planar
	 *                         faces that connect two consecutive positions
	 *                         (Note: Order of position uIDs defines
	 *                         connectivity).
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wall Position UI Ds</em>' containment reference.
	 * @see #setWallPositionUIDs(WallPositionUIDsType)
	 * @see Cpacs.CpacsPackage#getWallSegmentType_WallPositionUIDs()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wallPositionUIDs' namespace='##targetNamespace'"
	 * @generated
	 */
	WallPositionUIDsType getWallPositionUIDs();

	/**
	 * Sets the value of the '{@link Cpacs.WallSegmentType#getWallPositionUIDs <em>Wall Position UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wall Position UI Ds</em>' containment reference.
	 * @see #getWallPositionUIDs()
	 * @generated
	 */
	void setWallPositionUIDs(WallPositionUIDsType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getWallSegmentType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.WallSegmentType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // WallSegmentType
