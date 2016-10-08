angular.module('app.routes', [])

.config(function($stateProvider, $urlRouterProvider) {

  // Ionic uses AngularUI Router which uses the concept of states
  // Learn more here: https://github.com/angular-ui/ui-router
  // Set up the various states which the app can be in.
  // Each state's controller can be found in controllers.js
  $stateProvider
    
  

      .state('stepUpDE.donationTabPage', {
    url: '/page2',
    views: {
      'tab4': {
        templateUrl: 'templates/donationTabPage.html',
        controller: 'donationTabPageCtrl'
      }
    }
  })

  .state('stepUpDE.volunteerTabPage', {
    url: '/page3',
    views: {
      'tab3': {
        templateUrl: 'templates/volunteerTabPage.html',
        controller: 'volunteerTabPageCtrl'
      }
    }
  })

  .state('stepUpDE.networkTabPage', {
    url: '/page4',
    views: {
      'tab5': {
        templateUrl: 'templates/networkTabPage.html',
        controller: 'networkTabPageCtrl'
      }
    }
  })

  .state('stepUpDE', {
    url: '/page1',
    templateUrl: 'templates/stepUpDE.html',
    abstract:true
  })

  .state('stepUpDE.rewardTabPage', {
    url: '/page5',
    views: {
      'tab6': {
        templateUrl: 'templates/rewardTabPage.html',
        controller: 'rewardTabPageCtrl'
      }
    }
  })

  .state('stepUpDE.homeTabPage', {
    url: '/page7',
    views: {
      'tab1': {
        templateUrl: 'templates/homeTabPage.html',
        controller: 'homeTabPageCtrl'
      }
    }
  })

$urlRouterProvider.otherwise('/page1/page5')

  

});