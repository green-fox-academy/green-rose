<template>
  <div id="ToDo">
  <p>{{msg}}</p>
  <ToDoList v-bind:todos="todos"/>
  </div>
</template>

<script>
import ToDoList from './ToDoList.vue'
export default {
  name: 'ToDo',
  components: {
    ToDoList,
  },
  data: function () {
    return {
    todos: [{
       title: 'Todo A',
       project: 'Project A',
       done: false,
     }, {
       title: 'Todo B',
       project: 'Project B',
       done: true,
     }, {
       title: 'Todo C',
       project: 'Project XXX',
       done: false,
     }, {
       title: 'Todo D',
       project: 'Project D',
       done: false,
     }],
     msg: "Welcome to Mila's ToDo Vue App",
  }
  }
}
</script>