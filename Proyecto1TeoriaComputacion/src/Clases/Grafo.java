/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Miguel Flores
 */
public class Grafo {

    ArrayList<Gnode> nodes = new ArrayList();
    ArrayList<Conexiones> conexiones = new ArrayList();

    public ArrayList<Gnode> getNodes() {
        return nodes;
    }

    public void setNodes(Gnode nodes) {
        this.nodes.add(nodes);
    }

    public ArrayList<Conexiones> getConexiones() {
        return conexiones;
    }

    public void setConexiones(Conexiones conexiones) {
        this.conexiones.add(conexiones);
    }
    public Conexiones c_pop(){
        if(conexiones.size()>0){
            Conexiones c=conexiones.get(0);
            conexiones.remove(0);
            return c;
        }else{
            return null;
        }
    }
    
}
