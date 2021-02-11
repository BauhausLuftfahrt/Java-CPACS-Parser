/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotor Blade Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RotorBladeAttachmentType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.RotorBladeAttachmentType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.RotorBladeAttachmentType#getAzimuthAngles <em>Azimuth Angles</em>}</li>
 *   <li>{@link Cpacs.RotorBladeAttachmentType#getNumberOfBlades <em>Number Of Blades</em>}</li>
 *   <li>{@link Cpacs.RotorBladeAttachmentType#getHinges <em>Hinges</em>}</li>
 *   <li>{@link Cpacs.RotorBladeAttachmentType#getRotorBladeUID <em>Rotor Blade UID</em>}</li>
 *   <li>{@link Cpacs.RotorBladeAttachmentType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRotorBladeAttachmentType()
 * @model extendedMetaData="name='rotorBladeAttachmentType' kind='elementOnly'"
 * @generated
 */
public interface RotorBladeAttachmentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the blade attachment.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getRotorBladeAttachmentType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.RotorBladeAttachmentType#getName <em>Name</em>}' containment reference.
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
	 * Description of the blade attachment.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getRotorBladeAttachmentType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.RotorBladeAttachmentType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Azimuth Angles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The azimuthAngles element is used to specify
	 *                                     a list of discrete azimuth angles (in deg) at which instances
	 *                                     of attached blades are to be created. The number of blades will
	 *                                     equal to the number of elements of the vector. E.g.
	 *                                     <azimuthAngles>0;90;180;270</azimuthAngles> for a
	 *                                     four blade rotor with equal equiangularly distributed blades.
	 *                                     The transformation of the respective rotor blade corresponds to
	 *                                     a rotation by azimuthAngle around the z axis of the rotor
	 *                                     coordinate system in mathematically positive sense of rotation.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Azimuth Angles</em>' containment reference.
	 * @see #setAzimuthAngles(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getRotorBladeAttachmentType_AzimuthAngles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='azimuthAngles' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getAzimuthAngles();

	/**
	 * Sets the value of the '{@link Cpacs.RotorBladeAttachmentType#getAzimuthAngles <em>Azimuth Angles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azimuth Angles</em>' containment reference.
	 * @see #getAzimuthAngles()
	 * @generated
	 */
	void setAzimuthAngles(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Number Of Blades</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If only the number of blades is specified,
	 *                                     the attached blades will be distributed equiangularly and the
	 *                                     first blade will be attached at azimuth angle 0. (Formula:
	 *                                     azimuthAngle[i] = i*360deg/numberOfBlades,
	 *                                     i=0..numberOfBlades-1)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Blades</em>' containment reference.
	 * @see #setNumberOfBlades(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getRotorBladeAttachmentType_NumberOfBlades()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfBlades' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getNumberOfBlades();

	/**
	 * Sets the value of the '{@link Cpacs.RotorBladeAttachmentType#getNumberOfBlades <em>Number Of Blades</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Blades</em>' containment reference.
	 * @see #getNumberOfBlades()
	 * @generated
	 */
	void setNumberOfBlades(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Hinges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of all hinges used to attach the
	 *                                 rotor blade.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hinges</em>' containment reference.
	 * @see #setHinges(RotorHubHingesType)
	 * @see Cpacs.CpacsPackage#getRotorBladeAttachmentType_Hinges()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hinges' namespace='##targetNamespace'"
	 * @generated
	 */
	RotorHubHingesType getHinges();

	/**
	 * Sets the value of the '{@link Cpacs.RotorBladeAttachmentType#getHinges <em>Hinges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hinges</em>' containment reference.
	 * @see #getHinges()
	 * @generated
	 */
	void setHinges(RotorHubHingesType value);

	/**
	 * Returns the value of the '<em><b>Rotor Blade UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the rotorBlade which should be attached
	 *                                 to the rotor hub.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rotor Blade UID</em>' containment reference.
	 * @see #setRotorBladeUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getRotorBladeAttachmentType_RotorBladeUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rotorBladeUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getRotorBladeUID();

	/**
	 * Sets the value of the '{@link Cpacs.RotorBladeAttachmentType#getRotorBladeUID <em>Rotor Blade UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotor Blade UID</em>' containment reference.
	 * @see #getRotorBladeUID()
	 * @generated
	 */
	void setRotorBladeUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getRotorBladeAttachmentType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.RotorBladeAttachmentType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // RotorBladeAttachmentType
