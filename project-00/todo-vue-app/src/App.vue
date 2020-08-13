<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/greenfox.png">
    <ToDo msg="Welcome to Mila's ToDo Vue App"/>
  </div>
</template>

<script>
import ToDo from './components/ToDo.vue'

export default {
  name: 'App',
  components: {
    ToDo
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
