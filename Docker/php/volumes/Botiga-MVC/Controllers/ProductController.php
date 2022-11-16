<?php
require './Model/ProductModel.php';
class ProductController
{ 
    private $view;
    private $items;

    function __construct()
    {
        $this->items = new ProductModel();
        $this->view = new View();
    }

    public function listar()
    {
        $listado = $this->items->listadoTotal();
        $data['listado'] = $listado;
        $this->view->show("llistar.php", $data);
    }

    public function insertarProducto()
    {
        $listado = $this->items->listadoTotal();
        $data['listado'] = $listado;
        $this->view->show("afegir.php", $data);
    }

    public function obtenerProductoPorId($id)
    {
        $arr['listado'] = $this->items->obtenerProductoPorId($id);
        $this->view->show("fitxa.php", $arr);
    }

    public function insertar($nom, $desc, $preu)
    { 
        $this->items->insertarProducto($nom, $desc, $preu); 
        $this->view->show("alta-producte.php");
    } 
}
