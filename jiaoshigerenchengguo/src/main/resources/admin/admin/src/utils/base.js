const base = {
    get() {
        return {
            url : "http://localhost:8080/jiaoshigerenchengguo/",
            name: "jiaoshigerenchengguo",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/jiaoshigerenchengguo/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "教师个人成果管理系统"
        } 
    }
}
export default base
