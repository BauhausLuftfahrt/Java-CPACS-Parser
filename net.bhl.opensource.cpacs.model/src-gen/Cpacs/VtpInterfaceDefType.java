/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vtp Interface Def Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.VtpInterfaceDefType#getVtpFrameDefinitions <em>Vtp Frame Definitions</em>}</li>
 *   <li>{@link Cpacs.VtpInterfaceDefType#getVtpAreaToleranceX <em>Vtp Area Tolerance X</em>}</li>
 *   <li>{@link Cpacs.VtpInterfaceDefType#getVtpAreaToleranceZ <em>Vtp Area Tolerance Z</em>}</li>
 *   <li>{@link Cpacs.VtpInterfaceDefType#getVtpReinfRelZ <em>Vtp Reinf Rel Z</em>}</li>
 *   <li>{@link Cpacs.VtpInterfaceDefType#getVtpReinfRelWidth <em>Vtp Reinf Rel Width</em>}</li>
 *   <li>{@link Cpacs.VtpInterfaceDefType#getVtpIntersectionArc <em>Vtp Intersection Arc</em>}</li>
 *   <li>{@link Cpacs.VtpInterfaceDefType#getVtpAttachmentStructElemUID <em>Vtp Attachment Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.VtpInterfaceDefType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getVtpInterfaceDefType()
 * @model extendedMetaData="name='vtpInterfaceDefType' kind='elementOnly'"
 * @generated
 */
public interface VtpInterfaceDefType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Vtp Frame Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.VtpFrameDefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of the VTP attachment frames and
	 *                                 their
	 *                                 reinforcement
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vtp Frame Definitions</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getVtpInterfaceDefType_VtpFrameDefinitions()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='vtpFrameDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VtpFrameDefType> getVtpFrameDefinitions();

	/**
	 * Returns the value of the '<em><b>Vtp Area Tolerance X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines area for valid x-position of VTP (just
	 *                                 used
	 *                                 if attachmentpoint is directly based on frame) ==> check and
	 *                                 potentially warning message
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vtp Area Tolerance X</em>' containment reference.
	 * @see #setVtpAreaToleranceX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getVtpInterfaceDefType_VtpAreaToleranceX()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vtpAreaToleranceX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getVtpAreaToleranceX();

	/**
	 * Sets the value of the '{@link Cpacs.VtpInterfaceDefType#getVtpAreaToleranceX <em>Vtp Area Tolerance X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vtp Area Tolerance X</em>' containment reference.
	 * @see #getVtpAreaToleranceX()
	 * @generated
	 */
	void setVtpAreaToleranceX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Vtp Area Tolerance Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of the max. distance between
	 *                                 fuselage and
	 *                                 the defined VTP pins ==> check and potentially warning
	 *                                 message
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vtp Area Tolerance Z</em>' containment reference.
	 * @see #setVtpAreaToleranceZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getVtpInterfaceDefType_VtpAreaToleranceZ()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vtpAreaToleranceZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getVtpAreaToleranceZ();

	/**
	 * Sets the value of the '{@link Cpacs.VtpInterfaceDefType#getVtpAreaToleranceZ <em>Vtp Area Tolerance Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vtp Area Tolerance Z</em>' containment reference.
	 * @see #getVtpAreaToleranceZ()
	 * @generated
	 */
	void setVtpAreaToleranceZ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Vtp Reinf Rel Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of reinforcement area at VTP frame
	 *                                 positions (relative coordinate, smaller than
	 *                                 1.0)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vtp Reinf Rel Z</em>' containment reference.
	 * @see #setVtpReinfRelZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getVtpInterfaceDefType_VtpReinfRelZ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vtpReinfRelZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getVtpReinfRelZ();

	/**
	 * Sets the value of the '{@link Cpacs.VtpInterfaceDefType#getVtpReinfRelZ <em>Vtp Reinf Rel Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vtp Reinf Rel Z</em>' containment reference.
	 * @see #getVtpReinfRelZ()
	 * @generated
	 */
	void setVtpReinfRelZ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Vtp Reinf Rel Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of vertical reinforcements at VTP
	 *                                 frame
	 *                                 positions (relative coordinate, smaller than
	 *                                 1.0)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vtp Reinf Rel Width</em>' containment reference.
	 * @see #setVtpReinfRelWidth(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getVtpInterfaceDefType_VtpReinfRelWidth()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vtpReinfRelWidth' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getVtpReinfRelWidth();

	/**
	 * Sets the value of the '{@link Cpacs.VtpInterfaceDefType#getVtpReinfRelWidth <em>Vtp Reinf Rel Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vtp Reinf Rel Width</em>' containment reference.
	 * @see #getVtpReinfRelWidth()
	 * @generated
	 */
	void setVtpReinfRelWidth(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Vtp Intersection Arc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * value to change from horizontal to radial
	 *                                 reinforcements for VTP frame plates
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vtp Intersection Arc</em>' containment reference.
	 * @see #setVtpIntersectionArc(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getVtpInterfaceDefType_VtpIntersectionArc()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vtpIntersectionArc' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getVtpIntersectionArc();

	/**
	 * Sets the value of the '{@link Cpacs.VtpInterfaceDefType#getVtpIntersectionArc <em>Vtp Intersection Arc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vtp Intersection Arc</em>' containment reference.
	 * @see #getVtpIntersectionArc()
	 * @generated
	 */
	void setVtpIntersectionArc(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Vtp Attachment Struct Elem UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of elements to connect VTP pins with
	 *                                 fuselage
	 *                                 (beam elements)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vtp Attachment Struct Elem UID</em>' containment reference.
	 * @see #setVtpAttachmentStructElemUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getVtpInterfaceDefType_VtpAttachmentStructElemUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vtpAttachmentStructElemUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getVtpAttachmentStructElemUID();

	/**
	 * Sets the value of the '{@link Cpacs.VtpInterfaceDefType#getVtpAttachmentStructElemUID <em>Vtp Attachment Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vtp Attachment Struct Elem UID</em>' containment reference.
	 * @see #getVtpAttachmentStructElemUID()
	 * @generated
	 */
	void setVtpAttachmentStructElemUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getVtpInterfaceDefType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.VtpInterfaceDefType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // VtpInterfaceDefType
