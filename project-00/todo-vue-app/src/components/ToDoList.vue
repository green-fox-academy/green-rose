<template>
  <div id="ToDoList">
    <div class = "todo-item-wrapper" v-for="todo in todos" :key="todo.title" >
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
  .todo-item-wrapper {
  border-style: solid;
  border-color: lightgray;
  border-width: 2px;
  margin: 5px;
  border-radius: 5px;
}
</style>