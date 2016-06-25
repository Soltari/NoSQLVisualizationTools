/**
 */
package Extended_NoSQL_Schema.impl;

import Extended_NoSQL_Schema.Aggregate;
import Extended_NoSQL_Schema.EntityVersion;
import Extended_NoSQL_Schema.Extended_NoSQL_SchemaPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Extended_NoSQL_Schema.impl.AggregateImpl#getRefTo <em>Ref To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregateImpl extends AssociationImpl implements Aggregate {
	/**
	 * The cached value of the '{@link #getRefTo() <em>Ref To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTo()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityVersion> refTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Extended_NoSQL_SchemaPackage.Literals.AGGREGATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityVersion> getRefTo() {
		if (refTo == null) {
			refTo = new EObjectResolvingEList<EntityVersion>(EntityVersion.class, this, Extended_NoSQL_SchemaPackage.AGGREGATE__REF_TO);
		}
		return refTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Extended_NoSQL_SchemaPackage.AGGREGATE__REF_TO:
				return getRefTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Extended_NoSQL_SchemaPackage.AGGREGATE__REF_TO:
				getRefTo().clear();
				getRefTo().addAll((Collection<? extends EntityVersion>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Extended_NoSQL_SchemaPackage.AGGREGATE__REF_TO:
				getRefTo().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Extended_NoSQL_SchemaPackage.AGGREGATE__REF_TO:
				return refTo != null && !refTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AggregateImpl
