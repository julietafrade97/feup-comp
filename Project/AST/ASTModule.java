/* Generated By:JJTree: Do not edit this line. ASTModule.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package AST; 
 
public class ASTModule extends SimpleNode {
  public String name = "";

  public ASTModule(int id) {
    super(id);
  }

  public ASTModule(yal2jvm p, int id) {
    super(p, id);
  }

  public String toString() {
    return yal2jvmTreeConstants.jjtNodeName[id] + " " + this.name;
  }

}
/* JavaCC - OriginalChecksum=4aa97d834457bc213f302483f5a25ee5 (do not edit this line) */