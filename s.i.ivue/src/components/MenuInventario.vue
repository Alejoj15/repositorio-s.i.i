<template>
    <div class="menu-inventario">

      <h2>Tabla De Productos</h2>
      <table>

        <thead>

          <th>Codigo</th>
          <th>Nombre</th>
          <th>Tipo</th>
          <th>Cantidad</th>

        </thead>
        <tbody>

          <tr v-for="producto in productos" :key="producto.id_producto">

            <td>{{producto.id_producto}}</td>
            <td>{{producto.nombre}}</td>
            <td>{{producto.tipo}}</td>
            <td>{{producto.cantidad}}</td>

          </tr>
          
        </tbody>

      </table>
    

      <form id="producto-form" @submit.prevent="agregar">
        <div class="formulario" >
          <label for="id_producto">Codigo de barras:</label>
          <input type="text" id="id_producto" name="id_producto" placeholder="codigo" required v-model="id_producto">

          <label for="nombre">Nombre:</label>
          <input type="text" id="nombre" name="nombre" placeholder="Nombre" required v-model="nombre">

          <label for="tipo">Tipo:</label>
          <input type="text" id="tipo" name="tipo" placeholder="Tipo" required v-model="tipo">

          <label for="cantidad">Cantidad:</label>
          <input type="number" id="cantidad" name="cantidad" placeholder="Cantidad" required v-model="cantidad">
          
        </div>



        <div class="botones">
          <button type="submit" id="agregar" name="agregar">Agregar Producto</button>
          <button type="button" id="buscar" name="buscar" @click="buscar" >buscar</button>
          <button type="button" id="editar" name="editar" @click="editar" >Editar Producto</button>
          <button type="button" id="borrar" name="borrar" @click="borrar" >Borrar Producto</button>
          
        </div>
      </form>
    
    </div>
  </template>

<script>
  import axios from 'axios';

  export default {

    data(){

      return{
        id_producto:"",
        nombre:"",
        tipo:"",
        cantidad:"",
        productos:[],
      };

    },
    methods:{

      agregar(){

        axios

          .post("http://localhost:8080/api/producto",{

            id_producto:this.id_producto,
            nombre:this.nombre,
            tipo:this.tipo,
            cantidad:this.cantidad,

          })
          .then((Response)=>{

          console.log("producto registrado con exito",Response.data);
          alert("producto registrado con exito");
          this.id_producto="";
          this.nombre="";
          this.tipo="";
          this.cantidad="";
          this.$emit("actualizar-tabla")
          })
          .catch((error) => {
            console.log("Ocurrió un error al registrar el producto",error);
            alert("Ocurrió un error al registrar el producto");  
        });

      },

      buscar(){

        axios

          .get("http://localhost:8080/api/producto/" +this.id_producto)
  
  
          .then((Response)=>{

            this.nombre=Response.data.nombre;
            this.tipo=Response.data.tipo;
            this.cantidad=Response.data.cantidad;
            this.$emit("actualizar-tabla")

          })
  
          .catch((error)=>{

            console.error("error al registrar el producto",error)
            alert("error",error);
          })

      },

      editar(){

        axios

          .put("http://localhost:8080/api/producto/" +this.id_producto,{

            id_producto:this.id_producto,
            nombre:this.nombre,
            tipo:this.tipo,
            cantidad:this.cantidad,

          })

          .then((Response)=>{

            alert ("producto editado exitosamente");
            console.log("producto editado exitosamente",Response.data);
            this.id_producto = "";
            this.nombre = "";
            this.tipo = "";
            this.cantidad = "";

            this.$emit("actualizar-tabla")

          })

          .catch((error)=>{

            console.log("errror al editar el producto",error);

          })

      },

      borrar(){

        axios

          .delete("http://localhost:8080/api/producto/" +this.id_producto)

          .then(()=>{

            alert("producto borrado exitosamente");
            console.log("producto borrado exitosamente");
            this.id_producto="";
            this.nombre="";
            this.tipo="";
            this.cantidad="";
            this.$emit("actualizar-tabla")

          })

          .catch((error)=>{

            console.log("error al borrar el producto",error);


          })

      },
      
      obtenerTodosLosProductos(){

        axios
          .get("http://localhost:8080/api/producto")
          .then((response)=>{

            this.productos=response.data;
          })
          .catch((error)=>{
            console.log("erroe al listar los productos",error)
          })

      },

    },

    mounted(){

      this.obtenerTodosLosProductos();

    },


  };

</script>