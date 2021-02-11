/**
 */
package Cpacs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Type3</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Cpacs.CpacsPackage#getTypeType3()
 * @model extendedMetaData="name='type_._3_._type'"
 * @generated
 */
public enum TypeType3 implements Enumerator {
	/**
	 * The '<em><b>Semi Rigid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMI_RIGID_VALUE
	 * @generated
	 * @ordered
	 */
	SEMI_RIGID(0, "semiRigid", "semiRigid"),

	/**
	 * The '<em><b>Rigid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGID_VALUE
	 * @generated
	 * @ordered
	 */
	RIGID(1, "rigid", "rigid"),

	/**
	 * The '<em><b>Articulated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARTICULATED_VALUE
	 * @generated
	 * @ordered
	 */
	ARTICULATED(2, "articulated", "articulated"),

	/**
	 * The '<em><b>Hingeless</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HINGELESS_VALUE
	 * @generated
	 * @ordered
	 */
	HINGELESS(3, "hingeless", "hingeless");

	/**
	 * The '<em><b>Semi Rigid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMI_RIGID
	 * @model name="semiRigid"
	 * @generated
	 * @ordered
	 */
	public static final int SEMI_RIGID_VALUE = 0;

	/**
	 * The '<em><b>Rigid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGID
	 * @model name="rigid"
	 * @generated
	 * @ordered
	 */
	public static final int RIGID_VALUE = 1;

	/**
	 * The '<em><b>Articulated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARTICULATED
	 * @model name="articulated"
	 * @generated
	 * @ordered
	 */
	public static final int ARTICULATED_VALUE = 2;

	/**
	 * The '<em><b>Hingeless</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HINGELESS
	 * @model name="hingeless"
	 * @generated
	 * @ordered
	 */
	public static final int HINGELESS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Type3</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeType3[] VALUES_ARRAY = new TypeType3[] { SEMI_RIGID, RIGID, ARTICULATED, HINGELESS, };

	/**
	 * A public read-only list of all the '<em><b>Type Type3</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeType3> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Type3</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType3 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType3 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type3</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType3 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType3 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type3</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType3 get(int value) {
		switch (value) {
		case SEMI_RIGID_VALUE:
			return SEMI_RIGID;
		case RIGID_VALUE:
			return RIGID;
		case ARTICULATED_VALUE:
			return ARTICULATED;
		case HINGELESS_VALUE:
			return HINGELESS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeType3(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //TypeType3
