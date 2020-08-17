<template>
  <div id="ToDoItem" class="card">
    <template v-if="!editing">
      <h5>{{ todoEdited.title }}</h5>
      <div>{{ todoEdited.project }}</div>
      <div class="edit-icons">
          <i 
              v-on:click="$emit('delete-item')"
              class="fas fa-trash-alt pull-right" 
              v-b-tooltip.hover title="Delete task">
              </i>
          <i v-on:click="editingTodo" v-b-tooltip.hover title="Edit task" class="fas fa-edit pull-right"></i>
      </div>
      <!-- ToDo: One Div -->
      <div v-if="todoEdited.done === true" v-on:click="changeStatus" class="btn btn-outline-success">
        Completed
      </div>
      <div v-else v-on:click="changeStatus" class="btn btn-outline-warning">
        Pendnig
      </div>
    </template>
      <!-- ToDo: Edit=CreateToDo-->
    <template v-else>
      <b-form  @submit.stop.prevent>
        <b-form-group label="Title" label-for="title">
          <b-form-input id="title" v-model="todoEdited.title" type="text"></b-form-input>
        </b-form-group>
        <b-form-group label="project" label-for="project">
          <b-form-input id="project" v-model="todoEdited.project" type="text"></b-form-input>
        </b-form-group>
      </b-form>
      <div class="btn btn-outline-primary" v-on:click="editToDo">Change</div>
    </template>
  </div>
</template>
<script>
export default {
  name: 'ToDoItem',
  props: {todo: Object},
  data () {
    return {
      editing: false,
      todoEdited: {...this.todo}
    }
  },
  methods: {
    editingTodo: function () {
      this.editing = !this.editing;
    },
    editToDo: function(){
      //this is wrong, should be handlen by parent ToDoList, but it works
      //this.todo=this.todoEdited;
      this.$emit('editTodo', this.todoEdited);
      this.editingTodo(this.todoEdited);
    },
    changeStatus: function () {
      this.todoEdited.done = !this.todoEdited.done;
      this.$emit('editTodo', this.todoEdited);
    }, 

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