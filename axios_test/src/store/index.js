import Vue from "vue"
import Vuex from "vuex"

Vue.use(Vuex)

const state = {
  BASEURL:'http://localhost:8080/SSM',
  personalInfo:{}
}
const actions = {}
const mutations = {}
const getters = {}

export default new Vuex.Store({
  state,actions,mutations,getters
})