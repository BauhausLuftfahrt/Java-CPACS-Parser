/**
 */
package Cpacs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Cpacs.CpacsPackage#getTypeType()
 * @model extendedMetaData="name='type_._type'"
 * @generated
 */
public enum TypeType implements Enumerator {
	/**
	 * The '<em><b>Main Rotor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAIN_ROTOR_VALUE
	 * @generated
	 * @ordered
	 */
	MAIN_ROTOR(0, "mainRotor", "mainRotor"),

	/**
	 * The '<em><b>Tail Rotor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAIL_ROTOR_VALUE
	 * @generated
	 * @ordered
	 */
	TAIL_ROTOR(1, "tailRotor", "tailRotor"),

	/**
	 * The '<em><b>Fenestron</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FENESTRON_VALUE
	 * @generated
	 * @ordered
	 */
	FENESTRON(2, "fenestron", "fenestron"),

	/**
	 * The '<em><b>Propeller</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPELLER_VALUE
	 * @generated
	 * @ordered
	 */
	PROPELLER(3, "propeller", "propeller");

	/**
	 * The '<em><b>Main Rotor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAIN_ROTOR
	 * @model name="mainRotor"
	 * @generated
	 * @ordered
	 */
	public static final int MAIN_ROTOR_VALUE = 0;

	/**
	 * The '<em><b>Tail Rotor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAIL_ROTOR
	 * @model name="tailRotor"
	 * @generated
	 * @ordered
	 */
	public static final int TAIL_ROTOR_VALUE = 1;

	/**
	 * The '<em><b>Fenestron</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FENESTRON
	 * @model name="fenestron"
	 * @generated
	 * @ordered
	 */
	public static final int FENESTRON_VALUE = 2;

	/**
	 * The '<em><b>Propeller</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPELLER
	 * @model name="propeller"
	 * @generated
	 * @ordered
	 */
	public static final int PROPELLER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeType[] VALUES_ARRAY = new TypeType[] { MAIN_ROTOR, TAIL_ROTOR, FENESTRON, PROPELLER, };

	/**
	 * A public read-only list of all the '<em><b>Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType get(int value) {
		switch (value) {
		case MAIN_ROTOR_VALUE:
			return MAIN_ROTOR;
		case TAIL_ROTOR_VALUE:
			return TAIL_ROTOR;
		case FENESTRON_VALUE:
			return FENESTRON;
		case PROPELLER_VALUE:
			return PROPELLER;
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
	private TypeType(int value, String name, String literal) {
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

} //TypeType
