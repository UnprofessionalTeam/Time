module.exports = {
  pages:{
    index:{
      entry:'src/main.js'
    }
  },  
  lintOnSave:false,//关闭语法检查
  // devServer:{//配置代理
  //   proxy:""
  // }
  publicPath:'./',
  devServer: {    
    proxy: {
      '/api':{
        target:'http://localhost:8080',
        // secure:false,
        // changeOrigin:true,
        pathRewrite:{
          '^/api':''
        }
      },
      
    }   
  },
}