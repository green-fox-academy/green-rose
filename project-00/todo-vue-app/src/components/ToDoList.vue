<template>
  <div id="ToDoList">
    <div v-for="todo in todos" :key="todo.title" >
      <ToDoItem v-bind:todo="todo"/>
    </div>
  </div>
</template>

<script>
import ToDoItem from './ToDoItem.vue'

export default {
  name: 'ToDoList',
  props: ['todos'],
  components: {
    ToDoItem,
  },
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

li {
 text-align: left;
}
</style>