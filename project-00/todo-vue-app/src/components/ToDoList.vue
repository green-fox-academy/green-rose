<template>
  <div id="ToDoList">
    <div class = "todo-item-wrapper" v-for="todo in todos" :key="todo.title" >
      <ToDoItem v-bind:todo="todo" v-on:editTodo="editTodo(todo, $event)" v-on:delete-item="deleteTodo(todo)"/>
    </div>
    <CreateToDo v-on:addToDo="addTodo($event)"/>
  </div>
</template>

<script>
import ToDoItem from './ToDoItem.vue'
import CreateToDo from './CreateToDo.vue'

export default {
  name: 'ToDoList',
  props: ['todos'],
  components: {
    ToDoItem,
    CreateToDo,
  },
  methods: {
    deleteTodo: function (todo) {
      for (let index = 0; index < this.todos.length; index++) {
        if(this.todos[index]===todo){
          this.todos.splice(index, 1);
          return
        }
      }
    },
    addTodo: function (todo) {
      this.todos.push(todo);
    },
    editTodo: function (todo, todoEdited) {
      console.log(todoEdited);
      const todoIndex = this.todos.indexOf(todo);
      console.log(this.todos[todoIndex]);
      this.todos[todoIndex]=todoEdited;
    },
  }
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