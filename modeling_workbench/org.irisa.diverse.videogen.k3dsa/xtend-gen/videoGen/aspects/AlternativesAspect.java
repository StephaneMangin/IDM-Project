package videoGen.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import videoGen.Alternatives;
import videoGen.Optional;
import videoGen.Video;
import videoGen.aspects.AlternativesAspectAlternativesAspectProperties;
import videoGen.aspects.DistributedRandomNumberGenerator;
import videoGen.aspects.SequenceAspect;
import videoGen.aspects.VideoAspect;

@Aspect(className = Alternatives.class)
@SuppressWarnings("all")
public class AlternativesAspect extends SequenceAspect {
  /**
   * Return a hashmap with corrected probabilities for an Alternatives instance
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  public static Map<String, Integer> checkProbabilities(final Alternatives _self) {
    videoGen.aspects.AlternativesAspectAlternativesAspectProperties _self_ = videoGen.aspects.AlternativesAspectAlternativesAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_checkProbabilities(_self_, _self);
    return (java.util.Map<java.lang.String, java.lang.Integer>)result;
  }
  
  private static Video selectVideo(final Alternatives _self) {
    videoGen.aspects.AlternativesAspectAlternativesAspectProperties _self_ = videoGen.aspects.AlternativesAspectAlternativesAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_selectVideo(_self_, _self);
    return (videoGen.Video)result;
  }
  
  @OverrideAspectMethod
  public static void process(final Alternatives _self) {
    videoGen.aspects.AlternativesAspectAlternativesAspectProperties _self_ = videoGen.aspects.AlternativesAspectAlternativesAspectContext.getSelf(_self);
     if (_self instanceof videoGen.Alternatives){
     videoGen.aspects.AlternativesAspect._privk3_process(_self_, (videoGen.Alternatives)_self);
    } else  if (_self instanceof videoGen.Sequence){
     videoGen.aspects.SequenceAspect.process((videoGen.Sequence)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static Map<String, Integer> _privk3_checkProbabilities(final AlternativesAspectAlternativesAspectProperties _self_, final Alternatives _self) {
    HashMap<String, Integer> _xblockexpression = null;
    {
      final HashMap<String, Integer> result = new HashMap<String, Integer>();
      int totalProb = 0;
      int totalOptions = 0;
      EList<Optional> _options = _self.getOptions();
      for (final Optional option : _options) {
        {
          Integer _probability = option.getProbability();
          boolean _equals = ((_probability).intValue() == 0);
          if (_equals) {
            totalOptions++;
          }
          int _talProb = totalProb;
          Integer _probability_1 = option.getProbability();
          totalProb = (_talProb + (_probability_1).intValue());
          Video _video = option.getVideo();
          String _name = _video.getName();
          Integer _probability_2 = option.getProbability();
          result.put(_name, _probability_2);
        }
      }
      Set<String> _keySet = result.keySet();
      for (final String name : _keySet) {
        Integer _get = result.get(name);
        boolean _equals = ((_get).intValue() == 0);
        if (_equals) {
          result.put(name, Integer.valueOf(((100 - totalProb) / totalOptions)));
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  protected static Video _privk3_selectVideo(final AlternativesAspectAlternativesAspectProperties _self_, final Alternatives _self) {
    Video _xblockexpression = null;
    {
      final DistributedRandomNumberGenerator drng = new DistributedRandomNumberGenerator();
      final Map<String, Integer> proba = AlternativesAspect.checkProbabilities(_self);
      EList<Optional> _options = _self.getOptions();
      final Function1<Optional, String> _function = (Optional it) -> {
        Video _video = it.getVideo();
        return _video.getName();
      };
      List<String> _map = ListExtensions.<Optional, String>map(_options, _function);
      final Consumer<String> _function_1 = (String name) -> {
        Set<String> _keySet = proba.keySet();
        List<String> _list = IterableExtensions.<String>toList(_keySet);
        int _indexOf = _list.indexOf(name);
        Integer _get = proba.get(name);
        drng.addNumber(_indexOf, (_get).intValue());
      };
      _map.forEach(_function_1);
      EList<Optional> _options_1 = _self.getOptions();
      int _distributedRandomNumber = drng.getDistributedRandomNumber();
      Optional _get = _options_1.get(_distributedRandomNumber);
      _xblockexpression = _get.getVideo();
    }
    return _xblockexpression;
  }
  
  private static void super_process(final Alternatives _self) {
    videoGen.aspects.SequenceAspectSequenceAspectProperties _self_ = videoGen.aspects.SequenceAspectSequenceAspectContext.getSelf(_self);
     videoGen.aspects.SequenceAspect._privk3_process(_self_, _self);
  }
  
  protected static void _privk3_process(final AlternativesAspectAlternativesAspectProperties _self_, final Alternatives _self) {
    Video _selectVideo = AlternativesAspect.selectVideo(_self);
    VideoAspect.select(_selectVideo);
    AlternativesAspect.super_process(_self);
  }
}