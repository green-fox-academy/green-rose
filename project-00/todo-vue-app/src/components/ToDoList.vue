<template>
  <ul id="ToDoList">
    <li  v-for="todo in todos" :key="todo.title" >
      {{ todo.title }}
      {{ todo.project }}
      {{ todo.done }}
    </li>
  </ul>
</template>

<script>
export default {
  name: 'ToDoList',
  props: ['todos']
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

li {
 text-align: left;
}
</style>