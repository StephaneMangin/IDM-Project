/**
 */
package org.irisa.diverse.videogen.videoGen.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.irisa.diverse.videogen.videoGen.util.VideoGenAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VideoGenItemProviderAdapterFactory extends VideoGenAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGenItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.irisa.diverse.videogen.videoGen.VideoGen} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoGenItemProvider videoGenItemProvider;

	/**
	 * This creates an adapter for a {@link org.irisa.diverse.videogen.videoGen.VideoGen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVideoGenAdapter() {
		if (videoGenItemProvider == null) {
			videoGenItemProvider = new VideoGenItemProvider(this);
		}

		return videoGenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.irisa.diverse.videogen.videoGen.Alternatives} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternativesItemProvider alternativesItemProvider;

	/**
	 * This creates an adapter for a {@link org.irisa.diverse.videogen.videoGen.Alternatives}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAlternativesAdapter() {
		if (alternativesItemProvider == null) {
			alternativesItemProvider = new AlternativesItemProvider(this);
		}

		return alternativesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.irisa.diverse.videogen.videoGen.Mandatory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MandatoryItemProvider mandatoryItemProvider;

	/**
	 * This creates an adapter for a {@link org.irisa.diverse.videogen.videoGen.Mandatory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMandatoryAdapter() {
		if (mandatoryItemProvider == null) {
			mandatoryItemProvider = new MandatoryItemProvider(this);
		}

		return mandatoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.irisa.diverse.videogen.videoGen.Optional} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionalItemProvider optionalItemProvider;

	/**
	 * This creates an adapter for a {@link org.irisa.diverse.videogen.videoGen.Optional}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOptionalAdapter() {
		if (optionalItemProvider == null) {
			optionalItemProvider = new OptionalItemProvider(this);
		}

		return optionalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.irisa.diverse.videogen.videoGen.Video} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoItemProvider videoItemProvider;

	/**
	 * This creates an adapter for a {@link org.irisa.diverse.videogen.videoGen.Video}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVideoAdapter() {
		if (videoItemProvider == null) {
			videoItemProvider = new VideoItemProvider(this);
		}

		return videoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.irisa.diverse.videogen.videoGen.Introduction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntroductionItemProvider introductionItemProvider;

	/**
	 * This creates an adapter for a {@link org.irisa.diverse.videogen.videoGen.Introduction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntroductionAdapter() {
		if (introductionItemProvider == null) {
			introductionItemProvider = new IntroductionItemProvider(this);
		}

		return introductionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.irisa.diverse.videogen.videoGen.Conclusion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConclusionItemProvider conclusionItemProvider;

	/**
	 * This creates an adapter for a {@link org.irisa.diverse.videogen.videoGen.Conclusion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConclusionAdapter() {
		if (conclusionItemProvider == null) {
			conclusionItemProvider = new ConclusionItemProvider(this);
		}

		return conclusionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (mandatoryItemProvider != null) mandatoryItemProvider.dispose();
		if (introductionItemProvider != null) introductionItemProvider.dispose();
		if (videoGenItemProvider != null) videoGenItemProvider.dispose();
		if (optionalItemProvider != null) optionalItemProvider.dispose();
		if (videoItemProvider != null) videoItemProvider.dispose();
		if (alternativesItemProvider != null) alternativesItemProvider.dispose();
		if (conclusionItemProvider != null) conclusionItemProvider.dispose();
	}

}
