import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import jiaocaizhuanzhu from '@/views/modules/jiaocaizhuanzhu/list'
    import jiaoxuegongzuo from '@/views/modules/jiaoxuegongzuo/list'
    import ketixinxi from '@/views/modules/ketixinxi/list'
    import luenwen from '@/views/modules/luenwen/list'
    import news from '@/views/modules/news/list'
    import yonghu from '@/views/modules/yonghu/list'
    import zhiyepeixun from '@/views/modules/zhiyepeixun/list'
    import zhuanlixinxi from '@/views/modules/zhuanlixinxi/list'
    import dictionaryJiaocaizhuanzhu from '@/views/modules/dictionaryJiaocaizhuanzhu/list'
    import dictionaryJiaoxuegongzuo from '@/views/modules/dictionaryJiaoxuegongzuo/list'
    import dictionaryKetixinxi from '@/views/modules/dictionaryKetixinxi/list'
    import dictionaryLuenwen from '@/views/modules/dictionaryLuenwen/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryXibu from '@/views/modules/dictionaryXibu/list'
    import dictionaryZhiyepeixun from '@/views/modules/dictionaryZhiyepeixun/list'
    import dictionaryZhuanlixinxi from '@/views/modules/dictionaryZhuanlixinxi/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryJiaocaizhuanzhu',
        name: '教材类型',
        component: dictionaryJiaocaizhuanzhu
    }
    ,{
        path: '/dictionaryJiaoxuegongzuo',
        name: '工作类型',
        component: dictionaryJiaoxuegongzuo
    }
    ,{
        path: '/dictionaryKetixinxi',
        name: '课题类型',
        component: dictionaryKetixinxi
    }
    ,{
        path: '/dictionaryLuenwen',
        name: '论文类型',
        component: dictionaryLuenwen
    }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryXibu',
        name: '系部',
        component: dictionaryXibu
    }
    ,{
        path: '/dictionaryZhiyepeixun',
        name: '荣誉类型',
        component: dictionaryZhiyepeixun
    }
    ,{
        path: '/dictionaryZhuanlixinxi',
        name: '专利类型',
        component: dictionaryZhuanlixinxi
    }


    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/jiaocaizhuanzhu',
        name: '教材信息',
        component: jiaocaizhuanzhu
      }
    ,{
        path: '/jiaoxuegongzuo',
        name: '教学工作',
        component: jiaoxuegongzuo
      }
    ,{
        path: '/ketixinxi',
        name: '课题信息',
        component: ketixinxi
      }
    ,{
        path: '/luenwen',
        name: '论文信息',
        component: luenwen
      }
    ,{
        path: '/news',
        name: '公告信息',
        component: news
      }
    ,{
        path: '/yonghu',
        name: '教师',
        component: yonghu
      }
    ,{
        path: '/zhiyepeixun',
        name: '荣誉信息',
        component: zhiyepeixun
      }
    ,{
        path: '/zhuanlixinxi',
        name: '专利信息',
        component: zhuanlixinxi
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
