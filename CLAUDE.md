# CLAUDE.md

Spring Boot + React 개인 포트폴리오 프로젝트.

## 🚨 브랜치 규칙 (최우선, 예외 없음)

- **어떠한 경우에도 `main` 브랜치에 직접 push(또는 commit)하지 않는다.** 긴급 수정, 오타 수정, 문서 수정도 예외 없다.
- 모든 작업은 **브랜치를 만들어서 진행하고, PR을 통해 병합**한다.
- `main`, `dev` 대상 force push(`--force`, `--force-with-lease`) 금지.
- 사용자가 명시적으로 지시해도 `main` 직접 push가 요청되면 실행하지 말고 브랜치 + PR 방식으로 되돌려 안내한다.

## 🌿 Git Flow 전략

| 브랜치 | 생성 기준 | 병합 대상 | 설명 |
|--------|-----------|-----------|------|
| `main` | - | - | 배포 가능한 안정 버전. 직접 push 금지 |
| `dev` | `main` | `main` (release 시) | 개발 통합 브랜치 |
| `feature/{domain}-{detail}` | `dev` | `dev` | 기능 개발 |
| `fix/{domain}-{detail}` | `dev` | `dev` | 일반 버그 수정 |
| `release/{x.y.z}` | `dev` | `main`, `dev` | 배포 준비 (버전 정리, 최종 점검) |
| `hotfix/{detail}` | `main` | `main`, `dev` | 배포 후 긴급 수정. 이 경우에도 PR로 병합 |

- 작업 시작 전 최신 `dev`를 pull 하고 브랜치를 생성한다.
- 기능 단위 작업이 끝나면 PR을 생성한다. (PR 템플릿: `.github/pull_request_template.md`)
- 병합된 작업 브랜치는 삭제한다.

## 📝 커밋 컨벤션

```
type: 작업 내용
```

`feat` / `fix` / `docs` / `style` / `refactor` / `test` / `chore` / `design` / `comment` / `rename` / `remove` / `!HOTFIX`

## 🔧 프로젝트 규칙

- **Spring Security는 Security 기능 개발을 시작할 때 추가한다.** 설정이 완성되기 전까지 계속 오류가 나므로 초기 의존성에 넣지 않는다.
- DB 접속 정보 등 민감 정보는 `.env`로 관리하고 커밋하지 않는다. (`.env.example`만 커밋)
- 설정 파일은 `application.yml`을 사용한다.
- 문서(요구사항/API/Data 모델링 등)는 Notion "IT 프로젝트 관리 올인원 패키지"를 기준으로 한다.

## 🛠 기술 스택

- Backend: Java 25, Spring Boot 4.1.1, Spring Data JPA, PostgreSQL, Gradle (Groovy)
- Frontend: React + Vite
- Package: `com.dowan.portfolio`
