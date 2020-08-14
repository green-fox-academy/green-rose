<template>
  <div id="ToDoItem" class="card">
    <template>
      <h5>New ToDo</h5>
      <b-form  @submit.stop.prevent>
        <b-form-group label="Title" label-for="title">
          <b-form-input id="title" v-model="todo.title" type="text"></b-form-input>
        </b-form-group>
        <b-form-group label="project" label-for="project">
          <b-form-input id="project" v-model="todo.project" type="text"></b-form-input>
        </b-form-group>
        </b-form>
        <div class="btn btn-outline-primary" v-on:click="addToDo" >Add</div>

    </template>
  </div>
</template>
<script>
export default {
  data: function () {
    return {
      todo:{
        title: "",
        project: "",
        done: false,
      }
    }
  },
  methods: {
    addToDo() {
     this.$emit('addToDo', this.todo)
   }

}
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

#ToDoItem {
  border-style: solid;
  border-color: lightgray;
  border-width: 2px;
  margin: 10px;
  border-radius: 5px;
}

i {
  margin: 5px 10px;

}

</style>