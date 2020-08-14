<template>
  <div id="ToDoItem">

      {{ todo.title }}
      {{ todo.project }}
      {{ todo.done }}

  </div>
</template>

<script>
export default {
  name: 'ToDoItem',
  props: {todo: Object}
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

li {
 text-align: left;
}
</style>