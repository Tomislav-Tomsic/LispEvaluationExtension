package lisp.tomislavt.ext;

import com.google.appinventor.components.runtime.*;
import jscheme.JS;

import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.UsesLibraries;
import com.google.appinventor.components.annotations.UsesPermissions;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.common.YaVersion;

@DesignerComponent(version = YaVersion.LISP_EVAL_COMPONENT_VERSION, description = " Component for modest acces to Kawa eval", category = ComponentCategory.EXTENSION, nonVisible = true, iconName = "images/lambda.png")
@SimpleObject(external = true)
@UsesPermissions(permissionNames = "android.permission.WRITE_EXTERNAL_STORAGE, android.permission.WRITE_SETTINGS,"
    + "android.permission.READ_EXTERNAL_STORAGE")
@UsesLibraries(libraries = "jscheme-7.2.jar")
public class LispEvaluation extends AndroidNonvisibleComponent {

  public LispEvaluation(ComponentContainer container) {
    super(container.$form());

  }

  @SimpleFunction(description = "Non-global evaluation")
  public String JSchemeEvaluation(String expression) {

    String result = JS.eval(expression).toString();

    return result;
  }
  
}
