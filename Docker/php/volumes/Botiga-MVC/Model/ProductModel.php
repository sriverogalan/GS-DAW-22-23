<?php
class ProductModel
{
    protected $db;

    public function __construct()
    { 
        $this->db = SPDO::singleton();
    }

    public function listadoTotal()
    { 
        $consulta = $this->db->prepare('SELECT * FROM articles');
        $consulta->execute(); 
        return $consulta;
    }
    public function obtenerProductoPorId($id)
    {
        $consulta = $this->db->prepare('SELECT * FROM articles where id = :id');
        $consulta->bindValue('id', $id);
        $consulta->execute();
        return $consulta;
    }
    public function insertarProducto($nom, $desc, $preu)
    {
        $query = $this->db->prepare("INSERT INTO articles (nom, descripcio, preu) VALUES (:nom, :desc, :preu)");
        $query->bindValue('nom', $nom);
        $query->bindValue('desc', $desc);
        $query->bindValue('preu', $preu);
        $query->execute();
    }
}