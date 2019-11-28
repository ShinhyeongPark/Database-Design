# SOCCER MATCHING DB
- - -
## Project Title
Soccer Matching Web

## Introduction
Unlike existing "Soccer reservation Web/APP", 
This *"Soccer Matching Web"* has "Mercernary" module, so the players don't have Team can play game.
And this Web has various modules like 'Scout', 'Resrvation', 'Create/Join Team'.
As a result. this web exists for the person who want to play soccer professionally as a team or mercernary.

## Motivation
As you know, many people live in  busy life, so it is hard to spend space time and gather together.
Therefore, "Soccer Matching web" can relieve this worry!
As people using this web can play with unknown player as a team, they can play soccer and don't need to spend time for gathering friend.
They can play soccer in time they want, so they manage their time.

## Tech used
- mysql
- java

## Development environment
- CentOS7
- Eclipse

## Module
- Create Team
- Join Team
- Play as a Mercernary
- Make a reservation with other Team
- Look up opponent

## Requirement Analysis
- 여러 명의 선수는 하나의 팀에 들어갈 수 있다.
- 한 명의 선수는 한 팀에만 들어갈 수 있다.
- 한 명 이상의 선수가 한 팀을 만들 수 있다.
- 한 명의 선수는 하나의 용병으로 등록할 수 있다.
- 용병은 1개 이상의 경기를 신청할 수 있다.
- 한 팀은 제한 없이 용병을 영입할 수 있다.
- 최소 1팀 최대 2팀이 한 개 이상의 경기를 예약할 수 있다.
- 팀이 있는 선수도 용병으로 등록할 수 있다.
- 용병은 한 팀에만 들어갈 수 있다.
- 용병은 경기를 예약할 수 없다.
- 용병은 정원이 차지 않은 경기만 신청할 수 있다.
- 같은 경기장에서의 경기는 동일 시간에 2개 이상 진행될 수 없다.
- 12시 이후 경기는 예약할 수 없다.
- 한 경기는 2시간 단위로 진행된다.
- 상대팀과 같은 색깔의 유니폼을 입을 수 없다.
  
## ER Diagram
![ER-Diagram](https://user-images.githubusercontent.com/57867611/69639524-02711a80-10a0-11ea-8994-2697a930bf3a.JPG)
## Relational Schema
![RelationalSchema](https://user-images.githubusercontent.com/57867611/69639535-0866fb80-10a0-11ea-86a0-4d73e5864a82.JPG)

