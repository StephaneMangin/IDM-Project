package org.irisa.diverse.videogen.videogenl.adapters.videogenlmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.irisa.diverse.videogen.videoGen.Sequence;

@SuppressWarnings("all")
public class SequenceAdapter extends EObjectAdapter<Sequence> implements org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence {
  private org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory adaptersFactory;
  
  public SequenceAdapter() {
    super(org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory.getInstance()) ;
    adaptersFactory = org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoGenLMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public String getName() {
    return adaptee.getName() ;
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o) ;
  }
  
  @Override
  public boolean isActive() {
    return adaptee.isActive() ;
  }
  
  @Override
  public void setActive(final boolean o) {
    adaptee.setActive(o) ;
  }
  
  @Override
  public org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence getNextSequence() {
    return () adaptersFactory.createAdapter(adaptee.getNextSequence(), eResource) ;
  }
  
  @Override
  public void setNextSequence(final org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence o) {
    if (o != null)
    	adaptee.setNextSequence(((org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.SequenceAdapter) o).getAdaptee()) ;
    else adaptee.setNextSequence(null) ;
  }
  
  @Override
  public org.irisa.diverse.videogen.videogenlmt.videoGen.Video getVideo() {
    return () adaptersFactory.createAdapter(adaptee.getVideo(), eResource) ;
  }
  
  @Override
  public void setVideo(final org.irisa.diverse.videogen.videogenlmt.videoGen.Video o) {
    if (o != null)
    	adaptee.setVideo(((org.irisa.diverse.videogen.videogenl.adapters.videogenlmt.VideoAdapter) o).getAdaptee()) ;
    else adaptee.setVideo(null) ;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static boolean ACTIVE_EDEFAULT = true;
  
  @Override
  public EClass eClass() {
    return org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.eINSTANCE.getSequence();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__NAME:
    		return getName();
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__NEXT_SEQUENCE:
    		return getNextSequence();
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__ACTIVE:
    		return isActive() ? Boolean.TRUE : Boolean.FALSE;
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__VIDEO:
    		return getVideo();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__NAME:
    		setName(NAME_EDEFAULT);
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__NEXT_SEQUENCE:
    		setNextSequence((org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence) null);
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__ACTIVE:
    		setActive(ACTIVE_EDEFAULT);
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__VIDEO:
    		setVideo((org.irisa.diverse.videogen.videogenlmt.videoGen.Video) null);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__NEXT_SEQUENCE:
    		return getNextSequence() != null;
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__ACTIVE:
    		return isActive() != ACTIVE_EDEFAULT;
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__VIDEO:
    		return getVideo() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__NAME:
    		setName((java.lang.String) newValue);
    		return;
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__NEXT_SEQUENCE:
    		setNextSequence((org.irisa.diverse.videogen.videogenlmt.videoGen.Sequence) newValue);
    		return;
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__ACTIVE:
    		setActive(((java.lang.Boolean) newValue).booleanValue());
    		return;
    	case org.irisa.diverse.videogen.videogenlmt.videoGen.VideoGenPackage.SEQUENCE__VIDEO:
    		setVideo((org.irisa.diverse.videogen.videogenlmt.videoGen.Video) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
