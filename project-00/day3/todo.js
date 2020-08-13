let todoList = [];
const body = document.querySelector('body');
const mainDiv = document.createElement('div');
mainDiv.className = 'main';
mainDiv.style.cssText = "width:500px; margin:0 auto;";
body.appendChild(mainDiv);
const heading = document.createElement('h1');
heading.innerHTML = "Mila's ToDo App";
mainDiv.appendChild(heading);
const inputToDo = document.createElement('input');
inputToDo.setAttribute('placeholder', 'what to do...?');
inputToDo.setAttribute('id', 'newTodo');
mainDiv.appendChild(inputToDo);
const button = document.createElement('button');
button.innerHTML = 'Add To Do';
button.addEventListener('click', addTodo);
mainDiv.appendChild(button);
const todoListElement = document.createElement('ul');
mainDiv.appendChild(todoListElement);

function addTodo() {

  const newToDoElement = document.createElement('li');
  let newTodo = document.getElementById('newTodo');
  let newTodoText = newTodo.value.trim();
  todoList.push({"text":newTodoText, "done":false});

  const newTodoTextElement = document.createElement('span');
  newTodoTextElement.textContent = newTodoText;
  newToDoElement.appendChild(newTodoTextElement);

  const newTodoHandleElement = document.createElement('span');
  newTodoHandleElement.style.cssText = "float:right;"
  newTodoHandleElement.textContent = "❌";
  newTodoHandleElement.addEventListener('click', removeTodo);
  newToDoElement.appendChild(newTodoHandleElement);

  const newTodoDoneElement = document.createElement('span');
  newTodoDoneElement.style.cssText = "float:right;"
  newTodoDoneElement.textContent = "done";
  newTodoDoneElement.addEventListener('click', doneTodo);
  newToDoElement.appendChild(newTodoDoneElement);

  todoListElement.appendChild(newToDoElement);
  newTodo.value="";
}

function removeTodo(event) {
   let removedElement = event.target.parentNode;
   removeTodoFromList(removedElement.firstChild.textContent);
   console.log(todoList);
   removedElement.parentNode.removeChild(removedElement);
}

function doneTodo(event) {
    let doneElement = event.target.parentNode;
    toggleTodo(doneElement.firstChild.textContent);
    console.log(todoList);
    event.target.textContent = event.target.textContent==="done" ? "undone": "done";
 }

function removeTodoFromList(todoText) {

    for (let index = 0; index < todoList.length; index++) {
        if (todoList[index].text===todoText) {
            todoList.splice(index,1);
            return;
        }
    }
}

function toggleTodo(todoText){
    for (let index = 0; index < todoList.length; index++) {
        if (todoList[index].text===todoText) {
            todoList[index].done=!todoList[index].done;
            return;
        }
    }
}
