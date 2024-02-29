import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SignupComponent } from './pages/signup/signup.component';
import { LoginComponent } from './pages/login/login.component';
import { HomeComponent } from './pages/home/home.component';
import { ProfileComponent } from './pages/profile/profile.component';
import { WelcomeComponent } from './pages/home/welcome/welcome.component';

const routes: Routes = [
  {
    path:'home',
    component:HomeComponent,
    children:[
      {
        path:'',
        component: WelcomeComponent,
      },
      {
        path:'profile',
        component: ProfileComponent,
      },
    ],
  },
  {
    path: 'signup',
    component: SignupComponent,
    pathMatch: 'full',
  },
  {
    path:'login',
    component:LoginComponent,
    pathMatch:'full',
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
