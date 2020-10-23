const express=require("express");
const body_parser= require('body-parser');
var http=require("http");
var server=http.createServer();
const app=express();
var connection = require('./conexion');
//function mensaje(peticion,respuesta){
   // respuesta.writeHead(200,{'content-type':'text/plain'})
    //respuesta.write("Hola Mundo")
    //respuesta.end();
//}
//server.on('request',mensaje);s
server.listen(3000,function(){
    console.log("El servidor se inicio correctamente")
});