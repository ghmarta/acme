
package acme;

/**
 * Proporciona un manera de activarde forma remota explosiones para hacer volar al correcaminos.
 * <p>trata de usar primero {@link Smartphone#zapRoadRunner} antes de recurrir a 
 * {@link blowDinamitaBigBang}. Sin embargo, en casos graves de infestación de correcaminos, el método 
 * {@link zapRoadRunner} podría no ser suficientemente eficiente. En estos casos, propablemente quieras 
 * recurrir a {@link blowDinamitaBigBang} para aniquilarlos a todos a la vez.
 * <b>advertencia:</b> aléjese primero de la zona!!!
 * </p>
 * 
 */
public class Dinamita {
    
    /**
     * Permite detonar de forma remota una carga de dinamita, <b> aléjese antes de activar el método </b>
     * @param megatones indica el número de megatones de explosivo
     * @see blowDinamitaSilentBang
     * @see zapRoadRunner
     */
    public void blowDinamitaBigBang (int megatones){
        System.out.println("colocando un cartucho de dinamita de " + megatones + "megatones");
        System.out.println("kaboom!! megaexplosion");
    }
    
    /**
     * Permite detonar de forma remota una bomba silenciosa, <b> no espere la emisión de absolutamente 
     * ningún sonido</b>
     * @param megatones indica el número de megatones de explosivo
     * @see blowDinamitaBigBang
     * @see zapRoadRunner
     */
    public void blowDinamitaSilentBang (int megatones){
        System.out.println("colocando una bomba silenciosa de " + megatones + "megatones");
        System.out.println("<boom silencioso>, nada se oye");
    }
    
}
