<template>
    <div class="menu">
      
        <div class="container">
        
            <BarraLateral  />
            <MenuInventario ref="tablaproducto" @actualizar-tabla="actualizarTabla"/>
        
        
        </div>
    
    
    
    
    </div>    
  </template>
  
  <script>
  import BarraLateral from '@/components/BarraLateral.vue';
  import MenuInventario from '@/components/MenuInventario.vue';
  
  export default {
    name: 'MenuView',
    components: {
      BarraLateral,
      MenuInventario,
    },

    methods:{

      actualizarTabla(){

        this.$refs.tablaproducto.obtenerTodosLosProductos()


      }

    }



  };
  </script>
  
  
    <style>

.menu {
  display: flex;
  flex-direction: row;
}


.container {
  display: flex;
  flex: 1;
  padding: 20px;
}


#sidebar {
  flex-direction: column;
  align-items: center;
}

#profile {
  text-align: center;
  margin-bottom: 30px;
}

#profile-pic {
  width: 80px;
  height: 80px;
  border-radius: 50%;
  margin-bottom: 10px;
}

#username {
  font-size: 16px;
  font-weight: bold;
}


button {
  width: 100%;
  padding: 15px;
  margin: 10px 0;
  border: none;
  border-radius: 4px;
  background-color: #4caf50;
  color: white;
  cursor: pointer;
}

button:hover {
  background-color: #45a049;
}

.menu-inventario {
  padding: 30px;
  background-color: white;
  border-radius: 8px;
  width: 100%;
  max-width: 900px;
  margin-left: auto;
  margin-right: auto;
  box-sizing: border-box;
  box-shadow: none;
}


h2 {
  margin-bottom: 20px;
  text-align: center;
  font-size: 24px;
  color: #333;
}


table {
  width: 100%;
  border-collapse: collapse;
  margin-bottom: 20px;
}

th, td {
  padding: 3px;
  text-align: left;
  border: 1px solid #ddd;
}

th {
  background-color: #4CAF50;
  color: white;
}

td {
  background-color: #f9f9f9;
}

.formulario {
  display: flex;
  flex-wrap: wrap;
  gap: 10px;
  margin-top: 10%;
}

.formulario .campo {
  display: flex;
  flex-direction: column;
  width: 45%;
  margin-bottom: 15px;
}

.formulario label {
  font-size: 14px;
  font-weight: bold;
  margin-bottom: 5px;
}

.formulario input {
  padding: 10px;
  font-size: 14px;
  border: 1px solid #ccc;
  border-radius: 4px;
  width: 12%;
  box-sizing: border-box;
}

.botones {
  display: flex;
  gap: 10px;
  justify-content: center;
  margin-top: 20px;
}

.botones button {
  padding: 12px 18px;
  background-color: #4CAF50;
  color: white;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  font-size: 16px;
  transition: background-color 0.3s ease;
}

.botones button:hover {
  background-color: #45a049;
}

@media (max-width: 768px) {
  .formulario .campo {
    width: 100%;
  }

  .botones {
    flex-direction: column;
    gap: 15px;
  }
}
</style>