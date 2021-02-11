/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuselage Cut Out Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FuselageCutOutType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.FuselageCutOutType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.FuselageCutOutType#getPositionX <em>Position X</em>}</li>
 *   <li>{@link Cpacs.FuselageCutOutType#getReferenceY <em>Reference Y</em>}</li>
 *   <li>{@link Cpacs.FuselageCutOutType#getReferenceZ <em>Reference Z</em>}</li>
 *   <li>{@link Cpacs.FuselageCutOutType#getReferenceAngle <em>Reference Angle</em>}</li>
 *   <li>{@link Cpacs.FuselageCutOutType#getOrientationVector <em>Orientation Vector</em>}</li>
 *   <li>{@link Cpacs.FuselageCutOutType#getAlignmentVector <em>Alignment Vector</em>}</li>
 *   <li>{@link Cpacs.FuselageCutOutType#getDeltaY <em>Delta Y</em>}</li>
 *   <li>{@link Cpacs.FuselageCutOutType#getDeltaZ <em>Delta Z</em>}</li>
 *   <li>{@link Cpacs.FuselageCutOutType#getDeltaY1 <em>Delta Y1</em>}</li>
 *   <li>{@link Cpacs.FuselageCutOutType#getDeltaZ1 <em>Delta Z1</em>}</li>
 *   <li>{@link Cpacs.FuselageCutOutType#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link Cpacs.FuselageCutOutType#getCutoutType <em>Cutout Type</em>}</li>
 *   <li>{@link Cpacs.FuselageCutOutType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFuselageCutOutType()
 * @model extendedMetaData="name='fuselageCutOutType' kind='elementOnly'"
 * @generated
 */
public interface FuselageCutOutType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the cutout
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFuselageCutOutType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageCutOutType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the cutout
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFuselageCutOutType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageCutOutType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Position X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * X position of the cutout center point
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position X</em>' containment reference.
	 * @see #setPositionX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFuselageCutOutType_PositionX()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='positionX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPositionX();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageCutOutType#getPositionX <em>Position X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position X</em>' containment reference.
	 * @see #getPositionX()
	 * @generated
	 */
	void setPositionX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Reference Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Y offset of the cutout reference point
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Y</em>' containment reference.
	 * @see #setReferenceY(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFuselageCutOutType_ReferenceY()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referenceY' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getReferenceY();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageCutOutType#getReferenceY <em>Reference Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Y</em>' containment reference.
	 * @see #getReferenceY()
	 * @generated
	 */
	void setReferenceY(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Reference Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Z offset of the cutout reference point
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Z</em>' containment reference.
	 * @see #setReferenceZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFuselageCutOutType_ReferenceZ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referenceZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getReferenceZ();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageCutOutType#getReferenceZ <em>Reference Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Z</em>' containment reference.
	 * @see #getReferenceZ()
	 * @generated
	 */
	void setReferenceZ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Reference Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angle in degrees of the vector pointing from
	 *                                 the cutout reference point to the cutout center point, measured
	 *                                 relative to the direction of the fuselage z axis.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Angle</em>' containment reference.
	 * @see #setReferenceAngle(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFuselageCutOutType_ReferenceAngle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referenceAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getReferenceAngle();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageCutOutType#getReferenceAngle <em>Reference Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Angle</em>' containment reference.
	 * @see #getReferenceAngle()
	 * @generated
	 */
	void setReferenceAngle(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Orientation Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coordinates of the unit vector defining the
	 *                                 direction of extrusion
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orientation Vector</em>' containment reference.
	 * @see #setOrientationVector(PointXYZType)
	 * @see Cpacs.CpacsPackage#getFuselageCutOutType_OrientationVector()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='orientationVector' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getOrientationVector();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageCutOutType#getOrientationVector <em>Orientation Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation Vector</em>' containment reference.
	 * @see #getOrientationVector()
	 * @generated
	 */
	void setOrientationVector(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>Alignment Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coordinates of the unit vector defining the
	 *                                 y-axis of the local cutout coordinate system. Must be normal to
	 *                                 the orientationVector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alignment Vector</em>' containment reference.
	 * @see #setAlignmentVector(PointXYZType)
	 * @see Cpacs.CpacsPackage#getFuselageCutOutType_AlignmentVector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alignmentVector' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getAlignmentVector();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageCutOutType#getAlignmentVector <em>Alignment Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment Vector</em>' containment reference.
	 * @see #getAlignmentVector()
	 * @generated
	 */
	void setAlignmentVector(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>Delta Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This value is used to define the width of the
	 *                                 cutout
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Y</em>' containment reference.
	 * @see #setDeltaY(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFuselageCutOutType_DeltaY()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deltaY' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDeltaY();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageCutOutType#getDeltaY <em>Delta Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Y</em>' containment reference.
	 * @see #getDeltaY()
	 * @generated
	 */
	void setDeltaY(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Delta Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This value is used to define the height of the
	 *                                 cutout
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Z</em>' containment reference.
	 * @see #setDeltaZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFuselageCutOutType_DeltaZ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deltaZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDeltaZ();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageCutOutType#getDeltaZ <em>Delta Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Z</em>' containment reference.
	 * @see #getDeltaZ()
	 * @generated
	 */
	void setDeltaZ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Delta Y1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This value is used to define the width of the
	 *                                 cutout
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Y1</em>' containment reference.
	 * @see #setDeltaY1(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFuselageCutOutType_DeltaY1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deltaY1' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDeltaY1();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageCutOutType#getDeltaY1 <em>Delta Y1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Y1</em>' containment reference.
	 * @see #getDeltaY1()
	 * @generated
	 */
	void setDeltaY1(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Delta Z1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This value is used to define the height of the
	 *                                 cutout
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Z1</em>' containment reference.
	 * @see #setDeltaZ1(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFuselageCutOutType_DeltaZ1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deltaZ1' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDeltaZ1();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageCutOutType#getDeltaZ1 <em>Delta Z1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Z1</em>' containment reference.
	 * @see #getDeltaZ1()
	 * @generated
	 */
	void setDeltaZ1(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Fillet Radius</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fillet radius of the cut element (absolute
	 *                                 value)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fillet Radius</em>' containment reference.
	 * @see #setFilletRadius(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFuselageCutOutType_FilletRadius()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='filletRadius' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getFilletRadius();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageCutOutType#getFilletRadius <em>Fillet Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fillet Radius</em>' containment reference.
	 * @see #getFilletRadius()
	 * @generated
	 */
	void setFilletRadius(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Cutout Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cutout type. Determines the type of the cutout
	 *                                 and how it is treated by the tools. Possible values:
	 *                                 ("window"|"door"|"ramp")
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cutout Type</em>' containment reference.
	 * @see #setCutoutType(CutoutTypeType)
	 * @see Cpacs.CpacsPackage#getFuselageCutOutType_CutoutType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cutoutType' namespace='##targetNamespace'"
	 * @generated
	 */
	CutoutTypeType getCutoutType();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageCutOutType#getCutoutType <em>Cutout Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cutout Type</em>' containment reference.
	 * @see #getCutoutType()
	 * @generated
	 */
	void setCutoutType(CutoutTypeType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getFuselageCutOutType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageCutOutType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // FuselageCutOutType
